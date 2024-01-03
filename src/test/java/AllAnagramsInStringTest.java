import org.example.leetcode_task.l02_hash_table.l021_find_all_anagrams.AllAnagramsInString;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllAnagramsInStringTest {
    @Test
    public void testFindAllAnagramsWithMiddleCase() {
        AllAnagramsInString anagram = new AllAnagramsInString();
        List<Integer> actual = anagram.findAllAnagrams("cbaebabacd", "abc");
        List<Integer> expected = Arrays.asList(0, 6);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindAllAnagramsWithMiddle2Case() {
        AllAnagramsInString anagram = new AllAnagramsInString();
        List<Integer> actual = anagram.findAllAnagrams("abab", "ab");
        List<Integer> expected = Arrays.asList(0, 1, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindAllAnagramsWithEmptyOriginalCase() {
        AllAnagramsInString anagram = new AllAnagramsInString();
        List<Integer> actualRes = anagram.findAllAnagrams("", "abc");
        Assert.assertEquals(new ArrayList<>(), actualRes);
    }
}
