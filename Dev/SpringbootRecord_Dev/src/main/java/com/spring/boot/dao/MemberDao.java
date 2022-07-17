package com.spring.boot.dao;

import com.spring.boot.vo.Vo_member;
import com.spring.boot.vo.Vo_study;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberDao {

    // 멤버 전체 리스트
    public List<Vo_member> doMemberList();

    // 멤버 One row
    public Vo_member doMemberListOne(String strMemberId);

    // 멤버 수정
    public int doMemberUp(Vo_member vo_member);

    // 멤버 삭제
    public int doMemberDel(String strMemberId);

    // 멤버 등록
    public int doMemberIns(Vo_member vo_member);

}
