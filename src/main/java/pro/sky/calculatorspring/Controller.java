package pro.sky.calculatorspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final HelloService helloService;

    public Controller(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }

    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName) {
        return helloService.answerHello(userName);
    }

    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return helloService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String plusCalculator(@RequestParam (value = "num1", required = false) double number1, @RequestParam(value = "num2", required = false) double number2) {
        return number1 + " + " + number2 + " = " + helloService.plusCalculator(number1, number2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam(value = "num1", required = false) double number1, @RequestParam(value = "num2", required = false) double number2) {
        return number1 + " - " + number2 + " = " + helloService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam(value = "num1", required = false) double number1, @RequestParam(value = "num2", required = false) double number2) {
        return number1 + " * " + number2 + " = " + helloService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam(value = "num1", required = false) Integer number1, @RequestParam(value = "num2", required = false) Integer number2) {
        return number1 + " / " + number2 + " = " + helloService.divideCalculator(number1, number2);
    }
}
