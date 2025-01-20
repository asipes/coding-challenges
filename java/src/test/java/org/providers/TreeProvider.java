package org.providers;

import org.model.Node;
import org.model.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeProvider {
    /**
     * Строит бинарное дерево из представления массива в порядке уровней.
     * Каждый элемент соответствует значению узла, null обозначает отсутствующие узлы.
     */
    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();

            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    /**
     * Строит бинарное дерево поиска (BST) из массива целых чисел.
     * Null-значения игнорируются.
     */
    public static TreeNode buildBST(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        TreeNode root = null;
        for (Integer val : arr) {
            if (val != null) {
                root = insertIntoBST(root, val);
            }
        }

        return root;
    }

    /**
     * Вспомогательный метод для рекурсивной вставки значения в BST.
     */
    private static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    /**
     * Строит N-арное дерево из представления массива в порядке уровней.
     * Null-значения в массиве разделяют группы детей.
     */
    public static Node buildNaryTree(Integer[] data) {
        if (data == null || data.length == 0 || data[0] == null) {
            return null; // Пустое дерево
        }

        // Создаем корень
        Node root = new Node(data[0]);
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int i = 1; // Индекс для обхода массива
        while (!queue.isEmpty() && i < data.length) {
            Node parent = queue.poll(); // Берем текущего родителя из очереди

            // Если parent == null, пропускаем
            if (parent == null) {
                continue;
            }

            List<Node> children = new ArrayList<>();
            // Обрабатываем всех детей текущего узла
            while (i < data.length && data[i] != null) {
                Node child = new Node(data[i]); // Создаем дочерний узел
                children.add(child);           // Добавляем в список детей
                queue.add(child);              // Добавляем в очередь для дальнейшей обработки
                i++;
            }

            parent.children = children; // Присваиваем детей текущему родителю
            i++; // Пропускаем null, который разделяет группы детей
        }

        return root;
    }



}
