package easy

import (
	"fmt"
	"math/bits"
)

// https://leetcode.com/problems/binary-watch

func readBinaryWatch(turnedOn int) []string {
	var res []string

	for i := 0; i <= 11; i++ {
		hourBitCount := bits.OnesCount(uint(i))
		for j := 0; j <= 59; j++ {
			minuteBitCount := bits.OnesCount(uint(j))

			if hourBitCount+minuteBitCount == turnedOn {
				s := fmt.Sprintf("%d:%02d", i, j)
				res = append(res, s)
			}
		}
	}

	return res
}

func ReadBinaryWatchWrapper(turnedOn int) []string {
	return readBinaryWatch(turnedOn)
}
