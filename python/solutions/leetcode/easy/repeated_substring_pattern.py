# https://leetcode.com/problems/repeated-substring-pattern 459. Repeated Substring Pattern

class RepeatedSubstringPattern:
    def repeatedSubstringPattern(self, s: str) -> bool:
        n = len(s)
        k = 1

        while k < n:
            substring = s[:k]
            if substring * (n // k) == s:
                return True
            k += 1

        return False