package medium_test

import (
	"golang/solution/leetcode/medium"
	"reflect"
	"testing"
)

func TestFindRedundantConnection(t *testing.T) {
	type args struct {
		edges [][]int
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Case 1",
			args: args{
				edges: [][]int{{1, 2}, {1, 3}, {2, 3}},
			},
			want: []int{2, 3},
		},
		{
			name: "Case 1",
			args: args{
				edges: [][]int{{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}},
			},
			want: []int{1, 4},
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := medium.FindRedundantConnection(tt.args.edges); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("FindRedundantConnection() = %v, want %v", got, tt.want)
			}
		})
	}
}
