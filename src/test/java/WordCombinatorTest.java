import Utils.WordCombinator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static Utils.WordCombinator.*;

public class WordCombinatorTest {

    @Test
    /**
     * p = (n! / (n-(n-1))) + n! Permutation allowing subsets formula
     * n = 3 p = 12
     *
     * */
    public void FindWordCombinationsFor3LetterWordsReturnsLessOrEqualThan12() {
        List<String> combinations = FindWordCombinations("war");
        Assert.assertTrue("The actual size was" + combinations.size(),combinations.size() <= 12);
    }

    @Test
    public void anagramWordContainsTheOriginalWord(){
        String original = "peace";
        List<String> results = new ArrayList<>();
        anagramWord(original,0,4,5,results);
        Assert.assertTrue("Actual Results List " + results.toString() ,results.contains(original));
    }

    @Test
    public void swapCharsAtReturnsAStringWithTheCharsSwapped() {
        String original = "war";
        String raw = swapCharsAt(original,0,2);
        Assert.assertEquals(raw,"raw");
    }

    }