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
        public void insert(int data, int index){
            Node n = new Node(data);
            if(index == 0){
                n.next = head;
                head = n;
            }
            else{
                Node nd = head;
                for (int i = 0; i < index-1; i++) {
                    nd = nd.next;
                }
                n.next = nd.next;
                nd.next = n;
            }
        }
        public void deleteAtIndex(int index){
            if(index==0){
                head = head.next;
            }
            else{
                Node n = head;
                Node n1;
                for (int i = 0; i < index-1; i++) {
                    n = n.next;
                }
                n1 = n.next;
                n.next = n1.next;
                n1 = null;
            }
        }
    }


    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insert(15);
        obj.insert(45);
        obj.insert(156,1);
        obj.deleteAtIndex(0);

        obj.show();
    }
}