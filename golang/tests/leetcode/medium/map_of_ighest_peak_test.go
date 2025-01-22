package medium_test

import (
	"golang/solution/leetcode/medium"
	"reflect"
	"testing"
)

func TestHighestPeak(t *testing.T) {
	tests := []struct {
		name    string
		isWater [][]int
		want    [][]int
	}{
		{
			name: "Case 1",
			isWater: [][]int{
				{0, 0, 1},
				{1, 0, 0},
				{0, 0, 0},
			},
			want: [][]int{
				{1, 1, 0},
				{0, 1, 1},
				{1, 2, 2},
			},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.HighestPeak(tt.isWater); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("HighestPeak() = %v, want %v", got, tt.want)
			}
		})
	}
}
