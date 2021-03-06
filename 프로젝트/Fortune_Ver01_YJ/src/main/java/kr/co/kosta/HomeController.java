package kr.co.kosta;

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
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	@RequestMapping(value = "/index.htm", method = RequestMethod.GET)
	public String index() {

		
		System.out.println("�떆�옉�럹�씠吏� 而⑦듃濡ㅻ윭 ��湲�");
		return "WEB-INF/views/index.html";
	}
	
	@RequestMapping(value = "/index.htm", method = RequestMethod.POST)
	public String index2() {

		
		System.out.println("POST!!!");
		return "WEB-INF/views/index.html";
	}
	
	@RequestMapping(value = "/sign.htm", method = RequestMethod.POST)
	public String sign() {

		
		System.out.println("sign!!!");
		return "WEB-INF/views/sign.html";
	}

	
}
