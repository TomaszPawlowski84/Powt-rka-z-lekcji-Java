import java.util.Random;
import java.util.Scanner;

public class Gra {
    public static void main(String[] args) {
        Random generator = new Random();
        int x = generator.nextInt(200);
        int y = generator.nextInt(200);
        System.out.println(" Podaj wynik mnożenia : " + x + "*" + y);
        Scanner scan = new Scanner(System.in);
        int odp = scan.nextInt();
        if (odp == x * y) {
            System.out.println("Odpowiedz prawidłowa jesteś Mistrzem");
        }else System.out.println("Udzieliłeś złej odpowiedzi. Ćwicz dalej!!!");
    }
}
