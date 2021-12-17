package com.blz.moodanalyser;

public class MoodAnalyserException extends Exception{

    public ExceptionType exceptionType;
    public String message;
    public enum ExceptionType{
        EMPTY,NULL;
    }

public MoodAnalyserException(String message,ExceptionType exceptionType){
        this.message = message;
        this.exceptionType = exceptionType;
}

    public MoodAnalyserException(String message) {
        this.message = message;
    }
}
