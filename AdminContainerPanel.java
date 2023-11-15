import java.awt.*;
import javax.swing.*;

public class AdminContainerPanel extends JPanel{
	UserGroup userbase;
	public AdminContainerPanel(UserGroup userbase){
		this.userbase = userbase;
		this.setBackground(Palette.getBackground());
		this.setPreferredSize(new Dimension(540, 160));
		this.setLayout(new GridLayout(3, 1, 0, 5));
		this.add(new AddUserElement(userbase));
		this.add(new AddUserGroupElement(userbase));

	}
}
