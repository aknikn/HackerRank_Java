# 023: [Valid Username Regular Expression](https://www.hackerrank.com/challenges/valid-username-checker/problem "https://www.hackerrank.com/challenges/valid-username-checker/problem")
- level: Easy
- language: Java


## Description of the problem
You are updating the username policy on your company's internal networking platform.<br>
According to the policy, a username is considered valid if all the following constraints are satisfied:

- The username consists of 8 to 30 characters inclusive.<br>
	If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
- The username can only contain alphanumeric characters and underscores (_).<br>
	Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
- The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].

For example:<br>
| Username       | Length | Validity                                              |<br>
|:---------------|-------:|:------------------------------------------------------|<br>
| Julia          |      5 | INVALID; Username length < 8 characters               |<br>
| Samantha       |      8 | VALID                                                 |<br>
| Samantha_21    |     11 | VALID                                                 |<br>
| 1Samantha      |      9 | NVALID; Username begins with non-alphabetic character |<br>
| Samantha_10_2A |     14 | INVALID; '?' character not allowed                    |<br><br>

Update the value of regularExpression field in the UsernameValidator class so that the regular expression only matches with valid usernames.

### Imput Format
The first line of input contains an integer n, describing the total number of usernames.<br>
Each of the next n lines contains a string describing the username.<br>
The locked stub code reads the inputs and validates the username.

### Constraints
- 0 ≦ n ≦ 100
- The username consists of any printable characters.

### Output Format
For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

### Sample Input
> 8<br>
> Julia<br>
> Samantha<br>
> Samantha_21<br>
> 1Samantha<br>
> Samantha?10_2A<br>
> JuliaZ007<br>
> Julia@007<br>
> _Julia007

### Sample Output
> Invalid<br>
> Valid<br>
> Valid<br>
> Invalid<br>
> Invalid<br>
> Valid<br>
> Invalid<br>
> Invalid

### Explanation
Refer diagram in the challenge statement.