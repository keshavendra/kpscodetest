//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters
package com.testds.leetcode.problems.maxLengthConcatSubSequence;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.IntStream;

public class Solution {

    Integer[] codeArray;
    Integer[] codeLengthArray;

    @SuppressWarnings("DataFlowIssue")
    public int maxLength(List<String> arr) {
        //Find A Code for each String
        Object[] codeAndLengthArrays = getCodeAndLength(arr);
        codeArray = (Integer[]) codeAndLengthArrays[0];
        codeLengthArray = (Integer[]) codeAndLengthArrays[1];
        Queue<Integer> codeQueue = new LinkedList<>();
        Queue<Integer> indexQueue = new LinkedList<>();
        Queue<Integer> codeLengthQueue = new LinkedList<>();
        IntStream.range(0, arr.size()).forEach(x -> {
            codeQueue.add(codeArray[x]);
            indexQueue.add(x);
            codeLengthQueue.add(codeLengthArray[x]);
        });
        int maxLength = 0;
        while (!codeQueue.isEmpty()) {
            int index = indexQueue.poll();
            int code = codeQueue.poll();
            int codeLength = codeLengthQueue.poll();
            int localMax = codeLength;
            for (int i = index + 1; i < codeArray.length; i++) {
                if ((code & codeArray[i]) == 0) {
                    codeQueue.add(code | codeArray[i]);
                    indexQueue.add(i);
                    codeLengthQueue.add(codeLength + codeLengthArray[i]);
                    if (localMax < (codeLength + codeLengthArray[i])) {
                        localMax = codeLength + codeLengthArray[i];
                    }
                }
            }
            if (localMax > maxLength)
                maxLength = localMax;
        }
        return maxLength;
    }

    private Object[] getCodeAndLength(List<String> arr) {
        Integer[] code = new Integer[arr.size()];
        Integer[] codeLengthArray = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            String str = arr.get(i);
            int num = 0, codeLength = 0;
            for (char ch : str.toCharArray()) {
                int charNum = 1 << (ch - 'a');
                if ((num & charNum) != 0) {
                    num = -1;
                    codeLength = -1;
                    break;
                }
                num |= charNum;
                codeLength++;
            }
            code[i] = num;
            codeLengthArray[i] = codeLength;
        }
        return new Object[]{code, codeLengthArray};
    }
}
