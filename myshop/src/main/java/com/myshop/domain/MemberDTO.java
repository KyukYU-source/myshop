package com.myshop.domain;

import java.util.Date;

public class MemberDTO {
	private int member_num;
	private String member_name;
	private String member_rnum;
	private String member_id;
	private String member_pw;
	private String member_addr;
	private String member_tel;
	private Date member_date;
	
	public int getMember_num() {
		return member_num;
	}
	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_rnum() {
		return member_rnum;
	}
	public void setMember_rnum(String member_rnum) {
		this.member_rnum = member_rnum;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}
	public String getMember_tel() {
		return member_tel;
	}
	public void setMember_tel(String member_tel) {
		this.member_tel = member_tel;
	}
	public Date getMember_date() {
		return member_date;
	}
	public void setMember_date(Date member_date) {
		this.member_date = member_date;
	}
	@Override
	public String toString() {
		return "MemberDTO [member_num=" + member_num + ", member_name=" + member_name + ", member_rnum=" + member_rnum
				+ ", member_id=" + member_id + ", member_pw=" + member_pw + ", member_addr=" + member_addr
				+ ", member_tel=" + member_tel + ", member_date=" + member_date + "]";
	}
	
	
	
}
