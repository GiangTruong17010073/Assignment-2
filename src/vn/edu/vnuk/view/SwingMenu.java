package vn.edu.vnuk.view;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.event.KeyEvent;

	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;

	public class SwingMenu implements ActionListener {
		
		private JMenuItem menuOne_1;
		private JMenuItem menuOne_2;
		private JMenuItem menuOne_3;
		private JMenuItem menuOne_4;
		private JMenuItem menuOne_5;
		private JMenuItem menuOne_6;
		private JMenuItem menuTwo_1;
		private JMenuItem menuThree_1;
		private JMenuItem menuFour_1;
		private JMenuItem menuFour_2;
		private JMenuItem menuFour_3;
		private JMenuItem menuFour_4;
		private JMenuItem menuFour_5;
		private JMenuItem menuFour_6;
		private JMenuItem menuFive_1;
		private JMenuItem menuSix_1;
		private JMenuItem menuSeven_1;
		private JMenuItem menuEight_1;
		private JMenuItem menuNine_1;
		
		public SwingMenu() {
			
			JFrame frame = new JFrame("Employee Manager");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JMenuBar menuBar = new JMenuBar();
			frame.setJMenuBar(menuBar);
			
			JMenu menuOne = new JMenu("Menu One");
			menuOne.setMnemonic(KeyEvent.VK_O);
			menuBar.add(menuOne);
			
				menuOne_1 = new JMenuItem("Add new staff in the bottom");
				menuOne_1.addActionListener(this);
				menuOne.add(menuOne_1);
				
				menuOne_2 = new JMenuItem("Add new staff on the top");
				menuOne_2.addActionListener(this);
				menuOne.add(menuOne_2);
				
				menuOne_3 = new JMenuItem("Add new staff after specific position");
				menuOne_3.addActionListener(this);
				menuOne.add(menuOne_3);
				
				menuOne_4 = new JMenuItem("Add new staff in the bottom from staff.txt");
				menuOne_4.addActionListener(this);
				menuOne.add(menuOne_4);
				
				menuOne_5 = new JMenuItem("Add new casual worker from labor.txt");
				menuOne_5.addActionListener(this);
				menuOne.add(menuOne_5);
			
			JMenu menuTwo = new JMenu("Menu Two");
			menuTwo.setMnemonic(KeyEvent.VK_T);
			menuBar.add(menuTwo);
			
				menuTwo_1= new JMenuItem("Edit employee's imformation");
				menuTwo_1.addActionListener(this);
				menuTwo.add(menuTwo_1);
			
			JMenu menuThree = new JMenu("Menu Three");
			menuThree.setMnemonic(KeyEvent.VK_H);
			menuBar.add(menuThree);
			
				menuThree_1 = new JMenuItem("Delete employee");
				menuThree_1.addActionListener(this);
				menuThree.add(menuThree_1);
			
			JMenu menuFour = new JMenu("Menu Four");
			menuFour.setMnemonic(KeyEvent.VK_F);
			menuBar.add(menuFour);
			
				menuFour_1 = new JMenuItem("Display current list");
				menuFour_1.addActionListener(this);
				menuFour.add(menuFour_1);
				
				menuFour_2 = new JMenuItem("Display list order by Ascending of salary");
				menuFour_2.addActionListener(this);
				menuFour.add(menuFour_2);
				
				menuFour_3 = new JMenuItem("Display list with name order by Alphabet");
				menuFour_3.addActionListener(this);
				menuFour.add(menuFour_3);
				
				menuFour_4 = new JMenuItem("Find employee by name"); 
				menuFour_4.addActionListener(this);
				menuFour.add(menuFour_4);
				
				menuFour_5 = new JMenuItem("Find employee by year of birth");
				menuFour_5.addActionListener(this);
				menuFour.add(menuFour_5);
			
			JMenu menuFive = new JMenu("Menu Five");
			menuFive.setMnemonic(KeyEvent.VK_I);
			menuBar.add(menuFive);
			
				menuFive_1 = new JMenuItem("Delete all data");
				menuFive_1.addActionListener(this);
				menuFive.add(menuFive_1);
			
			JMenu menuSix = new JMenu("Menu Six");
			menuSix.setMnemonic(KeyEvent.VK_S);
			menuBar.add(menuSix);
			
				menuSix_1 = new JMenuItem("Display salary all of employee in system");
				menuSix_1.addActionListener(this);
				menuSix.add(menuSix_1);
			
			JMenu menuSeven = new JMenu("Menu Seven");
			menuSeven.setMnemonic(KeyEvent.VK_V);
			menuBar.add(menuSeven);
			
				menuSeven_1 = new JMenuItem("Update basic salary");
				menuSeven_1.addActionListener(this);
				menuSeven.add(menuSeven_1);
			
			JMenu menuEight = new JMenu("Menu Eight");
			menuEight.setMnemonic(KeyEvent.VK_E);
			menuBar.add(menuEight);
			
				menuEight_1 = new JMenuItem("Input list employee id need to subscribe basic salary");
				menuEight_1.addActionListener(this);
				menuEight.add(menuEight_1);
		
			JMenu menuNine = new JMenu("Menu Nine");
			menuNine.setMnemonic(KeyEvent.VK_N);
			menuBar.add(menuNine);
			
				menuNine_1 = new JMenuItem("Exit");
				menuNine_1.addActionListener(this);
				menuNine.add(menuNine_1);
			
			frame.setSize(1000, 500);
			frame.setVisible(true);
		}
		
		public void actionPerformed(ActionEvent e) {
			JMenuItem item = (JMenuItem)e.getSource();
			if (item == menuOne_1) {
				
			}
			
			if (item == menuOne_2) {
				
			}
			
			if (item == menuOne_3) {
				
			}
			
			if (item == menuOne_4) {
				
			}

			if (item == menuOne_5) {
				
			}

			if (item == menuOne_6) {
				
			}
			
			if (item == menuNine_1) {
				System.exit(0);
			}
			
		}
			
		public static void main (String[] args) {
			new SwingMenu();
		}
	}
}
