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
	
	//д���ļ���
		public void book_write() throws IOException {
			FileOutputStream out=new FileOutputStream("C:\\Users\\86185\\Documents\\ͼ�����ϵͳ2.0\\ͼ����Ϣ.txt");
			ObjectOutputStream oos=new ObjectOutputStream(out);
		    for(Book book: booklist1) {
		    	oos.writeObject(book);
		    	oos.flush();
		    	
		    }
		    oos.close();
			
		}
   //���ļ��ж�����
		public List<Book> book_read() throws FileNotFoundException, IOException, ClassNotFoundException{
			Object obj=null;
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\86185\\Documents\\ͼ�����ϵͳ2.0\\ͼ����Ϣ.txt"));
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
		    Book b=new Book("1021","���ݿ�ϵͳԭ��","��ɺ","�����ʵ������",10);
		    Book b1=new Book("1014","���ݽṹ","	��ε��","�ߵȽ���������",	9 );
		    Book b2=new Book("1106", "����ϵͳ", "��С��", "�����ʵ������",8);
		    Book b3=new Book("1203", "C���Գ������","̷��ǿ","��е��ҵ������",9);
		    Book b4=new Book("0105","C++���Գ������","̷��ǿ","�廪��ѧ������ ",7);
		    Book b5=new Book("1012","Java���Գ������","������","�����ʵ������",8);
		    
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
