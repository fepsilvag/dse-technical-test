package com.dse.util;

import com.dse.exception.EmptyInputException;
import com.dse.exception.InvalidCharacterException;
import com.dse.exception.NullAnagramException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AnagramUtilTest {

    @Test
    @DisplayName("Throw NullAnagramException when input is null")
    public void throwNullAnagramException() {
        // Then
        assertThrows(NullAnagramException.class, () -> AnagramUtil.generateAnagrams(null));
    }

    @Test
    @DisplayName("Throw EmptyInputException when input is empty")
    public void throwEmptyInputException() {
        // given
        List<String> listOfErrors = List.of("", " ");

        // then
        listOfErrors.forEach(input -> assertThrows(EmptyInputException.class, () ->
                AnagramUtil.generateAnagrams(input)));
    }

    @Test
    @DisplayName("Throw InvalidCharacterException when input is with invalid characters")
    public void shouldThrowInvalidCharacterException() {
        // given
        List<String> listOfErrors = List.of("a1", "a b", "a *", " a", "a ");

        // then
        listOfErrors.forEach(input -> assertThrows(InvalidCharacterException.class, () ->
                AnagramUtil.generateAnagrams(input)));
    }

    @Test
    @DisplayName("Throw InvalidCharacterException when input is with invalid characters")
    public void shouldReturnAllAnagrams() {
        // given
        String withOneCharacter = "a";
        String withTwoCharacters = "ab, ba";
        String withThreeCharacters = "abc, acb, bac, bca, cab, cba";

        // then
        assertEquals(AnagramUtil.generateAnagrams("a"), withOneCharacter);
        assertEquals(AnagramUtil.generateAnagrams("ab"), withTwoCharacters);
        assertEquals(AnagramUtil.generateAnagrams("abc"), withThreeCharacters);
    }

}
