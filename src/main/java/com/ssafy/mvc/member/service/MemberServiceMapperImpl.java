package com.ssafy.mvc.member.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssafy.mvc.member.dto.MemberDto;
import com.ssafy.mvc.member.repository.MemberRepository;

public class MemberServiceMapperImpl implements MemberService {

	private MemberRepository repo;
	
	@Autowired
	public MemberServiceMapperImpl(MemberRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public void register(String id, String name, String pass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDto update(String id, String name, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MemberDto login(String id, String pass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findPw(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
