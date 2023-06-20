package org.khatman.karen;
import sun.util.calendar.CalendarUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        /*****************Stars*****************/
        Stars linaleli = new Stars();
        linaleli.runStars();
        System.out.println("-------Done with Stars-------");
        System.out.println();

        /*****************Name*****************/
        Scanner input = new Scanner(System.in);

        Name lebitso = new Name();

        System.out.printf("What is your name:");
        String name = input.nextLine();
        lebitso.setName(name);
        System.out.println(); //blank line
        System.out.printf("Your name is %s",lebitso.getName());
        System.out.println();

        /*****************Calculator*****************/
        Calculator lipalo = new Calculator();

        System.out.print("X:");
        int x = input.nextInt();
        lipalo.setX(x); //storing x
        System.out.print("Y:");
        int y = input.nextInt();
        lipalo.setY(y);
        System.out.println();
        System.out.printf("X*Y = %d", lipalo.square());

        /*****************Word Length*****************/
        Word mantsoe = new Word();

        System.out.print("First Name:");
        String first_name = input.nextLine();
        mantsoe.setX(Arrays.toString(new String[]{first_name}));

        System.out.print("Middle Name:");
        String middle_name = input.nextLine();
        mantsoe.setY(new String[]{middle_name});

        System.out.print("Last Name:");
        String last_name = input.nextLine();
        mantsoe.setZ(new String[]{last_name});
        System.out.println();
        System.out.printf("%d", mantsoe.getWordLength());

    }
}