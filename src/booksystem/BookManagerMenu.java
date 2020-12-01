package booksystem;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.List;

public class BookManagerMenu {
    JFrame a = new JFrame("ͼ�����ϵͳ");
    JLabel j1,j2,j3,j4,j5,j6;
    JButton b1,b2,b3,b4,b5;
    GridLayout gl ;
    
    public BookManagerMenu(int n,BookAccessFile bc,CirculationDataAccess cda) {
        if (n == 1) {
            this.gl = new GridLayout(2, 1);
            this.j1 = new JLabel("�û�����");
            this.j1.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
            this.b1 = new JButton("ѡ��");
            this.j2 = new JLabel("�û������޸�:     ");
            this.j2.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b2 = new JButton("ѡ��");
            this.a.setLayout(this.gl);
            for (int i = 0; i < 2; i++) {
                JPanel p = new JPanel();
                this.a.add(p);
                if (i == 0) {
                    p.add(this.j1);
                }
                if (i == 1) {
                    p.add(this.j2);
                    p.add(this.b2);
                }
            }
            this.a.setSize(550, 400);
            this.a.setVisible(true);
        }
        if (n == 2) {
            this.gl = new GridLayout(5, 1);
            this.j1 = new JLabel("ͼ�����");
            this.j1.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
            //this.b1 = new JButton("ѡ��");
            this.j2 = new JLabel("ͼ����Ϣ¼��:            ");
            this.j2.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b2 = new JButton("ѡ��");
            this.j3 = new JLabel("ͼ����Ϣ�޸�:            ");
            this.j3.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b3 = new JButton("ѡ��");
            this.j4 = new JLabel("ͼ����Ϣɾ��:            ");
            this.j4.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b4 = new JButton("ѡ��");
            this.j5 = new JLabel("ͼ����Ϣ��ѯ:            ");
            this.j5.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b5 = new JButton("ѡ��");
            this.a.setLayout(this.gl);
            for (int i = 0; i < 5; i++) {
                JPanel p = new JPanel();
                this.a.add(p);
                if (i == 0) {
                    p.add(this.j1);
                }
                if (i == 1) {
                    p.add(this.j2);
                    p.add(this.b2);
                }
                if (i == 2) {
                    p.add(this.j3);
                    p.add(this.b3);
                }
                if (i == 3) {
                    p.add(this.j4);
                    p.add(this.b4);
                }
                if (i == 4) {
                    p.add(this.j5);
                    p.add(this.b5);
                }
            }
            this.a.setSize(550, 400);
            this.a.setVisible(true);
            BookMenuListener bml=new BookMenuListener(this,2,bc,cda);
            this.b2.addActionListener(bml);
            this.b3.addActionListener(bml);
            this.b4.addActionListener(bml);
            this.b5.addActionListener(bml);
            
            
        }
        if (n == 3) {
            this.gl = new GridLayout(4, 1);
            this.j1 = new JLabel("ͼ����ͨ����");
            this.j1.setFont(new Font(Font.DIALOG, Font.BOLD, 50));
            this.b1 = new JButton("ѡ��");
            this.j2 = new JLabel("���鴦��:                 ");
            this.j2.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b2 = new JButton("ѡ��");
            this.j3 = new JLabel("���鴦��:                 ");
            this.j3.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b3 = new JButton("ѡ��");
            this.j4 = new JLabel("������Ϣ��ѯ:          ");
            this.j4.setFont(new Font(Font.DIALOG, Font.BOLD, 30));
            this.b4 = new JButton("ѡ��");
            this.a.setLayout(this.gl);
            for (int i = 0; i < 4; i++) {
                JPanel p = new JPanel();
                this.a.add(p);
                if (i == 0) {
                    p.add(this.j1);
                }
                if (i == 1) {
                    p.add(this.j2);
                    p.add(this.b2);
                }
                if (i == 2) {
                    p.add(this.j3);
                    p.add(this.b3);
                }
                if (i == 3) {
                    p.add(this.j4);
                    p.add(this.b4);
                }
            }
            this.a.setSize(550, 400);
            this.a.setVisible(true);
            BookMenuListener bml=new BookMenuListener(this,3,bc,cda);
            this.b2.addActionListener(bml);
            this.b3.addActionListener(bml);
            this.b4.addActionListener(bml);
            
            
        }
    }

	
    

   
}

