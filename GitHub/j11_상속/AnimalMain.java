package j11_상속;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		System.out.println();
		
		human.move();
		System.out.println();
		
		tiger.move();
		
		human.study();
		
		human.eat();
		
		animal.move();
		animal.eat();
		System.out.println();
		
		Animal animal2 = new Human();
		System.out.println(animal2);
		animal2.move();
		animal2.eat();
		
		((Human)animal2).study();
		System.out.println();
		((Human)animal2).eat();
//		((Tiger)animal2).attack();
//		((Human)animal).study();
		
	}
}
