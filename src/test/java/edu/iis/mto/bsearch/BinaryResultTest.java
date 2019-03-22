package edu.iis.mto.bsearch;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class BinaryResultTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldReturnTrueIfOneElementIsInOneElementSequence() {
        int[] sequence = {3};
        int key = 3;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementDoesNoTExistInOneElementSequence() {
        int[] sequence = {10};
        int key = 14;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementIsFirstInSequence() {
        int[] sequence = {3, 9};
        int key = 3;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementIsLastInSequence() {
        int[] sequence = {3, 4, 6, 7, 9};
        int key = 9;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(sequence.length, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementIsMiddleInSequence() {
        int[] sequence = {3, 4, 5, 6, 8, 10, 10};
        int key = 6;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat((sequence.length + 1) / 2, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementDoesNotExistInSequence() {
        int[] sequence = {3, 4, 6, 7, 8};
        int key = 9;
        SearchResult searchResult = BinarySearch.search(key, sequence);
        assertThat(-1, is(equalTo(searchResult.getPosition())));
    }

    @Test
    public void shouldReturnTrueIfOneElementIsNotInEmptySequence(){
        int[] sequence = {};
        int key = 3;
        thrown.expect(IllegalArgumentException.class);
        BinarySearch.search(key,sequence);
    }

    @Test
    public void shouldReturnTrueIfSequenceIsSorted(){

    }


}
