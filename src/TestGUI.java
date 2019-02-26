import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestGUI extends JFrame
{
	public TestGUI()
	{
		setTitle("My test constructor");
		setBounds(100, 100, 600, 400);
		setLayout(null);
		
		JLabel lblOne = new JLabel("Type whatever: ");
		lblOne.setBounds(20, 20, 100, 30);
		add(lblOne);
		JTextField text = new JTextField("");
		text.setBounds(120, 20, 100, 30);
		add(text);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[])
	{
		new TestGUI();
	}
}
