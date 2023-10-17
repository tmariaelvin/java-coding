package main.interfaces;

public class InterfaceSample {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2020(100000);
        var taxReport = new TaxReport(calculator);
        taxReport.show();
    }
}
