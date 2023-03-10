import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class HomeScreen {
	String firstname;
	String surname;
	double finalGrade;

	HomeScreen(String firstname, String surname, double finalGrade){
		this.firstname = firstname ;
		this.surname = surname;
		this.finalGrade = finalGrade;
	}
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		studentGrades johnYap = new studentGrades("John", "Yap", 0);
		
		studentGrades krishaCruz = new studentGrades("Krisha", "Cruz", 0);
		
		studentGrades henryGo = new studentGrades("Henry", "Go", 0);
		
		studentGrades haileyDaily = new studentGrades("Hailey", "Daily", 3.00);
		
		studentGrades ashtonDrake = new studentGrades("Ashton", "Drake", 2.00);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeScreen window = new HomeScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomeScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(9, 9, 9));
		frame.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 64, 584, 65);
		frame.getContentPane().add(separator);
		
		JLabel lblNewLabel = new JLabel("STUDENT RECOMMENDATION");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 11, 584, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("RECOMMEND STUDENT");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(175, 504, 205, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JOptionPane.showMessageDialog(null, "WELCOME USER");
		
		
		
	}
}
