import org.example.my_task.m04_anagram.Anagram;
import org.junit.Assert;
import org.junit.Test;

public class AnagramTest {
    @Test
    public void tesIsAnagram() {
        Anagram anagram = new Anagram();
        int actualRes = anagram.isAnagram("dasbb", "basdb");
        Assert.assertEquals(1, actualRes);
    }
}
