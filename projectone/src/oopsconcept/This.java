package oopsconcept;

public class This {
	 int a;
	 This(int a){
			this.a=a;
		}
		public void display() {
			System.out.println("a is :"+a);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			This d = new This(1);
			d.display();
		}
}
