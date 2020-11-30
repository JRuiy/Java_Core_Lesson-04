package ua.lviv.lgs.task_02;

public class Aplication {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("Леопард", 70.4, 5);
		
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() + " км/год, Вік тварини = " + a.getAge() + " років");
		
		a.setName("Бик");
		a.setSpeed(10.4);
		a.setAge(14);
		
		System.out.println("Назва тварини = " + a.getName() + ", Швидкість тварини = " + a.getSpeed() + " км/год, Вік тварини = " + a.getAge() + " років");

	}
}
