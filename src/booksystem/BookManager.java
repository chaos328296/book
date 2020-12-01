package booksystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookManager{
	BookAccessFile book_ac;
	private List<Book> booklist;
	private List<Book> booklist2;//查找图书的时候用的
	public BookManager(BookAccessFile book_ac) {
		this.book_ac=book_ac;
		booklist=book_ac.booklist1;
		booklist2=new ArrayList<Book>();
	}
	//图书信息的添加
		public void book_input(Book book)throws IOException {
			booklist.add(book);
			book_ac.book_write();
		}
		
		public void book_update(String o_BookID,String n_BookID,String BookName,String BookAuthor,String BookPress,int BookCount) throws FileNotFoundException, IOException, ClassNotFoundException {
			//先全部读出来找到要修改的，修改了以后再全部给它写进去
		    //弹出窗口询问请问你要修改那本书的书号是的是什么
		 
			for(Book book: booklist) {
				if(book.getBookID().equals(o_BookID)) {
					//有一个窗口弹出你要修改什么内容，每一个按钮有不同的点击事件
					//booklist1.remove(book);
					book.setBookID(n_BookID);
					book.setBookName(BookName);
					book.setBookAuthor(BookAuthor);
					book.setBookPress(BookPress);
					book.setBookCount(BookCount);
					//booklist1.add(book);
					book_ac.book_write();
			
					
			
				}
			} 
			//有一个窗口弹出没有找到你要查找的信息
		    
		}
		public void book_delete(String Num) throws FileNotFoundException, ClassNotFoundException, IOException {
				for(Book book: booklist) {
					if(book.getBookID().equals(Num)) {
						//有一个窗口弹出你要修改什么内容，每一个按钮有不同的点击事件
						booklist.remove(book);
						//book.setBookAuthor(bookAuthor);
						//booklist1.add(book);
						book_ac.book_write();
						
						
				
					}
				} 
		}

		public void queryByNum(String Num) throws FileNotFoundException, ClassNotFoundException, IOException {
			
			for(Book book: booklist) {
				if(book.getBookID().equals(Num)) {
					 booklist2.add(book);
					 System.out.println("进来了应该是会有加一的");
					
			
				}
			} 
			
			//有一个窗口弹出没有找到你要查找的信息
			
			
		}
		public void queryByName(String Name) throws FileNotFoundException, ClassNotFoundException, IOException {
			for(Book book: booklist) {
				if(book.getBookName().equals(Name)) {
					 booklist2.add(book);
					 System.out.println("进来了应该是会有加2的");
				}
			}
			
			//有一个窗口弹出没有找到你要查找的信息
		}
		public void queryByAuthor(String Author) throws FileNotFoundException, ClassNotFoundException, IOException {
		
			for(Book book: booklist) {
				if(book.getBookAuthor().equals(Author)) {
					//有一个窗口弹出所有查找到的信息
					booklist2.add(book);
					
					
			
				}
			}
			
		}
		public List<Book> getBooklist2() {
			return booklist2;
		}
		public void setBooklist2(List<Book> booklist2) {
			this.booklist2 = booklist2;
		}
		public void deleteAllbl2() {
			if(booklist2.size()!=0) {
				booklist2.clear();
			}
		}
		
}
