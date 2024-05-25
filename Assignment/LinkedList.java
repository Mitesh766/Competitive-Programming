class Node {
    int data;
    Node next;

    Node(int data1, Node next1){
        this.data=data1;
        this.next=next1;
    }

    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}


public class LinkedList {

    private static Node convertingArrToLL(int[] arr){
        if(arr.length==0) return null;
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
          Node newNode = new Node(arr[i]);
          temp.next=newNode;
          temp=newNode;
        }
        return head;
    }

    private static void traversingALL(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }

    private static Node addBeforeHead(Node head, int element){
        Node newNode= new Node(element,head);
        return newNode;
    }

    private static boolean isEmptyLL(Node head){
        if(head==null) return true;

        return false;
    }

    private static int sizeOfLL(Node head){
        if(isEmptyLL(head)) return 0;
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

    }

   

    private static Node appendAtLast(Node head , int element){
        Node newNode= new Node(element);
        if(head==null) return newNode;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }

    private static Node middleOfLL(Node head){

        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private static Node mergeTwoLL(Node head1,Node head2){
     Node temp=head1;
     if(temp==null) return head2;

     while(temp.next!=null) temp=temp.next;
     temp.next=head2;

     return head1;

    }
    private static Node interLeaveLL(Node head1,Node head2){
        if(head1==null) return head2;
        Node curr1=head1;
        Node curr2=head2;
        Node temp1=curr1.next;
        Node temp2=curr2.next;
        while(temp1!=null && temp2!=null){
           curr1.next=curr2;
           curr1=temp1;
           temp1=temp1.next;
           curr2.next=curr1;
           curr2=temp2;
           temp2=temp2.next;
        }
  if(temp2!=null){
   curr1.next=curr2;
  }
  else{
    curr2.next=curr1;
  }

        return head1;
    }

public static void main(String[] args) {
    
    int[] arr1={1,2,3};
    int[] arr2={4,5,6};
    Node head1=convertingArrToLL(arr1);
    Node head2=convertingArrToLL(arr2);
    Node interLeavedHead=interLeaveLL(head1,head2);
    traversingALL(head1);

}
    
}
