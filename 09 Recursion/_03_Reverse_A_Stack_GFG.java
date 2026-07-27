package _09_Recursion;

import java.util.Stack;

public class _03_Reverse_A_Stack_GFG {
    public static void insert(int x,Stack<Integer> st){
        if(st.empty()){
            st.push(x);
            return;
        }

        int val = st.pop();
        insert(x,st);
        st.push(val);
    }

    public static void reverseStack(Stack<Integer> st) {
        if(st.empty() || st.size() == 1)
            return;

        int x = st.pop();
        reverseStack(st);
        insert(x,st);
    }
}
