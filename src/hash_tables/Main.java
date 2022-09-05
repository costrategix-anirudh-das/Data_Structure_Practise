package hash_tables;

public class Main {
	
	public static void main(String[] args) {
		HashTable table = new HashTable();
		table.set("nails", 20);
		table.set("hammer", 100);
		table.set("lumber", 150);
		
		table.printTable();
		
		System.out.println(table.get("nails"));
		System.out.println(table.keys());
	}

}
