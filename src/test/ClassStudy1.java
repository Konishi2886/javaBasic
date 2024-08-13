package test;

public class ClassStudy1 {

	public static void main(String[] args) {
		Product1 shampoo = new Product1("シャンプー",800,10);
		Product1 coffee = new Product1("コーヒー",500,5);
		
		shampoo.takeOrder(5);
		coffee.takeOrder(3);
		shampoo.takeOrder(8);
	}

}
