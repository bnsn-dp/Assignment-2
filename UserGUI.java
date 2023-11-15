import java.awt.*;
import javax.swing.*;

public class UserGUI extends JFrame{
	private User user;

	public UserGUI(String username, UserGroup root){
		User user = (User)root.getMembers().get(username);
		this.setTitle(user.getID());
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setSize(360, 640);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Palette.getBackground());
		this.add(new FollowListElement(user.getFollowing()));
		this.add(new FollowUserElement(user));
		this.add(new FeedElement(user.getFeed()));
		this.add(new TweetCompositionField());
		this.setVisible(true);
	}
}
