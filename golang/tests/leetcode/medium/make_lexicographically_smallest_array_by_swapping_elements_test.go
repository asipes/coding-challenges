package medium_test

import (
	"golang/solution/leetcode/medium"
	"reflect"
	"testing"
)

func TestLexicographicallySmallestArray(t *testing.T) {
	type args struct {
		nums  []int
		limit int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Case 1",
			args: args{
				nums:  []int{1, 5, 3, 9, 8},
				limit: 2,
			},
			want: []int{1, 3, 5, 8, 9},
		},
		{
			name: "Case 2",
			args: args{
				nums:  []int{1, 7, 6, 18, 2, 1},
				limit: 3,
			},
			want: []int{1, 6, 7, 18, 1, 2},
		},
		{
			name: "Case 3",
			args: args{
				nums:  []int{1, 7, 28, 19, 10},
				limit: 3,
			},
			want: []int{1, 7, 28, 19, 10},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.LexicographicallySmallestArray(tt.args.nums, tt.args.limit); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("LexicographicallySmallestArray() = %v, want %v", got, tt.want)
			}
		})
	}
}
