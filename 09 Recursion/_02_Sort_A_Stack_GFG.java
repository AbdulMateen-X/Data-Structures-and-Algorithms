package _09_Recursion;
import java.util.Stack;

public class _02_Sort_A_Stack_GFG {
    public void insert(int x,Stack<Integer> st){
        if(st.empty() || x >= st.peek()){
            st.push(x);
            return;
        }

        int val = st.pop();
        insert(x,st);
        st.push(val);
    }

    public void sortStack(Stack<Integer> st) {
        if(st.empty())
            return;

        int x = st.pop();
        sortStack(st);
        insert(x,st);
    }
}
