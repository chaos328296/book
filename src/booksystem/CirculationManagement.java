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
		//传进来的有用户名 书号
		Boolean flag=true;
		for(Book book: bc.booklist1) {
			if(BookID.equals(book.getBookID())) {
				if(book.getBookCount()!=0) {
					book.setBookCount(book.getBookCount()-1);
					flag=false;
				}else {
					JOptionPane.showMessageDialog(null, "这本书已经被借完了，请过一段时间再来看看！");
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
			//最后一个操作人应该是登录的时候带过来的
			
			
			bcir=new BookCirculation(String.valueOf(serialNum++),UserNum,BookID,date,1,"");
			System.out.println(serialNum);
			cda.BookCirculations.add(bcir);
			try {
				cda.Cir_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "借书成功");
		}else {
			JOptionPane.showMessageDialog(null, "没有找到这本书");
		}
		
		
		//生成一条借书记录
		//借书人对应的文件
		//图书对应的藏书量的文件 藏书量减一
		
		
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
			//最后一个操作人应该是登录的时候带过来的
			
			
			bcir=new BookCirculation(String.valueOf(serialNum++),UserNum,BookID,date,2,"");
			
			cda.BookCirculations.add(bcir);
			try {
				cda.Cir_write();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
			JOptionPane.showMessageDialog(null, "还书成功");
			
		}else {
			JOptionPane.showMessageDialog(null, "没有找到这本书");
		}
		
		
	}
	//利用用户名查阅借还书文件
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
