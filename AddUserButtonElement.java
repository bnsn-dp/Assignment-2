import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class AddUserButtonElement extends JButton implements ActionListener, MouseListener{
	private TextAreaElement textField;
	UserGroup userbase;

	public AddUserButtonElement(String input, TextAreaElement textField, UserGroup userbase){
		this.userbase = userbase;
		addActionListener(this);
		addMouseListener(this);
		this.setPreferredSize(new Dimension(150, 25));
		this.setBackground(Palette.getButton());
		this.setBorderPainted(false);
		this.setText(input);
		this.textField = textField;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==this){
			String ID = this.textField.getText();
			userbase.addMember(ID);
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
