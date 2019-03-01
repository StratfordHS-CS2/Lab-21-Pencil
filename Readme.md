[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-21-pencil-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-21-pencil-username)

# Lab 21 - Pencil

## Lab Goal
You will make a Pencil class that can be used to create and manipulate Pencil objects.

## Instructions
* Create a default constructor for the Pencil class.  Set reasonable default values for `color`, `length`, `isSharp`, and `hasEraser`.
* Create a second constructor for the Pencil class that accepts all 4 values as parameters and sets the instance variables with the contents of the parameters.
* In the proper locations, complete the following getters and setters (note that you don't need to create a getter or setter for public variables):
  - `getLength`
  - `getColor`
  - `setLength`
  - `setColor`
* Complete the method `public void sharpen()` that will sharpen the pencil.  Sharpening means that the pencil is now sharp, and the lenght is reduced by 5.
* Complete the standard `toString` method to allow Java to print a Pencil object.  The values of each of the 4 instance variables should be included in the output.
* In the `PencilRunner` class, create at least one pencil and test each of the constructors and methods.
* Complete all javadoc comments with the proper tags.

## Reference
* [ThinkJava chapter on Classes](http://greenteapress.com/thinkjava6/html/thinkjava6012.html)

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 13 - Constructor
* 13 - Second Constructor
* 10 - `getLength`
* 10 - `getColor`
* 10 - `setLength`
* 10 - `setColor`
* 10 - `sharpen()` method
* 14 - `toString()` method
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
