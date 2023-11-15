import java.awt.*;
import javax.swing.*;

public class TweetCompositionField extends JPanel{
	public TweetCompositionField(){
		this.setLayout(new FlowLayout());
		this.setPreferredSize(new Dimension(520, 100));
		TextAreaElement textField = new TextAreaElement("Compose Tweet:");
		textField.setPreferredSize(new Dimension(300, 25));
		TweetButtonElement button = new TweetButtonElement("Post Tweet", textField);
		button.setPreferredSize(new Dimension(300, 25));
		this.add(textField);
		this.add(button);
		this.setBackground(Palette.getBackground());
	}
}
