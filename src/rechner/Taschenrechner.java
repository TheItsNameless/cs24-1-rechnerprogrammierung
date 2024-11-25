package rechner;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gib eine Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Bitte gib eine zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Bitte gib eine Rechenoperation ein (+, -, *, /, ^ für Potenz: ");
        String operation = scanner.next();

        // Einfache Ausgabe
        // System.out.println("Du möchtest berechnen: " + zahl1 + " " + operation + " " + zahl2);

        // Formatierte Ausgabe
        System.out.printf("Du möchtest berechnen: %.2f %s %.2f %n", zahl1, operation, zahl2);
    }
}
