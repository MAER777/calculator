package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    public String helloCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public String plusCalculator(Double number1, Double number2) {
        return String.valueOf(number1+number2);
    }

    public String minusCalculator(Double number1, Double number2) {
        return String.valueOf(number1-number2);
    }

    public String  multiplyCalculator(Double number1, Double number2) {
        return String.valueOf(number1*number2);
    }

    public String divideCalculator(Double number1, Double number2) {
        return String.valueOf(String.format("%.3f",number1/number2));
    }
}
