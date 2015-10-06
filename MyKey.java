package Corner;
import java.io.*;

public class MyKey {
	public static void main(String[] a) {
		File fo = new File("f:/Java/Key");
		try {
			FileOutputStream fos = new FileOutputStream(fo);
			for (int i = 0; i < 128; ++i) {
				fos.write((int)(Math.random() * 128));
			}
		} catch (Exception e) {
			
		}
	}
}
