import Dictionaries.EnglishDictionary;
import org.junit.Test;

public class EnglishDictionaryTest {
    private EnglishDictionary dictionary;

    @Test
    public void isEnglishWordReturnsBoolean() {
        dictionary = new EnglishDictionary();
        assert dictionary.isEnglishWord("word") == true;
        assert dictionary.isEnglishWord("jik") == false;
    }
}
