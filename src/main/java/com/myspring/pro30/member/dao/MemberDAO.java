package com.myspring.pro30.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;



public interface MemberDAO {

	List selectAllMemberList() throws DataAccessException;

	int insertMember(MemberVO memberVO) throws DataAccessException;

	int deleteMember(String id) throws DataAccessException;

	int addMember(MemberVO memberVO) throws DataAccessException;

	int updateMember(MemberVO memberVO) throws DataAccessException;

	MemberVO selectMemberById(String id) throws DataAccessException;
	
	MemberVO loginById(MemberVO memberVO) throws DataAccessException;

}