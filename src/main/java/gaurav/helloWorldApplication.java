package gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

import javax.servlet.annotation.WebServlet;


@ServletComponentScan
@SpringBootApplication
@ComponentScan
public class helloWorldApplication {
    public static void main(String[] args) {
//        System.out.println(100);
        SpringApplication.run(helloWorldApplication.class, args);
    }
}
