package item.storage;

import java.util.Scanner;

public class ArrayDao {
//		private static Item item1;
		private static Item obj[];
	 
		public static void main(String[] args) {
			
			
			
			
			obj = new Item[3];
			int i = 0;
			do {
				Scanner sc = new Scanner(System.in);
				String name = sc.nextLine();
				Double price = sc.nextDouble();
				int quantity = sc.nextInt();
				
				Item item = new Item();
				
				item.setName(name);
				item.setPrice(price);
				item.setQuantity(quantity);
				
				//add item to array
				obj[i] = item;
				
				i++;
			}while(i<obj.length);
			
			for(int j=0; j<obj.length;j++) {
				System.out.println(obj[j].getName());
				System.out.println(obj[j].getPrice());
				System.out.println(obj[j].getQuantity());
			}
							
}
			

//	private static void add(Item item) {
//		Scanner sc = new Scanner(System.in);
//		int quantity = sc.nextInt();
//		String name = sc.nextLine();
//		Double price = sc.nextDouble();
//		item.setName(name);
//		item.setPrice(price);
//		item.setQuantity(quantity);
//	}
}
