package BinarySearchTree;

public class bstTree {

    bstTree left;
    bstTree right;

    int value;
    bstTree(int value){
        this.value = value;
        left = null;
        right = null;
    }

    bstTree addNode(bstTree root, int value) {
        if(root == null){
            return new bstTree(value);
        }
        if(root.value < value){
            root.right = addNode(root.right, value);
        }
        else if(root.value > value){
            root.left = addNode(root.left, value);
        }
        return root;
    }
    void showTree(bstTree root){
        if(root == null) {
            System.out.println("Tree is empty");
        }else{
            System.out.print(root.value + " ");
        }
        if(root.left != null) {
            showTree(root.left);
        }
        if(root.right != null) {
            showTree(root.right);
        }
    }
    Boolean searchNode(bstTree root, int value) {
        if(root == null){
            System.out.println("There is no such node");
            return false;
        }
        if(root.value == value){
            System.out.println("Found such node");
            return true;
        }
        if(root.value < value){
            return searchNode(root.right, value);
        }else{
            return searchNode(root.left, value);
        }
    }
    bstTree deleteNode(bstTree root, int value) {
        if(root == null){
            System.out.println("There is no such node");
            return null;
        }
        if(root.value < value){
            root.right = deleteNode(root.right, value);
        }else if (root.value > value){
            root.left = deleteNode(root.left, value);
        }else{
            if(root.left == null && root.right == null){
                return null;
            }
            else if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            else{
                bstTree minNode = findMin(root.left);
                root.value = minNode.value;
                root.left = deleteNode(root.left, minNode.value);
            }
        }
        return root;
    }
    bstTree findMin(bstTree root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    void minBts(bstTree root){
        if(root == null){
            System.out.println("There is no such node");
        }
        else{
            if(root.left == null){
                System.out.println(root.value);
            }else{
                minBts(root.left);
            }
        }
    }
    void maxBts(bstTree root){
        if(root == null){
            System.out.println("There is no such node");
        }
        else{
            if(root.right == null){
                System.out.println(root.value);
            }
            else{
                maxBts(root.right);
            }
        }
    }
}