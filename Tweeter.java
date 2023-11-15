public interface Tweeter {
	public String getID();
	public int getUserCount();
	public int getGroupCount();
	public UserGroup getGroup();
	public void setGroup(UserGroup group);
	public boolean isGroup();
}
