import java.awt.*;
import javax.swing.*;

public class TextAreaElement extends JTextField{
	
	public TextAreaElement(String message){
		this.setBackground(Palette.getPanel());
		this.setBorder(null);
		this.setPreferredSize(new Dimension(150, 25));
		this.setText(message);
	}
}
