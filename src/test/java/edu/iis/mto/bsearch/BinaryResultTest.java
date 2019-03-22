package edu.iis.mto.bsearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryResultTest {


    @Test
    public void shouldReturnTrueIfOneElementIsInOneElementSequence() {
        int[] sequence = {3};
        int key = 3;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfOneElementDoesNoTExistInOneElementSequence() {
        int[] sequence = {10};
        int key = 14;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(-1, searchResult.getPosition());
    }
}
