package ua.lviv.lgs.task_01;

public class Aplication {

	public static void main(String[] args) {
		
		Robot r = new Robot("Robot", "просто працюю");
		CoffeRobot cr = new CoffeRobot("CoffeRobot", "варю каву");
		RobotDancer rd = new RobotDancer("RobotDancer", "просто танцюю");
		RobotCoocker rc = new RobotCoocker("RobotCoocker", "просто готую");
		r.work();
		cr.work();
		rd.work();
		rc.work();
		
		
		Robot [] array = {r, cr, rd, rc};
		
		for (int i = 0; i < array.length; i++) {
			array[i].work();
		}
		
	}
	
}
