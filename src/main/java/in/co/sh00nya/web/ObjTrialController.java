package in.co.sh00nya.web;

import java.util.Locale;

import in.co.sh00nya.model.UserInfo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ObjTrialController {
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testObject(Locale locale, Model model) {
		UserInfo info = new UserInfo();
		info.setFname("Sid");
		info.setLname("God");
		model.addAttribute("userInfo", info);
		return "testobj";
	}

}
