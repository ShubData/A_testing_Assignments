# 2nd Assignment Q&A
### Q : Which Special character allowed in Java class first letter
A : $ , _ are the only special character allowed as starting of an identifier.


### Q : What is first statement in java file ?
A : The package statement should be the first line in the file.


### Q : What is package in Java ?
A : A java package is a group of similar types of classes, interfaces and sub-packages.Package in java can be categorized in two form, built-in package and user-            defined package.

### Q : why we use for loop when we have while and do.while loops?

A : we use for loop when we know how many times we have to run the loop.

### Q : Write a real time scenario when we use do while loop?

A : We use do while loops where we want to run the code atleast once ,regardless of the condition. we can use this in a Menu option ,where menu is atleast shown once, 
    before accessing forward. 

### Q : Write 3 real-life examples where we use infinite while loop?

A : Infinite loops generally are used in scenarios where a program has to been run continuously this can be
    
    a) Embedded systems: A cartridge-based video game is an embedded system that uses an infinite loop.
        The game runs an infinite loop until the console is powered off because there is no underlying OS to return to.
     b) Operating systems: OSes are infinite loops that continually check for user input and respond accordingly.
        The loop continues until the device is turned off or reset.
     c) Web servers: Web servers are designed to take a request, return a webpage and then wait indefinitely for the next request.

### Q : Why do we have do_while loop when while and for loop is available?

A : The Do - While loop unlike FOR and WHILE loop will execute atleast once, even if the conditions required to execute a loop is not met.
    this comes in handy in a menu driven program where the termination condition depends upon the end user.
    This feature of Do- While loop can be very useful, hence its availibilty in Java is important. 

### Q : Write difference between while, do.while and for loop?

A : loops
       
      a) FOR Loop : It is known as entry controlled loop ,If the condition is not true first time than control will never enter in a loop.
             Initialization and updating is the part of the syntax.
            (Syntax): For(initialization; condition;updating), {Statements; }.
      
      b) WHILE Loop : It is known as entry controlled loop. If the condition is not true first time than control will never enter in a loop.
            Initialization and updating is not the part of the syntax.
            (Syntax) : While(condition){Statements; }
      
      c) DO - WHILE Loop :It is known as exit controlled loop.Even if the condition is not true for the first time the control will enter in a loop.
           Initialization and updating is not the part of the syntax.
           (Syntax): Syntax: Do { Statements; } While(condition);
           
### Q : What is obfuscation?

A : Obfuscation is the action of making the code unclear by doing some modifications in the executable code but the code remains fully functional.
    The purpose of using obfuscation is to make the code hard to see or understand for an external entity (ex. an hacker).

### Q : Difference between Obfuscation and Encoding ?

A : OBFUSCATION is a technique that is normally used to hide the meaning of some software by rearranging the operations,
    An obfuscated program should produce exactly the same results as an unobfuscated one.
    Where as The purpose of ENCODING is to transform data so that it can be properly (and safely) consumed by a different type of system, e.g. binary data being sent       over email, or viewing special characters on a web page. The goal is not to keep information secret, but rather to ensure that it’s able to be properly consumed.       Encoding transforms data into another format using a scheme that is publicly available so that it can easily be reversed.        

### Q : Why do we need break in switch case ?

A : The break statement notifies the program to exit out of the switch case, if break statement is not provided, the switch case will keep running and possibly throw
    an incorrect solution/requirement/answer.
    
### Q : What is limitation in Switch Case?

A : Limitations of Swtich Case : 

      a) Switch case doesn't allow floating numbers. (It only allows int, short, byte, long, char,String )
      
      b) Each case should be configured with either a constant value or a final value variable. Otherwise, the program will not compile.


### Q : What is basic difference between Logical and Bitwise operators?

A : BITWISE Operators : 
                     
      a) bitwise operators work on binary digits of integer values (long, int, short, char, and byte) 
      b) bitwise operators always evaluate both operands.
      c) bitwise operators work on bits and perform bit by bit operations.
      d) it return an integer.
      e) bitwise operations cannot be used on boolean, float, or double
      f) Syntax: & , | , ~
    
  
   LOGICAL Operators : 
   
       a) logical operators work on boolean expressions.
       b) logical operators always evaluate the first boolean expression and, depending on its result and the operator used, may or may not evaluate the second.
       c) logical operators are used in making decisions based on multiple conditions.
       d) it returns boolean values (True or False).
       e) logical oprators can evaluate from floats and double values.
       f) Syntax: && ,||, !
    
### Q : Which Operator is better? Bitwise and Logical. also write reasons?

A : Both the operators can be used in different scenarios, logical operators are more likely to be used when making a decision based program whereas bitwise operators     are often found when working on bit level.Although Bitwise operator has a speed advantage it lacks some function of  working with float or boolean values, hence       both operators are eqally important, rather than choosing one over other, its better to use them where they are better suited.

### Q : Explain 3 exmaples which shows logical operator usage better instead of bitwise?

A : case a) suppose we require an AND operator in 
             (5 > 10) && (20 > 5), here the logical operator will provide a answer just by left statement (which is false in this case) and wont go to right hand side,
             whereas a bitwise operator would have to check both sides.
     case b) 

### Q : What is reserve Keyword?

A : Reserved keywords are reserved words in Java that serve as a code key. These words can't be used for anything else because they're predefined. They can't be used      as a variable name, object name, or any other identifier. 

### Q : How many keywords available in java?

A : Currently there are 67 reserved terms or keywords in Java.
    ex:
         
         > abstract	,continue	,for ,new, switch
         > assert, default, goto , package, synchronized
         > boolean, do , if	,private, this
         > break, double, implements, protected, throw

### Q : Why java consider goto as keyword?

A : Java keyword list specifies the goto keyword, but it is marked as "not used".It was in the original JVM, but then removed. It was probably kept as a reserved           keyword in case it were to be added to a later version of Java.If goto was not on the list, and it gets added to the language later on, existing code that used the     word goto as an identifier (variable name, method name, etc...) would break. But because goto is a keyword, such code will not even compile in the present, and it     remains possible to make it actually do something later on, without breaking existing code.
