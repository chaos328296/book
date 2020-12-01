package booksystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookManager{
	BookAccessFile book_ac;
	private List<Book> booklist;
	private List<Book> booklist2;//����ͼ���ʱ���õ�
	public BookManager(BookAccessFile book_ac) {
		this.book_ac=book_ac;
		booklist=book_ac.booklist1;
		booklist2=new ArrayList<Book>();
	}
	//ͼ����Ϣ�����
		public void book_input(Book book)throws IOException {
			booklist.add(book);
			book_ac.book_write();
		}
		
		public void book_update(String o_BookID,String n_BookID,String BookName,String BookAuthor,String BookPress,int BookCount) throws FileNotFoundException, IOException, ClassNotFoundException {
			//��ȫ���������ҵ�Ҫ�޸ĵģ��޸����Ժ���ȫ������д��ȥ
		    //��������ѯ��������Ҫ�޸��Ǳ��������ǵ���ʲô
		 
			for(Book book: booklist) {
				if(book.getBookID().equals(o_BookID)) {
					//��һ�����ڵ�����Ҫ�޸�ʲô���ݣ�ÿһ����ť�в�ͬ�ĵ���¼�
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
			//��һ�����ڵ���û���ҵ���Ҫ���ҵ���Ϣ
		    
		}
		public void book_delete(String Num) throws FileNotFoundException, ClassNotFoundException, IOException {
				for(Book book: booklist) {
					if(book.getBookID().equals(Num)) {
						//��һ�����ڵ�����Ҫ�޸�ʲô���ݣ�ÿһ����ť�в�ͬ�ĵ���¼�
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
					 System.out.println("������Ӧ���ǻ��м�һ��");
					
			
				}
			} 
			
			//��һ�����ڵ���û���ҵ���Ҫ���ҵ���Ϣ
			
			
		}
		public void queryByName(String Name) throws FileNotFoundException, ClassNotFoundException, IOException {
			for(Book book: booklist) {
				if(book.getBookName().equals(Name)) {
					 booklist2.add(book);
					 System.out.println("������Ӧ���ǻ��м�2��");
				}
			}
			
			//��һ�����ڵ���û���ҵ���Ҫ���ҵ���Ϣ
		}
		public void queryByAuthor(String Author) throws FileNotFoundException, ClassNotFoundException, IOException {
		
			for(Book book: booklist) {
				if(book.getBookAuthor().equals(Author)) {
					//��һ�����ڵ������в��ҵ�����Ϣ
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
