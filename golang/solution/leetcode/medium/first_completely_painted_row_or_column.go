package medium

// https://leetcode.com/problems/first-completely-painted-row-or-column

func firstCompleteIndex(arr []int, mat [][]int) int {
	n := len(mat)
	m := len(mat[0])

	freq := make([][2]int, n*m)
	for i := 0; i < n; i++ {
		for j := 0; j < m; j++ {
			freq[mat[i][j]-1][0] = i
			freq[mat[i][j]-1][1] = j
		}
	}

	rowPainted := make([]int, n)
	colPainted := make([]int, m)

	index := 0

	for i, num := range arr {
		row := freq[num-1][0]
		col := freq[num-1][1]

		rowPainted[row]++
		colPainted[col]++

		if rowPainted[row] == m || colPainted[col] == n {
			index = i
			break
		}
	}

	return index
}

func FirstCompleteIndex(arr []int, mat [][]int) int {
	return firstCompleteIndex(arr, mat)
}
