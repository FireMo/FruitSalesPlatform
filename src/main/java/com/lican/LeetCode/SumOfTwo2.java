package com.lican.LeetCode;

public class SumOfTwo2 {
    public static ListNode addTwoNum(ListNode node1, ListNode node2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = node1, q = node2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null){
            int x = (p != null) ? p.val : 0;
            int y = (p != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        node1.next = new ListNode(4);
        node1.next = new ListNode(3);
        ListNode node2 = new ListNode(5);
        node2.next = new ListNode(6);
        node2.next = new ListNode(4);

        ListNode ret = addTwoNum(node1, node2);
        System.out.println(ret);
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
