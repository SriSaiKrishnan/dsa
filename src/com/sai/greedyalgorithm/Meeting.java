package com.sai.greedyalgorithm;

/*

Problem Statement: There is one meeting room in a firm. You are given two arrays, start and end each of size N.For an index ‘i’, start[i] denotes the starting time of the ith meeting while end[i]  will denote the ending time of the ith meeting. Find the maximum number of meetings that can be accommodated if only one meeting can happen in the room at a  particular time. Print the order in which these meetings will be performed.

Example:

Input:  N = 6,  start[] = {1,3,0,5,8,5}, end[] =  {2,4,5,7,9,9}

Output: 1 2 4 5

Explanation: See the figure for a better understanding.

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NMeetings {

    int start;
    int end;
    int pos;

    NMeetings(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }

}

    class meetingComparator implements Comparator<NMeetings>{

        @Override
        public int compare(NMeetings o1, NMeetings o2)
        {
            if (o1.end < o2.end)
                return -1;
            else if (o1.end > o2.end)
                return 1;
            else if(o1.pos < o2.pos)
                return -1;
            return 1;
        }

}

public class Meeting {
    static void maxMeetings(int start[], int end[], int n) {
        ArrayList<NMeetings> meet = new ArrayList<>();

        for(int i = 0; i < start.length; i++)
            meet.add(new NMeetings(start[i], end[i], i+1));

        meetingComparator mc = new meetingComparator();
        Collections.sort(meet, mc);
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i = 1;i<start.length;i++) {
            if(meet.get(i).start > limit) {
                limit = meet.get(i).end;
                answer.add(meet.get(i).pos);
            }
        }
        System.out.println("The order in which the meetings will be performed is ");
        for(int i = 0;i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }
    public static void main(String args[])
    {
        int n = 6;
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,5,7,9,9};
        maxMeetings(start,end,n);

    }
}

