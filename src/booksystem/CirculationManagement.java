package booksystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class CirculationManagement {
	List<BookCirculation> Bcirlist=new ArrayList<BookCirculation>();
	CirculationDataAccess cda;
	BookAccessFile bc;
	BookCirculation bcir;
	static int serialNum=0;

	public CirculationManagement(CirculationDataAccess Cir_Acc,BookAccessFile bc) {
		this.bc=bc;
		cda=Cir_Acc;
		Bcirlist=new ArrayList<BookCirculation>();
		
	}
	public void lendBook(String date,String BookID,String UserNum) {
		//�����������û��� ���
		Boolean flag=true;
		for(Book book: bc.booklist1) {
			if(BookID.equals(book.getBookID())) {
				if(book.getBookCount()!=0) {
					book.setBookCount(book.getBookCount()-1);
					flag=false;
				}else {
					JOptionPane.showMessageDialog(null, "�Ȿ���Ѿ��������ˣ����һ��ʱ������������");
				}
				
			}
		}
		if(!flag) {
		
			try {
				bc.book_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//���һ��������Ӧ���ǵ�¼��ʱ���������
			
			
			bcir=new BookCirculation(String.valueOf(serialNum++),UserNum,BookID,date,1,"");
			System.out.println(serialNum);
			cda.BookCirculations.add(bcir);
			try {
				cda.Cir_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "����ɹ�");
		}else {
			JOptionPane.showMessageDialog(null, "û���ҵ��Ȿ��");
		}
		
		
		//����һ�������¼
		//�����˶�Ӧ���ļ�
		//ͼ���Ӧ�Ĳ��������ļ� ��������һ
		
		
	}
	public void returnBook(String date,String BookID,String UserNum) {
		Boolean flag=true;
		for(Book book: bc.booklist1) {
			if(BookID.equals(book.getBookID())) {
				book.setBookCount(book.getBookCount()+1);
				flag=false;
			}
		}
		if(!flag) {
			try {
				bc.book_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//���һ��������Ӧ���ǵ�¼��ʱ���������
			
			
			bcir=new BookCirculation(String.valueOf(serialNum++),UserNum,BookID,date,2,"");
			
			cda.BookCirculations.add(bcir);
			try {
				cda.Cir_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			JOptionPane.showMessageDialog(null, "����ɹ�");
			
		}else {
			JOptionPane.showMessageDialog(null, "û���ҵ��Ȿ��");
		}
		
		
	}
	//�����û������Ľ軹���ļ�
	public void query(String UserID) {
		for(BookCirculation bcc:cda.BookCirculations) {
			if(UserID.equals(bcc.getUserid())) {
				Bcirlist.add(bcc);
			}
		}
	}
	public List<BookCirculation> getBcirlist() {
		return Bcirlist;
	}
	public void setBcirlist(List<BookCirculation> bcirlist) {
		Bcirlist = bcirlist;
	}
	public void deleteAllBcirlist() {
		if(Bcirlist.size()!=0) {
			Bcirlist.clear();
		}
	}
}
