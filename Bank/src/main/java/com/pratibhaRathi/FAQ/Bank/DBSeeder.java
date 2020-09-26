package com.pratibhaRathi.FAQ.Bank;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;
import com.pratibhaRathi.FAQ.Bank.Repository.FaqRepositoryInterface;


@Component
public class DBSeeder implements CommandLineRunner {

	@Autowired
    private final FaqRepositoryInterface faqRepositoryInterface;
    
    public DBSeeder(FaqRepositoryInterface faqRepositoryInterface) {
		this.faqRepositoryInterface = faqRepositoryInterface;
	}

	@Override
    public void run(String... args) throws Exception {
    	
    	
		FaqClass faqClass1 =new FaqClass("what is mastercard value","Mastercard value is 1500","mastercard");
		FaqClass faqClass2 =new FaqClass("what is Debitcard value","Mastercard value is 2500","Debitcard");
		FaqClass faqClass3 =new FaqClass("what is Creditcard value","Mastercard value is 1800","Creditcard");
		FaqClass faqClass4 =new FaqClass("what is Paytmcard value","currently unavailable","Paytmcard");
		FaqClass faqClass5 =new FaqClass("what is OnlineMerchantcard value","WE don't provide this service","OnlineMerchantcard");

        List<FaqClass> faqs = new ArrayList<>();
        faqs.add(faqClass1);
        faqs.add(faqClass2);
        faqs.add(faqClass3);
        faqs.add(faqClass4);
        faqs.add(faqClass5);
        
        faqRepositoryInterface.saveAll(faqs);

        
        
    }
}