package trees;

public class Main {
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(60);
		tree.insert(55);
		tree.insert(21);
		
		System.out.println("Value 21 is there : " +tree.contains(21));
		
	}
}
