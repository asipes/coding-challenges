package org.solutions.leetcode.easy;

import org.model.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> ans = new ArrayList<>();
        String path = "";

        dfs(root, path, ans);
        return ans;
    }

    private void dfs(TreeNode node, String path, List<String> ans) {
        path += node.val;

        if (node.left == null && node.right == null) {
            ans.add(path);
        }

        if (node.left != null) {
            dfs(node.left, path + "->", ans);
        }
        if (node.right != null) {
            dfs(node.right, path + "->", ans);
        }
    }
}
