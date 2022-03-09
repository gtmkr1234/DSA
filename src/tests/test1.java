package tests;
import java.util.Scanner;

// Question -
/*             an array is given in which we have to add the longest subsequence in a priority queue
*/
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue enq = new PriorityQueue();
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        int sum,len, j = 0,flag=0,temp=0;
        for(int i=0;i<n;i++)
        {
            flag=0;
            if(a[i]%2!=0)
            {
                flag=1;
                temp=1;
                len=0;sum=0;
                for(j=i;j<n && a[j]%2!=0;j++)
                {
                    len++;
                    sum+=a[j];
                }
                enq.enque(len,sum);
            }

            if(flag==1)
                i=j;
        }


        if(temp==0)
        {
            System.out.println("can't perform the operation");
        }
        else
            enq.display();
    }
}
class node{
    int length;
    int priority;
    node next;
    public node(int length, int priority){
        this.length = length;
        this.priority = priority;
        next = null;
    }
}
class PriorityQueue{
    node rear;
    node front;

    PriorityQueue(){
        rear = null;
        front = null;
    }
    public void enque(int len, int sum){
        node newnode = new node(len,sum);
        if(front == null|| newnode.priority < front.priority){
            newnode.next = front;
            front = newnode;
        }
        else{
            node temp = front;
            while(temp.next == null && temp.next.priority <= newnode.next.priority){
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }

    }
    public void display(){
        node tmp = front;
        while(tmp.next != null){
            System.out.println( tmp.next + " " + tmp.priority);
            tmp = tmp.next;
        }
    }
}