package booksystem;

import java.awt.Font;
import java.awt.GridLayout;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CirculationAchieveMenu {
	JFrame a = new JFrame("图书管理系统");
	   JTable table;
	   JLabel l1,l2,l3;
	   JTextField tf1,tf2;
	   JButton b1,b2;
	   GridLayout gl ;
	   Date now = new Date();
	   SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");//可以方便地修改日期格式
	   String hehe = dateFormat.format( now );
	   public CirculationAchieveMenu(int n,BookAccessFile bc,CirculationDataAccess cda) {
		   if(n==1) {
			   this.gl=new GridLayout(4,1);
	           this.l1=new JLabel("借书处理");
	           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	           this.l1=new JLabel("今日日期"+hehe);
	           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	           this.l2=new JLabel("请输入要借的书籍的书号 ");
	           this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	           this.tf1=new JTextField(30);
	           this.l3=new JLabel("请输入借书的用户的用户名 ");
	           this.l3.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	           this.tf2=new JTextField(30);
	           this.b1=new JButton("确定");
	           this.a.setLayout(this.gl);
	           for (int i=0;i<4;i++){
	               JPanel p = new JPanel();
	               this.a.add(p);
	               if(i==0){
	                   p.add(this.l1);
	                   
	               }
	               if(i==1){
	                   p.add(this.l2);
	                   p.add(this.tf1);
	               }
	               if(i==2){
	            	   p.add(this.l3);
	                   p.add(this.tf2);
	               }
	               if(i==3){
	                   p.add(this.b1);
	               }
	           }
	           CirculationAchieveMenuListener caml=new  CirculationAchieveMenuListener(this,1,bc,cda);
	           this.b1.addActionListener(caml);
	         
	           this.a.setSize(550,400);
	           this.a.setVisible(true);
		   }
		   if(n==2) {
			   this.gl=new GridLayout(4,1);
	           this.l1=new JLabel("借书处理");
	           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	           this.l1=new JLabel("今日日期"+hehe);
	           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	           this.l2=new JLabel("请输入要还的书籍的书号 ");
	           this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	           this.tf1=new JTextField(30);
	           this.l3=new JLabel("请输入还书的用户的用户名 ");
	           this.l3.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	           this.tf2=new JTextField(30);
	           this.b1=new JButton("确定");
	           this.a.setLayout(this.gl);
	           for (int i=0;i<4;i++){
	               JPanel p = new JPanel();
	               this.a.add(p);
	               if(i==0){
	                   p.add(this.l1);
	                   
	               }
	               if(i==1){
	                   p.add(this.l2);
	                   p.add(this.tf1);
	               }
	               if(i==2){
	            	   p.add(this.l3);
	                   p.add(this.tf2);
	               }
	               if(i==3){
	                   p.add(this.b1);
	               }
	           }
	           
	           CirculationAchieveMenuListener caml=new  CirculationAchieveMenuListener(this,2,bc,cda);
	           this.b1.addActionListener(caml);
	         
	           this.a.setSize(550,400);
	           this.a.setVisible(true);
			   
		   }
		   if(n==3) {
			   this.gl=new GridLayout(5,1);
			   this.l1=new JLabel("借阅信息查询");
	           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	           this.l2=new JLabel("请输入要查询的用户名          ");
	           this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	           this.tf2=new JTextField(25);
	           
	           Object[] columnTitle = {"流水号","用户名","书号","日期","借还书类型","操作人"};
	           Object[][] tableData =
	                   {

	                           new Object[]{"","","","","",""},
	                           new Object[]{"","","","","",""},
	                           new Object[]{"","","","","",""},
	                           new Object[]{"","","","","",""},
	                           new Object[]{"","","","","",""}               
	                   };
	           this.table=new JTable();
	           this.table.setModel(new DefaultTableModel(tableData,columnTitle));
	           this.b1=new JButton("查询");//按用户名查询
	           this.a.setLayout(this.gl);
	           for (int i=0;i<3;i++){
	               JPanel p = new JPanel();
	               this.a.add(p);
	               if(i==0){
	                   p.add(this.l1);
	               }
	               if(i==1){
	            	  
	                   p.add(this.l2);
	                   p.add(tf2);
	                   p.add(b1);
	               }
	             
	               if(i==2) {
	            	   a.add(new JScrollPane(table));
	                   a.pack();
	               }
	               
	           }
	           CirculationAchieveMenuListener caml=new  CirculationAchieveMenuListener(this,3,bc,cda);
	           this.b1.addActionListener(caml);
	         
	           
	           this.a.setSize(500,400);
	           this.a.setVisible(true);
		   }
	   }
	  
}
