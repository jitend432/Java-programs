import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteData {
	public static  void main (String[] args) {
		
		String txt = "Hello I am a trozen horse?";
		
		try (FileOutputStream file = new FileOutputStream("H:\\Horse.txt")) {
			for (int i=0; i<=txt.length();i++) {
				file.write(txt.charAt(i));
			}
		} 
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}