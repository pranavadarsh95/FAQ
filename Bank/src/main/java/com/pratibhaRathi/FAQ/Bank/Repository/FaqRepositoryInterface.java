package com.pratibhaRathi.FAQ.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratibhaRathi.FAQ.Bank.Entity.FaqClass;


public interface FaqRepositoryInterface extends JpaRepository<FaqClass,Integer> {

}
