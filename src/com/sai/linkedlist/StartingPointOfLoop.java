package com.sai.linkedlist;

/*

Problem Statement: Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that the tail’s next pointer is connected to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as a parameter.

Do not modify the linked list.

Examples:

Example 1:
Input:
 head = [1,2,3,4,3,6,10]
Output:
 tail connects to node index 2

 */

import java.util.ArrayList;
import java.util.List;

public class StartingPointOfLoop {

    StartingPointOfLoop head;
    StartingPointOfLoop next;
    int data;

    StartingPointOfLoop(){};

    StartingPointOfLoop(int d){
        data = d;
        next = null;
    }

    public StartingPointOfLoop insert(StartingPointOfLoop list, int data){

        StartingPointOfLoop new_node = new StartingPointOfLoop(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            StartingPointOfLoop last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public StartingPointOfLoop printList(StartingPointOfLoop list){

        StartingPointOfLoop curr = list.head;
        List<Integer> elements = new ArrayList<>();

        while (curr != null){
            System.out.print(curr.data + " ");
            elements.add(curr.data);
            curr = curr.next;
        }

        return list;
    }

    public StartingPointOfLoop createCycle(StartingPointOfLoop list){

        StartingPointOfLoop last = list.head;

        while (last.next != null){
            last = last.next;
        }

        last.next = list.head;

        return list;
    }

    public static  Boolean detectCycle(StartingPointOfLoop list) {

        StartingPointOfLoop slow = list.head;
        StartingPointOfLoop fast = list.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public StartingPointOfLoop findIndex(StartingPointOfLoop list) {

        if (list == null)
            return null;

        StartingPointOfLoop slow = list.head;
        StartingPointOfLoop fast = list.head;
        StartingPointOfLoop entry = list.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                while (slow != entry) {
                    slow = slow.next;
                    entry = entry.next;
                }
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {

        StartingPointOfLoop list = new StartingPointOfLoop();

        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);

        list.printList(list);

        list.createCycle(list);

        System.out.println();

        if(detectCycle(list) == true)
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");

        System.out.println();

        int d = list.findIndex(list).data;

        System.out.println(d);

    }

}
