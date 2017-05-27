package com.student.service.impl;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.student.dao.BankDao;
import com.student.service.BankService;

public class BankServiceImpl implements BankService{
	
	private BankDao bankDao;
	
	private TransactionTemplate transactionTemplate; 
	
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}


	public void setBankDao(BankDao bankDao) {
		this.bankDao = bankDao;
	}


	@Override
	public void transferAcounts(int account, int userIdA, int userIdB) {
		
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				bankDao.OutMoney(account, userIdA);
				bankDao.inMoney(account, userIdB);
				
			}
		});
		
		
	}

}
