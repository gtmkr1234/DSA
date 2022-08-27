package BinarySearchTree;

class node {
    int data;
    node left;
    node right;

    public node(int data){
        this.data = data;
    }
}
public class BST {
    node root;
    public BST(){
        root=null;
    }
    public node insertkey(node root, int data){
        if(root==null){
            node nd = new node(data);
            root=nd;
            return root;
        }
        if(data<root.data){
            if(root.left==null){
                node nd = new node(data);
                root.left= nd;
            }
            else {
                insertkey(root.left, data);
            }
        }
        if(data>root.data){
            if(root.right==null){
                node nd = new node(data);
                root.right= nd;
            }
            else {
                insertkey(root.right, data);
            }
        }
        return root;
    }
    public void insert(int data){
        root = insertkey(root,data);
    }
    public void preorder(node root){
        if(root==null){
            return;
        }
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void main(String[] args) {
        BST obj = new BST();
        obj.insert(15);
        obj.insert(55);
        obj.insert(65);
        obj.insert(12);
        obj.insert(3);
        obj.insert(13);
        obj.inorder(obj.root);
        System.out.println();
        obj.preorder(obj.root);
    }
}
