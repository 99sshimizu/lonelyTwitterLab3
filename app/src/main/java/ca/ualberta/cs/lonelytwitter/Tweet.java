
/*Tweet
 *
 *  Version 1.0
 *
 *  January 30, 2018
 * Copyright (c) 2018 Team X CMPUT 301. University of Alberta - All Rights Reserved.
 * You may use distribute or modify this code under terms and condition of the Code of Student Behaviour at University of Alberta.
 * You can find a copy of licence in this project. Otherwise please contact contact @abc.ca.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 *
 * @author Unknown
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 */
public abstract class Tweet implements Tweetable {

    private String message;
    private Date date;

    /**
     * Constructs a tweet objects
     * @param message tweet message
     */
    Tweet(String message){

        this.message = message;
        date = new Date();
//        message = message;
    }

    /**
     * Constructs a tweet objects.
     *
     * @param message tweet message
     * @param date tweet date
     */

    Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets tweets message.
     * @return message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException the tweet message is over 140 characters
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() < 140){
            this.message = message;
        }
        else{
            throw new TweetTooLongException();
        }
    }

    /**
     * Gets tweets date.
     * @return date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Sets tweet date.
     * @param date tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Returns tweets importance boolean.
     * @return tweet boolean
     */
    public abstract Boolean isImportant();

    /**
     * Converts date to string.
     * @return dateInString
     */
    public String toString() {
        return date.toString() + " | " + message;
    }

}
