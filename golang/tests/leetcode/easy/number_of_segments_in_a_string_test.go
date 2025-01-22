package easy

import (
	"golang/solution/leetcode/easy"
	"testing"
)

func TestCountSegments(t *testing.T) {
	tests := []struct {
		name string
		s    string
		want int
	}{
		{
			name: "Case 1",
			s:    "Hello, my name is John",
			want: 5,
		},
		{
			name: "Case 1",
			s:    "Hello",
			want: 1,
		},
	}

	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			got := easy.CountSegments(tt.s)
			if got != tt.want {
				t.Errorf("CountSegments(%s) = %d; want %d", tt.s, got, tt.want)
			}
		})

	}

}
