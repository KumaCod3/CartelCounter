package GUIbase;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import contaCartelle.Conta;

public class Home  extends Finestra{
	private final String deff="--------";
	public static Double bat=0.0;
	private Double cart;
	private Double micr;
	private Double macr;
	private Double comp;
	static Double pre1=2.0;
	static Double pre2=3.0;
	static Double pre3=4.0;
	FormVuoto form =new FormVuoto("battute o file");
	Etichetta bbb1=new Etichetta(deff);
	Etichetta car1=new Etichetta(deff);
	Etichetta mic1=new Etichetta(deff);
	Etichetta mac1=new Etichetta(deff);
	Etichetta com1=new Etichetta(deff);
	
	public Home(){
		super("Home: ");
		
		JPanel titolo=new JPanel();
		titolo.setOpaque(false);
		Etichetta tit=new Etichetta("IL CALCOLATORE DELLO SCRITTOMANTE");
		titolo.add(tit);
		c.add("North", titolo);
		
		JPanel centro=new JPanel();
		centro.setLayout(new GridLayout(7,2));
		centro.setOpaque(false);
		c.add("Center",centro);
		
/*1*/	Etichetta non=new Etichetta("<html>Inserire numero battute: (spazi incl)<br>O droppa qui il file     ------------></html>");
		centro.add(non);
		centro.add(form);

/*2*/		Etichetta bbb=new Etichetta("Numero battute totali:");
		centro.add(bbb);
		centro.add(bbb1);
		
/*2bis*/		Etichetta car=new Etichetta("Numero cartelle totali:");
		centro.add(car);
		centro.add(car1);
		
/*3*/	Etichetta mic=new Etichetta("Costo MicroEditing:");
		centro.add(mic);
		centro.add(mic1);
		
/*4*/	Etichetta mac=new Etichetta("Costo MacroEditing:");
		centro.add(mac);
		centro.add(mac1);
		
/*5*/	Etichetta com=new Etichetta("Costo Completo:");
		centro.add(com);
		centro.add(com1);
		
		
		
/*6*/	Bottone bex=new Bottone("Chiudi");
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
		    	try {
					bat=Double.parseDouble(form.ret);
					cart=bat/1800;
					micr=cart*pre1;
					macr=cart*pre2;
					comp=cart*pre3;
					bbb1.setText(Est.de.format(bat));
					car1.setText(Est.de.format(cart));
					mic1.setText(Est.deci.format(micr)+"0 Euro");
					mac1.setText(Est.deci.format(macr)+"0 Euro");
					com1.setText(Est.deci.format(comp)+"0 Euro");
//					bat=0.0;
//					form.clear();
		    	}
		    	catch (NumberFormatException ex) {
		    		
		    	
			    	try {
			    		Conta pro=new Conta(form.ciao);
						bat=pro.con();
						cart=bat/1800;
						micr=cart*pre1;
						macr=cart*pre2;
						comp=cart*pre3;
						bbb1.setText(Est.de.format(bat));
						car1.setText(Est.de.format(cart));
						mic1.setText(Est.deci.format(micr)+"0 Euro");
						mac1.setText(Est.deci.format(macr)+"0 Euro");
						com1.setText(Est.deci.format(comp)+"0 Euro");
						bat=0.0;
						form.clear();
			    	}
			    	catch (Exception ee) {}
		    	}
//		    	catch (Exception ex) {
//		    		clear();
//		    	}
			}
		});
		centro.add(cal);
		centro.add(bex);
		
		pack();
	}
	public void clear() {
		form.clear();
		bat=0.0;
		cart=0.0;
		micr=0.0;
		macr=0.0;
		comp=0.0;
		bbb1.setText(deff);
		car1.setText(deff);
		mic1.setText(deff);
		mac1.setText(deff);
		com1.setText(deff);
	}
}
