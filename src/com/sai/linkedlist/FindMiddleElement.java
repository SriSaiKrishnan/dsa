package com.sai.linkedlist;

/*

Problem Statement: Given the head of a singly linked list, return the middle node of the linked list. If there are two middle nodes, return the second middle node.

Examples:

Input Format:
( Pointer / Access to the head of a Linked list )
head = [1,2,3,4,5]

Result: [3,4,5]
( As we will return the middle of Linked list the further linked list will be still available )

Explanation: The middle node of the list is node 3 as in the below image.

 */


    class ListNodee {

        ListNodee next;
        ListNodee head;
        int data;
        static int size;

        ListNodee() {
        }

        ListNodee(int d) {
            data = d;
            next = null;
        }

        public static ListNodee insert(ListNodee listNodee, int data) {

            ListNodee new_node = new ListNodee(data);

            if (listNodee.head == null) {
                listNodee.head = new_node;
            } else {
                ListNodee last = listNodee.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
            size +=1;
            return listNodee;
        }

        public static ListNodee middleNode(ListNodee listNodee){

            ListNodee slow = listNodee.head, fast = listNodee.head;
            while (fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public static ListNodee print(ListNodee list){
            ListNodee currNode = list.head;
            while (currNode != null){
                System.out.print(currNode.data + " ");
                currNode = currNode.next;
            }
            return list;
        }


        public static void main(String[] args) {
            ListNodee listNodee = new ListNodee();

            listNodee = insert(listNodee,1);
            listNodee = insert(listNodee,2);
            listNodee = insert(listNodee,3);
            listNodee = insert(listNodee,4);
            listNodee = insert(listNodee,5);
            listNodee = insert(listNodee,7);
            listNodee = insert(listNodee,8);
            listNodee = insert(listNodee,6);


            print(listNodee);

            System.out.println();

            System.out.println("Size of the Linked List is " + size);

            listNodee.head = middleNode(listNodee);

            System.out.println("Print the elements after find the middle element");

            print(listNodee);

        }

    }
