import unittest

from solutions.leetcode.hard.recover_a_tree_from_preorder_traversal import RecoverATreeFromPreorderTraversal


class TestRecoverATree(unittest.TestCase):
    def setUp(self):
        self.solver = RecoverATreeFromPreorderTraversal()

    def test_example_1(self):
        traversal = "1-2--3--4-5--6--7"
        root = self.solver.recoverFromPreorder(traversal)
        self.assertEqual(root.val, 1)
        self.assertEqual(root.left.val, 2)
        self.assertEqual(root.left.left.val, 3)
        self.assertEqual(root.left.right.val, 4)
        self.assertEqual(root.right.val, 5)
        self.assertEqual(root.right.left.val, 6)
        self.assertEqual(root.right.right.val, 7)

    def test_single_node(self):
        traversal = "1"
        root = self.solver.recoverFromPreorder(traversal)
        self.assertEqual(root.val, 1)
        self.assertIsNone(root.left)
        self.assertIsNone(root.right)

    def test_deep_tree(self):
        traversal = "1-2--3---4----5"
        root = self.solver.recoverFromPreorder(traversal)
        self.assertEqual(root.val, 1)
        self.assertEqual(root.left.val, 2)
        self.assertEqual(root.left.left.val, 3)
        self.assertEqual(root.left.left.left.val, 4)
        self.assertEqual(root.left.left.left.left.val, 5)

if __name__ == "__main__":
    unittest.main()
