import pytest
from solutions.leetcode.easy.repeated_substring_pattern import RepeatedSubstringPattern

@pytest.mark.parametrize("s, expected", [
    ("abab", True),
    ("aba", False),
    ("abcabcabcabc", True),
])
def test_repeated_substring_pattern(s, expected):
    solver = RepeatedSubstringPattern()
    assert solver.repeatedSubstringPattern(s) == expected