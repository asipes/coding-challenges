package easy

// https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color
// 3274. Check if Two Chessboard Squares Have the Same Color

func checkTwoChessboards(coordinate1 string, coordinate2 string) bool {
	h1 := int(coordinate1[0])
	h2 := int(coordinate2[0])

	hr := abs(h1 - h2)

	v1 := int(coordinate1[1])
	v2 := int(coordinate2[1])

	vr := abs(v1 - v2)

	return hr%2 == 0 && vr%2 == 0 || hr%2 != 0 && vr%2 != 0
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}

func CheckTwoChessboards(coordinate1 string, coordinate2 string) bool {
	return checkTwoChessboards(coordinate1, coordinate2)
}
