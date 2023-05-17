package cn.itcast;

import java.awt.*;
import java.util.Date;

public class Leetcode_1 {

    public static void main(String[] args) throws Exception {

        int[] a1 = {2,4,3};
        int[] a2 = {5,6,4};
        Solution solution = new Solution();
        ListNode l1 = solution.createListNode(a1);
        ListNode l2 = solution.createListNode(a2);
        ListNode node = solution.addTwoNumbers(l1, l2);
        solution.print(node);
        String a = "99999999999";

    }

}

 class ListNode {
    void ss(){}
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    ListNode nodeStar = new ListNode();
    ListNode nextNode = nodeStar;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = getNum(l1) + getNum(l2);
        getLN(num);
        return nextNode;
    }

    public int getNum(ListNode l){
        String str = new String();
        int num;
        while(l != null){
            str += String.valueOf(l.val);
            l = l.next;
        }
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        str = sb.toString();
        num = Integer.parseInt(str);
        return num;
    }

    public void getLN(int num){
        String str = String.valueOf(num);
        StringBuffer sb = new StringBuffer(str);
        sb = sb.reverse();
        str = sb.toString();
        char[] array_c = str.toCharArray();
        for( int i = 0;i <= array_c.length-1; i++ ){
            ListNode node = new ListNode();
            nextNode.val = Integer.parseInt(String.valueOf(array_c[i]));
            if (i == array_c.length-1){
                break;
            }
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        nextNode = nodeStar;
    }

    // 创建链表
    public ListNode createListNode(int[] array){
        ListNode start = new ListNode();
        ListNode nextNode = start;
        for (int i = 0; i <= array.length-1;i++){
            ListNode node = new ListNode();
            nextNode.val = array[i];
            if (i == array.length-1){
                break;
            }
            nextNode.next = node;
            nextNode = nextNode.next;
        }
        return start;
    }

    // 打印链表
    public void print(ListNode listNode){
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}


 class SuperTest extends Date {
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new SuperTest().test();
    }
}