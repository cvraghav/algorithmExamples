class BinaryTree{

	Node root;

	public void addNode(int key, String name){
		Node newNode = new Node(key, name);

		if(root == null){
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while(true){
				parent = focusNode;
				
				if(key < focusNode.key){
					focusNode = focusNode.leftChild;

					if(focusNode == null){
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
		
                                        if(focusNode == null){
                                                parent.rightChild = newNode;
                                                return;
                                        }
					
				}
			}
		}
	}

	public void inorderReverseTree(Node focusNode){
		if(focusNode != null){
			inorderReverseTree(focusNode.leftChild);
			System.out.println(focusNode);
			inorderReverseTree(focusNode.rightChild);
		}
	}

        public void preorderReverseTree(Node focusNode){
                if(focusNode != null){
			System.out.println(focusNode);
                        preorderReverseTree(focusNode.leftChild);
                        preorderReverseTree(focusNode.rightChild);
                }
        }

        public void postorderReverseTree(Node focusNode){
                if(focusNode != null){
                        postorderReverseTree(focusNode.leftChild);
                        postorderReverseTree(focusNode.rightChild);
			System.out.println(focusNode);
                }
        }

	public Node findNode(int key){
		Node focusNode = root;
		while(focusNode.key != key){
			if(key < focusNode.key)
				focusNode = focusNode.leftChild;
			else
				focusNode = focusNode.rightChild;
			
			if(focusNode ==null) 
				return null;
		}
		return focusNode;
	}

	public static void main(String[] args){
		BinaryTree bt = new BinaryTree();
		bt.addNode(50, "Director");
		bt.addNode(30, "Architect");
		bt.addNode(35, "Engineer");
		bt.addNode(25, "Manager");
		bt.addNode(20, "Vice President");

		//bt.inorderReverseTree(bt.root);

		//bt.preorderReverseTree(bt.root);
		bt.postorderReverseTree(bt.root);
		System.out.println("Finding Node 35");
		System.out.println(bt.findNode(35));
	}
}

class Node{
	int key;
	String name;

	Node leftChild;
	Node rightChild;

	Node(int key, String name){
		this.key = key;
		this.name = name;
	}	

	public String toString(){
		return name + " has a key " + key;
	}
}
