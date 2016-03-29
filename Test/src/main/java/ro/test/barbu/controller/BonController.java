package ro.test.barbu.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ro.test.barbu.model.Dosar;
import ro.test.barbu.repositories.DosarJpaRepository;
import ro.test.barbu.services.GenereazaBonService;

@Controller
public class BonController {
	
	Dosar d;
	
	@Autowired
	DosarJpaRepository dosarRepository;
	
	@RequestMapping("/cauta")
	public String cauta(@RequestParam("nrDosar") String nrDosar, Model model) {
		d = dosarRepository.findByNrDosar(nrDosar);
		if(d  != null){
			model.addAttribute("firmaGasita", d.getDenFirma());
		} else {
			model.addAttribute("firmaGasita", "Nu exista aceasta firma!");
		}
		//serviciu return Dosar
		
		return "bon";
		
	}
	
	@RequestMapping("/tipareste")
	@ResponseBody
	public FileSystemResource  tipareste() {
		
		
	    try {
			return new FileSystemResource(GenereazaBonService.tipareste());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null; 
	    
		//return "bon";
		
	}
}
