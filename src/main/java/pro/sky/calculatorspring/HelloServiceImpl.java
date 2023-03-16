package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    public String hello() {
        return "hello";
    }

    public String answerHello(String userName) {
        return "hello " + userName;
    }

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор.";
    }

    public String plusCalculator(double number1, double number2) {
        return number1 + " + " + number2 + " = " + (number1+number2);
    }

    public String minusCalculator(double number1, double number2) {
        return number1 + " - " + number2 + " = " + (number1-number2);
    }

    public String multiplyCalculator(double number1, double number2) {
        return number1 + " * " + number2 + " = " + (number1*number2);
    }

    public String divideCalculator(double number1, double number2) {
        if (number2 == 0) {
            return "Деление на НОЛЬ не возможно.";
        } else{
            return number1 + " / " + number2 + " = " + (number1/number2);
        }
    }
}
