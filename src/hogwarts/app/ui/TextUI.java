package hogwarts.app.ui;

import hogwarts.data.House;

import java.util.Scanner;

public class TextUI {

    public static int promptInt(String message) {
        Scanner scan = new Scanner(System.in);

        System.out.print(message);
        int input = scan.nextInt();
        return input;

    }
    public static String promptString(String message) {
        Scanner scan = new Scanner(System.in);

        System.out.print(message);
        String input = scan.nextLine();
        return input;

    }
  

}
