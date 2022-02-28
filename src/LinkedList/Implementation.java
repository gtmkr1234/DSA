package LinkedList;

public class Implementation{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class LinkedList{
        Node head;
        public void insert(int data){
            Node nd = new Node(data);
            nd.next = null;

            if(head== null){
                head = nd;
            }
            else{
                Node last = head;
                while(last.next != null){
                    last = last.next;
                }
                last.next = nd;
            }
        }
        public void show(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insert(15);
        obj.insert(45);

        obj.show();
    }
}