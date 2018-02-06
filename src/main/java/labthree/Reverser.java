package labthree;

import labthree.Sentence;

import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Provides a generic method for reversing an array.
 *
 * @author Gregory M. Kapfhammer
 */

public class Reverser {

  /** The maximum number of items to use for output. */
  private static int MAXIMUM_NUMBER_ITEMS = 5;

  /**
   * Reverse the provided array, for any data type.
   *
   * @param data the array to be reversed
   *
   * @author Gregory M. Kapfhammer
   */
  public static <T> T[] reverse(T[] data) {
    // TODO: Add the source code for generic reversal
  }

  public static void main(String[] args) {
    Sentence[] originalArray = new Sentence[MAXIMUM_NUMBER_ITEMS];
    for (int i = 0; i < originalArray.length; i++) {
      originalArray[i] = new Sentence("Sentence " + i);
    }
    System.out.println("Printing Sentences before Reversal ...");
    for (int i = 0; i < originalArray.length; i++) {
      System.out.println(originalArray[i]);
    }
    System.out.println("... Done Printing Sentences before Reversal.");
    Sentence[] reversedArray = Reverser.reverse(originalArray.clone());
    System.out.println("Printing Sentences after Reversal ...");
    for (int i = 0; i < reversedArray.length; i++) {
      System.out.println(reversedArray[i]);
    }
    System.out.println("... Done Printing Sentences after Reversal.");
    // TODO: Add the source code for reversing an Integer array
  }

}
