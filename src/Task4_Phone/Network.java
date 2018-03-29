package Task4_Phone;

import java.util.ArrayList;
import java.util.List;

public class Network {
    //Создаем список для зарегистрированных абонентов
    private static List<String> phoneNumbers = new ArrayList<>();

    //Регистрация нового абонента в сети
    public static void registerNumber (String phoneNumber) {
        phoneNumbers.add(phoneNumber);

    }

    //проверка в сети ли абонент
    public static boolean isConnected (String phoneNumber) {
        for (Object phoneNumber1 : phoneNumbers) {
            if (phoneNumber1.equals(phoneNumber)) {
                return true;

            }

        }
        return false;
    }

}

