# 021: [Java Regex](https://www.hackerrank.com/challenges/java-regex/problem "https://www.hackerrank.com/challenges/java-regex/problem")
- level: Medium
- language: Java


## Description of the problem
Write a class called MyRegex which will contain a string pattern.<br>
You need to write a regular expression and assign it to the pattern such that it can be used to validate an IP address.<br>
Use the following definition of an IP address:

> IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.<br>
> Leading zeros are allowed.<br>
> The length of A, B, C, or D can't be greater than 3.

Some valid IP address:<br>
> 000.12.12.034<br>
> 121.234.12.12<br>
> 23.45.12.56

Some invalid IP address:<br>
> 000.12.234.23.23<br>
> 666.666.23.23<br>
> .213.123.23.32<br>
> 23.45.22.32.<br>
> I.Am.not.an.ip

In this problem you will be provided strings containing any combination of ASCII characters.<br>
You have to write a regular expression to find the valid IPs.<br><br>

Just write the MyRegex class which contains a String pattern.<br>
The string should contain the correct regular expression.<br><br>

(MyRegex class MUST NOT be public)

### Sample Input
> 000.12.12.034<br>
> 121.234.12.12<br>
> 23.45.12.56<br>
> 00.12.123.123123.123<br>
> 122.23<br>
> Hello.IP

### Sample Output
> true<br>
> true<br>
> true<br>
> false<br>
> false<br>
> false