package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public double plusCalculator(double number1, double number2) {
        return (number1+number2);
    }

    public double minusCalculator(double number1, double number2) {
        return (number1-number2);
    }

    public double multiplyCalculator(double number1, double number2) {
        return (number1*number2);
    }

    public double divideCalculator(double number1, double number2) {
        return (number1/number2);
    }
}
