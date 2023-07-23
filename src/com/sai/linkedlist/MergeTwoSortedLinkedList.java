package com.sai.linkedlist;

/*

Problem Statement: Given two singly linked lists that are sorted in increasing order of node values, merge two sorted linked lists and return them as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Example 1:

Input Format :
l1 = {3,7,10}, l2 = {1,2,5,8,10}

Output :
{1,2,3,5,7,8,10,10}

 */

class SortedLinkedList {

    SortedLinkedList head;
    int data;
    SortedLinkedList next;

    SortedLinkedList(){};

    SortedLinkedList(int d){
        data = d;
        next = null;
    }

    public SortedLinkedList insert(SortedLinkedList list, int data){

        SortedLinkedList new_node = new SortedLinkedList(data);

        if(list.head == null){
            list.head = new_node;
        }
        else{
            SortedLinkedList last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static SortedLinkedList print(SortedLinkedList list){

        SortedLinkedList currList = list.head;

        while (currList != null){
            System.out.print(currList.data + " ");
            currList = currList.next;
        }

        return list;
    }

    public static SortedLinkedList sort(SortedLinkedList list1, SortedLinkedList list2){

        SortedLinkedList sortedLinkedList = new SortedLinkedList();

        list1 = list1.head;
        list2 = list2.head;

        while (list1 != null && list2 != null){
            if(list1.data < list2.data){
                sortedLinkedList.insert(sortedLinkedList, list1.data);
                list1 = list1.next;
            }else{
                sortedLinkedList.insert(sortedLinkedList, list2.data);
                list2 = list2.next;
            }
        }

        while (list1 != null)
        {
            sortedLinkedList.insert(sortedLinkedList, list1.data);
            list1 = list1.next;
        }
        while (list2 != null)
        {
            sortedLinkedList.insert(sortedLinkedList, list2.data);
            list2 = list2.next;
        }

        System.out.println();

        System.out.println("Sorted List");

        print(sortedLinkedList);

        return sortedLinkedList;
    }

    public static void main(String[] args) {

        SortedLinkedList list1 = new SortedLinkedList();

        list1.insert(list1,1);
        list1.insert(list1,2);
        list1.insert(list1,5);
        list1.insert(list1,6);
        list1.insert(list1,8);

        SortedLinkedList list2 = new SortedLinkedList();
        list2.insert(list2,3);
        list2.insert(list2,4);
        list2.insert(list2,7);

        print(list1);

        System.out.println();

        print(list2);

        sort(list1,list2);

    }

}
