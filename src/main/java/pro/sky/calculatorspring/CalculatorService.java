package pro.sky.calculatorspring;

public interface CalculatorService {
    String helloCalculator();
    String plusCalculator(Double number1, Double number2);
    String minusCalculator(Double number1, Double number2);
    String multiplyCalculator(Double number1, Double number2);
    String divideCalculator(Double number1, Double number2);
}
