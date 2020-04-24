package gaurav;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


//Usinh MVC architecture to call the url helloSpring
@Controller
public class HelloWorldController {

    @RequestMapping("/helloSpring")
    //This annotation is used to tell the Spring (dispatcher servlet and handler mapping classes)
    // that the controller method is mapped to a specific URL.
    @ResponseBody
    //The @ResponseBody annotation denotes that the object returned by this method
    // is to be returned to the user as an HTTP response.
    public String helloSpring(){
        return "Hello Spring using Controller";
    }

    // We don't require @ResponseBody
    //Because we are retuning index.html file
    //Id ResponseBody was used then only index would have been printed.
    @RequestMapping("/helloSpringMVC")
    public String helloSpringMVC(){
        return "index";
        // It searches for index.html file itself
        //because of the thymeleaf dependency
    }
}
