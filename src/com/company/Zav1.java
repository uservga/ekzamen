package com.company;
import java.util.Scanner;

public class Zav1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Яку цифру нажимаєте(0-9): ");
        int a = scanner.nextInt();
        switch (a) {
            case (0):
                System.out.println("Ви обрали кнопку з номером - 0!");
                System.out.println("Ввімкнули UA-Перший");
                break;
            case (1):
                System.out.println("Ви обрали кнопку з номером -  1!");
                System.out.println("Ввімкнули Україна");
                break;
            case (2):
                System.out.println("Ви обрали кнопку з номером -  2!");
                System.out.println("Ввімкнули Новий Канал");
                break;
            case (3):
                System.out.println("Ви обрали кнопку з номером -  3!");
                System.out.println("Ввімкнули ТЕТ");
                break;
            case (4):
                System.out.println("Ви обрали кнопку з номером -  4!");
                System.out.println("Ввімкнули ICTV");
                break;
            case (5):
                System.out.println("Ви обрали кнопку з номером -  5!");
                System.out.println("Ввімкнули QTV");
                break;
            case (6):
                System.out.println("Ви обрали кнопку з номером -  6!");
                System.out.println("Ввімкнули Плюс Плюс");
                break;
            case (7):
                System.out.println("Ви обрали кнопку з номером -  7!");
                System.out.println("Ввімкнули 1+1");
                break;
            case (8):
                System.out.println("Ви обрали кнопку з номером -  8!");
                System.out.println("Ввімкнули 2+2");
                break;
            case (9):
                System.out.println("Ви обрали кнопку з номером -  9!");
                System.out.println("Ввімкнули М1");
                break;
            default:
                System.out.println("Ввімкнули М2");
                break;
        }
    }
}