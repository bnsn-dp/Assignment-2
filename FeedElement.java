import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public class FeedElement extends JPanel{
	private Feed source;

	public FeedElement(Feed source){
		this.source = source;
		DefaultListModel<String> data = new DefaultListModel<String>();
		for(String tweet : source.getContents()){
			data.addElement(tweet);
		}
		JList<String> list = new JList<String>(data);
		JScrollPane tweets = new JScrollPane(list);
		tweets.setPreferredSize(new Dimension(300, 200));
		this.setPreferredSize(new Dimension(300, 200));
		this.setLayout(new BorderLayout());
		this.add(tweets, BorderLayout.SOUTH);
	}

}
