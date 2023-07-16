package com.sai.linkedlist;

class ListNode {

        ListNode head;
        int data;
        ListNode next;

     ListNode(){}

        ListNode(int d){
            data = d;
            next = null;
        }

    public static ListNode insert(ListNode list, int data){

        ListNode new_node = new ListNode(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            ListNode last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public static ListNode print(ListNode list)
    {

        ListNode currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        return list;
    }

    public static ListNode reverse(ListNode head){

        ListNode new_node = null;
        head = head.head;
        while (head != null){
            ListNode next = head.next;
            head.next = new_node;
            new_node = head;
            head = next;
        }
        return new_node;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode();

        System.out.println("Inserting elements in the linked list");

        listNode = insert(listNode,1);
        listNode = insert(listNode,2);
        listNode = insert(listNode,3);
        listNode = insert(listNode,4);
        listNode = insert(listNode,5);

        print(listNode);

        System.out.println();

        System.out.println("After reversing the linked list");

        listNode.head = reverse(listNode);

        print(listNode);
    }

}

