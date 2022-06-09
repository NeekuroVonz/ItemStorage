package item.storage;

import java.util.Scanner;

import item.storage.*;

public class Services {
	private static Scanner sc;
	private static Item obj[];

	public static void add() {
		Item item = new Item();
		System.out.println(" Name : ");
		String id = sc.nextLine();
		System.out.println("  : ");
		String pw = sc.nextLine();
		
		item.setName(pw);
	}
}
