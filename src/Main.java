import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static boolean checkLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static String checkPhone(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        boolean phoneNew = clientDeviceYear >= currentYear;

        String version = phoneNew ? "приложение" : "облегченную версию приложения";

        if (clientOS == 0) {
            return "Установите " + version + " для iOS по ссылке";
        } else if (clientOS == 1) {
            return "Установите " + version + " для Android по ссылке";
        } else {
            return "Ос не поддерживается";
        }
    }

    public static int checkDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }


    public static void task1() {
        System.out.println("Задача 1");

        var year = 2004;
        var currentYear = checkLeapYear(year);

        if (currentYear) {
            System.out.println(year + " год - високосный год.");
        } else {
            System.out.println(year + " год - невисокосный год.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        var clientOS = 0;
        var clientDeviceYear = 2009;

        var clientResult = checkPhone(clientOS, clientDeviceYear);
        System.out.println(clientResult);
    }

    public static void task3() {
        System.out.println("Задача 3");

        var deliveryDistance = 42;

        var deliveryResult = checkDelivery(deliveryDistance);
        if (deliveryResult == (-1)) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка займет " + deliveryResult + " дня");
        }
    }
}