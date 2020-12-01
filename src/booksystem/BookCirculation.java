package booksystem;

import java.io.Serializable;

public class BookCirculation implements Serializable {
	private String serialNo;
	private String Userid;
	private String Book_Num;
	private String date;
	private int  type;
	private String operator;
	public BookCirculation(String serialNo,String Userid,String Book_Num,String date,int type,String operator) {
		this.serialNo=serialNo;
		this.Userid=Userid;
		this.Book_Num=Book_Num;
		this.date=date;
		this.type=type;
		this.operator=operator;
	}
	public String getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
	public String getUserid() {
		return Userid;
	}
	public void setUserid(String userid) {
		Userid = userid;
	}
	public String getBook_Num() {
		return Book_Num;
	}
	public void setBook_Num(String book_Num) {
		Book_Num = book_Num;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	
	
	
	
}
