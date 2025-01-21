package medium_test

import (
	"golang/solution/leetcode/medium"
	"testing"
)

func TestGridGame(t *testing.T) {
	tests := []struct {
		name string
		grid [][]int
		want int64
	}{
		{
			name: "Case 1",
			grid: [][]int{{2, 5, 4}, {1, 5, 1}},
			want: 4,
		},
		{
			name: "Case 2",
			grid: [][]int{{3, 3, 1}, {8, 5, 2}},
			want: 4,
		},
		{
			name: "Case 3",
			grid: [][]int{{1, 3, 1, 15}, {1, 3, 3, 1}},
			want: 7,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := medium.GridGame(tt.grid)
			if got != tt.want {
				t.Errorf("GridGame(%v) = %d; want %d", tt.grid, got, tt.want)
			}
		})
	}
}
