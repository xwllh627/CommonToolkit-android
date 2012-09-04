package com.richitec.commontoolkit.user;

/**
 * User Bean
 * 
 * @author sk
 * 
 */
public class UserBean {
	private String name = "";
	private String password = "";
	private String userkey = "";
	private boolean rememberPwd;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserkey() {
		return userkey;
	}

	public void setUserkey(String userkey) {
		this.userkey = userkey;
	}

	public boolean isRememberPwd() {
		return rememberPwd;
	}

	public void setRememberPwd(boolean rememberPwd) {
		this.rememberPwd = rememberPwd;
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("username: ").append(name).append('\n');
		sb.append("password: ").append(password).append('\n');
		sb.append("userkey: ").append(userkey).append('\n');
		sb.append("rememberPwd: ").append(rememberPwd).append('\n');
		return sb.toString();

	}

}