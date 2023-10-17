package main.interfaces;

public class TaxReport {
    private TaxCalculator2020 calculator;
    public TaxReport(TaxCalculator2020 calculator){
      this.calculator = calculator;
    }

    public void setCalculator(TaxCalculator2020 calculator) {
        this.calculator = calculator;
    }

    public void show(){
        var tax = calculator.calculateTax();
        System.out.println(tax);
  }
}
