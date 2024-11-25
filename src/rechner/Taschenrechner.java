package rechner;

import java.util.Scanner;

public class Taschenrechner {
    public static final double pi = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            TaschenrechnerHilfe.einzelneBerechnung();

            // Frage nach Beendigung
            System.out.println("Möchten Sie eine weitere Berechnung durchführen? (ja/nein): ");
            String antwort = scanner.next();
            if (antwort.equals("nein")){
                break;
            }
        }
    }
}
