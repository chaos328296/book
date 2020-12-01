package booksystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CirculationAchieveMenuListener implements ActionListener{
	CirculationAchieveMenu cam;
 	
 	CirculationManagement cm;//��ͨ���ܵķ�װ��
    int select=0;
 
    CirculationAchieveMenuListener(CirculationAchieveMenu o,int n,BookAccessFile bc,CirculationDataAccess cda){
       cam=o;
       select=n;
       cm=new CirculationManagement(cda,bc);
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		String BookID,UserID;
		if(select==1) {
			if(e.getSource()==this.cam.b1) {
				BookID=this.cam.tf1.getText();
				UserID=this.cam.tf2.getText();
				cm.lendBook(this.cam.hehe,BookID,UserID);
			}
		}
		if(select==2) {
			if(e.getSource()==this.cam.b1) {
				BookID=this.cam.tf1.getText();
				UserID=this.cam.tf2.getText();
				cm.returnBook(this.cam.hehe,BookID,UserID);
			}
		}
		if(select==3) {
			BookCirculation bcir;
				if(e.getSource()==this.cam.b1) {//����Ų�ѯ
					UserID=this.cam.tf2.getText();
					System.out.println(UserID);
					cm.deleteAllBcirlist();
					cm.query(UserID);;
					System.out.println("���ǳ���"+cm.getBcirlist().size());
					if(cm.getBcirlist().size()!=0) {
						 Object[] columnTitle = {"��ˮ��","�û���","���","����","�軹������","������"};
						 Object[][] t = new Object[cm.getBcirlist().size()][];
						for(int i=0;i<cm.getBcirlist().size();i++) {
							t[i]=new Object[]{cm.getBcirlist().get(i).getSerialNo(),cm.getBcirlist().get(i).getUserid(),cm.getBcirlist().get(i).getBook_Num(),cm.getBcirlist().get(i).getDate(),cm.getBcirlist().get(i).getType(),cm.getBcirlist().get(i).getOperator() };
							
						}

					       DefaultTableModel dtm2=(DefaultTableModel)this.cam.table.getModel();//��ȡ���ģ��
					       dtm2.setDataVector(t,columnTitle);
					       this.cam.table.updateUI();
						

					       
					}else {
						JOptionPane.showMessageDialog(null, "û���ҵ��Ȿ��");
					}
					
					
				}
		
		 }

	 }
}
