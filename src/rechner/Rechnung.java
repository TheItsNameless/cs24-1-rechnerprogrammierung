package rechner;

public class Rechnung {
    private double zahl1;
    private double zahl2;
    private String operation;

    public Rechnung(double zahl1, double zahl2, String operation) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        this.operation = operation;
    }

    public double getZahl1() {
        return zahl1;
    }

    public void setZahl1(double zahl1) {
        this.zahl1 = zahl1;
    }

    public double getZahl2() {
        return zahl2;
    }

    public void setZahl2(double zahl2) {
        this.zahl2 = zahl2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
