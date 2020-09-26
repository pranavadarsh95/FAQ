package com.pratibhaRathi.FAQ.Bank.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;

@Repository
public class FaqRepositoryClass {

	@Autowired
	FaqRepositoryInterface faqRepositoryInterface;

	public FaqRepositoryClass(FaqRepositoryInterface faqRepositoryInterface) {
		this.faqRepositoryInterface = faqRepositoryInterface;
	}
	
	public FaqClass saveFaq(FaqClass faqClass){
		return faqRepositoryInterface.save(faqClass);
	}

	public List<FaqClass> FindAllFaq(){
		return faqRepositoryInterface.findAll();
	}
	
	public FaqClass FindFaqById(int id) {
		return faqRepositoryInterface.findById(id).get();
	}
	
	public FaqClass updateFaqById(FaqClass faqClass) {
		return faqRepositoryInterface.save(faqClass);
	}
	
	public void DeleteFaqById(int id) {
		faqRepositoryInterface.deleteById(id);
	}
	
}
