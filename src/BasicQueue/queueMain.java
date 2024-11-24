package BasicQueue;

import java.util.Scanner;

public class queueMain {

    int[] queue;
    int rear, front;

    queueMain(){
        queue = new int[0];
        rear = 0;
        front = 0;
    }

    int[] add(int element){
        int[] newqueue = new int[queue.length + 1];
        for(int i = 0; i < queue.length; i++){
            newqueue[i] = queue[i];
        }
        newqueue[rear] = element;
        queue = newqueue;
        rear++;
        return queue;
    }

    void printQueue(int index){
        if(rear == 0){
            System.out.println("Queue is empty");
        }else if(index >= rear){
            return;
        }else{
            System.out.println(queue[index]);
            printQueue(index + 1);
        }
    }

    public static void main(String[] args) {
        queueMain queue = new queueMain();
        System.out.println("Basic Queue Management System");
        System.out.print("Write how many elements you want of queue: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            queue.add(sc.nextInt());
        }
        while (true){
            System.out.println("Print queue: 1\nExit program: 2");
            int num1 = sc.nextInt();
            switch (num1){
                case 1:
                    queue.printQueue(0);
                    break;
                case 2:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
}
