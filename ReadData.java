import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class ReadData {
	public static  void main (String[] args) {
		
		try {
			FileInputStream file = new FileInputStream("H:\\Rinku.txt");
			int data;
			while((data = file.read())!= -1) {				
			System.out.print((char)data);
			}
			file.close();
		} 
		
		catch(FileNotFoundException e) {u8
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}