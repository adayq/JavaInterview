package four;

/**
 * 给定一个链表，判断链表中是否有环。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 *
 */

public class Solution013 {
    /**
     * Definition for singly-linked list.
     */
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        hasCycle(head);
    }

    public static boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fastNode = head;
        ListNode lastNode = head;
        while (fastNode != null && fastNode.next != null) {
            fastNode = fastNode.next.next;
            lastNode = lastNode.next;
            if (fastNode == lastNode) {
                return true;
            }
        }
        return false;
    }


}
