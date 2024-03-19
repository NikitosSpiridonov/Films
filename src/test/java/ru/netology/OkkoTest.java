package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OkkoTest {
    @Test
    public void testFindAll() {
        Okko okko = new Okko();
        String movie1 = "Властелин колец";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        okko.add(movie1);
        okko.add(movie2);
        okko.add(movie3);
        String[] actual = okko.findAll();
        String[] expected = {movie1, movie2, movie3};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testFindLast() {
        Okko okko = new Okko();
        String movie1 = "Властелин колец";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        okko.add(movie1);
        okko.add(movie2);
        okko.add(movie3);
        String[] actual = okko.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastUnderLimitChooseLimit() {
        Okko okko = new Okko(12);
        String movie1 = "Властелин колец";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        okko.add(movie1);
        okko.add(movie2);
        okko.add(movie3);
        String[] actual = okko.findLast();
        String[] expected = {movie3, movie2, movie1};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverLimit() {
        Okko okko = new Okko();
        String movie1 = "Властелин колец";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";
        String movie7 = "Властелин колец 7";
        okko.add(movie1);
        okko.add(movie2);
        okko.add(movie3);
        okko.add(movie4);
        okko.add(movie5);
        okko.add(movie6);
        okko.add(movie7);
        String[] actual = okko.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLastOverLimitChooseLimit() {
        Okko okko = new Okko(6);
        String movie1 = "Властелин колец";
        String movie2 = "Властелин колец 2";
        String movie3 = "Властелин колец 3";
        String movie4 = "Властелин колец 4";
        String movie5 = "Властелин колец 5";
        String movie6 = "Властелин колец 6";
        String movie7 = "Властелин колец 7";
        okko.add(movie1);
        okko.add(movie2);
        okko.add(movie3);
        okko.add(movie4);
        okko.add(movie5);
        okko.add(movie6);
        okko.add(movie7);
        String[] actual = okko.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2};
        Assertions.assertArrayEquals(expected, actual);
    }
}