package easy_test

import (
	"golang/solution/leetcode/easy"
	"testing"
)

func TestCheckTwoChessboards(t *testing.T) {
	type args struct {
		coordinate1 string
		coordinate2 string
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{
			name: "Case 1",
			args: args{
				coordinate1: "a1",
				coordinate2: "c3",
			},
			want: true,
		},
		{
			name: "Case 2",
			args: args{
				coordinate1: "a1",
				coordinate2: "h3",
			},
			want: false,
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := easy.CheckTwoChessboards(tt.args.coordinate1, tt.args.coordinate2); got != tt.want {
				t.Errorf("CheckTwoChessboards() = %v, want %v", got, tt.want)
			}
		})
	}
}
