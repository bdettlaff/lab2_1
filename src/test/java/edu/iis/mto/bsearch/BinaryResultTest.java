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

    @Test
    public void shouldReturnTrueIfOneElementIsFirstInSequence() {
        int[] sequence = {3, 9};
        int key = 3;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(1, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfOneElementIsLastInSequence() {
        int[] sequence = {4, 3, 6, 7, 9};
        int key = 9;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(sequence.length, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfOneElementIsMiddleInSequence() {
        int[] sequence = {4, 3, 6, 5, 8, 10, 10};
        int key = 5;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals((sequence.length + 1) / 2, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfOneElementDoesNotExistInSequence() {
        int[] sequence = {4, 3, 6, 7, 8};
        int key = 9;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(-1, searchResult.getPosition());
    }

    @Test
    public void shouldReturnTrueIfOneElementIsNotInEmptySequence(){
        int[] sequence = new int[0];
        int key = 3;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertEquals(-1, searchResult.getPosition());
    }
}
