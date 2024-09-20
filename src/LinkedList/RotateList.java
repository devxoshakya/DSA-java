package LinkedList;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k <= 0){
            return head;
        }
        ListNode last = head;
        int length = 1;
        while(last.next != null){
            last = last.next;
            length++;
        }

        last.next = head;
        k = k % length;
        int stepsToNewHead = length - k;

        for(int i = 0; i < stepsToNewHead; i++){
            last = last.next;
        }

        head = last.next;
        last.next = null;
        return head;
    }
}
