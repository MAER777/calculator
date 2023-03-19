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

    public double plusCalculator(double number1, double number2) {
        return (number1+number2);
    }

    public double minusCalculator(double number1, double number2) {
        return (number1-number2);
    }

    public double multiplyCalculator(double number1, double number2) {
        return (number1*number2);
    }

    public String divideCalculator(Integer number1, Integer number2) {
        if (number1 == null) {
            return "Введите первое число";
        } else if (number2 == null) {
            return "Введите второе число";
        } else if (number2 == 0) {
            return "Деление на НОЛЬ не возможно.";
        } else{
            return String.valueOf(number1/number2);
        }
    }
}
