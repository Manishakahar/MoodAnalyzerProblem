package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenContainsSadItShouldReturnSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "sad";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenContainsHappyItShouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenContainsAnyMoodItShouldReturnAnyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String actualResult = moodAnalyser.moodAnalyser();
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

}
