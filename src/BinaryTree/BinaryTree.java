package BinaryTree;
class BinaryNode<T>{
    T data;
    BinaryNode<T> left;
    BinaryNode<T> right;
    public void BinaryNode(T data){
        this.data = data;
    }
}
public class BinaryTree {
    public static void main(String[] args) {
        BinaryNode <Integer> root = new BinaryNode<Integer>(15);

    }
}
