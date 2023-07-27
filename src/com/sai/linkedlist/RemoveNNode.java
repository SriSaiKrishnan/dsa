package com.sai.linkedlist;

/*

Problem Statement: Given a linked list, and a number N. Find the Nth node from the end of this linked list and delete it. Return the head of the new modified linked list.

Example 1 :

Input: head = [1,2,3,4,5], n = 2

Output: [1,2,3,5]

 */

class RemoveNode {

    int data;
    RemoveNode next;
    RemoveNode head;

    RemoveNode(){}

    RemoveNode(int d){
        data = d;
        next = null;
    }

    public RemoveNode insert(RemoveNode node, int data) {

        RemoveNode new_node = new RemoveNode(data);

        if(node.head == null){
            head = new_node;
        }
        else{
            RemoveNode last = node.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }

        return node;
    }

    public RemoveNode print(RemoveNode node){

        RemoveNode currNode = node.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

        return node;
    }

    public RemoveNode removeNNode(RemoveNode node, int index){

       RemoveNode start = new RemoveNode();
       start = node.head;
       RemoveNode slow = start;
       RemoveNode fast = start;

       for(int i=1; i<=index; i++){
           fast = fast.next;
       }

       while (fast !=null && fast.next != null){
           slow = slow.next;
           fast = fast.next;
       }

       slow.next = slow.next.next;

        return node;
    }

    public static void main(String[] args) {

        RemoveNode node = new RemoveNode();

        node = node.insert(node,1);
        node = node.insert(node,2);
        node = node.insert(node,3);
        node = node.insert(node,4);
        node = node.insert(node,5);

        System.out.println("Before Removing the node");

        node.print(node);

        node.removeNNode(node,5);

        System.out.println("After Removing the node");

        node.print(node);

    }

}
