package booksystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public  static void main(String args[]) throws IOException, ClassNotFoundException {
		//List<Book> booklist=new ArrayList<Book>();
		BookAccessFile bc=new BookAccessFile();
		CirculationDataAccess cda=new CirculationDataAccess();
		/* Book b=new Book("1021","���ݿ�ϵͳԭ��","��ɺ","�����ʵ������",10);
		 Book b1=new Book("1014","���ݽṹ","��ε��","�ߵȽ���������",	9 );
		    Book b2=new Book("1106", "����ϵͳ", "��С��", "�����ʵ������",8);
		    Book b3=new Book("1203", "C���Գ������","̷��ǿ","��е��ҵ������",9);
		    Book b4=new Book("0105","C++���Գ������","̷��ǿ","�廪��ѧ������ ",7);
		    Book b5=new Book("1012","Java���Գ������","������","�����ʵ������",8);
		    
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
