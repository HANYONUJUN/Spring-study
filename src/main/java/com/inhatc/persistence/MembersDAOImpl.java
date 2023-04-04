package com.inhatc.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.MembersVO;


@Repository
public class MembersDAOImpl implements MembersDAO{

     @Inject
     private SqlSession sqlSession;
     
     private static final String namespace = "com.inhatc.mapper.MemberMapper";
	
	 @Override
     public String getTime() {
    	 
    	 return sqlSession.selectOne(namespace + ".getTime"); //문자열로 받아와서 출력
     
     }
	 @Override
	 public void insertMembers(MembersVO vo) {
		sqlSession.insert(namespace + ".insertMembers", vo); 
	 }
	
}
