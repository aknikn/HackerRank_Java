# 034: [Java Map](https://www.hackerrank.com/challenges/phone-book/problem "https://www.hackerrank.com/challenges/phone-book/problem")
- level: Easy
- language: Java


## Description of the problem
You are given a phone book that consists of people's names and their phone number.<br>
After that you will be given some person's name as query.<br>
For each query, print the phone number of that person.

### Imput Format
The first line will have an integer *n* denoting the number of entries in the phone book.<br>
Each entry consists of two lines: a name and the corresponding phone number.<br><br>

After these, there will be some queries.<br>
Each query will contain a person's name.<br>
Read the queries until end-of-file.

### Constraints
A person's name consists of only lower-case English letters and it may be in the format 'first-name last-name' or in the format 'first-name'.<br>
Each phone number has exactly 8 digits without any leading zeros.<br>
- 1 ≦ *n* ≦ 100000
- 0 ≦ Query ≦ 100000

### Output Format
For each case, print "Not found" if the person has no entry in the phone book.<br>
Otherwise, print the person's name and phone number.<br>
See sample output for the exact format.<br><br>

To make the problem easier, we provided a portion of the code in the editor.<br>
You can either complete that code or write completely on your own.

### Sample Input
> 3<br>
> uncle sam<br>
> 99912222<br>
> tom<br>
> 11122222<br>
> harry<br>
> 12299933<br>
> uncle sam<br>
> uncle tom<br>
> harry

### Sample Output
> uncle sam=99912222<br>
> Not found<br>
> harry=12299933