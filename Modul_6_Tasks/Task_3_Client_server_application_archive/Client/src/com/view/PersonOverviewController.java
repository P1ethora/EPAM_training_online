package com.view;

import com.communication.RequestDelete;
import com.communication.RequestEdit;
import com.communication.RequestLogin;
import com.communication.RequestNew;
import com.readerAndwriter.XMLjdomReader;
import com.readerAndwriter.XMLjdomWriter;
import com.stratWindow.StartPersonEditDialog;
import com.model.Person;
import com.other.DateUtil;
import com.other.NothingSelected;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class PersonOverviewController implements Initializable {

    @FXML
    private TableView<Person> tableViewPerson;
    @FXML
    private TableColumn<Person, String> tableColumnClienteName;
    @FXML
    private TableColumn<Person, String> tableColumnClienteFamily;
    @FXML
    private Label firstName;
    @FXML
    private Label lastName;
    @FXML
    private Label city;
    @FXML
    private Label street;
    @FXML
    private Label postalCode;
    @FXML
    private Label birthday;
    @FXML
    private Label PersonProfile;


    public static List<Person> listPerson = new ArrayList();

    private ObservableList<Person> observableListPersons;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        PersonProfile.setText(RequestLogin.log);
        carregarTableViewClientes();

        tableViewPerson.getSelectionModel().selectedItemProperty().addListener(                 //инициализация колонок
                (observable, oldValue, newValue) -> selecionarItemTableViewClientes(newValue));

        showPersonDetails(null);

        tableViewPerson.getSelectionModel().selectedItemProperty().addListener(      //инициализация описания
                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }

    public void carregarTableViewClientes() {

        tableColumnClienteName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        tableColumnClienteFamily.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        XMLjdomReader reader = new XMLjdomReader();
        observableListPersons = FXCollections.observableArrayList(listPerson);

        tableViewPerson.setItems(observableListPersons);
    }


    public void selecionarItemTableViewClientes(Person person) {
    }

    private void showPersonDetails(Person person) {
        if (person != null) {

            firstName.setText(person.getFirstName());
            lastName.setText(person.getLastName());
            city.setText(person.getCity());
            street.setText(person.getStreet());
            postalCode.setText(String.valueOf(person.getPostalCode()));
            birthday.setText(DateUtil.format(person.getBirthday()));
        } else {
            firstName.setText("");
            lastName.setText("");
            city.setText("");
            street.setText("");
            postalCode.setText("");

        }
    }

    @FXML
    private void handleDeletePerson() throws Exception {           //Метод удаления
        int selectedIndex = tableViewPerson.getSelectionModel().getSelectedIndex();
        if (selectedIndex >= 0) {
            tableViewPerson.getItems().remove(selectedIndex);
            listPerson.remove(selectedIndex);
            XMLjdomWriter write = new XMLjdomWriter();
            System.out.println("Персона удалена");

            RequestDelete requestDelete = new RequestDelete();
            System.out.println("DELETE PERSON ОТПРАВЛЕН НА СЕРВЕР");
        } else {
            // Ничего не выбрано
            NothingSelected nothingSelected = new NothingSelected();
        }
    }

    @FXML
    private void handleNewPerson() throws Exception {  //Новый
        Person tempPerson = new Person();
        StartPersonEditDialog edit = new StartPersonEditDialog();
        boolean okClicked = edit.showPersonEditDialog(tempPerson);
        if (okClicked) {
            listPerson.add(tempPerson);
            observableListPersons.add(tempPerson);
            XMLjdomWriter write = new XMLjdomWriter();
            System.out.println("Новая персона добавлена");

            RequestNew requestNew = new RequestNew();           //Метод запрос на новую персону

            System.out.println("NEW PERSON ОТПРАВЛЕН НА СЕРВЕР");
        }
    }

    @FXML
    private void handleEditPerson() throws Exception {
        Person selectedPerson = tableViewPerson.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            StartPersonEditDialog edit = new StartPersonEditDialog();
            boolean okClicked = edit.showPersonEditDialog(selectedPerson);
            if (okClicked) {
                showPersonDetails(selectedPerson);
                System.out.println("Персона изменена");
                RequestEdit requestEdit = new RequestEdit();
                System.out.println("EDIT PERSON ОТПРАВЛЕН НА СЕРВЕР");
            }

        } else {
            // Ничего не выбрано
            NothingSelected nothingSelected = new NothingSelected();
        }
    }
}