package com.TomaszPawlowski;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int i = 0;

        int los;
        int odp = 0;

        Random rnd = new Random();
        los = rnd.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zgadnij liczb od 1 - 10 ");
        do {
            i++;
            System.out.println("Podaj liczbę : ");
            odp = scanner.nextInt();
            if (odp > los) {
                System.out.println("PODALES ZA WYOKĄ LICZBĘ");
            } else if (odp < los) {
                System.out.println("podałeś za niską liczbę");
            }
        } while (odp != los);
        {
            System.out.println("odgadłeś za " + i + " razem");
        }
    }
}



