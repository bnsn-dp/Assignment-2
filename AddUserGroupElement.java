import java.awt.*;
import javax.swing.*;

public class AddUserGroupElement extends JPanel{
	UserGroup userbase;
	public AddUserGroupElement(UserGroup userbase){
		this.userbase = userbase;
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 50));
		TextAreaElement textField = new TextAreaElement("New ID");
		AddUserGroupButtonElement button = new AddUserGroupButtonElement("Add Group:", textField, userbase);
		this.add(button);
		this.add(textField);
		this.setBackground(Palette.getBackground());
	}
}
