package rechner;

import java.util.Scanner;

public class Taschenrechner {
    public static final double pi = 3.14159;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definiere Basisoperationen
        String[] basisoperationen = new String[4];
        basisoperationen[0] = "+";
        basisoperationen[1] = "-";
        basisoperationen[2] = "*";
        basisoperationen[3] = "/";

        System.out.println("Bitte gib eine Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Deine Zahl als int ist: " + alsInt(zahl1));

        System.out.println("Bitte gib eine zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();

        System.out.println("Bitte gib eine Rechenoperation ein (+, -, *, /, ^, =: ");
        String operation = scanner.next();

        // Einfache Ausgabe
        // System.out.println("Du möchtest berechnen: " + zahl1 + " " + operation + " " + zahl2);

        // Formatierte Ausgabe
        System.out.printf("Du möchtest berechnen: %.2f %s %.2f %n", zahl1, operation, zahl2);

        // Berechnung durchführen
        boolean habeBerechnet = false;

        for (int i = 0; i < basisoperationen.length; i++) {
            if (operation.equals(basisoperationen[i])) {
                System.out.println("Das Ergebnis der Berechnung ist: " + berechnen(zahl1, zahl2, operation));
                habeBerechnet = true;
            }
        }

        if (!habeBerechnet) {
            System.out.println("Das Ergebnis des Vergleiches ist: " + zahl1 + " " + vergleichen(zahl1, zahl2) + " " + zahl2);
        }
    }

    public static double berechnen(double zahl1, double zahl2, String operation) {
        return 0.0;
    }

    public static String vergleichen(double zahl1, double zahl2) {
        return "";
    }

    public static int alsInt(double zahl) {
        return (int) zahl;
    }
}
