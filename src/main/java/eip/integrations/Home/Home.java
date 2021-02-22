package eip.integrations.Home;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Home {

    private static final Map<String, String> PING;
	static {
		PING = new HashMap<>();
		PING.put("name", "tars-eip");
	}

	@GetMapping("/ping")
	@ResponseBody
	public Map<String, String> ping() {
		return PING;
	}
	
	@GetMapping("/")
	public RedirectView redirectToDocs(RedirectAttributes attributes) {
	  return new RedirectView("/swagger-ui.html");
	}
}
