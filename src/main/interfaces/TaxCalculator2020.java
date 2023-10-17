package main.interfaces;

public class TaxCalculator2020 implements TaxCalculators {

   private double income;
   public TaxCalculator2020(double income){
      this.income = income;
   }
   @Override
   public double calculateTax() {
      return income * 0.3;
   }
}
