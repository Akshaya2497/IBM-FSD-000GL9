package comm.example.spring;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	@RequestMapping(method = RequestMethod.GET,name = "/insertView")
	public String studentHome() {
		return "insertStudent";
	}
	@RequestMapping(method = RequestMethod.POST,name = "/showView")
	public String studentShow(){
		return "showStudent";
	}
	@RequestMapping(name = "/processFormVersionThree")
	public String processStudentFormVersionThree(@RequestParam("name") String studentName,
			Model theModel)
	
	{
		String message="Yo!!"+(studentName.toUpperCase());
theModel.addAttribute("M", message);
		return "hello-world";
	}
	
}
