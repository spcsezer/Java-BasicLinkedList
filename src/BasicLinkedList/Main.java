package BasicLinkedList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        System.out.print("Type how many you wanna add node: ");
        int nodeNum = sc.nextInt();
        for(int i = 1; i <= nodeNum; i++){
            System.out.print("Node " + i + ": ");
            int value = sc.nextInt();
            Node newNode = new Node(value);
            list.addNode(newNode);
        }
        while(true) {
            System.out.println("(Printing list: 1)\n(Remove First Node: 2)\n(Remove Last Node: 3)\n(Remove Node by Index: 4)\n(Exit the Program: 5)");
            System.out.print("Enter the node operation index: ");
            int operationIndex = sc.nextInt();
            switch (operationIndex) {
                case 1:
                    list.printLinkedLists();
                    break;
                case 2:
                    list.removeFirstNode();
                    break;
                case 3:
                    list.removeLastNode();
                    break;
                case 4:
                    System.out.print("Which node would you like to remove: ");
                    int nodeIndex = sc.nextInt();
                    list.removeNode(nodeIndex);
                    break;
                case 5:
                    System.out.print("Exiting the program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid operation index");
                    break;
            }
        }
    }
}
