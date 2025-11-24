# 024: [Tag Content Extractor](https://www.hackerrank.com/challenges/tag-content-extractor/problem "https://www.hackerrank.com/challenges/tag-content-extractor/problem")
- level: Medium
- language: Java


## Description of the problem
In a tag-based language like XML or HTML, contents are enclosed between a start tag and an end tag like <tag>contents</tag>.<br>
Note that the corresponding end tag starts with a /.

Given a string of text in a tag-based language, parse this text and retrieve the contents enclosed within sequences of well-organized tags meeting the following criterion:<br>
1. The name of the start and end tags must be same.<br>
	The HTML code <h1>Hello World</h2> is not valid, because the text starts with an h1 tag and ends with a non-matching h2 tag.
2. Tags can be nested, but content between nested tags is considered not valid.<br>
	For example, in <h1><a>contents</a>invalid</h1>, contents is valid but invalid is not valid.
3. Tags can consist of any printable characters.

### Imput Format
The first line of input contains a single integer, N (the number of lines).<br>
The N subsequent lines each contain a line of text.

### Constraints
- 0 ≦ N ≦ 100
- Each line contains a maximum of 10^4 printable characters.
- The total number of characters in all test cases will not exceed 10^6.

### Output Format
For each line, print the content enclosed within valid tags.<br>
If a line contains multiple instances of valid content, print out each instance of valid content on a new line; if no valid content is found, print None.

### Sample Input
> 4<br>
> <h1>Nayeem loves counseling</h1><br>
> <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par><br>
> <Amee>safat codes like a ninja</amee><br>
> <SA premium>Imtiaz has a secret crush</SA premium><br>

### Sample Output
> Nayeem loves counseling<br>
> Sanjay has no watch<br>
> So wait for a while<br>
> None<br>
> Imtiaz has a secret crush