package question_10;

import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        char c = (sc.next()).charAt(0);
        System.out.println(s1.indexOf(c));
    }
}
