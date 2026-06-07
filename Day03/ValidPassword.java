package org.example.Day03;

import java.util.Scanner;
class validPassword {

    public static boolean isValidPassword(String password) {

        // Minimum 4 characters
        if (password.length() < 4) {
            return false;
        }

        // First character must not be a number
        char first = password.charAt(0);

        if (first >= '0' && first <= '9') {
            return false;
        }

        boolean hasCapital = false;
        boolean hasNumber = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            // No space or slash
            if (ch == ' ' || ch == '/') {
                return false;
            }

            // Capital letter check
            if (ch >= 'A' && ch <= 'Z') {
                hasCapital = true;
            }

            // Number check
            if (ch >= '0' && ch <= '9') {
                hasNumber = true;
            }
        }

        return hasCapital && hasNumber;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        sc.close();
    }
}