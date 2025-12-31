package com.testds.ds.trees;

import java.util.HashMap;
import java.util.Map;

public class TreeUtils {

    public static TreeNode createTreeFromArray(Integer[] treeArray) {
        if (treeArray == null) {
            return null;
        }
        Map<Integer, TreeNode> map = new HashMap<>();
        for (int i = 0; i < treeArray.length; i++) {
            if (treeArray[i] != null)
                map.put(i, new TreeNode(treeArray[i]));
        }

        for (int i = 0; i < treeArray.length; i++) {
            if (treeArray[i] == null) {
                continue;
            }
            if (i * 2 + 1 < treeArray.length) {
                map.get(i).setLeft(map.get(i * 2 + 1));
            }
            if (i * 2 + 2 < treeArray.length) {
                map.get(i).setRight(map.get(i * 2 + 2));
            }
        }

        return map.get(0);
    }

}
