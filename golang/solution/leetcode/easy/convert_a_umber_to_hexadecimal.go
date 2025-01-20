package easy

// https://leetcode.com/problems/convert-a-number-to-hexadecimal 405. Convert a Number to Hexadecimal

func toHex(num int) string {
	symbols := [16]rune{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'}
	var hex []rune
	num = int(uint32(num))

	for num > 15 {
		inx := num % 16
		hex = append(hex, symbols[inx])
		num /= 16
	}

	hex = append(hex, symbols[num])

	res := make([]rune, len(hex))
	for i, v := range hex {
		res[len(hex)-1-i] = v
	}
	return string(res)
}

func ToHex(num int) string {
	return toHex(num)
}
