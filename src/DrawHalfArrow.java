
//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           DrawHalfArrow
// Files:           a list of all source files used by that program
// Course:          CS200 Spring 2018
//
// Author:          Reece Lardy
// Email:           rlardy@wisc.edu
// Lecturer's Name: Mark Renault
//
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         identify each person and describe their help in detail
// Online Sources:  identify each URL and describe their assistance in detail
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////

import java.util.Scanner; 

public class DrawHalfArrow {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int arrowBaseHeight = 0;
      int arrowBaseWidth  = 0;
      int arrowHeadWidth = 0;
      int arrowHeadHeight = 0;

      int i = 0;
      int j = 0;
      int k = 0;
      int l = 0;

      System.out.print("Enter arrow base height: ");
      arrowBaseHeight = scnr.nextInt();

      System.out.print("Enter arrow base width: ");
      arrowBaseWidth = scnr.nextInt();

      System.out.print("Enter arrow head width: ");
      arrowHeadWidth = scnr.nextInt();

    	  while (arrowHeadWidth <= arrowBaseWidth) {
    	      System.out.print("Enter arrow head width: ");
    	      arrowHeadWidth = scnr.nextInt();
    		}

      //draw arrow base 
    	  System.out.println("");
    	  for (i = 0; i < arrowBaseHeight; i++) {
  			for (j = 0; j < arrowBaseWidth; j++) {
  				System.out.print("*");
  			}
  			System.out.println("");
  		}

      //draw arrow head
    	  arrowHeadHeight = arrowHeadWidth;
    	  for (k = 0; k < arrowHeadHeight; k++) {
    			for (l = 0; l < arrowHeadWidth; l++) {
    				System.out.print("*");
    			}
    			System.out.println("");
    			arrowHeadWidth--;
    		}

      return;
   }
}
