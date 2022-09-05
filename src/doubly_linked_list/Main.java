package doubly_linked_list;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList mylist = new DoublyLinkedList(19);
		mylist.append(16);
		mylist.append(55);
		
		mylist.printList();
	}
}
