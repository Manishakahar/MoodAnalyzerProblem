package com.blz.moodanalyser;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageWhenSadMoodItShouldReturnSadMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.moodAnalyser("I am in sad mood");
        String expectedMood = "sad";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenHappyMoodItShouldReturnHappyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.moodAnalyser("I am in happy mood");
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }
    @Test
    public void givenMessageWhenAnyMoodItShouldReturnAnyMood(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String actualResult = moodAnalyser.moodAnalyser("I am in any mood");
        String expectedMood = "happy";
        Assert.assertEquals(actualResult, expectedMood);
    }

}
