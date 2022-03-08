public class Main {


    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.addNode(50, "Boss");
        binaryTree.addNode(25, "Vice President");
        binaryTree.addNode(15, "Office Manager");
        binaryTree.addNode(30, "Secretary");
        binaryTree.addNode(75, "Sales Manager");
        binaryTree.addNode(80, "Salesman 1");

        Orders.inOrderTraverseTree(binaryTree.root);
        Orders.preOrderTraverseTree(binaryTree.root);
        Orders.postOrderTraverseTree(binaryTree.root);
    }
}
