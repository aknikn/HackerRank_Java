# 038: [Java Comparator](https://www.hackerrank.com/challenges/java-comparator/problem "https://www.hackerrank.com/challenges/java-comparator/problem")
- level: Medium
- language: Java
<br>

## Description of the problem
Comparators are used to compare two objects. In this challenge, you'll create a comparator and use it to sort an array.<br>

The Player class is provided for you in your editor.<br>
It has 2 fields: a *name* String and a *score* integer.<br>

Given an array of *n* Player objects, write a comparator that sorts them in order of decreasing score; if 2 or more players have the same score, sort those players alphabetically by name.<br>
To do this, you must create a Checker class that implements the Comparator interface, then write an int compare(Player a, Player b) method implementing the [Comparator.compare(T o1, T o2)](https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare "https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare") method.

### Imput Format
Input from stdin is handled by the locked stub code in the Solution class.<br>

The first line contains an integer, *n*, denoting the number of players.<br>
Each of the *n* subsequent lines contains a player's *name* and *score*, respectively.

### Constraints
- 0≦*score*≦1000
- 2  players can have the same name.
- Player names consist of lowercase English letters.

### Output Format
You are not responsible for printing any output to stdout.<br>
The locked stub code in Solution will create a Checker object, use it to sort the Player array, and print each sorted element.

### Sample Input
> 5<br>
> amy 100<br>
> david 100<br>
> heraldo 50<br>
> aakansha 75<br>
> aleksa 150

### Sample Output
> aleksa 150<br>
> amy 100<br>
> david 100<br>
> aakansha 75<br>
> heraldo 50