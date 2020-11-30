package ua.lviv.lgs.task_01;

public class Robot {
	
	private String name;
	private String kindWork;

	public Robot(String name, String kindWork) {
		super();
		this.name = name;
		this.kindWork = kindWork;
	}

	public void work() {
		System.out.println("Я " + name + " - я " + kindWork);
	}

	
	
}
