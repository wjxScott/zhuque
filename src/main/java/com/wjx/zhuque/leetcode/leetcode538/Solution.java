package com.wjx.zhuque.leetcode.leetcode538;


import com.wjx.zhuque.leetcode.TreeNode;

/**
 * @author wangjinxin
 * @date 2021/5/8 12:49
 * @mail wjxScott@iCloud.com
 * @description
 */
public class Solution {

    private int sum = 0;

    public TreeNode convertBST(TreeNode root) {
        getSubTreeNum(root);
        return root;
    }

    private void getSubTreeNum(TreeNode root) {
        if (root == null) {
            return;
        }

        getSubTreeNum(root.right);

        sum += root.val;
        root.val = sum;

        getSubTreeNum(root.left);
    }
}