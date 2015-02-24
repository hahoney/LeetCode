package solution

import "testing"
import "fmt"

func TestSolution(t *testing.T) {
	sol := new(Solution)

	fmt.Print("Test NULL: ")
	minVal, ok := sol.FindMin([]int{})
	if ok == nil {
		t.Fatalf("Empty array must return null")
	}
	fmt.Println("OK")

	fmt.Print("Test Duplicates: ")
	minVal, ok = sol.FindMin([]int{1, 3, 4})
	if minVal != 1 {
		t.Fatalf("Should get %v but get %v", 1, minVal)
	}

	fmt.Print("Test unrotated array: ")
	num1 := []int{1, 2, 3, 4, 5, 6, 7}
	minVal, _ = sol.FindMin(num1)
	if minVal != 1 {
		t.Fatalf("Should get %v but get %v", 1, minVal)
	}
	fmt.Println("OK")

	fmt.Print("Test rotated array: ")
	num2 := []int{4, 5, 6, 7, 1, 2, 3}
	minVal, _ = sol.FindMin(num2)
	if minVal != 1 {
		t.Fatalf("Should get %v but get %v", 1, minVal)
	}
	fmt.Println("OK")
}
