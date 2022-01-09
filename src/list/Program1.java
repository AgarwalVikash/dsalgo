package list;

// Move the particular key element at the end element at the end of the list

class Node {
	int data;
	Node nextNode;

	public Node(int data) {
		this.data = data;
		this.nextNode = null;
	}
}

public class Program1 {
	static Node root;

	public static void display(Node root) {
		Node head = root;
		while (head != null) {
			System.out.println(head.data);
			head = head.nextNode;
		}
	}

	public static void addElementToList() {
		root = new Node(2);
		root.nextNode = new Node(6);
		root.nextNode.nextNode = new Node(2);
		root.nextNode.nextNode.nextNode = new Node(8);
		root.nextNode.nextNode.nextNode.nextNode = new Node(2);
		root.nextNode.nextNode.nextNode.nextNode.nextNode = new Node(2);
	}

	public static void main(String[] args) {
		addElementToList();
		Node dublicateNode = null;
		Node rootDuplicateNode = null;
		System.out.println("Display list before moving the elements to end");
		if (root == null) {
			System.out.println("There is no list to work on");
			System.exit(0);
		}
		display(root);
		int key = 2;
		Node head = root;
		Node previousNode = null;
		while (head!= null) {
			if (head.data == key) {
				if (dublicateNode == null) {
					dublicateNode = new Node(head.data);
					rootDuplicateNode = dublicateNode;
				} else {
				Node tempNode = new Node(head.data);
					dublicateNode.nextNode = tempNode;
					dublicateNode = tempNode;
				}
				if(previousNode==null) {
					head=head.nextNode.nextNode;
					previousNode=head.nextNode;
				}else {
				head=head.nextNode;
				previousNode.nextNode=head;
				}
				continue;
			}
			previousNode=head;
			head=head.nextNode;
		
		}
		previousNode.nextNode = rootDuplicateNode;
		System.out.println("After moving all the key element at the end");
		display(root);
	}

}
