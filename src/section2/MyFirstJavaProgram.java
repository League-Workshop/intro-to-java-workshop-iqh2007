package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot r2d2 = new Robot();
	r2d2.setSpeed(100);
	
	r2d2.setPenWidth(5);
	
	r2d2.setPenColor(Color.CYAN);
	
	r2d2.penDown();

	for (int i=0; i<9; i++) {
		r2d2.move(100);
		r2d2.turn(-90);
		r2d2.setPenColor(Color.magenta);
		r2d2.setPenColor(Color.pink);
		r2d2.move(50);
		r2d2.setPenColor(Color.GREEN);
		r2d2.move(50);
		r2d2.setPenColor(Color.BLUE);

		
		
	}
		
	}
}
