package in.co.sh00nya.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {
	
	@RequestMapping(value = "/data/{index}", method = RequestMethod.GET)
	public String getDataByIndex(@PathVariable int index, Model model) {
		model.addAttribute("index", index);
		return "displaydata";
	}
	
	@RequestMapping(value = "/data/newtext", method = RequestMethod.POST, consumes = "text/plain")
	public String createNewData(@RequestBody String data, Model model) {
		model.addAttribute("data", data);
		return "create_done";
	}

}
