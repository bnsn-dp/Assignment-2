import java.util.HashMap;

public class UserGroup implements Tweeter{
	private String ID;
	private HashMap<String, Tweeter> members;
	private int userCount = 0;
	private int groupCount = 0;
	private UserGroup group;

	public UserGroup(String ID){
		this.ID = ID;
		members = new HashMap<String, Tweeter>();
	}
	public String getID() {
		return ID;
	}
	public HashMap<String, Tweeter> getMembers(){
		return members;
	}
	public void addMember(String ID){
		if(getMembers().containsKey(ID)){
			System.out.println("User with given ID already exists");
		}
		else{
			members.put(ID, new User(ID));
			members.get(ID).setGroup(this);
		}
	}
	public void addGroup(String ID){
			if(getMembers().containsKey(ID)){
			System.out.println("Group with given ID already exists");
		}
		else{
			members.put(ID, new UserGroup(ID));
			members.get(ID).setGroup(this);
		}
	}
	public boolean userExists(String ID){
		if(getMembers().containsKey(ID)){
			return true;
		}
		if(getGroup() == null){
			return false;
		}
		else{
			return getGroup().userExists(ID);
		}
	}
	public Tweeter findUser(String ID){
		if(getMembers().containsKey(ID)){
			return getMembers().get(ID);
		}
		if(getGroup() == null){
			return null;
		}
		else{
			return getGroup().findUser(ID);
		}
	}
	@Override
	public UserGroup getGroup() {
		return group;
	}
	@Override
	public void setGroup(UserGroup group) {
		this.group = group;
	}
	@Override
	public int getUserCount() {
		for(Tweeter guy : getMembers().values()){
			userCount = userCount + guy.getUserCount();
		}
		return userCount;
	}
	@Override
	public int getGroupCount() {
		for(Tweeter guy : getMembers().values()){
			groupCount = groupCount + guy.getGroupCount();
		}
		return groupCount;
	}
	@Override
	public boolean isGroup() {
		return true;
	}
}
