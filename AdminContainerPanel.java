import java.awt.*;
import javax.swing.*;

public class AdminContainerPanel extends JPanel{
	public AdminContainerPanel(){
		this.setBackground(Palette.getBackground());
		this.setPreferredSize(new Dimension(540, 160));
		this.setLayout(new GridLayout(3, 1, 0, 5));
		this.add(new OpenUserElement());
		this.add(new AddUserElement());
		this.add(new AddUserGroupElement());

	}
}
