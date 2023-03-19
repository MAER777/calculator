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
    public String plusCalculator (@RequestParam ("num1") double number1, @RequestParam("num2") double number2) {
        return number1 + " + " + number2 + " = " + calculatorService.plusCalculator(number1, number2);
    }
    @GetMapping(path = "minus")
    public String minusCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 + " - " + number2 + " = " + calculatorService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "multiply")
    public String multiplyCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 + " * " + number2 + " = " + calculatorService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "divide")
    public String divideCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return number1 + " / " + number2 + " = " + calculatorService.divideCalculator(number1, number2);
    }
}
