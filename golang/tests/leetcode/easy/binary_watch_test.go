package easy_test

import (
	"golang/solution/leetcode/easy"
	"reflect"
	"testing"
)

func TestReadBinaryWatch(t *testing.T) {
	tests := []struct {
		turnedOn int
		expected []string
	}{
		{
			turnedOn: 1,
			expected: []string{
				"0:01", "0:02", "0:04", "0:08", "0:16", "0:32",
				"1:00", "2:00", "4:00", "8:00",
			},
		},
	}

	for _, tt := range tests {
		result := easy.ReadBinaryWatchWrapper(tt.turnedOn)
		if !reflect.DeepEqual(result, tt.expected) {
			t.Errorf("ReadBinaryWatch(%d) = %v; expected %v", tt.turnedOn, result, tt.expected)
		}
	}
}
