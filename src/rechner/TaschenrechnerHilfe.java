package rechner;

import java.util.Scanner;

public class TaschenrechnerHilfe {
    public static void einzelneBerechnung() {
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
        double ergebnis;

        switch (operation) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                ergebnis = zahl1 / zahl2;
                break;
            default:
                ergebnis = 0;
                break;
        }

        return ergebnis;
    }


//    mit neuem Switch-Statement
//    public static double berechnen(double zahl1, double zahl2, String operation){
//        return switch (operation){
//            case "+" -> zahl1 + zahl2;
//            case "-" -> zahl1 - zahl2;
//            case "*" -> zahl1 * zahl2;
//            case "/" -> zahl1 / zahl2;
//            default -> 0;
//        };
//    }

    public static String vergleichen(double zahl1, double zahl2) {
        if (zahl1 == zahl2) {
            return "ist gleich groß wie";
        } else if (zahl1 > zahl2) {
            return "ist größer als";
        } else {
            return "ist kleiner als";
        }
    }

    public static int alsInt(double zahl) {
        return (int) zahl;
    }
}
