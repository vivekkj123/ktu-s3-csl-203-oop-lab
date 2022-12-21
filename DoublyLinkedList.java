class Node{
	Node previous;
	int item;
	Node next;
	Node(int Item){
		this.item = Item;
	}
}
class DoublyLinkedList{
	Node head = null;
	Node tail = null;
	void addNode(int item){
		Node newNode = new Node(item);
		if(head==null){
			head = tail = newNode;
			head.previous = null;
			tail.next = null;
		}else{
			tail.next = newNode;
			newNode.previous = tail;
			tail = newNode;
			tail.next = null;
		}
	}
	void display(){
		Node temp = head;
		if(head==null){
			System.out.println("Linked list is Empty");
		}else{
			while(temp!=tail){
				System.out.print(temp.item + "\t");
				temp = temp.next;
			}
			System.out.print(temp.item + "\n");
		}
	}
	void deleteNode(){
		Node temp = tail;
		System.out.println("Deleted Element is "+ temp.item);
		tail=tail.previous;
	}
}

class MainClassDL{
	public static void main(String [] args){
	
	DoublyLinkedList dl = new DoublyLinkedList();
	dl.addNode(10);
	dl.addNode(20);
	dl.addNode(30);
	dl.addNode(40);
	dl.addNode(50);
	dl.display();
	dl.deleteNode();
	dl.deleteNode();	
	dl.display();
	}
}
