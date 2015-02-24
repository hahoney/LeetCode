package solution

import "errors"

/*
 *  The solution only applies to
 *  arrays without duplicates
 */

type Solution struct{}

func (sol *Solution) FindMin(num []int) (minValue int, err error) {
	if num == nil || len(num) == 0 {
		return 0, errors.New("Empty array")
	}
	begin := 0
	end := len(num) - 1
	for begin < end {
		var mid int
		mid = begin + (end-begin)/2
		if num[mid] < num[end] {
			end = mid
		} else if num[mid] >= num[begin] {
			begin = mid + 1
		} else {
			return num[begin], nil
		}
	}
	return num[end], nil
}
