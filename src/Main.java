import java.time.LocalDate;

public class Main {
    public static void printTheIssueNumber(String number) {
        System.out.println("Задача № " + number);
    }

    public static void printSeparator() {
        System.out.println("|===***==**=*=**==***===|");
    }

    public static void yearCheck(short currentYear) {
        if (currentYear % 4 == 0 && currentYear % 100 != 0 || currentYear % 400 == 0) {
            System.out.println(currentYear + " год является високосным.");
        } else {
            System.out.println(currentYear + " год не является високосным.");
        }
    }

    public static void checkClientDeviceYear(short clientDeviceYear, short clientOS) {
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите приложение по ссылке.");
        }
    }

    public static void checkDaysForDelivery(short deliveryDistance, short daysForDelivery) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: " + daysForDelivery);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (daysForDelivery + daysForDelivery));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (daysForDelivery + daysForDelivery + daysForDelivery));
        }
    }

    public static void main(String[] args) {

        printTheIssueNumber("1");
        yearCheck((short) 2021);

        printSeparator();

        printTheIssueNumber("2");
        int currentYear = LocalDate.now().getYear();
        checkClientDeviceYear((short) currentYear, (short) 0);

        printSeparator();

        printTheIssueNumber("3");
        checkDaysForDelivery((short) 95, (short) 1);
    }
}