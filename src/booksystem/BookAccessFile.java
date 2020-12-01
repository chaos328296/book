package booksystem;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class BookAccessFile {
	List<Book> booklist1;
	public BookAccessFile() {
		//initBook(booklist1);
		booklist1=new ArrayList<Book>();
	
	}
	
	//写到文件内
		public void book_write() throws IOException {
			FileOutputStream out=new FileOutputStream("C:\\Users\\86185\\Documents\\图书管理系统2.0\\图书信息.txt");
			ObjectOutputStream oos=new ObjectOutputStream(out);
		    for(Book book: booklist1) {
		    	oos.writeObject(book);
		    	oos.flush();
		    	
		    }
		    oos.close();
			
		}
   //从文件中读出来
		public List<Book> book_read() throws FileNotFoundException, IOException, ClassNotFoundException{
			Object obj=null;
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\86185\\Documents\\图书管理系统2.0\\图书信息.txt"));
			try {
				while((obj=in.readObject()) != null) {
					
					booklist1.add((Book) obj);
					System.out.println((Book)obj);
				}
			}catch(EOFException e) {
				//e.printStackTrace();
			}
			/*obj=in.readObject();
			booklist1.add((Book)obj);
			System.out.println((Book)obj);*/
			return booklist1;
			
		}
		/*public void initBook(List<Book> book) {
		    Book b=new Book("1021","数据库系统原理","王珊","人民邮电出版社",10);
		    Book b1=new Book("1014","数据结构","	严蔚敏","高等教育出版社",	9 );
		    Book b2=new Book("1106", "操作系统", "汤小丹", "人民邮电出版社",8);
		    Book b3=new Book("1203", "C语言程序设计","谭浩强","机械工业出版社",9);
		    Book b4=new Book("0105","C++语言程序设计","谭浩强","清华大学出版社 ",7);
		    Book b5=new Book("1012","Java语言程序设计","朱庆生","人民邮电出版社",8);
		    
			booklist1.add(b);
			booklist1.add(b1);
			booklist1.add(b2);
			booklist1.add(b3);
			booklist1.add(b4);
			booklist1.add(b5);
			try {
				book_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}*/
}
