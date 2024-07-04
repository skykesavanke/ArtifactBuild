
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
        @GetMapping("/call")
        public String Hello(){
            return "Hello,Everyone...I am Keerthu";
        }
    }

