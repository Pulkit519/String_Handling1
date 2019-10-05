package question_1;

import java.util.Scanner;

public class Question_1 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        String enter = X.nextLine();
        int length = enter.length();
        for (int i = 0; i < length; i++) {
            char ch = enter.charAt(i);
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < length; i++) {
            char ch = enter.charAt(i);
            System.out.print(ch + "\t");
        }
    }
}
