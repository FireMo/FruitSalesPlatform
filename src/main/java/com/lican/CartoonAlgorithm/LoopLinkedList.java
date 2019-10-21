package com.lican.CartoonAlgorithm;

/**
 * @Descirption
 * @Author FireMo
 * @Date 2019/9/16 8:52
 */
public class LoopLinkedList {

    /**
     * 功能描述: 判断链表是否有环
     * @Param:
     * @Return:
     * @Author: FireMo
     * @Date: 2019/9/16 9:29
     */
    public static boolean isCycle(Node head){
        Node p1 = head;
        Node p2 = head;
        while (p1.next != null && p2.next != null){
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2){
                return true;
            }
        }
        return false;
    }

    /**
     * 功能描述: 求环的长度
     * @Param: [head]
     * @Return: int
     * @Author: FireMo
     * @Date: 2019/9/16 9:29
     */
    public static int cycleLength(Node head){
        Node p1 = head.next;
        Node p2 = head.next.next;
        //先让两个指针指向环上的同一点
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p1 = p1.next;
        p2 = p2.next.next;
        int count = 1;//上两行代码代表 先走一步！
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next.next;
            count++;
        }
        return count;
    }

    /**
     * 功能描述: 求入环节点
     * @Param: [head]
     * @Return: com.lican.CartoonAlgorithm.LoopLinkedList.Node
     * @Author: FireMo
     * @Date: 2019/9/16 12:41
     */
    public static Node getFirstNodeCycle(Node head){
        Node p1 = head.next;
        Node p2 = head.next.next;
        //先让两个指针指向环上的同一点
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        p1 = head;
        while (p1 != p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p1;
    }

    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(5);
        Node node2 = new Node(3);
        Node node3 = new Node(7);
        Node node4 = new Node(2);
        Node node5 = new Node(6);
        Node node6 = new Node(8);
        Node node7 = new Node(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node3;
        System.out.println(isCycle(node1));
        System.out.println("环长度为：" + cycleLength(node1));
        System.out.println("入环节点为：" + getFirstNodeCycle(node1).data);
    }

}
