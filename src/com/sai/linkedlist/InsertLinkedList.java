package com.sai.linkedlist;

public class InsertLinkedList {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    public static InsertLinkedList insert(InsertLinkedList list, int data){
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
        }
        return list;
    }

    public static  InsertLinkedList printList(InsertLinkedList list){
        Node currNode = list.head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        return list;
    }

    public static void main(String[] args) {
        InsertLinkedList list = new InsertLinkedList();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);

        printList(list);
    }

}
