package booksystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class BookManagementAchieveMenuListener implements ActionListener{
	 	BookManagementAchieveMenu umam;
	 	BookManager bm;//功能的封装类
	    int select=0;
	 
	    BookManagementAchieveMenuListener(BookManagementAchieveMenu o,int n,BookAccessFile bc){
	       umam=o;
	       select=n;
	       bm=new BookManager(bc);
	   }
		@Override
		public void actionPerformed(ActionEvent e) {
			String BookID,BookName,BookAuthor,BookPress,BookCount,n_BookID,o_BookID;
			int bc;
			if(select==1) {
				if(e.getSource()==this.umam.b1) {
					BookID=this.umam.tf2.getText();
					BookName=this.umam.tf3.getText();
					BookAuthor=this.umam.tf4.getText();
					BookPress=this.umam.tf5.getText();
					BookCount=this.umam.tf6.getText();
					bc=Integer.parseInt(BookCount);
					Book book=new Book(BookID,BookName,BookAuthor,BookPress,bc);
					try {
						bm.book_input(book);
						JOptionPane.showMessageDialog(null, "添加成功！");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			}if(select==2) {
				o_BookID=this.umam.tf2.getText();
				if(e.getSource()==this.umam.b1) {
					
		
					try {
						bm.queryByNum(o_BookID);
						
						if(bm.getBooklist2().size()!=0) {
							this.umam.tf3.setText(bm.getBooklist2().get(0).getBookID());
							this.umam.tf4.setText(bm.getBooklist2().get(0).getBookName());
							this.umam.tf5.setText(bm.getBooklist2().get(0).getBookAuthor());
							this.umam.tf6.setText(bm.getBooklist2().get(0).getBookPress());
							this.umam.tf7.setText(String.valueOf(bm.getBooklist2().get(0).getBookCount()));
						}else {
							JOptionPane.showMessageDialog(null, "没有找到这本书");
						}
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource()==this.umam.b2) {//按了确定的按钮的时候
					n_BookID=this.umam.tf3.getText();
					BookName=this.umam.tf4.getText();
					BookAuthor=this.umam.tf5.getText();
					BookPress=this.umam.tf6.getText();
					BookCount=this.umam.tf7.getText();
					bc=Integer.parseInt(BookCount);
					try {
						bm.book_update(o_BookID, n_BookID, BookName, BookAuthor, BookPress, bc);
						JOptionPane.showMessageDialog(null, "修改成功");
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
				
			}if(select==3) {
				if(e.getSource()==this.umam.b1) {
					BookID=this.umam.tf1.getText();
					try {
						bm.book_delete(BookID);
						JOptionPane.showMessageDialog(null, "删除成功");
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}if(select==4) {
				Book bk;
				if(e.getSource()==this.umam.b1) {//按书号查询
					BookID=this.umam.tf2.getText();
					System.out.println(BookID);
					try {
						bm.deleteAllbl2();
						bm.queryByNum(BookID);
						System.out.println("这是长度"+bm.getBooklist2().size());
						if(bm.getBooklist2().size()!=0) {
							 Object[] columnTitle = {"书号","书名","作者","出版社","藏书量"};
							 Object[][] t = new Object[bm.getBooklist2().size()][];
							for(int i=0;i<bm.getBooklist2().size();i++) {
								t[i]=new Object[]{bm.getBooklist2().get(i).getBookID(),bm.getBooklist2().get(i).getBookName(),bm.getBooklist2().get(i).getBookAuthor(),bm.getBooklist2().get(i).getBookPress(),bm.getBooklist2().get(i).getBookCount()};
							}
	
						       DefaultTableModel dtm2=(DefaultTableModel)this.umam.table.getModel();//获取表格模型
						       dtm2.setDataVector(t,columnTitle);
						       this.umam.table.updateUI();
					
					           
						}else {
							JOptionPane.showMessageDialog(null, "没有找到这本书");
						}
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
				}if(e.getSource()==this.umam.b2) {
					BookName=this.umam.tf3.getText();
					System.out.println(BookName);
					try {
						bm.deleteAllbl2();
						bm.queryByName(BookName);
						System.out.println("这是长度"+bm.getBooklist2().size());
						if(bm.getBooklist2().size()!=0) {
							 Object[] columnTitle = {"书号","书名","作者","出版社","藏书量"};
							 Object[][] t = new Object[bm.getBooklist2().size()][];
							for(int i=0;i<bm.getBooklist2().size();i++) {
								t[i]=new Object[]{bm.getBooklist2().get(i).getBookID(),bm.getBooklist2().get(i).getBookName(),bm.getBooklist2().get(i).getBookAuthor(),bm.getBooklist2().get(i).getBookPress(),bm.getBooklist2().get(i).getBookCount()};
							}
	
						       DefaultTableModel dtm2=(DefaultTableModel)this.umam.table.getModel();//获取表格模型
						       dtm2.setDataVector(t,columnTitle);
						       this.umam.table.updateUI();
								
						}else {
							JOptionPane.showMessageDialog(null, "没有找到这本书");
						}
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(e.getSource()==this.umam.b3) {
					BookAuthor=this.umam.tf4.getText();
					try {
						bm.deleteAllbl2();
						bm.queryByAuthor(BookAuthor);
						System.out.println("这是长度"+bm.getBooklist2().size());
						if(bm.getBooklist2().size()!=0) {
							 Object[] columnTitle = {"书号","书名","作者","出版社","藏书量"};
							 Object[][] t = new Object[bm.getBooklist2().size()][];
							for(int i=0;i<bm.getBooklist2().size();i++) {
								t[i]=new Object[]{bm.getBooklist2().get(i).getBookID(),bm.getBooklist2().get(i).getBookName(),bm.getBooklist2().get(i).getBookAuthor(),bm.getBooklist2().get(i).getBookPress(),bm.getBooklist2().get(i).getBookCount()};
							}
	
						       DefaultTableModel dtm2=(DefaultTableModel)this.umam.table.getModel();//获取表格模型
						       dtm2.setDataVector(t,columnTitle);
						       this.umam.table.updateUI();
								
						}else {
							JOptionPane.showMessageDialog(null, "没有找到这本书");
						}
						
					} catch (ClassNotFoundException | IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
			
		}
		
			
			
}


