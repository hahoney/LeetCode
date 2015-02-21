package solution

import "errors"

type Solution struct{}

func (sol Solution) finMin(num []int) (minValue int, err error) {
	if num == nil || len(num) == 0 {
		return 0, errors.New("Empty array")
	}
	begin := 0
	end := len(num) - 1
	for begin < end {
		var mid int
		mid = (begin + end) / 2
		if num[mid] >= num[end] {
			begin = mid + 1
		} else if num[mid] <= num[begin] {
			end = mid
		} else {
			return num[begin], nil
		}
	}
	return num[end], nil
}
