package GUIbase;
import java.awt.Color;
import javax.swing.JLabel;

public class Etichetta extends JLabel{
	public Etichetta(String x){
		setText(x);
		setForeground(Color.BLACK);
		setBackground(Est.scuro);
		setFont(Est.plainFont);
		setOpaque(false);
		setBorder(Est.bordo);
	}
}
