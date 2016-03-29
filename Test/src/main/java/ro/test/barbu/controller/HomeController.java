package ro.test.barbu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Meniu navigare module aplicatii.
 */
@Controller
public class HomeController {

	@RequestMapping("/")
	public String startApp() {

		return "home";
	}

	@RequestMapping("/home")
	public String acasa() {

		return "home";
	}

	@RequestMapping(value="/home", params ="bon")
	public String bon() {

		return "bon";
	}
	
	@RequestMapping(value="/home", params ="afisaj")
	public String afisaj() {

		return "afisaj";
	}
	@RequestMapping(value="/home", params ="grefier")
	public String grefier() {

		return "grefier";
	}
}
