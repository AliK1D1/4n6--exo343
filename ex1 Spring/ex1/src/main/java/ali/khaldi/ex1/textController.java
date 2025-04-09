package ali.khaldi.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class textController {
    @GetMapping(value = "/text")
    public @ResponseBody String text(){
        System.out.println("requete recu");
        return "text bla bla bla yo mama";
    }
}
