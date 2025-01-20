package easy_test

import (
	"golang/solution/leetcode/easy"
	"testing"
)

func TestToHex(t *testing.T) {
	tests := []struct {
		name string
		num  int
		want string
	}{
		{
			name: "Case 1",
			num:  26,
			want: "1a",
		},
		{
			name: "Case 1",
			num:  -1,
			want: "ffffffff",
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := easy.ToHex(tt.num)
			if got != tt.want {
				t.Errorf("ToHex(%d) = %s, want %s", tt.num, got, tt.want)
			}
		})
	}
}
