package booksystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class BookMenuListener implements ActionListener {
	BookManagerMenu bm;
	BookManagementAchieveMenu bam;
	CirculationAchieveMenu cam;
	BookAccessFile ba;
	CirculationDataAccess cda;
	int type;
	public BookMenuListener(BookManagerMenu o,int n,BookAccessFile bc,CirculationDataAccess cda) {
		this.bm=o;
		type=n;
		ba=bc;
		this.cda=cda;
	}
	public void actionPerformed(ActionEvent e) {
		if(type==1) {
			if(e.getSource()==this.bm.b1) {
				
				
			}
		}
		//图书管理
		if(type==2) {
			try {
			if(e.getSource()==this.bm.b2) {
				
					bam=new BookManagementAchieveMenu(1,ba);
				
			}
			if(e.getSource()==this.bm.b3) {
				bam=new BookManagementAchieveMenu(2,ba);
			}
			if(e.getSource()==this.bm.b4) {
				bam=new BookManagementAchieveMenu(3,ba);
			}
			if(e.getSource()==this.bm.b5) {
				bam=new BookManagementAchieveMenu(4,ba);
			}
			}catch(IOException e1) {
				e1.printStackTrace();
			}
		}
		//图书流通管理
		if(type==3) {
			if(e.getSource()==this.bm.b2) {
					cam=new CirculationAchieveMenu(1,ba,cda);
			}
			if(e.getSource()==this.bm.b3) {
				cam=new CirculationAchieveMenu(2,ba,cda);
			}
			if(e.getSource()==this.bm.b4) {
				cam=new CirculationAchieveMenu(3,ba,cda);
			}
		
		}
	}
	

}
