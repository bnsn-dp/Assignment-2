import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ButtonElement extends JButton implements ActionListener, MouseListener{

	public ButtonElement(String input){
		addActionListener(this);
		addMouseListener(this);
		this.setBackground(Palette.getButton());
		this.setBorderPainted(false);
		this.setText(input);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this){
			System.out.println("default button");
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {
		this.setBackground(Palette.getHover());
	}
	@Override
	public void mouseExited(MouseEvent e) {
		this.setBackground(Palette.getButton());
	}
	
}
