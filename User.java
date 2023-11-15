import java.util.HashMap;

public class User implements Tweeter{
	private String username;
	private HashMap<String, User> followers = new HashMap<String, User>();
	private HashMap<String, User> following = new HashMap<String, User>();
	private UserGroup group;
	private Feed feed;

	public User(String username){
		this.username = username;
		this.feed = new Feed();
	}

	public String getID(){
		return username;
	}
	public HashMap<String, User> getFollowers(){
		return followers;
	}
	public HashMap<String, User> getFollowing(){
		return following;
	}
	public Feed getFeed(){
		return feed;
	}
	public UserGroup getGroup(){
		return group;
	}

	public void setGroup(UserGroup group){
		this.group = group;
	}
	public String tweet(String content){
		updateFeed(content);
		notifyFollowers(content);
		return content;
	}
	public void notifyFollowers(String content){
		for(User e : followers.values()){
			e.updateFeed(content);
		}
	}
	public void updateFeed(String content){
		feed.add(content, this.getID());
	}
	public void follow(String ID){
		UserGroup homeGroup = getGroup();
		if(homeGroup.userExists(ID)){
			followers.put(ID, (User)homeGroup.findUser(ID));
		}
		else{
			System.out.println("No such User exists");
		}
	}
	@Override
	public int getUserCount() {
		return 1;
	}
	@Override
	public int getGroupCount() {
		return 0;
	}

	@Override
	public boolean isGroup() {
		return false;
	}
}
