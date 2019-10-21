package com.lican.CartoonAlgorithm;

import java.util.Stack;

/**
 * @Descirption 实现一个最小栈
 * @Author FireMo
 * @Date 2019/9/16 12:50
 */
public class MinStackAug {
    private Stack<Integer> mainStack = new Stack<Integer>();//主栈
    private Stack<Integer> minStack = new Stack<Integer>();//辅助栈

    /**
     * 功能描述:  入栈操作
     * @Param: [element]
     * @Return: void
     * @Author: FireMo
     * @Date: 2019/9/16 12:53
     */
    public void push(int element){
        mainStack.push(element);
        //如果最小栈为空，或者新元素小于或等于辅助栈栈顶，则将新元素压入辅助栈
        if (minStack.empty() || element <= minStack.peek()){
            minStack.push(element);
        }
    }

    /**
     * 功能描述: 出栈操作
     * @Param: []
     * @Return: java.lang.Integer
     * @Author: FireMo
     * @Date: 2019/9/16 12:55
     */
    public Integer pop(){
        //如果出栈元素和辅助栈的栈顶元素相等，则辅助栈出栈
        if(mainStack.peek().equals(minStack.peek())){
            minStack.pop();
        }
        return mainStack.pop();
    }

    /**
     * 功能描述: 获取栈中最小元素
     * @Param: []
     * @Return: int
     * @Author: FireMo
     * @Date: 2019/9/16 12:57
     */
    public int getMin() throws Exception {
        if (mainStack.empty()){
            throw new Exception("stack is empty");
        }
        return minStack.peek();
    }

    public static void main(String[] args) throws Exception {
        MinStackAug stack = new MinStackAug();
        stack.push(4);
        stack.push(9);
        stack.push(7);
        stack.push(3);
        stack.push(8);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack.getMin());
    }

}
