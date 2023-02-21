package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandled {
	public static void read() throws FileNotFoundException, IOException {
		try(FileInputStream fin=new FileInputStream("src/practice/Hello.txt")){
			int ch;
			while((ch=fin.read())!=-1)
				System.out.print((char)ch);
		}
	}
	public static void write() throws FileNotFoundException, IOException {
		try(FileOutputStream fout=new FileOutputStream("src/practice/Hello.txt")){
			String msg="Hii How are you??";
			fout.write(msg.getBytes());
			fout.flush();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		write();
		read();
		
	}
}
