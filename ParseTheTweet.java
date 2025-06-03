
/*
 * ParseTheTweet.java
 * Author: Sharon Agbita 
 * Submission Date:  1/31/2025
 *
 * Purpose: The purpose of this program is to parse the users input which would be a tweet
 * and display information back to the user from it. The information that is shown is, the type, location, 
 * detail, latitude, and longitude. Each piece of information is found by the position within tweet, using .indexOf.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */
import java.util.Scanner;

public class ParseTheTweet {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		// Where the user enters a tweet
		System.out.println("Enter a Tweet Below");
		String tweet = keyboard.nextLine() + "\n";

		// Declared variables
		String tweetType = "Type: \t\t";
		String tweetLocation = "Location:\t";
		String tweetDetail = "Detail: \t";
		String tweetLatitude = "Latitude: \t";
		String tweetLongitude = "Longitude: \t";

		// Declared variable for start and finish
		int start;
		int finish;

		// Parsing type
		start = tweet.indexOf(" ", 1); // finds the 1st position after the space
		finish = tweet.indexOf(";"); // find the position of the semicolon
		String tweetTypeParsed = tweet.substring(start, finish).trim().toUpperCase(); /* The tweet "type" parsed as a string
																						*/
		tweet = tweet.substring(finish + 1); // extracts the first tweet the user inputted

		// Parsing detail
		start = tweet.indexOf(" ", 1); // finds the 1st position after the space
		finish = tweet.indexOf(";"); // find the position of the semicolon
		String tweetDetailParsed = tweet.substring(start, finish).trim(); // The tweet "detail" parsed as a string
		tweet = tweet.substring(finish + 1); // extracts the second tweet the user inputted

		// Parsing Location
		start = tweet.indexOf(" ", 1); // finds the 1st position after the space
		finish = tweet.indexOf(";"); // find the position of the semicolon
		String tweetLocationParsed = tweet.substring(start, finish).trim(); // The tweet "location" parsed as a string
		tweet = tweet.substring(finish + 1); // extracts the third tweet the user inputted

		// Parsing Latitude
		start = tweet.indexOf(" ", 1); // finds the 1st position after the space
		finish = tweet.indexOf(";"); // find the position of the semicolon
		String tweetLatitudeParsed = tweet.substring(start, finish).trim(); // The tweet "latitude" parsed as a string
		tweet = tweet.substring(finish + 1); // extracts the fourth tweet the user inputted

		// Parsing Longitude
		start = tweet.indexOf(" ", 1); // finds the 1st position after the space
		finish = tweet.indexOf(";"); // find the position of the semicolon
		String tweetLongitudeParsed = tweet.substring(start, finish).trim(); // The tweet "longitude" parsed as a string
		tweet = tweet.substring(finish + 1); // extracts the fifth tweet the user inputted

		// Outputs
		System.out.println(tweetType + tweetTypeParsed);
		System.out.println(tweetDetail + tweetDetailParsed);
		System.out.println(tweetLocation + tweetLocationParsed);
		System.out.println(tweetLatitude + tweetLatitudeParsed);
		System.out.println(tweetLongitude + tweetLongitudeParsed);

		keyboard.close();
	}

}
