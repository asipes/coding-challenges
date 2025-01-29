package medium

import "golang/model"
import "sort"

// https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements 2948. Make Lexicographically Smallest Array by Swapping Elements

func lexicographicallySmallestArray(nums []int, limit int) []int {
	n := len(nums)
	dsu := model.NewDSU(n)

	for i := 0; i < n; i++ {
		for j := i + 1; j < n; j++ {
			if abs(nums[i]-nums[j]) <= limit {
				dsu.Union(i, j)
			}
		}
	}

	components := make(map[int][]int)

	for i := 0; i < n; i++ {
		root := dsu.Find(i)
		components[root] = append(components[root], i)
	}

	res := make([]int, n)

	for _, entry := range components {
		values := make([]int, len(entry))

		for i, idx := range entry {
			values[i] = nums[idx]
		}

		sort.Ints(values)
		sort.Ints(entry)

		for i, idx := range entry {
			res[idx] = values[i]
		}
	}

	return res
}

func LexicographicallySmallestArray(nums []int, limit int) []int {
	return lexicographicallySmallestArray(nums, limit)
}

func abs(a int) int {
	if a < 0 {
		return a * -1
	}

	return a
}
