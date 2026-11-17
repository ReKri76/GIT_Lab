import java.util.Scanner;

public class Lab_1_Back {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        printWelcome();

        while (true) {

            //Филёнов
            //printMenu();

            //Николай
            //int choice = readMenuChoice(scanner);

            switch (choice) {

                case 1:
                    //Антом
                    //findPalindromes(scanner);
                    break;

                case 2:
                    System.out.println("\nПрограмма завершена.");
                    scanner.close();
                    return;
            }
        }
    }

    /**
     * Выводит приветственное сообщение при запуске программы.
     */
    public static void printWelcome() {

        System.out.println("Лабораторная 1");
        System.out.println("Ввести с консоли n целых чисел и поместить их в массив. На консоль");
        System.out.println("вывести числа-полиндромы, значения которых в прямом и обратном");
        System.out.println("порядке совпадают.");
        System.out.println();
    }

    

    /**
     * Проверяет, является ли переданная строка целым числом.
     * Поддерживаются положительные и отрицательные числа.
     */
    public static boolean isInteger(String value) {

        try {

            Long.parseLong(value);
            return true;

        } catch (NumberFormatException e) {

            return false;
        }
    }

    /**
     * Проверяет, является ли переданное число палиндромом.
     * Палиндром читается одинаково слева направо и справа налево.
     */
    public static boolean isPalindrome(String number) {

        String value = number;

        if (value.startsWith("-")) {
            value = value.substring(1);
        }

        String reverse = new StringBuilder(value).reverse().toString();

        return value.equals(reverse);
    }
}