package menu;

import events.Action;
import main.Window;

public class Menu
{	
	public Menu()
	{
		Action listener = new Action();
		
		//Add ActionListeners
		Window.btnExit.addActionListener(listener);
		Window.btnPlayS.addActionListener(listener);
		Window.btnPlayM.addActionListener(listener);
		Window.btnOptions.addActionListener(listener);
		Window.btnTodo.addActionListener(listener);
		Window.btnBack.addActionListener(listener);
		
		System.out.println("Menu class loaded");
	}
}