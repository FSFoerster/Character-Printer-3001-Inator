import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class DetectMouseMove extends JFrame{
	private JButton button;
	
	public DetectMouseMove() {
		setTitle("Change Background Color on Hover");
		setLayout(new FlowLayout());
		button = new JButton("Hover over this button");
		button.setOpaque(true);
		add(button);
		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent evt) {
				button.setBackground(Color.orange);
			}
			public void mouseExited(MouseEvent evt) {
				button.setBackground(null);
			}
		});
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
