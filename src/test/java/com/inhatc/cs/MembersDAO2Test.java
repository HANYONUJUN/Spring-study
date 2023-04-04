package com.inhatc.cs;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.inhatc.domain.MembersVO;
import com.inhatc.persistence.MembersDAO;


@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"}
)
public class MembersDAO2Test {
		
	@Inject
	private MembersDAO dao;
	
	@Test
	public void testInsertMembers() throws Exception {
		MembersVO vo = new MembersVO();
		vo.setUserid("userID1");
		vo.setUserpw("PW1");
		vo.setUsername("Name 1");
		vo.setEmail("sfsdf@itc.ac.kr");
		dao.insertMembers(vo);
	}
}
