//https://leetcode.com/problems/split-linked-list-in-parts/
package com.testds.leetcode.problems.splitLinkedListInParts;

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] listNodesArray = new ListNode[k];
        //counting number of nodes
        int nodeCount = 0;
        ListNode temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.next;
        }
        temp = head;
        if (nodeCount < k) {
            //we require empty arrays
            for (int i = 0; i < nodeCount; i++) {
                ListNode node = temp;
                temp = temp.next;
                node.next = null;
                listNodesArray[i] = node;
            }
        } else {
            int minNodesInEachPart = nodeCount / k;
            int numberOfPartsWithExtraNodes = nodeCount % k;

            for (int indexForReturningArray = 0; indexForReturningArray < k; indexForReturningArray++) {
                ListNode tempHead = temp;
                //iterate till minNodesInEachPart
                for (int nodePartsCount = 1; nodePartsCount < minNodesInEachPart; nodePartsCount++) {
                    temp = temp.next;
                }
                //handling extra nodes
                if (numberOfPartsWithExtraNodes > 0) {
                    temp = temp.next;
                    numberOfPartsWithExtraNodes--;
                }
                //currently temp points to last node of the listPart saving it in lastNodeOfPartList
                ListNode lastNodeOfPartList = temp;

                //increasing the temp node to jump to next node.
                temp = temp.next;

                //removing the link from the lastNodeOfPartList
                lastNodeOfPartList.next = null;

                //saving the list in the listNodesArray
                listNodesArray[indexForReturningArray] = tempHead;
            }
        }

        return listNodesArray;
    }
}
