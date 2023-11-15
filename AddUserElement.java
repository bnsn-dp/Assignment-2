import java.awt.*;
import javax.swing.*;

public class AddUserElement extends JPanel{
	UserGroup userbase;
	public AddUserElement(UserGroup userbase){
		this.userbase = userbase;
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 50));
		TextAreaElement textField = new TextAreaElement("New ID");
		AddUserButtonElement button = new AddUserButtonElement("Add User:", textField, userbase);
		this.add(button);
		this.add(textField);
		this.setBackground(Palette.getBackground());
	}
}
