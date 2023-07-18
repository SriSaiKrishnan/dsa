package com.sai.linkedlist;

/*

Problem Statement: Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list instead, you will be given access to the node to be deleted directly. It is guaranteed that the node to be deleted is not a tail node in the list.

Examples:

Example 1:
Input:
 Linked list: [1,4,2,3]
       Node = 2
Output:
Linked list: [1,4,3]
Explanation: Access is given to node 2. After deleting nodes, the linked list will be modified to [1,4,3].

Example 2:
Input:
 Linked list: [1,2,3,4]
       Node = 1
Output: Linked list: [2,3,4]
Explanation:
 Access is given to node 1. After deleting nodes, the linked list will be modified to [2,3,4].

 */

class DeleteNode {

    DeleteNode head;
    DeleteNode next;
    int data;

    DeleteNode(){}

    DeleteNode(int d)
    {
        data = d;
        next = null;
    }

    public DeleteNode insert(DeleteNode list, int data){

        DeleteNode new_node = new DeleteNode(data);

        if(list.head == null){
            head = new_node;
        }
        else {
            DeleteNode last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }

    public DeleteNode deleteNode(DeleteNode list, int data){

        DeleteNode currNode = list.head;

        while (currNode != null){
            if(currNode.data == data)
            {
                currNode.data = currNode.next.data;
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }

        return list;
    }

    public DeleteNode print(DeleteNode list){

        DeleteNode currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        return list;
    }

    public static void main(String[] args) {
        DeleteNode node = new DeleteNode();

        node.insert(node,1);
        node.insert(node,2);
        node.insert(node,3);
        node.insert(node,3);
        node.insert(node,4);
        node.insert(node,5);

        node.print(node);

        System.out.println();

        node.deleteNode(node,3);

        node.deleteNode(node,3);

        System.out.println("After deleting the node");

        node.print(node);
    }

}
