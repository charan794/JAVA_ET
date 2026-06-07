package org.example.Day01;
import java.util.Scanner;
public class BinaryOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i += 2) {
            int value = str.charAt(i + 1) - '0';
            char ch = str.charAt(i);
            if (ch == 'C') {
                result = result ^ value;
            } else if (ch == 'A') {
                result = result & value;
            } else if (ch == 'B') {
                result = result | value;
            }
        }
        System.out.println(result);
    }
}
