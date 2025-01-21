package easy_test

import (
	"golang/solution/leetcode/easy"
	"testing"
)

func TestLongestPalindrome(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want int
	}{
		{
			name: "Case 1",
			s:    "abccccdd",
			want: 7,
		},
		{
			name: "Case 2",
			s:    "a",
			want: 1,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := easy.LongestPalindrome(tt.s)
			if got != tt.want {
				t.Errorf("LongestPalindrome(%s) = %d, want %d", tt.s, got, tt.want)
			}
		})
	}
}
