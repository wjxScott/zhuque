package com.wjx.zhuque.algorithm.bst;

import com.wjx.zhuque.algorithm.tree.TreeNode;

/**
 * @author wangjinxin
 * @date 2021/5/8 16:01
 * @mail wjxScott@iCloud.com
 * @description 二叉搜索树中插入一个数
 */
public class InsertBST {
    public TreeNode insertBST(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (root.value < value) {
            root.right = insertBST(root.right, value);
        }

        if (root.value > value) {
            root.left = insertBST(root.left, value);
        }
        return root;
    }
}
