package com.sai.linkedlist;

/*

Problem Statement: Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

Examples:

Example 1:
Input:
List 1 = [1,3,1,2,4], List 2 = [3,2,4]
Output:
2
Explanation: Here, both lists intersecting nodes start from node 2.

 */

import java.util.HashSet;

public class FindIntersection {

    FindIntersection head;
    FindIntersection next;
    int data;

    FindIntersection(){}

    FindIntersection(int d){
        data = d;
        next = null;
    }

    public FindIntersection insertToList(FindIntersection list, int data){

        FindIntersection new_node = new FindIntersection(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            FindIntersection last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public void printList(FindIntersection list){

        FindIntersection currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public void  createIntersection(FindIntersection list1, FindIntersection list2){

        FindIntersection intersectionNode = new FindIntersection();

        list1 = list1.head;

        for(int i=0; i<2; i++){
            list1 = list1.next;
        }

        intersectionNode = list1;

        list2 =  list2.head;

        while (list2.next != null){
            list2 = list2.next;
        }

        list2.next = intersectionNode;

    }

    public FindIntersection findIntersection(FindIntersection list1, FindIntersection list2){

        list1 = list1.head;
        list2 = list2.head;

        HashSet<FindIntersection> st=new HashSet<>();
        while(list1 != null) {
            st.add(list1);
            list1 = list1.next;
        }
        while(list2 != null) {
            if(st.contains(list2)) return list2;
            list2 = list2.next;
        }
        return null;

    }

    public static void main(String[] args) {

        FindIntersection list1 = new FindIntersection();

        list1.insertToList(list1,1);
        list1.insertToList(list1,2);
        list1.insertToList(list1,3);
        list1.insertToList(list1,4);
        list1.insertToList(list1,5);

        list1.printList(list1);

        System.out.println();

        FindIntersection list2 = new FindIntersection();

        list2.insertToList(list2,6);
        list2.insertToList(list2,7);
        list2.insertToList(list2,8);
        list2.insertToList(list2,9);
        list2.insertToList(list2,10);

        list2.printList(list2);

        System.out.println();

        list2.createIntersection(list1,list2);

        list2.printList(list2);

        System.out.println();

        if(list1.findIntersection(list1,list2) != null)
            System.out.println("Intersection node is " + list1.findIntersection(list1,list2).data);
        else
            System.out.println("No intersection node");


    }

}
