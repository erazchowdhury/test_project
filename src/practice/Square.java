package practice;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        int width;
        int length;
        String symbol;

        Scanner stdin = new Scanner(System.in);

        System.out.println("Please choose a symbol");
        symbol = stdin.next();

        System.out.println("Please enter a width");
        width = stdin.nextInt();

        System.out.println("Please enter a length");
        length = stdin.nextInt();

        for(int i = 0; i < width; i++) {
            System.out.print("");
            for(int j = 0; j < length; j++) {
                System.out.print(symbol);
            }
        }

    }

}

// "   "
// ****
//"   "
// ****
