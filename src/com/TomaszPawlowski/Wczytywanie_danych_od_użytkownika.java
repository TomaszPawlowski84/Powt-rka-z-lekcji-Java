package com.TomaszPawlowski;

import java.util.Scanner;

public class Wczytywanie_danych_od_użytkownika {


    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);                  //wczytanie danych od użytkownika z konsoli - należy zainportować classe scanner alt + enter
                                                                          //(System.in) -argument
        String name;                                                     //deklaracja zmiennej
        System.out.println( "Podaj swoje imie i nazwisko ");           // drukarka informuje aby użytkownik podał swoje imię
        name = scanner.nextLine();                              // przypisanie stringa (Next - wypiszę tylko pierwszy wyraz a NextLine wypisze cała linijke

        System.out.println("Witam Cię " + name + " !! Programowanie jest super !!!" );




    }
}
