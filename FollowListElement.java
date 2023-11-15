import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.*;

public class FollowListElement extends JPanel{
	HashMap<String, User> folks;

	public FollowListElement(HashMap<String, User> folks){
		this.folks = folks;
		DefaultListModel<String> data = new DefaultListModel<String>();
		for(String name : folks.keySet()){
			data.addElement(name);
		}
		JList<String> list = new JList<String>(data);
		JScrollPane tweets = new JScrollPane(list);
		tweets.setPreferredSize(new Dimension(300, 200));
		this.setPreferredSize(new Dimension(300, 200));
		this.setLayout(new BorderLayout());
		this.add(tweets, BorderLayout.SOUTH);
	}

	public void updateView(){
		this.revalidate();
		this.repaint();
	}
}
