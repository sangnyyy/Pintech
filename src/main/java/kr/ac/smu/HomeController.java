package kr.ac.smu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
		return "index";
	}
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "signup";
	}
	@RequestMapping(value = "/gconsult", method = RequestMethod.GET)
	public String showGConsult() {
		return "gconsult";
	}
	
	@RequestMapping(value = "/pconsult", method = RequestMethod.GET)
	public String showPConsult() {
		return "pconsult";
	}
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public String showNews() {
		return "news";
	}
	@RequestMapping(value = "/policy", method = RequestMethod.GET)
	public String showPolicy() {
		return "policy";
	}
	@RequestMapping(value = "/community", method = RequestMethod.GET)
	public String showCommunity() {
		return "community";
	}
	@RequestMapping(value = "/stat", method = RequestMethod.GET)
	public String showStat() {
		return "stat";
	}
}
