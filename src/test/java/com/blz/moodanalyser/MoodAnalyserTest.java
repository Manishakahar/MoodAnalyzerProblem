package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "sad";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenContainsAnyMoodItShouldReturnAnyMood() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

    @Test
    public void givenMessageWhenNullItShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("null");
        String actualResult;
        try {
            actualResult = moodAnalyser.moodAnalyser();
        } catch (MoodAnalyserException e) {
            String expectedMood = "happy";
            Assert.assertEquals(expectedMood, e.message);
        }
    }

    @Test
    public void givenMessageWhenEmptyShouldReturnHappy() throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        String actualResult;
        try {
            actualResult = moodAnalyser.moodAnalyser();
        } catch (MoodAnalyserException e) {
            MoodAnalyserException.ExceptionType expectedMood=MoodAnalyserException.ExceptionType.EMPTY;
            System.out.println(e);
            Assert.assertEquals(expectedMood,e.exceptionType);
        }
    }
}


