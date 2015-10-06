package Corner;

import Mainpa.QQLogin;
import java.io.*;

public class MyReadFile {
	public static void main(String[] args) {
		File fi = new File("f:/Java/test.txt");
		File fo = new File("f:/Java/test1.txt");
		try {
			FileReader fr = new FileReader(fi);
			FileWriter fw = new FileWriter(fo);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pw = new PrintWriter(fw, true);
			while(br.ready()) {
				pw.println(br.readLine());
			}
		} catch (Exception e) {
			
		}
	}
}

//printly自动加换行，radline的string则无换行符




































/*
public class MyReadFile {
	public static void main(String args[]) {
		File fi = new File("f:/Java/test.txt");
		File fo = new File("f:/Java/test2.txt");
		try {
			FileReader fr = new FileReader(fi);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(fo);
			PrintWriter pw = new PrintWriter(fw);
			while(br.ready()) {
				pw.println(br.readLine());
			}
			pw.close();
		} catch (Exception e) {
			
		}
	}
}












































public class MyReadFile {
	public static void main(String[] args) {
		try {
			File f = new File("f:/Java/test.txt");
		
			FileInputStream fis = new FileInputStream(f);
			int x =fis.available();
			for(int i = 0; i < x; ++i) {
				System.out.print((char)fis.read());
			}
		} catch(Exception e) {
			
		}
	}
}
*/