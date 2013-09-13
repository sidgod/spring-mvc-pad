package in.co.sh00nya.web;

import java.util.List;

import in.co.sh00nya.util.MsgRepoHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {
	
	@Autowired
	private MsgRepoHandler msgRepoHandler;
	
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
	
	@RequestMapping(value = "/data/list", method = RequestMethod.GET, produces = "application/json", headers="Accept=*/*")
	public @ResponseBody List<String> getMsgList(Model model) {
		if(msgRepoHandler != null) {
			return msgRepoHandler.getMsgList();
		}
		return null;
	}

}
