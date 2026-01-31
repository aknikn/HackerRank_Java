# 049: [Java Method Overriding](https://www.hackerrank.com/challenges/java-method-overriding/problem "https://www.hackerrank.com/challenges/java-method-overriding/problem")
- level: Easy
- language: Java
<br>

## Description of the problem
When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones).<br>
Consider the following Sports class:

> class Sports{<br>
> 　　String getName(){<br>
> 　　　　return "Generic Sports";<br>
> 　　}<br>
> 　　void getNumberOfTeamMembers(){<br>
> 　　　　System.out.println( "Each team has n players in " + getName() );<br>
> 　　}<br>
> }

Next, we create a Soccer class that inherits from the Sports class.<br>
We can override the getName method and return a different, subclass-specific string:

> class Soccer extends Sports{<br>
> 　　@Override<br>
> 　　String getName(){<br>
> 　　　　return "Soccer Class";<br>
> 　　}<br>
> }

Note: When overriding a method, you should precede it with the @Override annotation.<br>
The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.


### Task
Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the superclass' getNumberOfTeamMembers method, except that it replaces *n* with 11 (the number of players on a Soccer team).

### Output Format
When executed, your completed code should print the following:

> Generic Sports<br>
> Each team has n players in Generic Sports<br>
> Soccer Class<br>
> Each team has 11 players in Soccer Class