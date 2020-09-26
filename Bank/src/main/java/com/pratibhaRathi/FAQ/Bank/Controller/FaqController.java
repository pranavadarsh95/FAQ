package com.pratibhaRathi.FAQ.Bank.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;
import com.pratibhaRathi.FAQ.Bank.Service.FaqServiceInterface;

@RestController
public class FaqController {

	@Autowired
	FaqServiceInterface faqServiceInterface;

	public FaqController(FaqServiceInterface faqServiceInterface) {
		this.faqServiceInterface = faqServiceInterface;
	}
	
	@PostMapping("/saveFaq")
	public FaqClass saveFaq(@RequestBody FaqClass faqClass) {
		
		return  faqServiceInterface.saveFaq(faqClass);
	}

	@GetMapping("/findAllfaq")
	public List<FaqClass> FindAllFaq(){
		
		return faqServiceInterface.FindAllFaq();
	
	}
	
	@GetMapping("/findFaqById/{id}")
	public FaqClass FindFaqById(@PathVariable int id) {
		
		return faqServiceInterface.FindFaqById(id);
		
	}
	
	@PutMapping("/updateFaq")
	public FaqClass updateFaqById(@RequestBody FaqClass faqClass) {
		/* In this pass Id also*/
		return faqServiceInterface.updateFaqById(faqClass);
		
	}
	
	@DeleteMapping("/deleteFaq/{id}")
	public void DeleteFaqById(@PathVariable int id) {
		
		faqServiceInterface.DeleteFaqById(id);
				
	}
	
}
