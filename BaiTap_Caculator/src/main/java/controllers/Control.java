package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Control {
    @RequestMapping("/maytinh")
    public String calc(@RequestParam int num1, @RequestParam int num2, @RequestParam String operant, Model model) {
        int result = 0;
        switch (operant){
            case "+":
            result = num1 + num2;
            break;
            case "-":
                result = num1 - num2;
                break;
            case "x":
                result = num1 * num2;
                break;
            case "/" :
            result = num1 / num2;
            break;
        }
        model.addAttribute("result",result);
        return "index.jsp";
    }
    }

