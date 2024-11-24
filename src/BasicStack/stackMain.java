package BasicStack;

import java.util.Scanner;

public class stackMain {

    int[] stack;
    int pointer;

    stackMain(){
        stack = new int[0];
        pointer = 0;
    }

    int[] push(int num){
        int[] newStack = new int[pointer + 1];
        for(int i = 0; i < pointer; i++){
            newStack[i] = stack[i];
        }
        newStack[pointer] = num;
        stack = newStack;
        pointer++;
        return stack;
    }

    int pop(){
        return stack[--pointer];
    }

    void printStack(int pointer){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else if(pointer - 1 >= 0){
            System.out.println(stack[pointer - 1]);
            System.out.println("-----");
            printStack(pointer - 1);
        }
    }

    Boolean isEmpty(){
        if(pointer == 0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        stackMain stack = new stackMain();
        System.out.println("Basic Stack Management System");
        System.out.print("Write how many elements you want of stack: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            stack.push(sc.nextInt());
        }
        while(true){
            System.out.println("Print Stack: 1\nPop an Element: 2\nExit Program: 3");
            int input = sc.nextInt();
            switch(input){
                case 1:
                    stack.printStack(stack.pointer);
                    break;
                case 2:
                    System.out.println("Popped an Element: " + stack.pop());
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Operation");
                    break;
            }
        }
    }
}
