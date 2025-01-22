package medium

// https://leetcode.com/problems/map-of-highest-peak 1765. Map of Highest Peak

func highestPeak(isWater [][]int) [][]int {
	rows, cols := len(isWater), len(isWater[0])
	height := make([][]int, rows)
	for i := range height {
		height[i] = make([]int, cols)
		for j := range height[i] {
			height[i][j] = -1
		}
	}

	directions := [][2]int{{-1, 0}, {1, 0}, {0, -1}, {0, 1}}
	queue := make([][2]int, 0)
	for i := 0; i < rows; i++ {
		for j := 0; j < cols; j++ {
			if isWater[i][j] == 1 {
				height[i][j] = 0
				queue = append(queue, [2]int{i, j})
			}
		}
	}

	for len(queue) > 0 {
		current := queue[0]
		queue = queue[1:]
		x, y := current[0], current[1]
		for _, d := range directions {
			nx, ny := x+d[0], y+d[1]
			if nx >= 0 && ny >= 0 && nx < rows && ny < cols && height[nx][ny] == -1 {
				height[nx][ny] = height[x][y] + 1
				queue = append(queue, [2]int{nx, ny})
			}
		}
	}

	return height
}

func HighestPeak(isWater [][]int) [][]int {
	return highestPeak(isWater)
}
