package com.sai.linkedlist;

/*

Problem Statement: Given the head of a singly linked list, return true if it is a palindrome.

Examples:

Example 1:
Input: head = [1,2,3,3,2,1]
Output:
 true

 */

public class Palindrome {

    int data;
    Palindrome next;
    Palindrome head;

    Palindrome(){};

    Palindrome(int d){
        data =d;
        next = null;
    }

    public Palindrome insert(Palindrome list, int data){

        Palindrome new_node = new Palindrome(data);

        if(list.head == null){
            list.head = new_node;
        }
        else {
            Palindrome last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    public Palindrome print(Palindrome list){

        Palindrome currNode = list.head;

        while (currNode != null){
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        return list;
    }

    public Palindrome reverse(Palindrome list){

        Palindrome new_node = null;

        while (list != null){
            Palindrome next = list.next;
            list.next = new_node;
            new_node = list;
            list = next;
        }
        return new_node;
    }

    public boolean checkPalindrome(Palindrome list){

        if(list == null && list.next == null)
            return true;

        Palindrome slow = list.head;
        Palindrome fast = list.head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);

        slow = slow.next;
        Palindrome dummy = list.head;

        while (slow != null){
            if(slow.data != dummy.data)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Palindrome list = new Palindrome();

        list.insert(list,1);
        list.insert(list,3);
        list.insert(list,1);
        list.insert(list,1);
        list.insert(list,3);
        list.insert(list,1);

        list.print(list);

        System.out.println();

        if (list.checkPalindrome(list) == true)
            System.out.println("The given linked list is palindrome");
        else
            System.out.println("The given linked list is not palindrome");

    }


}
