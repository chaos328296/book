package booksystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Book implements Serializable{
	private String BookID;
	private String BookName;
	private String BookAuthor;
	private String BookPress;
	private int BookCount;
	
	public Book(String BookID,String BookName,String BookAuthor,String BookPress,int BookCount) {
		this.BookID=BookID;
		this.BookName=BookName;
		this.BookAuthor=BookAuthor;
		this.BookPress=BookPress;
		this.BookCount=BookCount;
		
	}
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getBookPress() {
		return BookPress;
	}
	public void setBookPress(String bookPress) {
		BookPress = bookPress;
	}
	public int getBookCount() {
		return BookCount;
	}
	public void setBookCount(int bookCount) {
		BookCount = bookCount;
	}
	@Override
	public String toString() {
		return "Book [BookID=" + BookID + ", BookName=" + BookName + ", BookAuthor=" + BookAuthor + ", BookPress="
				+ BookPress + ", BookCount=" + BookCount + "]";
	}
	
	
	
	

}
