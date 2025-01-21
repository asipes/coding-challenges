package easy

// https://leetcode.com/problems/longest-palindrome 409. Longest Palindrome

func longestPalindrome(s string) int {
	freq := make(map[rune]int)

	for _, r := range s {
		freq[r]++
	}

	res := 0
	hasOdd := false

	for _, value := range freq {
		if value%2 == 0 {
			res += value
		} else {
			res += value - 1
			hasOdd = true
		}
	}

	if hasOdd {
		res++
	}

	return res
}

func LongestPalindrome(s string) int {
	return longestPalindrome(s)
}
