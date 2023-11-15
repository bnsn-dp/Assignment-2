import java.awt.*;
import javax.swing.*;

public class OpenUserElement extends JPanel{
	public OpenUserElement(){
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 50));
		this.add(new OpenUserButtonElement());
		this.setBackground(Palette.getBackground());
	}
		
}
