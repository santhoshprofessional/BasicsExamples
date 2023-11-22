package oopsconcept;

public class WithoutThis {
	int a;
WithoutThis(int b){
	a=b;
}
public void display() {
	System.out.println("a is :"+a);
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	WithoutThis d = new WithoutThis(1);
	d.display();
}
}
