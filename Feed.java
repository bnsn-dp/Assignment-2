import java.util.ArrayList;

public class Feed {
	private ArrayList<String> contents;

	public Feed(){
		contents = new ArrayList<String>();
	}
	public String add(String tweet, String ID){
		String fullTweet = ID + " - " + tweet;
		contents.add(fullTweet);
		return fullTweet;
	}
	public ArrayList<String> getContents(){
		return contents;
	}
}
