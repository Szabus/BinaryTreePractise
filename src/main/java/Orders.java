public class Orders {

    public static void inOrderTraverseTree(Node focusNode){

        if (focusNode != null){

            inOrderTraverseTree(focusNode.leftChild);

            System.out.println(focusNode);

            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    public static void preOrderTraverseTree(Node focusNode){

        if (focusNode != null){

            System.out.println(focusNode);

            preOrderTraverseTree(focusNode.leftChild);

            preOrderTraverseTree(focusNode.rightChild);
        }
    }
    public static void postOrderTraverseTree(Node focusNode){

        if (focusNode != null){

            postOrderTraverseTree(focusNode.leftChild);

            postOrderTraverseTree(focusNode.rightChild);

            System.out.println(focusNode);
        }
    }


}
