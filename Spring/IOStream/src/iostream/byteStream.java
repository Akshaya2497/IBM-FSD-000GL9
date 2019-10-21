package iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStream {
	private static  FileInputStream in;
	private static FileOutputStream out;
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		try {
			in = new FileInputStream(new File("byteinputstream.txt"));
			 out = new FileOutputStream(new File("byteoutput.txt"));
			int c;
			try {
				while((c = in.read())!= -1) {
					System.out.println(c);
					out.write(c);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		in.close();
		
		
	}

}
