public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
                  }

    public static void task1() {
        System.out.println("Задача 1");
        byte clientOS;
        clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else {
            System.out.println("Для вашей системы нет версий, пожалуйста установите iOS или Android.");

        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS;
        clientOS = 0;
        int clientDeviceYear;
        clientDeviceYear = 2015;
        boolean oldAndroid = (clientDeviceYear < 2015 && clientOS == 1);
        boolean oldIOS = (clientDeviceYear < 2015 && clientOS == 0);
        if (oldAndroid) {
            System.out.println("Установите облегченную версию для Android по ссылке.");
        } else if (oldIOS) {
            System.out.println("Установите облегченную версию для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year;
        year = 2100;
        // остаток от деления номера года на 4
              int remDiv = year % 4;
        // остаток от деления на 400
              int fourHundrYear = year % 400;
        boolean leapYear = (remDiv == 0 && fourHundrYear == 0);
        if (leapYear) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance;
        deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + day);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + (day + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + (day + 2));
        } else {
            System.out.println("К сожалению, адрес доставки находится далеко, мы Вам не можем доставить карту.");
        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber;
        monthNumber = 12;
        if (monthNumber > 12) {
            monthNumber=0;
            System.out.println("Такого номера месяца не существует.");
        }
        switch (monthNumber) {
            case 0:
                break;
            case 1:
            case 2:
            case 12:
                System.out.println("Это зимний месяц.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Это весенний месяц.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Это летний месяц.");
                break;
            default:
                System.out.println("Это осенний месяц.");


        }


    }
}


