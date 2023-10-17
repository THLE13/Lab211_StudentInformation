package common;

import java.util.Random;
import java.util.Scanner;

public class Library {

    public Scanner sc = new Scanner(System.in);

    public int checkInputIntLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

   public boolean checkInputYN() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1 && result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.length() == 1 && result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Re-input.");
        }
    }

    public float checkInputFloat() {
        while (true) {
            try {
                float result = Float.parseFloat(sc.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public int getInt(String promt, int m, int n) {
        int a = -1;
        while (true) {
            System.out.print(promt);
            try {
                String s = sc.nextLine();
                a = Integer.parseInt(s);
                if (a >= m && a <= n) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter a number between " + m + " and " + n);
            }
        }
        return a;
    }

    public void display(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.println("");
    }

}
