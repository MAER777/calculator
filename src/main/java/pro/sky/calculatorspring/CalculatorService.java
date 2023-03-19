package pro.sky.calculatorspring;

public interface CalculatorService {
    String helloCalculator();
    String plusCalculator(double number1, double number2);
    String minusCalculator(double number1, double number2);
    String multiplyCalculator(double number1, double number2);
    String divideCalculator(Double number1, Double number2);
}
