/**
 This is just a plan; every method has to rewrite and then edit.
 No "import all (eg.*)" should exist in the future updates.
 有什么要改的赶紧改啊！！！！！圣诞之前要开始这个……
 哦对了这只是个蓝图而已……
*/

import javax.swing.*;
import java.awt.*;
import java.io.*;
import javax.imageio.ImageIO;
import java.util.*;

// This is core of the program; everything related to data, io is to be implemented in this class.
class Launcher extends Interface{
	// Main Method ============================
	public static void main(String[] args) {
		Launcher a = new Launcher();
		System.out.println("Bye bye!");
	}

	// Instance Variables =====================
	File data;
	boolean running; // whether the program is running or not
	long startTime; // this variable is used to calculate the elapsed time
	Functions[] functions;

	// Constractor ============================
	Launcher(){
		running = true;
		loadData();
		loadFunctions();
		super();
		while (running) {
			run();
		}
	}

	// Methods ================================
	void loadData(){}
	void loadFunctions(){} // functions[0] is always null on purpose... we can update this setting in the future
	void run(){
		draw();
		// program ends:
		if () {
			running=false;
		}
		// Access functions
		if () {
			drawMenu();
			try {
				functions[Interface.menuOutput()].run();
			} catch (NullPointerException e){}
		}
		// Do other stuff here, such as popping out bubbles randomly...
	}
}

// This is basically a user interface; everything displays to the user is to be implemented in this class.
class Interface extends JFrame{
	// Instance Variables =====================
	static Image[] character;
	JLable bubble; // Bubble is the "dialog" spoken by the "character"
	JMenu menu;
	int x,y;
	int width,height;

	// Constractors ===========================
	Interface(){
		super();
		getTransparentBG(); 
		loadImage();
		loadMenu();
		loadBubble();
	}

	// Accessor Methods =======================
	void draw(){}
	int getX(){}
	int getY(){}
	int getWidth(){}
	int getHeight(){}
	int menuOutput(){}

	// Mutator Methods ========================
	void changeBackground(){}
	void drawBubble(){}
	void drawMenu(){}

	// Helper Methods =========================
	private void getTransparentBG(){}
	private void loadImage(){}
	private void loadMenu(){}
	private void loadBubble(){}
}

// This abstract class is designed for future update. Any functions such as "calculator" or "calander" will extend this class.
abstract class Functions{
	// Abstract Methods =======================
	abstract String toString();
	abstract void run();

	// Constractors ===========================
	Functions(){}
}

/* example:
class whateverFunction extends Functions{}
*/
