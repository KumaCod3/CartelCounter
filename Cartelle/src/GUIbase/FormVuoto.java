package GUIbase;
import java.awt.Color;
import java.awt.datatransfer.DataFlavor;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.util.List;

import javax.swing.JTextField;

public class FormVuoto extends JTextField{
	String ret;
	String tt="";
	String ciao="";
	
	public FormVuoto(String tit){
		super(tit, 15);
		ret=tit;
		tt=tit;
		setForeground(Est.chiarissimo);
		addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e){
				setText("");
				setForeground(Color.BLACK);
			}
			public void focusLost(FocusEvent e){
				if (getText().isEmpty()){
					setText(tit);
					setForeground(Est.chiarissimo);
				}
				else ret=getText();
			}
		});
		setFont(Est.plainFont);
		
// metto dropp
		setDropTarget(new DropTarget() {
		    public synchronized void drop(DropTargetDropEvent evt) {
		        try {
		            evt.acceptDrop(DnDConstants.ACTION_COPY);
		            List<File> droppedFiles = (List<File>)evt.getTransferable().getTransferData(DataFlavor.javaFileListFlavor);
		            for (File file : droppedFiles) {
		                // process files
		            	ciao=file.getAbsolutePath();
		            }
		        } catch (Exception ex) {
		            ex.printStackTrace();
		        }
		    }
		});
		
	}
	
	public void clear(){
		setText(tt);
		setForeground(Est.chiarissimo);
	}
	
	public void setUnchain() {
		for (FocusListener f:getFocusListeners()) {
			removeFocusListener(f);
		}
	}
}
