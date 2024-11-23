package BinarySearchTree;

public class BinaryInsertion {
	Binarynode root;

	public void insert(int data) {
		Binarynode newnode = new Binarynode();
		newnode.data = data;

		if (root == null) { // check root node is null or not
			root = newnode; // jar root node null asel tr newnode ha root asel
			return;
		}
		Binarynode temp = root; // creat temporary variable for checking
		while (true) {
			if (data < temp.data) { // check inserted data is less than root or not
				if (temp.left == null) { // jr data less asel tr tychi left side madhe ky ahe k te check krtoy jr asel
											// tr temp else part madhe jaun pudhla node shift hoil ani punha check
											// comparision krel.
					temp.left = newnode; // left side is not null then add newnode on left side
					break;
				} else {
					temp = temp.left;
				}

			} else if (data > temp.data) {
				if (temp.right == null) {
					temp.right = newnode;
					break;
				}
				else {
					temp = temp.right;
				}
			}else {
					System.out.println("Duplicate data is found: " + data + "  data not inserting.");
					return;
				}

			}
		}
	

	void display(Binarynode root) {
		if (root != null) {
			display(root.left);
			System.out.println(root.data + "  ");
			display(root.right);
		}
	}

}
