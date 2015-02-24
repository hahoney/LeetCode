package MinStack

import "testing"

func TestMinStack(t *testing.T) {
	var res int

	minStack := new(MinStack)
	minStack.Init()
	minStack.Push(0)
	minStack.Push(1)
	minStack.Push(0)

	res, _ = minStack.Top()
	if res != 0 {
		t.Fatalf("Should get %v but get %v", 0, res)
	}
	minStack.Pop()
	res, _ = minStack.GetMin()
	if res != 0 {
		t.Fatalf("Should get %v but get %v", 0, res)
	}
	res, _ = minStack.Top()
	if res != 1 {
		t.Fatalf("Should get %v but get %v", 1, res)
	}

}
