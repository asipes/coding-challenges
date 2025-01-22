package easy

import "strings"

// https://leetcode.com/problems/number-of-segments-in-a-string 434. Number of Segments in a String

func countSegments(s string) int {
	return len(strings.Fields(s))
}

func CountSegments(s string) int {
	return countSegments(s)
}
