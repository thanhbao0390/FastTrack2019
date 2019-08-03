package sts.com.vn.autogen.service;

import org.springframework.stereotype.Service;

import sts.com.vn.autogen.dao.InformationDao;

@Service
public class InformationService {

	private InformationDao dao;

	public void getTables() {
		// TODO Auto-generated method stub
		System.out.println("list table geting...");
		dao.getTables();

	}

}
