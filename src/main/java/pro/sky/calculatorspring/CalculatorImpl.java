package pro.sky.calculatorspring;

import org.springframework.stereotype.Service;

@Service
public class CalculatorImpl {
    public String calculator() {
        return "Добро пожаловать в калькулятор";
    }
}
