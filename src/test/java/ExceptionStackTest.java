import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionStackTest  {

    @Test(expected = ExceptionStack.class)
    public void checkSize() throws ExceptionStack {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        FindElemStack st = new FindElemStack();
        st.recursiveFindSecondElem(stack);

    }
}
