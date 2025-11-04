# 012: [Java Date and Time]((https://www.hackerrank.com/challenges/java-date-and-time/problem "(https://www.hackerrank.com/challenges/java-date-and-time/problem")
- level: Easy
- language: Java


## Description of the problem
The Calendar class is an abstract class that provides methods for converting between a specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.

You are given a date.<br>
You just need to write the method, getDay, which returns the day on that date.<br>
To simplify your task, we have provided a portion of the code in the editor.

### Example
month = 8<br>
day = 14<br>
year = 2017<br>
The method should return MONDAY as the day on that date.

### Function Description
Complete the findDay function in the editor below.<br>
findDay has the following parameters:<br>
- int: month<br>
- int: day<br>
- int: year<br>

### Returns
- string: the day of the week in capital letters

### Imput Format
A single line of input containing the space separated month, day and year, respectively, in MM DD YYYY format.

### Constraints
- 2000 < year <3000

### Sample Input
> 08 05 2015

### Sample Output
> WEDNESDAY

### Explanation
The day on August 5th 2015 was WEDNESDAY.