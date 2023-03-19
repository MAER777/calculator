package pro.sky.calculatorspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "plus")
    public String plusCalculator (@RequestParam(value = "num1", required = false) Double number1,
                                  @RequestParam(value = "num2", required = false) Double number2) {
        if (number1 == null && number2 == null) {
            return "Введите числа";
        } else if (number1 == null) {
            return "Введите первое число + " + String.format("%.0f", number2) + " = ";
        } else if (number2 == null) {
            return String.format("%.0f", number1) + " + Введите второе число = ";
        } else {
            return number1 + " + " + number2 + " = " + calculatorService.plusCalculator(number1, number2);
        }
    }
    @GetMapping(path = "minus")
    public String minusCalculator(@RequestParam(value = "num1", required = false) Double number1,
                                  @RequestParam(value = "num2", required = false) Double number2) {
        if (number1 == null && number2 == null) {
            return "Введите числа";
        } else if (number1 == null) {
            return "Введите первое число - " + String.format("%.0f", number2) + " = ";
        } else if (number2 == null) {
            return String.format("%.0f", number1) + " - Введите второе число = ";
        } else {
            return number1 + " - " + number2 + " = " + calculatorService.minusCalculator(number1, number2);
        }
    }

    @GetMapping(path = "multiply")
    public String multiplyCalculator(@RequestParam(value = "num1", required = false) Double number1,
                                     @RequestParam(value = "num2", required = false) Double number2) {
        if (number1 == null && number2 == null) {
            return "Введите числа";
        } else if (number1 == null) {
            return "Введите первое число * " + String.format("%.0f", number2) + " = ";
        } else if (number2 == null) {
            return String.format("%.0f", number1) + " * Введите второе число = ";
        } else {
            return String.format("%.0f", number1) + " * " + String.format("%.0f", number2) + " = " + calculatorService.multiplyCalculator(number1, number2);
        }
    }

    @GetMapping(path = "divide")
    public String divideCalculator(@RequestParam(value = "num1", required = false) Double number1,
                                   @RequestParam(value = "num2", required = false) Double number2) {
        if (number1 == null && number2 == null) {
            return "Введите числа";
        } else if (number1 == null) {
            if (number2 == 0) {
                return "Введите первое число. Деление на НОЛЬ не возможно.";
            } else {
                return "Введите первое число / " + String.format("%.0f", number2) + " = ";
            }
        } else if (number2 == null) {
            return String.format("%.0f", number1) + "/ Введите второе число = ";
        } else if (number2 == 0) {
            return "Деление на НОЛЬ не возможно.";
        } else {
            return String.format("%.0f", number1) + " / " + String.format("%.0f", number2) + " = " + calculatorService.divideCalculator(number1, number2);
        }
    }
}
