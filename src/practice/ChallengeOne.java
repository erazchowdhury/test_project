package practice;

import java.util.Scanner;

public class ChallengeOne {

    public static void main(String[] args) {

        Scanner stdin =  new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("please enter the first value");
        num1 = stdin.nextInt();
        System.out.println("please enter the second value");
        num2 = stdin.nextInt();

        if(num1>num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }


    }
}