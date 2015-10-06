package Corner;
import java.io.*;
public class MyEncryp {
	public static void main(String[] args) {
		try {
			int key[] = new int[128];
			File keyFile = new File("f:/Java/key");
			FileInputStream keyFis = new FileInputStream (keyFile);
			for (int i = 0; i < 128; i++) {
				key[i] = keyFis.read();
			}
			File inFile = new File("f:/Java/test.txt");
			File outFile = new File("f:/Java/teste.txt");
			FileInputStream inFis = new FileInputStream (inFile);
			FileOutputStream outFis = new FileOutputStream (outFile);
			int length = inFis.available();
			for (int i = 0; i < length; i++) {
				outFis.write(inFis.read() + key[i %128]);
			}
		} catch (Exception e) {
			
		}
	}
}
