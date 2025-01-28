package medium_test

import (
	"golang/solution/leetcode/medium"
	"testing"
)

func TestFindMaxFish(t *testing.T) {
	type args struct {
		grid [][]int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{
			name: "Case 1",
			args: args{
				grid: [][]int{
					{0, 2, 1, 0},
					{4, 0, 0, 3},
					{1, 0, 0, 4},
					{0, 3, 2, 0},
				},
			},
			want: 7,
		},
		{
			name: "Case 2",
			args: args{
				grid: [][]int{
					{1, 0, 0, 0},
					{0, 0, 0, 0},
					{0, 0, 0, 0},
					{0, 0, 0, 1},
				},
			},
			want: 1,
		},
		{
			name: "Case 3",
			args: args{
				grid: [][]int{
					{4, 0},
				},
			},
			want: 4,
		},
		{
			name: "Case 4",
			args: args{
				grid: [][]int{
					{0, 4},
				},
			},
			want: 4,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.FindMaxFish(tt.args.grid); got != tt.want {
				t.Errorf("FindMaxFish() = %v, want %v", got, tt.want)
			}
		})
	}
}
