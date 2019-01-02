package vn.edu.vnuk.view;
import vn.edu.vnuk.controller.Controller;

public class Menu {
	public static void mainMenu() {
		int value;
		System.out.println("1. Add new Staff. \n"
						 + "2. Edit Staff's information. \n"
						 + "3. Delete Staff. \n"
						 + "4. Show Staff list. \n"
						 + "5. Delete all data. \n"
						 + "6. Show all staff's salary in system. \n"
						 + "7. Edit minimum wage. \n"
						 + "8. Enter the payroll code of the basic salary staff. \n"
						 + "9. Exit.");
		value = Controller.inputChoice(1,9);
		switch(value) {
			case 1: {
				Controller.menuOne();
				break;
			}
			
			case 2: {
				Controller.menuTwo();
				break;
			}
			
			case 3: {
				Controller.menuThree();
				break;
			}
			
			case 4:{
				Controller.menuFour();
				break;
			}
			
			case 5: {
				Controller.menuFive();
				break;
			}
			
			case 6:{
				Controller.menuSix();
				break;
			}
			
			case 7: {
				Controller.menuSeven();
				break;
			}
			
			case 8: {
				Controller.menuEight();
				break;
			}
			
			case 9: {
				Controller.menuNine();
				break;
			}
		}
	}
}	

		
	