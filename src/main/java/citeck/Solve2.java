package citeck;

import java.util.Stack;

public class Solve2 {
    /**
     * 2.Написать алгоритм проверки корректности регулярного выражения, которое включает [,],(,)
     * т.е., например ([][[]()]) - правильно, ([][]()]) – неправильно
     */
    public void checkHooks(char[] arrChar) {
        System.out.println("Задача-2");
        System.out.println("имеется выражение :");
        Stack<Character> stack = new Stack<>();
        for (int k = 0; k < arrChar.length; k++) {
            System.out.print(arrChar[k] + " ");
        }
        System.out.println();
        for (int k = 0; k < arrChar.length; k++) {
            if (arrChar[k] == '(' || arrChar[k] == '[') {
                stack.push(arrChar[k]);
                if (stack.empty()) {
                    System.out.println("выражение не верно");
                    break;
                }
            } else {
                if ((stack.peek() == '(' && arrChar[k] == ')') ||
                        (stack.peek() == '[' && arrChar[k] == ']')) {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            System.out.println("выражение верно");
        } else {
            System.out.println("выражение не верно");
        }
        System.out.println();
    }
}
