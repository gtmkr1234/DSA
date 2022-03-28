package BinaryTree;
class BinaryNode<T>{
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;
    public BinaryNode(T data){
        this.data = data;
    }
}
public class BinaryTree {
    public static void print(BinaryNode root){
        if (root == null){
            return;
        }
        else{
            System.out.print(root.data);
            System.out.println();
            print(root.left);
            print(root.right);
        }
    }
    public static void main(String[] args) {
        BinaryNode <Integer> root = new BinaryNode<>(15);
        BinaryNode<Integer> Rleft = new BinaryNode<>(10);
        BinaryNode<Integer> Rright = new BinaryNode<>(20);
        BinaryNode<Integer> o1 = new BinaryNode<>(55);
        BinaryNode<Integer> o2 = new BinaryNode<>(45);

        root.left=Rleft;
        root.right=Rright;
        Rright.right = o1;
        Rleft.left = o2;
        print(root);

    }
}
