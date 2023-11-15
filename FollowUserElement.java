import java.awt.*;
import javax.swing.*;

public class FollowUserElement extends JPanel{
	public FollowUserElement(User guy){
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 50));
		TextAreaElement textField = new TextAreaElement("ID");
		FollowUserButtonElement button = new FollowUserButtonElement(guy, "Follow User:", textField);
		this.add(button);
		this.add(textField);
		this.setBackground(Palette.getBackground());
	}
}
