package com.TomaszPawlowski;

public class Main {

    public static void main(String[] args) {
	// Operatory te działają na dwóch argumentach i dlatego nazywamy je dwuargumentowymi, bądź binarnymi.
        System.out.println(" dodawanie  " + (2 + 2));
        System.out.println( "odejmowanie " + (4 - 2));
        System.out.println("mnożenie    " + 2 * 2);
        System.out.println("dzielenie   "  + 4 / 2);


        /*Operatory: mnożenia, dzielenia, oraz reszty z dzielenia, mają taki sam priorytet, który jest wyższy,
          niż priorytet operatorów dodawania i odejmowania – tak jak w matematyce. Możemy jednak
          skorzystać z nawiasów, aby zmienić priorytet wykonywania działań.*/

        System.out.println("kolejność działań " + (10 * 2 + 1));
        System.out.println( " kolejność działan " + 10 * (2+1));




        System.out.println( 10 % 4); //operator dzielenia  zwraca
                                     //liczbę całkowitą (zaokrągloną w dół), jeżeli oba jego argumenty są typu całkowitego



        System.out.println(10.0 / 4); //Rzutowanie to traktowanie wartości pewnego typu jako wartości innego typu.

        //Zmiana priorytetów operatorów za pomocą nawiasów.
        System.out.println(2+2*2);
        System.out.println((2+2) * 2);
        System.out.println(2 * 2 / 2 * 2);
        System.out.println( 2 * 2 / (2 * 2));


        /*Operatory przypisania
        Operator dwuargumentowy, jest operatorem przypisania = .
        Ma on za zadanie przypisać zmiennej po jego lewej stronie wartość wyrażenia po jego prawej
        stronie:*/

        int a = 5;
        int b = a * 10;
        double c = (double) b / (a + 3);
        System.out.println(c);


        /*Pomocnicze operatory przypisania*/

        /*
                 +=
                 -=
                 *=
                 /=
                 %=
              Pierwszy operator dodaje do zmiennej po jego lewej stronie wartość wyliczoną po
              jego prawej stronie
        */
            int i = 10;
      //  i += 100; // i = 10 + 100, wiec a bedzie rowne 110
      // i -= 10; // i = i – 10, wiec a bedzie rowne 0
       // i *= 5; // i = i * 5, wiec a bedzie rowne 50
     //  i %= 2; // i = i % 2, wiec a bedzie rowne 0

        System.out.println(" i wyniesie " + i);




    }
}
