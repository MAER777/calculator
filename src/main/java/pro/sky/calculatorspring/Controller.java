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
    public String plusCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return helloService.plusCalculator(number1, number2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return helloService.minusCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String multiplyCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return helloService.multiplyCalculator(number1, number2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divideCalculator(@RequestParam("num1") double number1, @RequestParam("num2") double number2) {
        return helloService.divideCalculator(number1, number2);
    }
}
