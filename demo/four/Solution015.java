package four;

/**
 * @author Lenovo
 */
public class Solution015 {

    public static void main(String[] args) {
        ListNode head6 = new ListNode(6);
        ListNode head5 = new ListNode(5,head6);
        ListNode head4 = new ListNode(4,head5);
        ListNode head3 = new ListNode(3,head4);
        ListNode head2 = new ListNode(2,head3);
        ListNode head1 = new ListNode(1,head2);
        ListNode head0 = new ListNode(1);

        ListNode tail = removeNthFromEnd(head1,2);
        System.out.println(tail);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        //fast移n步，
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //如果fast为空，表示删除的是头结点
        if (fast == null){
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
