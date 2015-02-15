import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
public class MainClass {
	@RequestMapping("/")
	@ResponseBody
	String home(){
		return "Spring Boot has now been initialized. A litle bit longer..";
	}
	public static void main(String[] args) throws Exception {
        SpringApplication.run(MainClass.class, args);
    }

}
