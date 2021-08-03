package linked_list;

public class ImplementationOfLinkedList {

    public static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public void printNode(){
            System.out.println(this.data +" "+ this.next);

        }
    }

    public static class LinkedList{
        Node head;

        public LinkedList() {
            this.head = null;
        }
        public void InsertNodeAtTheTail(int data){
            if(head==null){
                head = new Node(data);
                return;
            }
            Node current = head;
            while (current.next !=null){
                current =current.next;
            }
            current.next =new Node(data);
            return;

        }
        public void printLinedList(){
            if(head==null){
                return;
            }
            Node current = head;
            while (current !=null){
                System.out.print(current.data+" ");
                current = current.next;
            }
            System.out.println();
            return;

        }
        public void InsertNodeAtTheHead(int data){
            if(head ==null){
                head =new Node(data);
                return;
            }
            Node temp = new Node(data);
            temp.next = head;
            head =temp;
            return;

        }
        public void deleteNode(int data){
            Node current =head;
            while (current.next.data !=data){
                current = current.next;
            }
            current.next=current.next.next;
            return;
        }


        public void insertNodeAtPosition(int val,int pos){
            if(head ==null){
                head =new Node(val);
                return;
            }
            if(pos==0){
                Node temp = new Node(val);
                temp.next = head;
                head =temp;
                return;

            }
            Node temp=head;
            for (int i=0; temp!=null && i<pos-1; i++){
                temp = temp.next;
            }
            Node beforeNode = temp.next;
            Node newNode= new Node(val);
            temp.next=newNode;
            newNode.next=beforeNode;
        }

        public  void detectPalindrome(){
            Node temp = head;
            Node current = head;
            Node after = null;
            Node before = null;
            while(current != null){
                after = current.next;
                current.next = before;
                before = current;
                current = after;
            }
            head = before;
            Node current1 = head;
            while (current1.data==temp.data&& current1.next!=null){
                temp=temp.next;
                current1=current1.next;
                System.out.println("hello");
            }
        }

    }


    public static void main(String[] args) {
//        Node node = new Node(5);
//        node.printNode();

        LinkedList linkedList=new LinkedList();
        linkedList.InsertNodeAtTheTail(1);
        linkedList.InsertNodeAtTheTail(2);
        linkedList.InsertNodeAtTheTail(3);
        linkedList.InsertNodeAtTheTail(2);
        linkedList.InsertNodeAtTheTail(1);
//        linkedList.InsertNodeAtTheHead(1);
//        linkedList.insertNodeAtPosition(1,2);
        linkedList.detectPalindrome();
        linkedList.printLinedList();



    }

}
