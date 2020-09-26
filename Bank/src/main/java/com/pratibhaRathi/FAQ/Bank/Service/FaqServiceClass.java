package com.pratibhaRathi.FAQ.Bank.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;
import com.pratibhaRathi.FAQ.Bank.Repository.FaqRepositoryClass;

@Service
public class FaqServiceClass implements FaqServiceInterface {

	@Autowired
	FaqRepositoryClass faqRepositoryClass;
	
	
	
	public FaqServiceClass(FaqRepositoryClass faqRepositoryClass) {
		this.faqRepositoryClass = faqRepositoryClass;
	}

	@Override
	public FaqClass saveFaq(FaqClass faqClass) {
		
		return null;
	}

	@Override
	public List<FaqClass> FindAllFaq() {
		
		return faqRepositoryClass.FindAllFaq();
	}

	@Override
	public FaqClass FindFaqById(int id) {
		
		return faqRepositoryClass.FindFaqById(id);
	}

	@Override
	public FaqClass updateFaqById(FaqClass faqClass) {
		
		return faqRepositoryClass.updateFaqById(faqClass);
	}

	@Override
	public void DeleteFaqById(int id) {
		
		faqRepositoryClass.DeleteFaqById(id);
	}

}
