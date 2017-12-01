class LinkedList{
	Node head;

	public void setNext(Node head){
		this.head = head;
	}
	public Node getNext(){
		return head;
	}

	static class Node{
		int data;
		Node next;

		Node(int data){
			this.data = data;
			next=null;
		}
		
		public int getData(){
			return data;
		}

		public void setData(int data){
			this.data = data;
		}

		public Node getNext(){
			return next;
		}
		public void setNext(Node next){
			this.next = next;
		}
	}

	public void reverse(){
		reverseList(head);
	}
	
	public void reverseList(Node current){
		if(current == null) return;

		if(current.next == null) {
			this.head = current;
			return;
		}
		System.out.println("Current :"+current.getData());
		reverseList(current.getNext());
		System.out.println("Current 1 : "+current.getData());
		current.getNext().setNext(current);
		System.out.println("Current 2 : "+current.getData());
		current.setNext(null);
		System.out.println("Current 3 : "+current.getData());
	}

	public static void main(String[] args){
		LinkedList linked = new LinkedList();
		linked.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(7);
		linked.head.next = second;
		second.next = third;
		third.next = fourth;
		linked.printList();

		linked.reverse();
		linked.printList();
	}

	public void printList(){
		Node n = head;

		while(n!=null){
			System.out.println(n.data+"");
			n=n.next;
		}
	}
}
