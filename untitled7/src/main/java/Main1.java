import java.util.Stack;

public class Main1 {
    
    public static void main(String[] args) {
        String s = "((()))";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                stack.push('(');
            else {
                if (stack.empty())
                    throw new RuntimeException();
                stack.pop();
            }
        }
        if (stack.empty())
            System.out.println("yes");
        else
            System.out.println("no");
        //queue priority queue stack binary tree map tracing
    }
}
