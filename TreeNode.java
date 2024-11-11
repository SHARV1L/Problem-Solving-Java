public class TreeNode {
    // Data stored in the node
    public int data;

    // References to the left, right children, and parent of the node
    public TreeNode left, right, parent;

    // Private variable to track the size of the subtree rooted at this node
    private int size = 0;

    // Constructor: Initializes the node with the given data
    public TreeNode(int d) {
        data = d;  // Assign data to the node
        size = 1;  // Initial size of the subtree is 1 (just this node)
    }

    /* Operation: In-Order Insertion
     * Inserts a new node with value 'd' into the tree in its correct position
     * following Binary Search Tree (BST) properties.
     */
    public void insertInOrder(int d) {
        // If 'd' is less than or equal to current node's data, go to the left subtree
        if (d <= data) {
            if (left == null) {
                // If the left child doesn't exist, create a new node and set it as the left child
                setLeftChild(new TreeNode(d));
            } else {
                // Otherwise, recursively insert 'd' in the left subtree
                left.insertInOrder(d);
            }
        } else {
            // If 'd' is greater than current node's data, go to the right subtree
            if (right == null) {
                // If the right child doesn't exist, create a new node and set it as the right child
                setRightChild(new TreeNode(d));
            } else {
                // Otherwise, recursively insert 'd' in the right subtree
                right.insertInOrder(d);
            }
        }
        // Increment the size of the subtree after insertion
        size++;
    }

    /* 
     * Returns the size of the subtree rooted at this node.
     * The size includes this node and all its descendants.
     */
    public int size() {
        return size;
    }

    /* Operation: Searching
     * Searches for a node with value 'd' in the tree.
     * Returns the node if found, otherwise returns null.
     */
    public TreeNode find(int d) {
        if (d == data) {
            // If the data matches the current node's data, return this node
            return this;
        } else if (d <= data) {
            // If 'd' is less than or equal to current node's data, search in the left subtree
            return left != null ? left.find(d) : null;
        } else {
            // If 'd' is greater than current node's data, search in the right subtree
            return right != null ? right.find(d) : null;
        }
    }

    /* Operation: Left Child Updation
     * Sets the left child of this node.
     * Also updates the parent reference of the new left child to this node.
     */
    public void setLeftChild(TreeNode left) {
        this.left = left;
        if (left != null) {
            left.parent = this;  // Set the parent reference of the left child
        }
    }

    /* Operation: Right Child Updation
     * Sets the right child of this node.
     * Also updates the parent reference of the new right child to this node.
     */
    public void setRightChild(TreeNode right) {
        this.right = right;
        if (right != null) {
            right.parent = this;  // Set the parent reference of the right child
        }
    }

    // Main method to test the TreeNode functionality
    public static void main(String[] args) {
        // Creating a root node
        TreeNode root = new TreeNode(10);

        // Inserting values into the Binary Search Tree
        root.insertInOrder(5);
        root.insertInOrder(15);
        root.insertInOrder(3);
        root.insertInOrder(7);
        root.insertInOrder(12);
        root.insertInOrder(18);

        // Printing the size of the tree (number of nodes)
        System.out.println("Size of the tree: " + root.size());

        // Searching for a value
        TreeNode foundNode = root.find(15);
        if (foundNode != null) {
            System.out.println("Node with value 15 found.");
        } else {
            System.out.println("Node with value 15 not found.");
        }

        // Searching for a non-existent value
        TreeNode notFoundNode = root.find(20);
        if (notFoundNode != null) {
            System.out.println("Node with value 20 found.");
        } else {
            System.out.println("Node with value 20 not found.");
        }
    }
}
