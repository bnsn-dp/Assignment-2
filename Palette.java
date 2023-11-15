import java.awt.*;
import javax.swing.*;

public class Palette {
	private static Color background = new Color(0x0f0e17);
	private static Color panel = new Color(0xfffffe);
	private static Color button = new Color(0xe53170);
	private static Color hover = new Color(0xf25f4c);
	private static Color text = new Color(0x000000);

	public static Color getBackground(){
		return background;
	}

	public static Color getPanel(){
		return panel;
	}

	public static Color getButton(){
		return button;
	}

	public static Color getHover(){
		return hover;
	}
}
