package BinarySearchTree;
import java.util.Scanner;

public class bstMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Type root of binary search tree: ");
        int rootNum = sc.nextInt();
        bstTree root = new bstTree(rootNum);
        System.out.println("Type how many node you want: ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("Node " + i + ": ");
            int node = sc.nextInt();
            root.addNode(root, node);
        }
        while(true) {
            System.out.println("Print binary search tree: 1\nFind a num: 2\nDelete a num: 3\nFind minimum num: 4\nFind maximum num: 5\nExit the program: 6");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    root.showTree(root);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("What node you wanna search: ");
                    int node = sc.nextInt();
                    root.searchNode(root, node);
                    break;
                case 3:
                    System.out.println("What node you wanna delete: ");
                    int node2 = sc.nextInt();
                    root.deleteNode(root, node2);
                    break;
                case 4:
                    root.minBts(root);
                    break;
                case 5:
                    root.maxBts(root);
                    break;
                case 6:
                    sc.close();
                    return;
            }
        }
    }
}
