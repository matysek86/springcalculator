package pl.sda.springcalculator;

public class CaclulatroMain {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        System.out.println(calculatorService.calculate("2+2"));
    }
}
