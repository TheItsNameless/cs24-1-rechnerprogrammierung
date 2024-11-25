package rechner;

import java.util.Scanner;

public class TaschenrechnerHilfe {
    public static void einzelneBerechnung() {
        Scanner scanner = new Scanner(System.in);

        // Definiere Basisoperationen
        String[] basisoperationen = new String[5];
        basisoperationen[0] = "+";
        basisoperationen[1] = "-";
        basisoperationen[2] = "*";
        basisoperationen[3] = "/";
        basisoperationen[4] = "^";

        System.out.println("Bitte gib eine Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Deine Zahl als int ist: " + alsInt(zahl1));

        System.out.println("Bitte gib eine zweite Zahl ein: ");
        double zahl2;
        String input = scanner.next();
        if (input.equals("")) {
            zahl2 = Math.random() * 100 + 1;
        } else{
            zahl2 = Double.parseDouble(input);
        }

        System.out.println("Bitte gib eine Rechenoperation ein (+, -, *, /, ^, =: ");
        String operation = scanner.next();

        // Erstelle eine Rechnung
        Rechnung rechnung = new Rechnung(zahl1, zahl2, operation);

        // Einfache Ausgabe
        // System.out.println("Du möchtest berechnen: " + zahl1 + " " + operation + " " + zahl2);

        // Formatierte Ausgabe
        System.out.printf("Du möchtest berechnen: %.2f %s %.2f %n", zahl1, operation, zahl2);

        // Berechnung durchführen
        boolean habeBerechnet = false;

        for (int i = 0; i < basisoperationen.length; i++) {
            if (operation.equals(basisoperationen[i])) {
                // Prüfe auf Division durch 0
                if (operation.equals("/") && zahl2 == 0){
                    System.out.println("Du kannst nicht durch 0 dividieren!");
                    return;
                }

                try {
                    System.out.println("Das Ergebnis der Berechnung ist: " + berechnen(rechnung));
                } catch (IllegalArgumentException e) {
                    System.out.println("Konnte die Berechnung nicht durchführen: Unbekannte Operation: " + operation);
                    return;
                }
                habeBerechnet = true;
            }
        }

        if (!habeBerechnet) {
            System.out.println("Das Ergebnis des Vergleiches ist: " + zahl1 + " " + vergleichen(rechnung) + " " + zahl2);
        }
    }

    public static double berechnen(Rechnung rechnung) throws IllegalArgumentException {
        double ergebnis;

        switch (rechnung.getOperation()) {
            case "+":
                ergebnis = rechnung.getZahl1() + rechnung.getZahl2();
                break;
            case "-":
                ergebnis = rechnung.getZahl1() - rechnung.getZahl2();
                break;
            case "*":
                ergebnis = rechnung.getZahl1() * rechnung.getZahl2();
                break;
            case "/":
                ergebnis = rechnung.getZahl1() / rechnung.getZahl2();
                break;
            case "^":
                ergebnis = Math.pow(rechnung.getZahl1(), rechnung.getZahl2());
                break;
            default:
                throw new IllegalArgumentException();
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

    public static String vergleichen(Rechnung rechnung) {
        if (rechnung.getZahl1() == rechnung.getZahl2()) {
            return "ist gleich groß wie";
        } else if (rechnung.getZahl1() > rechnung.getZahl2()) {
            return "ist größer als";
        } else {
            return "ist kleiner als";
        }
    }

    public static int alsInt(double zahl) {
        return (int) zahl;
    }
}
