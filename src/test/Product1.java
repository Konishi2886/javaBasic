package test;

public class Product1 {
	private String name = "";
	private int price = 0;
	private int stock = 0;
	
	public Product1(String name,int price,int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		
		System.out.println("商品データ：" + this.name);
		System.out.println("価格：" + this.price + "円/在庫数：" + this.stock);
	}
	
	public void takeOrder(final int number) {
		System.out.println("注文処理開始");
		System.out.println("商品名：" + this.name);
		System.out.println("単価：" + this.price + "円");
		System.out.println("注文数：" + number + "/在庫数：" + this.stock);
		
		if(this.stock < number) {
			System.out.println(this.name + "は在庫不足です");
			return;
		}
		
		int total = this.price * number;
		System.out.println(number + "点で合計" + total + "円です");
		
		this.stock -= number;
		System.out.println(this.name + "の残り在庫は" + this.stock + "個");
	}
}
