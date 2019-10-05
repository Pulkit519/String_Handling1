package question_3;

import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        String s = X.nextLine().trim();
        for(int i =0 ;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
               s=s.replace(ch,'*');
            }
        }
        System.out.println(s);

    }
}
