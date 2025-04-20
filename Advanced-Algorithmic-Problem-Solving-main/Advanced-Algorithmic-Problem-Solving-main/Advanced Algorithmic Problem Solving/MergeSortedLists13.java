class listNode {
        int val;
        Node next;

        listNode(int val){
            this.val = val;
        }
}
public class MergeSortedLists13 {
    public static Node mergeTwolist(Node l1, Node l2){
        Node temp = new Node(-1);
        Node tail = temp;

        while (l1 != null && l2 != null) {
            if(l1.val < l2.val){
                tail.next  = l1;
                l1 = l1.next;
            }
            else{
                tail.next = l2;
                l2 =l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null)? l1 :l2;
        return temp.next;
    }

    public static void printList(Node head){
        while(head != null){
            System.out.print(head.val +" -> ");
            head =head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node l1 =new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(5);

        Node l2 =new Node(2);
        l2.next = new Node(4);
        l2.next.next  = new Node(6);

        Node mergedHead = mergeTwolist(l1,l2);
        System.out.println("Merge List: ");
        printList(mergedHead);
    }

}


