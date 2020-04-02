import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Airline {

    private String destination;
    private int flightNumber;
    private String aircraftType;
    private LocalTime departureTime;
    private String daysOfTheWeek;

    public Airline(String destination, int flightNumber, String aircraftType, String departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = LocalTime.parse(departureTime, DateTimeFormatter.ofPattern("HH:mm"));
        this.daysOfTheWeek = daysOfTheWeek;

    }

    public String toString() {
        return "Пункт - " + destination + "; Номер - " + flightNumber + "; Тип - " + aircraftType + "; Время - " + departureTime + "; День недели - " + daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }
}