package com.sai.linkedlist;

/*

Problem Statement: Given head, the head of a linked list, determine if the linked list has a cycle in it. There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.

Return true if there is a cycle in the linked list. Otherwise, return false.

Examples:

Example 1:
Input:
 Head = [1,2,3,4]
Output:
 true
Explanation: Here, we can see that we can reach node at position 1 again by following the next pointer. Thus, we return true for this case.

 */


public class LinkedListCycle {

    int data;
    LinkedListCycle next;
    LinkedListCycle head;

    LinkedListCycle(){};

    LinkedListCycle(int d){
        data = d;
        next = null;
    }

    public static LinkedListCycle insert(LinkedListCycle list, int data){
        LinkedListCycle new_node = new LinkedListCycle(data);
        if(list.head == null){
            list.head = new_node;
        }
        else {
            LinkedListCycle last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }

    public static  LinkedListCycle printList(LinkedListCycle list){
        LinkedListCycle currNode = list.head;
        LinkedListCycle cycle = list.head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        return list;
    }

    public static LinkedListCycle createCycle(LinkedListCycle list){

        LinkedListCycle last = list.head;

        while (last.next != null)
        {
            last = last.next;
        }
        // Linked the LinkedList (Linked List Cycle)
        if(last.next == null)
            last.next = list.head;
        return list;

    }

    public static  Boolean detectCycle(LinkedListCycle list) {

        LinkedListCycle slow = list.head;
        LinkedListCycle fast = list.head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {

        LinkedListCycle list = new LinkedListCycle();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);

       printList(list);

       createCycle(list);

        System.out.println();

      if(detectCycle(list) == true)
          System.out.println("Cycle detected");
      else
          System.out.println("Cycle not detected");



    }

}
