package contaCartelle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class Conta {
	public int caratteri=0;
	
	public Conta(String s) {
		try {
			File file = new File(s);
	        FileInputStream fileInputStream = new FileInputStream(file);
	        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
	        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	        int characterCount = 0;

	        FileInputStream fis = fileInputStream;
            XWPFDocument document = new XWPFDocument(fis);
            List<XWPFParagraph> paragraphs = document.getParagraphs();
            for (XWPFParagraph para : paragraphs) {
                String line=(para.getText());
                characterCount += line.length();
            }
            caratteri=characterCount;
            
	        document.close();
	        fis.close();
	        bufferedReader.close();
		}
		catch (Exception e) {
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
			catch (Exception ee) {
				System.out.println("ERROREEE");
			}
		}
	}
	
	public double con() {
		return (double) caratteri;
	}
}
