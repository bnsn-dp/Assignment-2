public class Driver {
	public static void main(String[] args){
		UserGroup root = new UserGroup("root");
		root.addMember("Vex");
		root.addMember("Vax");
		((User)(root.getMembers().get("Vex"))).tweet("I miss trinket");
		((User)(root.getMembers().get("Vax"))).follow("Vex");
		AdminGUI.getInstance(root);
	}
}
