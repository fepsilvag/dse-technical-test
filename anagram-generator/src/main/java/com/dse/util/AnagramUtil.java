package com.dse.util;

import com.dse.exception.EmptyInputException;
import com.dse.exception.InvalidCharacterException;
import com.dse.exception.NullAnagramException;

import java.util.ArrayList;
import java.util.List;

/**
 * The <b>AnagramUtil</b> class provides utility methods for generating anagrams from a given input string.
 */
public class AnagramUtil {

    /**
     * Generates all possible anagrams from a given input string
     *
     * @param input the input string to generate anagrams from
     * @return a string containing all possible anagrams separated by a comma
     * @throws NullAnagramException if the input is null
     * @throws EmptyInputException if the input is empty
     * @throws InvalidCharacterException if the input contains invalid characters like numbers or special characters
     */
    public static String generateAnagrams(String input) {
        validateInputForAnagrams(input);

        if (input.length() == 1) {
            return input;
        }

        return String.join(", ", generatePermutations(input));
    }

    /**
     * Validates the input string to generate anagrams, throwing custom errors for each validation
     *
     * @param input the input string to validate
     * @throws NullAnagramException if the input is null
     * @throws EmptyInputException if the input is empty
     * @throws InvalidCharacterException if the input contains invalid characters like numbers or special characters
     */
    private static void validateInputForAnagrams(String input) {
        if (input == null) {
            throw new NullAnagramException();
        } else if (input.isBlank()) {
            throw new EmptyInputException();
        } else if (input.matches(".*[^a-zA-Z].*")) {
            throw new InvalidCharacterException();
        }
    }

    /**
     * This method uses recursion to generate all possible permutations (anagrams) of the given input string.
     * For each character in the input string, it recursively generates permutations of the remaining characters.
     * When the input string has only two characters, it returns a list containing the original string and its reverse.
     * These permutations are then concatenated with the preceding characters, building up the full list of anagrams.
     *
     * @param input the input string to generate permutations from
     * @return a list of all possible permutations of the input string
     */
    private static List<String> generatePermutations(String input) {
        if (input.length() == 2) {
            return List.of(input, input.charAt(1) + "" + input.charAt(0));
        }

        List<String> anagrams = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char character = input.charAt(i);
            String rest = input.substring(0, i) + input.substring(i + 1);

            anagrams.addAll(generatePermutations(rest).stream()
                    .map(anagram -> character + anagram)
                    .toList());
        }

        return anagrams;
    }

}
