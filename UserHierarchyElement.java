import java.awt.*;
import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class UserHierarchyElement extends JPanel implements TreeSelectionListener{
	JTree test;
	JScrollPane tree;
	DefaultTreeModel treeModel;
	DefaultMutableTreeNode root;
	UserGroup userbase;
	public UserHierarchyElement(UserGroup userbase){
		this.userbase = userbase;
		root = new DefaultMutableTreeNode("root");
		for(Tweeter user : userbase.getMembers().values()){
			if(user.isGroup()){
				addGroup((UserGroup)user);
			}
			else{
				addUser((User)user);
			}
		}
		treeModel = new DefaultTreeModel(root);
		test = new JTree(treeModel);
		test.setFont(new Font(test.getFont().getName(), test.getFont().getStyle(), test.getFont().getSize() + 5));
		tree = new JScrollPane(test);
		tree.setPreferredSize(new Dimension(540, 400));
		this.setBackground(Palette.getPanel());
		this.setPreferredSize(new Dimension(540, 400));
		this.setLayout(new BorderLayout());
		this.add(tree, BorderLayout.WEST);
		test.getSelectionModel().addTreeSelectionListener(this);
	}
	public void addUser(User guy){
		root.add(new DefaultMutableTreeNode(guy.getID()));
	}
	public void addGroup(UserGroup gang){
		DefaultMutableTreeNode temp = new DefaultMutableTreeNode(gang.getID());
		for(Tweeter guy : gang.getMembers().values()){
			temp.add(new DefaultMutableTreeNode(guy.getID()));
		}
		root.add(temp);
	}
	public void updateView(){
		this.revalidate();
		this.repaint();
		treeModel.reload();
	}
	@Override
	public void valueChanged(TreeSelectionEvent e) {
		DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) test.getLastSelectedPathComponent();
		String ID = selectedNode.getUserObject().toString();
		new UserGUI(ID, userbase);
	}
}
