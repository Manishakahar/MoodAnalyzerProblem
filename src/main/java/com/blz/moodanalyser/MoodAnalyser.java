package com.blz.moodanalyser;

public class MoodAnalyser {
    String message;

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String moodAnalyser() throws MoodAnalyserException {
        try {
            if (this.message.toLowerCase().contains("sad")) {
                return "sad";
            } else
            return "happy";
        }
        catch (NullPointerException e) {
            return "happy";
        }
    }
}
