package tests;

public class test2 {
    private class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data = data;
        }
    }
    class bst{
        node root;
        public void insert(node root,int data){
            if(root==null){
                node nd = new node(data);
                root = nd;
                return;
            }
            if(root.data>data){
                insert(root.left, data);
            }
            else{
                insert(root.right, data);
            }
        }

        public void preorder(node root){
            if(root==null){
                return;
            }
            else{
                System.out.println(root.data);
                preorder(root.left);
                preorder(root.right);
            }
        }
        public void inorder(node root){
            if(root==null){
                return;
            }
            else {
                inorder(root.left);
                System.out.println(root.data);
                inorder(root.right);
            }
        }
        public void postorder(node root){
            if(root==null){
                return;
            }
            else {
                postorder(root.left);
                postorder(root.right);
                System.out.println(root.data);
            }
        }

    }
}