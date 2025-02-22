from typing import Optional
from solutions.models.tree_node import TreeNode

# https://leetcode.com/problems/recover-a-tree-from-preorder-traversal 1028. Recover a Tree From Preorder Traversal

class RecoverATreeFromPreorderTraversal:
    def recoverFromPreorder(self, traversal: str) -> Optional[TreeNode]:
        stack = []
        i = 0

        while i < len(traversal):
            depth = 0
            while i < len(traversal) and traversal[i] == '-':
                depth += 1
                i += 1

            num_start = i
            while i < len(traversal) and traversal[i].isdigit():
                i += 1
            value = int(traversal[num_start:i])

            node = TreeNode(value)

            if depth == len(stack):
                if stack:
                    stack[-1].left = node  # Левый ребёнок
            else:
                while len(stack) > depth:
                    stack.pop()  # Убираем лишние узлы
                if stack:
                    stack[-1].right = node  # Теперь это правый ребёнок

            stack.append(node)

        return stack[0]

