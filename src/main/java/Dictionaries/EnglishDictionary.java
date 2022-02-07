package Dictionaries;

import Interfaces.IDictionary;
import java.util.List;

import static Utils.TextReader.readFileIntoList;

public class EnglishDictionary implements IDictionary {
    /**
     * Found a txt file with english words on https://github.com/dwyl/english-words/blob/master/words_dictionary.json
     * The plan is to convert it to a list of strings here
     */

    private List<String> words;
    private String DICTIONARY_FILE_PATH = "src/main/resources/englishWords.txt";

    public EnglishDictionary() {
        this.words = readFileIntoList(DICTIONARY_FILE_PATH);
    }


    /**
     * https://stackoverflow.com/questions/15824733/option-to-ignore-case-with-contains-method
     * */
    @Override
    public Boolean isEnglishWord(String word) {
        return words.stream().anyMatch(word::equalsIgnoreCase);
    }
}
