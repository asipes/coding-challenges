import pytest
from solutions.leetcode.medium.kth_lexicographical_happy_string import KthLexicographicalHappyString

@pytest.mark.parametrize("n, k, expected", [
    (3, 1, "aba"),
    (3, 5, "bab"),
    (3, 12, "cbc"),
    (3, 15, ""),
    (1, 3, "c"),
])
def test_kth_lexicographical_happy_string(n, k, expected):
    assert KthLexicographicalHappyString().get_happy_string(n, k) == expected
