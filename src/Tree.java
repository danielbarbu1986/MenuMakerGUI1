import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Tree extends JFrame {

private JMenuBar menuBar;
private JMenu fileMenu;
private JMenuItem newItem;
private JMenuItem openItem;
private JMenuItem saveItem;
private JList listBox;
private DefaultListModel listModel;
private JLabel statusLabel;
private JButton button1;
private JButton button2;
private JButton button3;
private JTree treeList;
private JScrollPane treeScrollPane;

public Tree() {
initUI();
}

private void initUI() {

// Create the menu bar and file menu
menuBar = new JMenuBar();
fileMenu = new JMenu("File");
menuBar.add(fileMenu);

// Create the menu items and add them to the file menu
newItem = new JMenuItem("New");
openItem = new JMenuItem("Open");
saveItem = new JMenuItem("Save");
fileMenu.add(newItem);
fileMenu.addSeparator();
fileMenu.add(openItem);
fileMenu.addSeparator();
fileMenu.add(saveItem);

// Set the menu bar for this JFrame
setJMenuBar(menuBar);

// Create the list box and list model
listModel = new DefaultListModel<>();
listBox = new JList<>(listModel);
add(new JScrollPane(listBox), BorderLayout.CENTER);

// Create the status bar and add it to the bottom of the JFrame
statusLabel = new JLabel("Ready");
add(statusLabel, BorderLayout.SOUTH);

// Create the three buttons and add them to the top right of the JFrame
button1 = new JButton("Button 1");
button2 = new JButton("Button 2");
button3 = new JButton("Button 3");
JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
buttonPanel.add(button1);
buttonPanel.add(button2);
buttonPanel.add(button3);
add(buttonPanel, BorderLayout.NORTH);

// Create the tree list and add it to the right of the list box
DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
treeList = new JTree(root);
treeScrollPane = new JScrollPane(treeList);
add(treeScrollPane, BorderLayout.EAST);

// Set the size, title, default close operation, and visibility of the JFrame
setSize(800, 600);
setTitle("My JFrame");
setDefaultCloseOperation(EXIT_ON_CLOSE);
setLocationRelativeTo(null);
setVisible(true);
}

public static void main(String[] args) {
new Tree();
}
}
