/*
 * Diego Soto (22737)
 * Algoritmos y Estructuras de Datos Sección 40
 * Hoja de Trabajo 4
 * 20-02-2023
 */
import java.util.ArrayDeque;
import java.util.Deque;

 
class InToPos {
 
    
    /** 
     * @param ch
     * @return int
     * metodo para idenficar el orden de los operadores basicos
     */
    static int Valor(char ch)
    {
        switch (ch) {
        case '+':
        case '-':
            return 1;
 
        case '*':
        case '/':
            return 2;
 
        case '^':
            return 3;
        }
        return -1;
    }
 
    
    /** 
     * @param exp
     * @return String
     * metodo para convertir una expresion infix to postfix
     */
    static String infixToPostfix(String exp)
    {
        String result = new String("");
 
        Deque<Character> stack = new ArrayDeque<Character>();
 
        for (int i = 0; i < exp.length(); ++i) {
            char c = exp.charAt(i);
 
            if (Character.isLetterOrDigit(c))
                result += c;
 
            else if (c == '(')
                stack.push(c);
 

            else if (c == ')') {
                while (!stack.isEmpty()
                       && stack.peek() != '(') {
                    result += stack.peek();
                    stack.pop();
                }
 
                stack.pop();
            }
            else 
            {
                while (!stack.isEmpty()
                       && Valor(c) <= Valor(stack.peek())) {
 
                    result += stack.peek();
                    stack.pop();
                }
                stack.push(c);
            }
        }
 
        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            result += stack.peek();
            stack.pop();
        }
       
        return result;
    }
}