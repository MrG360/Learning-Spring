package gaurav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

import javax.servlet.annotation.WebServlet;


@ServletComponentScan
@SpringBootApplication
public class helloWorldApplication {
    public static void main(String[] args) {
        System.out.println(100);
        SpringApplication.run(helloWorldApplication.class, args);
    }
}
