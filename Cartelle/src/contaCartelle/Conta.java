package contaCartelle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Conta {
	public int caratteri=0;
	
	public Conta(String s) {
		try {
			File file = new File(s);
	        FileInputStream fileInputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
  
	        String line;
	        int characterCount = 0;;
	  
	        while ((line = bufferedReader.readLine()) != null) {
	            if (line.equals("")) {
	            }
	            else {
	                characterCount += line.length();
	            }
	        }

	        caratteri=characterCount;
	        bufferedReader.close();
		}
		catch (Exception e) {
			System.out.println("ERROR ");
		}
	}
	public double con() {
		return (double) caratteri;
	}
}
