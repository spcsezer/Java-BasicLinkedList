package BinarySearchTree;

public class bstMain {

    public static void main(String[] args) {
        bstTree newNode = new bstTree(10);

        newNode.addNode(newNode, 5);
        newNode.addNode(newNode, 3);
        newNode.addNode(newNode, 6);
        newNode.addNode(newNode, 12);
        newNode.addNode(newNode, 11);
        newNode.addNode(newNode, 13);

        newNode.showTree(newNode);
        System.out.println();
        newNode.searchNode(newNode, 11);
        newNode.deleteNode(newNode, 11);
        newNode.showTree(newNode);
        System.out.println();
        newNode.minBts(newNode);
        newNode.maxBts(newNode);

    }
}
