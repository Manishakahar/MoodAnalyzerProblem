package com.blz.moodanalyser;

public class MoodAnalyser {
    String message;

    public String moodAnalyser(String mood) {
        if (mood.toLowerCase().contains("sad")) {
            return "sad";
        } else {
            return "happy";
        }
    }

}
