package MinStack

import "stack"
import "errors"

type MinStack struct {
	mainStack *stack.Stack
	minStack  *stack.Stack
}

func (st *MinStack) Init() {
	st.mainStack = new(stack.Stack)
	st.minStack = new(stack.Stack)
}

func (st *MinStack) Push(x int) {
	st.mainStack.Push(x)
	if (!st.minStack.IsEmpty() && st.minStack.Peek().(int) >= x) ||
		st.minStack.IsEmpty() {
		st.minStack.Push(x)
	}
}

func (st *MinStack) Pop() (res int, err error) {
	if st.mainStack.IsEmpty() || st.minStack.IsEmpty() {
		return 0, errors.New("Stack is empty")
	}
	res = st.mainStack.Pop().(int)
	if res == st.minStack.Peek().(int) {
		st.minStack.Pop()
	}
	return res, nil
}

func (st *MinStack) Top() (res int, err error) {
	if st.minStack.IsEmpty() {
		return 0, errors.New("Stack is empty")
	}
	return st.mainStack.Peek().(int), nil
}

func (st *MinStack) GetMin() (res int, err error) {
	if st.minStack.IsEmpty() {
		return 0, errors.New("Stack is empty")
	}
	return st.minStack.Peek().(int), nil
}
