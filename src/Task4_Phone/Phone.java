package Task4_Phone;

public class Phone {
    private String name;
    private String phoneNumber;
    private boolean online;

    public Phone() {

    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    //Регистрация номера телефона в сети
    public void networkConnection() {
        Network.registerNumber(phoneNumber);
        online = true;
    }

    //Вызов другого абонента
    public void call(String phoneNumber) {

        if (isOnline()) {
            //Попытка вызова номера абонента
            if (Network.isConnected(phoneNumber)) {
                System.out.println("Успешно. Вызов совершен!");
            } else {
                System.out.println("Телефон абонента выключен или находится вне зоны действия сети!");
            }
        } else {
                System.out.println("Ваш телефон не зарегистрирован в сети. Обратитесь в службу поддержки" +
                    " вашего оператора.");
        }

    }

    private boolean isOnline() {
        return online;
    }

    public void incomingCall() {
        System.out.println("Входящий вызов. Принять (Да/Нет)?");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
