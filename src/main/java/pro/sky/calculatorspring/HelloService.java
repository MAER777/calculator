package pro.sky.calculatorspring;

public interface HelloService {
    String hello();
    String answerHello(String userName);

    String helloCalculator();
    double plusCalculator(double number1, double number2);
    double minusCalculator(double number1, double number2);
    double multiplyCalculator(double number1, double number2);
    String divideCalculator(Integer number1, Integer number2);
}
