package com.TNS.user_service;

public class User {
	
 private Integer U_id;
 private String User_name;
 private String User_email;
 private String User_password;
 private Long User_ph_no;
 private String User_age;
 private String User_gender;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Integer u_id, String user_name, String user_email, String user_password, Long user_ph_no, String user_age,
		String user_gender) {
	super();
	U_id = u_id;
	User_name = user_name;
	User_email = user_email;
	User_password = user_password;
	User_ph_no = user_ph_no;
	User_age = user_age;
	User_gender = user_gender;
}
public Integer getU_id() {
	return U_id;
}
public void setU_id(Integer u_id) {
	U_id = u_id;
}
public String getUser_name() {
	return User_name;
}
public void setUser_name(String user_name) {
	User_name = user_name;
}
public String getUser_email() {
	return User_email;
}
public void setUser_email(String user_email) {
	User_email = user_email;
}
public String getUser_password() {
	return User_password;
}
public void setUser_password(String user_password) {
	User_password = user_password;
}
public Long getUser_ph_no() {
	return User_ph_no;
}
public void setUser_ph_no(Long user_ph_no) {
	User_ph_no = user_ph_no;
}
public String getUser_age() {
	return User_age;
}
public void setUser_age(String user_age) {
	User_age = user_age;
}
public String getUser_gender() {
	return User_gender;
}
public void setUser_gender(String user_gender) {
	User_gender = user_gender;
}
@Override
public String toString() {
	return "user [U_id=" + U_id + ", User_name=" + User_name + ", User_email=" + User_email + ", User_password="
			+ User_password + ", User_ph_no=" + User_ph_no + ", User_age=" + User_age + ", User_gender=" + User_gender
			+ "]";
}
 

}


