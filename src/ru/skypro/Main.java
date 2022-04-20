package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void recognizeIsYearLeap(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void recommendVersion(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();

        if ((clientOS == 1) && (clientDeviceYear >= currentYear)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if ((clientOS == 1) && (clientDeviceYear < currentYear)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if ((clientOS == 0) && (clientDeviceYear >= currentYear)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if ((clientOS == 0) && (clientDeviceYear < currentYear)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }

    public static int calculateDaysToDelivery(int deliveryDistance) {
        int deliveryInterval = 40;
        int nearestInterval = 20;
        int deliveryDays = 1;

        if (deliveryDistance > nearestInterval) {
            deliveryDays = ((deliveryDistance - nearestInterval) / deliveryInterval) + 2;
        }
        return deliveryDays;
    }

    public static void recognizeIsSymbolsDoubled(String symbols) {
        for (int i = 0; i < symbols.length(); i++) {
            if ((symbols.charAt(i) == symbols.charAt(i + 1)) && (i != symbols.length())) {
                System.out.println("Символ на позиции - " + i + ":'" + symbols.charAt(i) + "' повторяется.");
                break;
            }
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание №1");
        int year = 2000;
        recognizeIsYearLeap(year);
        System.out.println("_____");

        System.out.println("Задание №2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        recommendVersion(clientOS, clientDeviceYear);
        System.out.println("_____");

        System.out.println("Задание №3");
        int deliveryDistance = 21;

        System.out.println("Потребуется дней: " + calculateDaysToDelivery(deliveryDistance));
        System.out.println("_____");

        System.out.println("Задание №4");
        String symbolsToRecognizeIsDoubled = "aabccddefgghiijjkk";
        recognizeIsSymbolsDoubled(symbolsToRecognizeIsDoubled);
        System.out.println("_____");

        System.out.println("Задание №5");
        int[] outerArray = {3, 2, 1, 6, 5};
        reverseArray(outerArray);
        System.out.println(Arrays.toString(outerArray));
        System.out.println("_____");
    }
}
