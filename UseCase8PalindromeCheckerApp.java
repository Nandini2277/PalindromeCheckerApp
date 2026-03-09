import java.util.LinkedList;

class Node{
    char data;
    Node next;
    Node(char data){
        this.data = data;
        this.next = next;
    }
}

public class UseCase8PalindromeCheckerApp {
    UseCase8PalindromeCheckerApp(){
        new UseCase1PalindromeCheckerApp(8.0);
        String input = "level";
        boolean isPalindrome = true;
        Node head = null;
        Node current = null;
        for(char c : input.toCharArray()){
            Node newNode = new Node(c);
            if(head==null){
                head=newNode;
                current=newNode;
            }else{
                current.next=newNode;
                current = newNode;
            }
        }
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node prev = null;
        Node curr = slow;
        Node next = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node first = head;
        Node second = prev;
        while(second!=null){
            if(first.data!=second.data){
                isPalindrome = false;
                break;
            }
            first = first.next;
            second = second.next;
        }
        if(isPalindrome) System.out.println(input+" is a palindrome");
        else System.out.println(input+" is not a palindrome");
    }
    public static void main(String[] args) {
        new UseCase8PalindromeCheckerApp();
    }
}
