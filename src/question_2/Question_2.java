package question_2;

import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        String s = X.nextLine().trim();
        int length = s.length();
        int index = X.nextInt();
        if (index < length) {
            System.out.println(s.substring(index));
        } else {
            System.out.println("Enter a valid index");
        }
    }
}

