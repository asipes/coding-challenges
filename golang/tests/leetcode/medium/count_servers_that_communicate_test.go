package medium_test

import (
	"golang/solution/leetcode/medium"
	"testing"
)

func TestCountServers(t *testing.T) {
	tests := []struct {
		name string
		grid [][]int
		want int
	}{
		{
			name: "Case 1",
			grid: [][]int{{1, 0}, {0, 1}},
			want: 0,
		},
		{
			name: "Case 2",
			grid: [][]int{{0, 1}, {1, 1}},
			want: 3,
		},
		{
			name: "Case 3",
			grid: [][]int{
				{1, 1, 0, 0},
				{0, 0, 1, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 1},
			},
			want: 4,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.CountServers(tt.grid); got != tt.want {
				t.Errorf("CountServers() = %v, want %v", got, tt.want)
			}
		})
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.CountServersV2(tt.grid); got != tt.want {
				t.Errorf("CountServers() = %v, want %v", got, tt.want)
			}
		})
	}
}
