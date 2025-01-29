package model

type DSU struct {
	Parent []int
	Rank   []int
}

func NewDSU(start int, n int) *DSU {
	parent := make([]int, n)
	rank := make([]int, n)

	for i := start; i < n; i++ {
		parent[i] = i
		rank[i] = 1
	}

	return &DSU{Parent: parent, Rank: rank}
}

func (d *DSU) Find(x int) int {
	if d.Parent[x] != x {
		d.Parent[x] = d.Find(d.Parent[x])
	}

	return d.Parent[x]
}

func (d *DSU) Union(x int, y int) {
	rootX := d.Find(x)
	rootY := d.Find(y)

	if rootX != rootY {
		if d.Rank[rootX] > d.Rank[rootY] {
			d.Parent[rootY] = rootX
		} else if d.Rank[rootY] < d.Rank[rootY] {
			d.Parent[rootX] = rootY
		} else {
			d.Parent[rootY] = rootX
			d.Rank[rootX]++
		}
	}
}
