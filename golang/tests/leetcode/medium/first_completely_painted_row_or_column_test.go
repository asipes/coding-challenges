package medium_test

import (
	"golang/solution/leetcode/medium"
	"testing"
)

func TestFirstCompleteIndex(t *testing.T) {
	tests := []struct {
		name string
		arr  []int
		mat  [][]int
		want int
	}{
		{
			name: "Case 1",
			arr:  []int{1, 3, 4, 2},
			mat:  [][]int{{1, 4}, {2, 3}},
			want: 2,
		},
		{
			name: "Case 2",
			arr:  []int{2, 8, 7, 4, 1, 3, 5, 6, 9},
			mat:  [][]int{{3, 2, 5}, {1, 4, 6}, {8, 7, 9}},
			want: 3,
		},
		{
			name: "Case 3",
			arr:  []int{1, 4, 5, 2, 6, 3},
			mat:  [][]int{{4, 3, 5}, {1, 2, 6}},
			want: 1,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := medium.FirstCompleteIndex(tt.arr, tt.mat)
			if got != tt.want {
				t.Errorf("FirstCompleteIndex(%v, %v) = %v; want %v", tt.arr, tt.mat, got, tt.want)
			}
		})
	}
}
