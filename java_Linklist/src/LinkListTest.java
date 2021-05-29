import java.util.Scanner;

/**
 * @description:
 * @author:
 * @date: 2021/5/29 20:16
 * @version:1.0
 */

public class LinkListTest {



    Node head=null;


    class Node{
        Node next=null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }



    public int ListLength(){
        int temp=0;
        if(head==null){
            return 0;
        }
        Node tmp=head;
        while (tmp!=null){
            temp++;
            if(tmp.next==null){
                return temp;
            }else {
                tmp=tmp.next;
            }
        }
        return temp;
    }

    public void add(int d){
        Node newnode=new Node(d);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void deletenode(LinkListTest ls,int index){
        int length=ls.ListLength();
        if(index>length||index<1){
            System.out.println("error2");
        }else if(index==length){
            int i=1;
            Node temp=ls.head;
            Node cur=ls.head.next;
            while (cur!=null){
                if(i==index){
                    temp.next=cur.next;
                }
                temp=cur;
                cur=cur.next;
                i++;
            }

        }
        else {
            int i=1;
            Node temp=head;
            Node cur=head.next;
            while (cur!=null){
                if(index==i){
                    temp.next=cur.next;
                }
                temp=cur;
                cur=cur.next;
                i++;
            }
        }
    }

    public void printnode(LinkListTest ls){
        int i=ls.ListLength();
        Node temp=ls.head;
        for (int j=1;j<=i;j++){
            System.out.println("第"+j+"个节点value："+temp.data);
            temp=temp.next;
        }
        if(i==0){
            System.out.println("error3");
        }
    }
}
