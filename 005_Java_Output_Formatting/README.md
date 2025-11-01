# 005: [Java Output Formatting]((https://www.hackerrank.com/challenges/java-output-formatting/problem "(https://www.hackerrank.com/challenges/java-output-formatting/problem")
- level: Easy
- language: Java


## Description of the problem
Java's System.out.printf function can be used to print formatted output.<br>
The purpose of this exercise is to test your understanding of formatting output using printf.<br><br>

To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

### Imput Format
Every line of input will contain a String followed by an integer.<br>
Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

### Output Format
In each line of output there should be two columns:<br>
The first column contains the String and is left justified using exactly 15 characters.<br>
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

### Sample Input
> java 100<br>
> cpp 65<br>
> python 50

### Sample Output
> ================================<br>
> java           100<br>
> cpp            065<br>
> python         050<br>
> ================================

### Explanation
Each String is left-justified with trailing whitespace through the first 15 characters.<br>
The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.