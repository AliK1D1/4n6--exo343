package ali.khaldi.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;

@Controller
public class MonController {
    @Autowired
    private  monservice fibonacciService;
    @GetMapping(value = "/test/{coucou}/test")
    public @ResponseBody String test(@PathVariable Long coucou, @RequestParam(required = false, name = "id") String monSuperID) {
        System.out.println("Requête reçue : " + coucou + " " + monSuperID);
        return (coucou / 2) + "";
    }

    @GetMapping(value = "/bonjour")
    public @ResponseBody String bonjour() {
        System.out.println("Requête reçue sur bonjour ");
        return "bonjour le monde";
    }

    @PostMapping(value = "/prout/envoyer")
    public @ResponseBody String ajouterEnPost(@RequestParam int num) {
        System.out.println("requete recu");
        String text = "pipo";
        for (int i = 0; i < num; i++) {
            text += text;
        }
        return text;
    }

    @GetMapping("/fibo/{n}")
    public @ResponseBody BigInteger getFibonacci(@PathVariable int n) {
        return fibonacciService.Fibonacci(n);
    }

}
