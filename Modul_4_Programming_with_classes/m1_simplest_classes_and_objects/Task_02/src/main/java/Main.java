public class Main {

    /**
     * Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
     * Добавьте конструктор, инициализирующий члены класса по умолчанию.
     * Добавьте set- и get- методы для полей экземпляра класса.
     */


    public static void main(String[] args) {

        Test2 testDefault = new Test2();
        System.out.println(testDefault.toString());
        Test2 test = new Test2(10, 11);
        System.out.println(test.toString());
    }

}
