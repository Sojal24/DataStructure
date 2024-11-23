package BinarySearchTree;

public class BinaryTest {
	public static void main(String[] args) {
		BinaryInsertion b1 = new BinaryInsertion();
		b1.insert(13);
		b1.insert(16);
		b1.insert(11);
		b1.insert(40);
		b1.insert(16);
		b1.insert(23);
		b1.insert(8);
		System.out.println("in-order traversal of BST:");
		b1.display(b1.root);
	}

}
