import javax.swing.JFrame;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Jonathan A. Irizarry Quintero");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(900, 450);
		myFrame.setSize(400, 400);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
	}
}