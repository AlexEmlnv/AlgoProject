import org.example.leetcode_task.l04_stack.l041_valid_parentheses.ValidParentheses;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void testIsValidWithMiddleCase() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("{[()[{}]]}"));
    }

    @Test
    public void testIsValidWithMiddle2Case() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("{[]}({)}"));
    }
}
