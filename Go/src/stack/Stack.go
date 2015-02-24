package stack

/*
   Stack implementation in Golang

variable:

top                  stack top wrapper
top.value            stack top value

methods:

Push(interface{})    push a value into stack
Pop() (interface{})  pop and return a value out of stack. return nil if empty
Peek() (interface{}) return stack top. return nil if empty
IsEmpty() bool       if the stack is empty

*/

type Stack struct {
	top *Element
}

type Element struct {
	value interface{}
	next  *Element
}

func (stack *Stack) Push(x interface{}) {
	stack.top = &Element{x, stack.top}
}

func (stack *Stack) Pop() (value interface{}) {
	if stack.top != nil {
		value, stack.top = stack.top.value, stack.top.next
		return value
	}
	return nil
}

func (stack *Stack) Peek() (value interface{}) {
	if stack.top != nil {
		return stack.top.value
	}
	return nil
}

func (stack *Stack) IsEmpty() bool {
	if stack.top != nil {
		return false
	}
	return true
}
