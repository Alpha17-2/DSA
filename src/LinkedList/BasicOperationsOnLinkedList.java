package LinkedList;
import java.util.Scanner;

public class BasicOperationsOnLinkedList {

    private Node headNode ;
    private final Scanner sc = new Scanner(System.in);
    public BasicOperationsOnLinkedList(Node headNode){
        this.headNode = headNode;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public void insertNodeAtEnd() {
        System.out.println("How many nodes do you want to enter?");
        int n = sc.nextInt();
        System.out.println("Enter nodes :");
        for(int i=0;i<n;++i){
            int data = sc.nextInt();
            Node traverseNode = headNode;
            if (headNode == null) {
                // only once when the linked list is not initialised
                headNode = new Node(data, null);
            } else {
                while (traverseNode.next != null) {
                    traverseNode = traverseNode.next;
                }
                traverseNode.next = new Node(data, null);
            }
        }
    }

    public void displayNodes() {
        Node traverseNode = headNode;
        while (traverseNode != null) {
            System.out.print(traverseNode.data + "->");
            traverseNode = traverseNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void insertNodeAtBeginning() {
        System.out.println("Enter node at beginning");
        int data = sc.nextInt();
        headNode = new Node(data, headNode);
    }

    public void deleteNodeFromStart() {
        if (headNode == null || headNode.next == null) {
            headNode = null;
        } else {
            headNode = headNode.next;
        }
    }

    public void displayNthNode(){
        System.out.println("Enter which node display");
        int n= sc.nextInt();
        Node traverseNode = headNode;
        for(int i=1;i<n && traverseNode!=null;traverseNode=traverseNode.next){
            ++i;
        }
        if (traverseNode!=null){
            System.out.println(traverseNode.data);
        }
        else{
            System.out.println("Invalid range");
        }
    }

    public void deleteNthNode(){
        System.out.println("Enter which node to delete");
        int n= sc.nextInt();
        // case 1: n = 1
        if(n==1){
            deleteNodeFromStart();
        }
        else{
            Node traverseNode = headNode;
            for(int i=1;i<n-1 && traverseNode!=null; traverseNode = traverseNode.next){
                i++;
            }
            // case 2: N lies in between or is at last
            if(traverseNode!=null){
                Node nodeToRemove = traverseNode.next;
                if(nodeToRemove!=null){
                    traverseNode.next = nodeToRemove.next;
                }
                else {
                    System.out.println("Invalid range");
                }
            }
            else{
                System.out.println("Invalid range");
            }
        }
    }

    public void reverseList(){
        Node reversed = null;
        Node traverseNode = headNode;
        while(traverseNode!=null){
            Node newNode = new Node(traverseNode.data, null);
            newNode.next = reversed;
            reversed = newNode;
            traverseNode = traverseNode.next;
        }
        headNode = reversed;
    }

    public void reverseFrom(int start,int last){
        Node current = headNode;
        Node prev = null;
        // assuming start and last are range inclusive
        for (int i = 1; i < start ; i++) {
            prev = current;
            current = current.next;
        }
        Node prevStartFrom = prev;
        Node startFrom = current;
        for (int i = start ; i <= last; i++) {
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        if(prevStartFrom==null){
            headNode=prev;
        }
        else{
            prevStartFrom.next = prev;
        }
        assert startFrom != null;
        startFrom.next=current;
    }

    public void findMiddleNode(){
        Node slow = headNode, fast=headNode, prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        assert slow != null;
        System.out.println(slow.data);
    }

    public void swapAdjacentNodes(){
        if(headNode==null || headNode.next==null){
            System.out.println("No nodes to swap");
        }
        else{
            Node current = headNode.next.next;
            Node previous = headNode;
            headNode=headNode.next;
            headNode.next = previous;
            while (current!=null && current.next!=null){
                previous.next=current.next;
                previous=current;
                Node temp= current.next.next;
                current.next.next=current;

                current=temp;
            }
            previous.next = current;
        }
    }

    public void rotateListByK(int k){
        int n=0;
        Node current = headNode;
        while (true){
            n++;
            if(current.next==null){
                current.next = headNode;
                break;
            }
            current=current.next;
        }
        k%=n;
        current = headNode;
        Node prev = null;
        for(int i=1;i<=n-k;++i){
            prev = current;
            current = current.next;
        }
        assert prev != null;
        prev.next = null;
        headNode = current;
    }

    public void deleteMiddleNode(){
        if(headNode==null|| headNode.next==null){
            headNode = null;
        }
        Node slow = headNode;
        Node fast = headNode;
        Node prev = null;
        while(fast!=null && fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev.next!=null){
            prev.next = prev.next.next;
        }
    }

    public void removeDuplicatesFromSortedList(){
        // Assuming that the list is already sorted
        if(headNode==null || headNode.next==null){
            System.out.println("Nothing to do");
        }
        else{
            Node current = headNode;
            Node fast = headNode.next;
            while(fast!=null){
                while(fast!=null  && current.data==fast.data){
                    fast=fast.next;
                }
                current.next = fast;
                current=fast;
                if (fast!=null){
                    fast=fast.next;
                }
            }
        }
    }

    public void partitionList(int value){
        Node current = headNode;
        Node beforeValue = null;
        Node afterValue = null;
        Node firstBeforeValue = null,firstAfterValue = null;
        while(current!=null){
            if(current.data<value){
                if(beforeValue == null){
                    beforeValue = new Node(current.data, null);
                    firstBeforeValue = beforeValue;
                }
                else {
                    beforeValue.next = new Node(current.data,null);
                    beforeValue=beforeValue.next;
                }
            }
            else{
                if(afterValue==null){
                    afterValue = new Node(current.data, null);
                    firstAfterValue=afterValue;
                }
                else {
                    afterValue.next = new Node(current.data,null);
                    afterValue=afterValue.next;
                }
            }
            current = current.next;
        }
        if(firstBeforeValue!=null){
            beforeValue.next=firstAfterValue;
        }
        if(firstAfterValue!=null){
            afterValue.next = null;
        }
        headNode=firstBeforeValue!=null?firstBeforeValue:firstAfterValue;
    }

    public void sortOddEvenList(){
        Node left = null;
        Node firstLeft = null;
        Node right = null;
        Node firstRight = null;
        Node current = headNode;
        while(current!=null){
            if(current.data%2==0){
                // even number
                if(right==null){
                    right = new Node(current.data, null);
                    firstRight = right;
                }
                else{
                    right.next = new Node(current.data, null);
                    right = right.next;
                }
            }
            else{
                // odd number
                if(left==null){
                    left = new Node(current.data, null);
                    firstLeft = left;
                }
                else{
                    left.next = new Node(current.data, null);
                    left = left.next;
                }
            }
            current = current.next;
        }
        if(firstLeft == null){
            headNode = firstRight;
        }
        else {
            left.next=firstRight;
            headNode = firstLeft;
        }
    }

}
