package easy

import (
	"golang/solution/leetcode/easy"
	"reflect"
	"testing"
)

func TestAddStrings(t *testing.T) {
	tests := []struct {
		name string
		num1 string
		num2 string
		want string
	}{
		{
			name: "Case 1",
			num1: "11",
			num2: "123",
			want: "134",
		},
		{
			name: "Case 2",
			num1: "456",
			num2: "77",
			want: "533",
		},
		{
			name: "Case 3",
			num1: "0",
			num2: "0",
			want: "0",
		},
		{
			name: "Case 4",
			num1: "3876620623801494171",
			num2: "6529364523802684779",
			want: "10405985147604178950",
		},
	}

	for _, tt := range tests {
		got := easy.AddStrings(tt.num1, tt.num2)
		if !reflect.DeepEqual(got, tt.want) {
			t.Errorf("AddStrings(%s, %s) = %s; want %s", tt.num1, tt.num2, got, tt.want)
		}
	}
}
