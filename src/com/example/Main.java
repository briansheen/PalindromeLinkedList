package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(3);
        ListNode a5 = new ListNode(2);
        ListNode a6 = new ListNode(1);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;
        System.out.println(isPalidrome(a1));
    }

    public static boolean isPalidrome(ListNode head){
        List<Integer> valList = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            valList.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(valList);
        System.out.println(valList);
        for(Integer val : valList){
            if(val != head.val){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
