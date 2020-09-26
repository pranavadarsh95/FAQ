package com.pratibhaRathi.FAQ.Bank.Service;

import java.util.List;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;

public interface FaqServiceInterface {
	
	public FaqClass saveFaq(FaqClass faqClass);

	public List<FaqClass> FindAllFaq();
	
	public FaqClass FindFaqById(int id);
	
	public FaqClass updateFaqById(FaqClass faqClass);
	
	public void DeleteFaqById(int id);
}
