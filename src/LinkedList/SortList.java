package LinkedList;

public class SortList {

    public static ListNode sortList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return mergeTwoLists(left,right);
        
    }

    private static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }

    }

    private static ListNode getMid(ListNode head){
        ListNode midPrev = null;
        while(head!=null && head.next!=null){
            midPrev = (midPrev==null)?head:midPrev.next;
            head = head.next.next;
        }
        assert midPrev != null;
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
// test the above function sortList
    public static void main(String[] args) {
        // test sortList
        ListNode head = new ListNode(7);

        System.out.println(sortList(head).val);
    }
}

