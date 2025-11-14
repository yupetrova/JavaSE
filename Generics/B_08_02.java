import java.util.Stack;

public class B_08_02 {
    
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "([{}])";
        String test3 = "([)]";
        String test4 = "{[}]";
        String test5 = "((()))";
        String test6 = "((()";
        
        System.out.println(test1 + " -> " + isValid(test1));
        System.out.println(test2 + " -> " + isValid(test2));
        System.out.println(test3 + " -> " + isValid(test3));
        System.out.println(test4 + " -> " + isValid(test4));
        System.out.println(test5 + " -> " + isValid(test5));
        System.out.println(test6 + " -> " + isValid(test6));
    }
}
