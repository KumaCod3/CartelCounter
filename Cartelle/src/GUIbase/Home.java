package GUIbase;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class Home  extends Finestra{
	String deff="--------";
	Double bat=0.0;
	Double cart;
	Double micr;
	Double macr;
	Double comp;
	Double pre1=2.0;
	Double pre2=3.0;
	Double pre3=4.0;
	
	public Home(){
		super("Home: ");
		
		JPanel titolo=new JPanel();
		titolo.setOpaque(false);
		Etichetta tit=new Etichetta("IL CALCOLATORE DELLO SCRITTOMANTE");
		titolo.add(tit);
		c.add("North", titolo);

		
		JPanel centro=new JPanel();
		centro.setLayout(new GridLayout(6,2));
		centro.setOpaque(false);
		c.add("Center",centro);
		
		
		Etichetta non=new Etichetta("Inserire numero battute: (spazi incl)");
		centro.add(non);
		FormVuoto form =new FormVuoto("battute");
		centro.add(form);
	
		Etichetta car=new Etichetta("Numero cartelle totali:");
		centro.add(car);
		Etichetta car1=new Etichetta(deff);
		centro.add(car1);
		
		Etichetta mic=new Etichetta("Costo MicroEditing:");
		centro.add(mic);
		Etichetta mic1=new Etichetta(deff);
		centro.add(mic1);
		
		Etichetta mac=new Etichetta("Costo MacroEditing:");
		centro.add(mac);
		Etichetta mac1=new Etichetta(deff);
		centro.add(mac1);
		
		Etichetta com=new Etichetta("Costo Completo:");
		centro.add(com);
		Etichetta com1=new Etichetta(deff);
		centro.add(com1);
		
		Bottone bex=new Bottone("Chiudi");
		bex.but.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				setVisible(false);
		    	dispose();
		    	System.exit(0);
			}
		});
		Bottone cal=new Bottone("Calcola");
		cal.but.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
				bat=Double.parseDouble(form.ret);
				cart=bat/1800;
				micr=cart*pre1;
				macr=cart*pre2;
				comp=cart*pre3;
				car1.setText(Est.de.format(cart));
				mic1.setText(Est.deci.format(micr)+"0 Euro");
				mac1.setText(Est.deci.format(macr)+"0 Euro");
				com1.setText(Est.deci.format(comp)+"0 Euro");
			}
		});
		centro.add(cal);
		centro.add(bex);
		
		pack();
	}
}
