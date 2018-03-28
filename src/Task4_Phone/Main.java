package Task4_Phone;

public class Main {
    public static void main(String[] args) {


        //Регистрация телефона в сети
        Phone phoneOne = new Phone("Andrew", "+380971055223");
        phoneOne.networkConnection();
        System.out.println("Абонент " + phoneOne.getName() + " (" + phoneOne.getPhoneNumber() + ") " + "Зарегистрирован в сети!");

        Phone phoneTwo = new Phone("Ira", "+380971055478");
        phoneTwo.networkConnection();
        System.out.println("Абонент " + phoneTwo.getName() + " (" + phoneTwo.getPhoneNumber() + ") " + "Зарегистрирован в сети!");

        System.out.println();

        //Вызов абонента зарегистрированного в сети
        System.out.println("Совершается вызов. Пожалуйста ожидайте");
        phoneOne.call("+380971055478");

        System.out.println();

        //Вызов абонента не зарегистрированного в сети
        System.out.println("Совершается вызов. Пожалуйста ожидайте");
        phoneOne.call("+380971066371");

    }


}
