import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
    public void byteReader() {
    	try {
			FileInputStream input = new FileInputStream("book.txt");
			FileOutputStream output = new FileOutputStream("byte_output.txt");
			int n = 0;
			
			while((n = input.read()) != -1) {
				output.write(n);
				output.flush();
			}
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (IOException e) {
			System.out.println("IOException");
		}
    	
    }
	
	
	public static void main(String[] args) {
		ByteStream byteStream = new ByteStream();
		byteStream.byteReader();
		System.out.println("ByteStream finished.");
	}
}
