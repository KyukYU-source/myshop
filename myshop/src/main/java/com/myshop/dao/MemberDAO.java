package com.myshop.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myshop.domain.MemberDTO;

@Component
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate myBatis;
	
	public void insert(MemberDTO dto) {
		myBatis.insert("mem.insert", dto);
	}
	
}
