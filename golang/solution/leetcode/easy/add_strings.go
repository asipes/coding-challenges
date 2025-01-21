package easy

// https://leetcode.com/problems/add-strings 415. Add Strings

func addStrings(num1 string, num2 string) string {
	res := make([]byte, 0)
	n, m := len(num1)-1, len(num2)-1
	acc := 0

	for n >= 0 || m >= 0 || acc > 0 {
		var n1, n2 int

		if n >= 0 {
			n1 = int(num1[n] - '0')
			n--
		}

		if m >= 0 {
			n2 = int(num2[m] - '0')
			m--
		}

		sum := n1 + n2 + acc
		acc = sum / 10
		res = append(res, byte(sum%10)+'0')
	}

	for k, n := 0, len(res); k < n/2; k++ {
		res[k], res[n-1-k] = res[n-1-k], res[k]
	}

	return string(res)
}

func AddStrings(num1 string, num2 string) string {
	return addStrings(num1, num2)
}
