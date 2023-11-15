import java.awt.*;
import javax.swing.*;

public class PanelElement extends JPanel{
	public PanelElement(){
		this.setBackground(Palette.getPanel());
		this.setPreferredSize(new Dimension(540, 720));
	}
}
