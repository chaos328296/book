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

public class CirculationDataAccess {
	List<BookCirculation> BookCirculations;
	public CirculationDataAccess() {
		//initBook(booklist1);
		BookCirculations=new ArrayList<BookCirculation>();
	
	}
	
	//д���ļ���
		public void Cir_write() throws IOException {
			FileOutputStream out=new FileOutputStream("C:\\Users\\86185\\Documents\\ͼ�����ϵͳ2.0\\�軹����Ϣ.txt");
			ObjectOutputStream oos=new ObjectOutputStream(out);
		    for(BookCirculation bcir: BookCirculations) {
		    	oos.writeObject(bcir);
		    	oos.flush();
		    	
		    }
		    oos.close();
			
		}
   //���ļ��ж�����
		public List<BookCirculation> Cir_read() throws FileNotFoundException, IOException, ClassNotFoundException{
			Object obj=null;
			ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Users\\86185\\Documents\\ͼ�����ϵͳ2.0\\�軹����Ϣ.txt"));
			try {
				while((obj=in.readObject()) != null) {
					
					BookCirculations.add((BookCirculation) obj);
					System.out.println((BookCirculation)obj);
				}
			}catch(EOFException e) {
				//e.printStackTrace();
			}
			/*obj=in.readObject();
			booklist1.add((Book)obj);
			System.out.println((Book)obj);*/
			return BookCirculations;
			
		}
	
	
}
