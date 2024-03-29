package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.persistence.MembersDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)

public class MembersDAO1Test {
	
	
	@Inject
	private MembersDAO dao;
	
	@Test
	public void TestTime() throws Exception{
		System.out.println("------------test-------------");
		System.out.println(dao.getTime());
		System.out.println("------------test-------------");
		
	}
	
}
