import itertools

class KthLexicographicalHappyString:
    def get_happy_string(self, n: int, k: int) -> str:
        def is_happy(s):
            return all(s[i] != s[i + 1] for i in range(len(s) - 1))

        all_strings = sorted(("".join(s) for s in itertools.product('abc', repeat=n) if is_happy(s)))
        return all_strings[k - 1] if k <= len(all_strings) else ""
