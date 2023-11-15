import java.awt.*;
import javax.swing.*;

public class AddUserGroupElement extends JPanel{
	public AddUserGroupElement(){
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 50));
		TextAreaElement textField = new TextAreaElement("New ID");
		AddUserGroupButtonElement button = new AddUserGroupButtonElement("Add Group:", textField);
		this.add(button);
		this.add(textField);
		this.setBackground(Palette.getBackground());
	}
}
