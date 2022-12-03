package GUIbase;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class Est {
	public static Color sfondo=new Color(231,243,246 /*91,138,223*/);
	public static Color scuro=new Color(29,55,72 /*44,100,198*/);
	public static Color chiarissimo=new Color(117,223,235);
	
	public static Font boldFont=new Font("Arial Rounded MT Bold", Font.BOLD, 20);
	public static Font plainFont=new Font("Arial Rounded MT Bold", Font.PLAIN, 20);
	
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	private static double wi=screenSize.getSize().getWidth()/2;
	private static double he=screenSize.getSize().getSize().getHeight()/1.85;
	private static double he80=he/11.5;
//	private static double he30=he/31.0;
//	private static double wi270=wi/2.5;
	private static double wi190=wi/3.6;
	private static double wi310=wi/2.2;
	public static Dimension standard=new Dimension((int)wi, (int)he);
	public static Dimension piccolo=new Dimension((int)wi190,(int)he80);
	public static Dimension piccoloMin=new Dimension((int)(wi190/3*2),(int)(he80/3*2));
	public static Dimension grosso=new Dimension((int)wi310,(int)he80);
	public static Dimension grossoMin=new Dimension((int)(wi310/3),(int)(he80/3*2));
	public static Dimension testa=new Dimension((int)wi, (int)he80);
//	public static Dimension choi=new Dimension((int)wi270,(int)he80);
//	public static Dimension fil=new Dimension((int)wi270,(int)he30);
	public static int marginX=(int)((screenSize.getSize().getWidth()/2)-(standard.getSize().getWidth()/2));
	public static int marginY=(int)((screenSize.getSize().getSize().getHeight()/2)-(standard.getSize().getHeight()/2));
	
	public static DecimalFormat deci = new DecimalFormat("0.0");
	public static DecimalFormat de = new DecimalFormat("0");
	
	public static Border bordo= BorderFactory.createEmptyBorder(10,10,10,10);
	public static Border borColHe= BorderFactory.createMatteBorder(0, 4, 4, 4, scuro);
	public static Border borCol= BorderFactory.createMatteBorder(4, 4, 0, 4, scuro);
	public static Border borColTut= BorderFactory.createMatteBorder(4, 4, 4, 4, scuro);
	
}