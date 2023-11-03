package com.ssafy.mvc.member.repository;

import com.ssafy.mvc.member.dto.MemberDto;

public interface MemberRepository {
	// 회원가입
	public void register(String id, String name, String pass);
	// 회원수정
	public MemberDto update(String id, String name, String pass);
	// 회원조회
	//public MemberDto research(String id);
	// 회원탈퇴
	public void delete(String id);
	// 로그인
	public MemberDto login(String id, String pass);
	// 로그아웃 -> 컨트롤러에서 구현 
	// 비밀번호 찾기 
	public String findPw(String id);
}
