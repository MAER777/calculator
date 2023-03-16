package pro.sky.calculatorspring;

public interface HelloService {
    String hello();
    String answerHello(String userName);

    String helloCalculator();
    String plusCalculator(double number1, double number2);
    String minusCalculator(double number1, double number2);
    String multiplyCalculator(double number1, double number2);
    String divideCalculator(double number1, double number2);
}
