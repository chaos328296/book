package booksystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public  static void main(String args[]) throws IOException, ClassNotFoundException {
		//List<Book> booklist=new ArrayList<Book>();
		BookAccessFile bc=new BookAccessFile();
		CirculationDataAccess cda=new CirculationDataAccess();
		/* Book b=new Book("1021","数据库系统原理","王珊","人民邮电出版社",10);
		 Book b1=new Book("1014","数据结构","严蔚敏","高等教育出版社",	9 );
		    Book b2=new Book("1106", "操作系统", "汤小丹", "人民邮电出版社",8);
		    Book b3=new Book("1203", "C语言程序设计","谭浩强","机械工业出版社",9);
		    Book b4=new Book("0105","C++语言程序设计","谭浩强","清华大学出版社 ",7);
		    Book b5=new Book("1012","Java语言程序设计","朱庆生","人民邮电出版社",8);
		    
			bc.booklist1.add(b);
			bc.booklist1.add(b1);
			bc.booklist1.add(b2);
			bc.booklist1.add(b3);
			bc.booklist1.add(b4);
			bc.booklist1.add(b5);
			bc.book_write();*/
			bc.book_read();
			cda.Cir_read();
			BookManagerMenu bm=new BookManagerMenu(3,bc,cda);
	}

}
