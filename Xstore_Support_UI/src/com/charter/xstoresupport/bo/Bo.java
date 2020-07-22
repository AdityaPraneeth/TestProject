package com.charter.xstoresupport.bo;

import javax.swing.JTextField;

public class Bo {
	public String name;
	public String username;
	public String password;
	public String bnkstnbr;
	public String tsno;
	public String ttno;
	public String twid;
	public String tsts;
	public String csno;
	public String cid;
	public String dsno;
	public String dasnid;
	public String bdtsno;
	public String bdtwrgdt;
	public String bdtrstdt;
	
	
	
	public String getBdtsno() {
		return bdtsno;
	}
	public void setBdtsno(String bdtsno) {
		this.bdtsno = bdtsno;
	}
	public String getBdtwrgdt() {
		return bdtwrgdt;
	}
	public void setBdtwrgdt(String bdtwrgdt) {
		this.bdtwrgdt = bdtwrgdt;
	}
	public String getBdtrstdt() {
		return bdtrstdt;
	}
	public void setBdtrstdt(String bdtrstdt) {
		this.bdtrstdt = bdtrstdt;
	}
	public String getDsno() {
		return dsno;
	}
	public void setDsno(String dsno) {
		this.dsno = dsno;
	}
	public String getDasnid() {
		return dasnid;
	}
	public void setDasnid(String dasnid) {
		this.dasnid = dasnid;
	}
	public String getCsno() {
		return csno;
	}
	public void setCsno(String csno) {
		this.csno = csno;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getTsno() {
		return tsno;
	}
	public void setTsno(String tsno) {
		this.tsno = tsno;
	}
	public String getTtno() {
		return ttno;
	}
	public void setTtno(String ttno) {
		this.ttno = ttno;
	}
	public String getTwid() {
		return twid;
	}
	public void setTwid(String twid) {
		this.twid = twid;
	}
	public Object getTsts() {
		return tsts;
	}
	public void setTsts(String object) {
		this.tsts = object;
	}
	public String getBnkstnbr() {
		return bnkstnbr;
	}
	public void setBnkstnbr(String bnkstnbr) {
		this.bnkstnbr = bnkstnbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Bo [name=" + name + ", username=" + username + ", password=" + password + ", bnkstnbr=" + bnkstnbr
				+ ", tsno=" + tsno + ", ttno=" + ttno + ", twid=" + twid + ", tsts=" + tsts + ", csno=" + csno
				+ ", cid=" + cid + ", dsno=" + dsno + ", dasnid=" + dasnid + ", bdtsno=" + bdtsno + ", bdtwrgdt="
				+ bdtwrgdt + ", bdtrstdt=" + bdtrstdt + "]";
	}
	
	
	
}
