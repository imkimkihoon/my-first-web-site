package kr.co.board_model2.dto;

public class BoardDto {
 private int id,readnum;
 private String title,content,pwd,userid,writeday;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getReadnum() {
	return readnum;
}
public void setReadnum(int readnum) {
	this.readnum = readnum;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getWriteday() {
	return writeday;
}
public void setWriteday(String writeday) {
	this.writeday = writeday;
}
 
 
}
