package com.sai.linkedlist;

    class Node{
        Node head;
        int data;
        Node next;

        Node(){}

        Node(int d){
            data = d;
            next = null;
        }

    public static Node insert(Node list, int data){
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

    public static  Node printList(Node list){
        Node currNode = list.head;
        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        return list;
    }

    public static void main(String[] args) {
        Node list = new Node();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);

        printList(list);
    }
}