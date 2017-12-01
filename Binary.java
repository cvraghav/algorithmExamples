class Binary{
	Node root;

	Binary(){
		this.root = null;
	}

	public void addNode(int key, String name){
		Node newNode = new Node(key, name);

		if(root == null){

			this.root = newNode;
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

	public void inorderReversetree(Node focusNode){
		if(focusNode != null){
			
			inorderReversetree(focusNode.leftChild);
			System.out.println(focusNode);
			inorderReversetree(focusNode.rightChild);
		}
	}

        public void preorderReverseTree(Node focusNode){
                if(focusNode != null){
			System.out.println(focusNode);
                        inorderReversetree(focusNode.leftChild);
                        inorderReversetree(focusNode.rightChild);
                }
        }

	public Node findNode(int key){
		Node focusNode = root;

		while(focusNode.key != key){
			if(key < focusNode.key)
				focusNode = focusNode.leftChild;
			else
				focusNode = focusNode.rightChild;

			if(focusNode == null)
				return null;
				
		}
		return focusNode;
	}

	public boolean remove(int key){
		Node focusNode = root;
		Node parent = root;
		boolean isLeftChild = true;
		while(key != focusNode.key){
			parent = focusNode;
			if(key < focusNode.key){
				isLeftChild = true;
				focusNode = focusNode.leftChild;
			}else {
                                isLeftChild = false;
                                focusNode = focusNode.rightChild;				
			}	

			if(focusNode == null)
				return false;	
		}

		if(focusNode.leftChild == null && focusNode.rightChild == null){
			if(focusNode == root){
				root = null;
			}else if(isLeftChild){
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}else if(focusNode.rightChild == null){
			if(focusNode == root){
				root = focusNode.rightChild;
			} else if(isLeftChild)
				parent.leftChild = focusNode.leftChild;
			else
				parent.rightChild = focusNode.leftChild;
		} else if (focusNode.leftChild == null){
			if(focusNode ==root)
				root = focusNode.rightChild;
			else if(isLeftChild)
				parent.leftChild = focusNode.leftChild;
			else
				parent.rightChild = focusNode.leftChild;
				
		}else {
			Node replacement = getReplacement(focusNode);

			if(focusNode == root)
				root=replacement;

			else if (isLeftChild)
				parent.leftChild = replacement;
			else
				parent.rightChild = replacement;

			replacement.leftChild = focusNode.leftChild;
		}

		return true;
		
	}

	public Node getReplacement(Node replacementNode){
		Node replacementParent = replacementNode;
		Node replacement = replacementNode;

		Node focusNode = replacementNode.rightChild;

		while(focusNode != null){
			replacementParent = replacement;
			replacement = focusNode;

			focusNode = focusNode.leftChild;
		}
	}
	

	public static void main(String[] args){
		Binary bt = new Binary();

                bt.addNode(50, "Director");
                bt.addNode(30, "Architect");
                bt.addNode(35, "Engineer");
                bt.addNode(25, "Manager");
                bt.addNode(20, "Vice President");

		bt.inorderReversetree(bt.root);
                System.out.println("Finding Node 35");
                System.out.println(bt.findNode(35));			

		System.out.println("Finding second small node");
		bt.preorderReverseTree(bt.root);
	
	}
}

class Node{
	int key;
	String name;
	Node leftChild;
	Node rightChild;

	public Node(int key, String name){
		this.key = key;
		this.name = name;
	}

	public String toString(){
		return name + " is available with key "+key;
	}
}

