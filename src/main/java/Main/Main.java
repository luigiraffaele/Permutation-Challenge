package Main;

import Dictionaries.EnglishDictionary;
import Interfaces.IDictionary;

import java.util.List;

import static Utils.WordCombinator.FindWordCombinations;

public class Main {
    public static void main(String[] args){
        String word = "Working";
        IDictionary dictionary = new EnglishDictionary();

        List<String> combinations = FindWordCombinations(word);

        System.out.println(String.format("English words in %s:",word));
        System.out.println(System.lineSeparator());
        for(String combination : combinations){
            if(dictionary.isEnglishWord(combination)) System.out.println(combination.toUpperCase());
        }
    }
}
