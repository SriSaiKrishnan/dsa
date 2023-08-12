package com.sai.linkedlist;

/*

Problem Statement: Given the head of a linked list, rotate the list to the right by k places.

Examples:

Example 1:
Input:
	head = [1,2,3,4,5]
	k = 2
Output:
 head = [4,5,1,2,3]
Explanation:
 We have to rotate the list to the right twice.

 */

public class RotateLinkedList {

    RotateLinkedList head;
    RotateLinkedList next;
    int data;

    RotateLinkedList(){}

    RotateLinkedList(int d){
        data = d;
        next = null;
    }

    public RotateLinkedList insert(RotateLinkedList list, int data){

        RotateLinkedList new_node = new RotateLinkedList(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            RotateLinkedList last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return new_node;
    }

    public void printList(RotateLinkedList list){

        RotateLinkedList currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
    }

    public RotateLinkedList rotateLinkedList(RotateLinkedList list){

        RotateLinkedList last = list.head;

        while (last.next.next != null){
            last = last.next;
        }
        RotateLinkedList last_node = last.next;
        last.next = null;
        RotateLinkedList new_head = list.head;
        list.head = last_node;
        list.head.next = new_head;
        return list;
    }

    public static void main(String[] args) {

        RotateLinkedList list = new RotateLinkedList();

        list.insert(list,1);
        list.insert(list,2);
        list.insert(list,3);
        list.insert(list,4);
        list.insert(list,5);

        list.printList(list);

        int k=4;

        for (int i=0; i<k; i++){
            list.rotateLinkedList(list);
        }

        System.out.println();

        list.printList(list);

    }

}
