import java.util.Stack;

public class ReverseStack {

    // function to insert at bottom
    public static void pushAtBottom(Stack<Integer> s, int data) {

        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }


    // function to reverse stack
    public static void reverse(Stack<Integer> s) {

        if(s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }


    public static void main(String args[]) {

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack: " + s);

        reverse(s);

        System.out.println("Reversed Stack: " + s);

    }
}
