/* NormalTweet
 *
 * Version 3.0.1
 *
 * January 30, 2018
 * Copyright (c) 2018 Team X CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of licence in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

/**
 * Represents a NormalTweet
 *
 * @author Unknown
 * @version 1.5
 * @see Tweet
 */
public class NormalTweet extends Tweet {
    /**Constructs normalTweet
     *
     * @param message normalTweet message
     */
    NormalTweet(String message){
        super(message);
    }

    /**
     * Constructs normalTweet.
     * @param message normalTweet message
     * @param date normalTweet date
     */
    NormalTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns boolean to tell it is not important.
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
