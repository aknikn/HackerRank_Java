# 039: [Java Sort](https://www.hackerrank.com/challenges/java-sort/problem "https://www.hackerrank.com/challenges/java-sort/problem")
- level: Easy
- language: Java
<br>

## Description of the problem
You are given a list of student information: ID, FirstName, and CGPA.<br>
Your task is to rearrange them according to their CGPA in decreasing order.<br>
If two student have the same CGPA, then arrange them according to their first name in alphabetical order.<br>
If those two students also have the same first name, then order them according to their ID.<br>
No two students have the same ID.<br>

Hint: You can use comparators to sort a list of objects.<br>
See the oracle docs to learn about comparators.

### Imput Format
The first line of input contains an integer *N*, representing the total number of students.<br>
The next *N* lines contains a list of student information in the following structure:<br>

> ID Name CGPA

### Constraints
- 2≦*N*≦1000
- 0≦*ID*≦100000
- 5≦|*Name*|≦30
- 0≦*CGPA*≦4.00

The name contains only lowercase English letters.<br>
The *ID* contains only integer numbers without leading zeros.<br>
The *CGPA*will contain, at most, 2 digits after the decimal point.

### Output Format
After rearranging the students according to the above rules, print the first name of each student on a separate line.

### Sample Input
> 5<br>
> 33 Rumpa 3.68<br>
> 85 Ashis 3.85<br>
> 56 Samiha 3.75<br>
> 19 Samara 3.75<br>
> 22 Fahim 3.76

### Sample Output
> Ashis<br>
> Fahim<br>
> Samara<br>
> Samiha<br>
> Rumpa
