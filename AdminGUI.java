import java.awt.*;
import javax.swing.*;

public class AdminGUI extends JFrame{
	private static AdminGUI instance;
	private UserGroup userbase;

	public static AdminGUI getInstance(UserGroup userbase){
		if(instance == null){
			instance.userbase = userbase; 
			instance = new AdminGUI();
			instance.setTitle("Admin Panel");
			instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			instance.setResizable(false);
			instance.setSize(360, 640);
			instance.setLayout(new BorderLayout());
			instance.getContentPane().setBackground(Palette.getBackground());
			instance.add(new AdminContainerPanel(), BorderLayout.SOUTH);
			instance.add(new UserHierarchyElement(userbase), BorderLayout.NORTH);
			instance.setVisible(true);
		}
		return instance;
	}
}
