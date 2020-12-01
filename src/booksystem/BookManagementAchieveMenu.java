package booksystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookManagementAchieveMenu {
	   JFrame a = new JFrame("图书管理系统");
	   JTable table;
	   JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	   JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9;
	   JButton b1,b2,b3,b4,b5,b6,b7;
	   GridLayout gl ;
	   public BookManagementAchieveMenu(int n,BookAccessFile bc) throws IOException {
	        if(n==1){
	            this.gl=new GridLayout(7,1);
	            this.l1=new JLabel("图书信息录入");
	            this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	            this.l2=new JLabel("书号              ");
	            this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf2=new JTextField(25);
	            this.l3=new JLabel("书名          ");
	            this.l3.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf3=new JTextField(25);
	            this.l4=new JLabel("作者          ");
	            this.l4.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf4=new JTextField(25);
	            this.l5=new JLabel("出版社                  ");
	            this.l5.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf5=new JTextField(25);
	            this.l6=new JLabel("藏书量                  ");
	            this.l6.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf6=new JTextField(25);
	            this.b1=new JButton("确定");
	            this.a.setLayout(this.gl);
	            for(int i=0;i<7;i++){
	                JPanel p = new JPanel();
	                this.a.add(p);
	                if(i==0){
	                    p.add(this.l1);
	                }
	                if(i==1){
	                    p.add(this.l2);
	                    p.add(this.tf2);
	                }
	                if(i==2){
	                    p.add(this.l3);
	                    p.add(this.tf3);
	                }
	                if(i==3){
	                    p.add(this.l4);
	                    p.add(this.tf4);
	                }
	                if(i==4){
	                    p.add(this.l5);
	                    p.add(this.tf5);
	                }
	                if(i==5){
	                    p.add(this.l6);
	                    p.add(this.tf6);
	                }
	                if(i==6){
	                	 p.add(this.b1);
	                }
	               
	            }
	            BookManagementAchieveMenuListener umamml=new BookManagementAchieveMenuListener(this,1,bc);
	            this.b1.addActionListener(umamml);
	            this.a.setSize(550,400);
	            this.a.setVisible(true);
	        	}
	        if(n==2){
	            this.gl=new GridLayout(8,1);
	            this.l1=new JLabel("图书信息修改");
	            this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
	            this.l2=new JLabel("请输入你要查询的书号 ");
	            this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf2=new JTextField(15);
	            this.l3=new JLabel("书号   	  ");
	            this.l3.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf3=new JTextField(25);
	            this.l4=new JLabel("书名         ");
	            this.l4.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf4=new JTextField(25);
	            this.l5=new JLabel("作者         ");
	            this.l5.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf5=new JTextField(25);
	            this.l6=new JLabel("出版社      ");
	            this.l6.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf6=new JTextField(25);
	            this.l7=new JLabel("藏书量       ");
	            this.l7.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
	            this.tf7=new JTextField(25);
	            this.b2=new JButton("确定");
	            this.b1=new JButton("查询");
	            this.a.setLayout(this.gl);
	            for(int i=0;i<8;i++){
	                JPanel p = new JPanel();
	                this.a.add(p);
	                if(i==0){
	                    p.add(this.l1);
	                }
	                if(i==1){
	                    p.add(this.l2);
	                    p.add(this.tf2);
	                    p.add(this.b1);
	                }
	                if(i==2){
	                    p.add(this.l3);
	                    p.add(this.tf3);
	                }
	                if(i==3){
	                    p.add(this.l4);
	                    p.add(this.tf4);
	                }
	                if(i==4){
	                    p.add(this.l5);
	                    p.add(this.tf5);
	                }
	                if(i==5){
	                    p.add(this.l6);
	                    p.add(this.tf6);
	                }
	                if(i==6) {
	                	p.add(this.l7);
	                	p.add(this.tf7);
	                }
	                if(i==7){
	                    p.add(this.b2);
	                }
	            }
	            BookManagementAchieveMenuListener umamml=new BookManagementAchieveMenuListener(this,2,bc);
	            this.b1.addActionListener(umamml);
	            this.b2.addActionListener(umamml);
	            this.a.setSize(550,400);
	            this.a.setVisible(true);
	        	}
	        
	   
	   if(n==3){
           this.gl=new GridLayout(4,1);
           this.l1=new JLabel("图书信息删除");
           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
           this.l2=new JLabel("请输入要删除图书的书号 ");
           this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
           this.tf1=new JTextField(30);
           this.b1=new JButton("删除");
           this.a.setLayout(this.gl);
           for (int i=0;i<4;i++){
               JPanel p = new JPanel();
               this.a.add(p);
               if(i==0){
                   p.add(this.l1);
               }
               if(i==1){
                   p.add(this.l2);
               }
               if(i==2){
                   p.add(this.tf1);
               }
               if(i==3){
                   p.add(this.b1);
               }
           }
           BookManagementAchieveMenuListener umamml=new BookManagementAchieveMenuListener(this,3,bc);
           this.b1.addActionListener(umamml);
           this.a.setSize(550,400);
           this.a.setVisible(true);
       }
	   if(n==4) {
		   this.gl=new GridLayout(6,1);
		   this.l1=new JLabel("图书信息查询");
           this.l1.setFont(new Font (Font.DIALOG, Font.BOLD, 30));
           this.l2=new JLabel("按书号          ");
           this.l2.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
           this.tf2=new JTextField(25);
           this.l3=new JLabel("按书名   	    ");
           this.l3.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
           this.tf3=new JTextField(25);
           this.l4=new JLabel("按作者          ");
           this.l4.setFont(new Font (Font.DIALOG, Font.BOLD, 20));
           this.tf4=new JTextField(25);
        Object[] columnTitle = {"书号","书名","作者","出版社","藏书量"};
           Object[][] tableData =
                   {

                           new Object[]{"","","","",""},
                           new Object[]{"","","","",""},
                           new Object[]{"","","","",""},
                           new Object[]{"","","","",""},
                           new Object[]{"","","","",""}               
                   };
           this.table=new JTable();
           this.table.setModel(new DefaultTableModel(tableData,columnTitle));
           this.b1=new JButton("查询");//按书号查询
           this.b2=new JButton("查询");//按书名查询
           this.b3=new JButton("查询");//按作者查询
           this.a.setLayout(this.gl);
           for (int i=0;i<5;i++){
               JPanel p = new JPanel();
               this.a.add(p);
               if(i==0){
                   p.add(this.l1);
               }
               if(i==1){
            	   //按书号
                   p.add(this.l2);
                   p.add(tf2);
                   p.add(b1);
               }
               if(i==2){
            	   //按书名
            	   p.add(this.l3);
                   p.add(tf3);
                   p.add(b2);
                   
               }
               if(i==3){
            	   p.add(this.l4);
                   p.add(tf4);
                   p.add(b3);
                   
               }
               if(i==4) {
        	   a.add(new JScrollPane(table));
                   a.pack();
               }
               
           }
           BookManagementAchieveMenuListener umamml=new BookManagementAchieveMenuListener(this,4,bc);
           this.b1.addActionListener(umamml);
           this.b2.addActionListener(umamml);
           this.b3.addActionListener(umamml);
           //a.add(new JScrollPane(table));
           this.a.setSize(500,400);
           this.a.setVisible(true);
	   }
	  }
	   
	 
}

