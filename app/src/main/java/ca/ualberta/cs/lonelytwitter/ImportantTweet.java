/*ImportantTweet
 *
 * Version 1.0
 *
 * January 30, 2018
 * Copyright (c) 2018 Team X CMPUT 301. University of Alberta - All Rights Reserved. You may use distribute or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 *
 * You can find a copy of licence in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a ImportantTweet
 *
 * @author Unknown
 * @version 1.5
 * @see Tweet
 */
public class ImportantTweet extends Tweet {
    /**
     * Constructs importantTweet
     *
     * @param message importantTweet message
     */
    ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs importantTweet
     *
     * @param message importantTweet message
     * @param date importantTweet date
     */
    ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Returns boolean to tell it is important.
     * @return true
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
