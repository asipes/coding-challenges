import pytest
from solutions.leetcode.easy.assign_cookies import AssignCookies

@pytest.mark.parametrize("g, s, expected", [
    ([1, 2, 3], [1, 1], 1),
    ([1, 2], [1, 2, 3], 2),
    ([1, 2, 3], [3], 1),
    ([1, 2, 3], [], 0),
    ([1, 1, 1], [1, 2, 3], 3),
    ([10, 20, 30], [5, 10, 15], 1),
])
def test_find_content_children(g, s, expected):
    solver = AssignCookies()
    assert solver.findContentChildren(g, s) == expected
