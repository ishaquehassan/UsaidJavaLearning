package com.company;

import java.util.Scanner;

public class Usaid {
    public static void main(String[] args) {
        int total = 20;
        float gst = 13.5f;
        char u = 'U';
        System.out.print(u);
        char s = 'S';
        System.out.print(s);
        char a = 'A';
        System.out.print(a);
        char i = 'I';
        System.out.print(i);
        char d = 'D';
        System.out.println(d);
        System.out.println(total-gst);
        //Single Line comment
        /*
        Multi
        line
        comment
         */
        String name = "USAID";
        System.out.println(name);

        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.next();
        System.out.println("Hello "+nameInput);
        int my1stVal = scanner.nextInt();
        int my2ndVal = scanner.nextInt();
        System.out.println(my1stVal+my2ndVal);
    }
}
