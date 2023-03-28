Q : why we use for loop when we have while and do.while loops?

A : we use for loop when we know how many times we have to run the loop.

Q : Write a real time scenario when we use do while loop?

A : We use do while loops where we want to run the code atleast once ,regardless of the condition. we can use this in a Menu option ,where menu is atleast shown once, 
    before accessing forward. 

Q : Write 3 real-life examples where we use infinite while loop?

A : Infinite loops generally are used in scenarios where a program has to been run continuously this can be
    
    a) Embedded systems: A cartridge-based video game is an embedded system that uses an infinite loop.
        The game runs an infinite loop until the console is powered off because there is no underlying OS to return to.
     b) Operating systems: OSes are infinite loops that continually check for user input and respond accordingly.
        The loop continues until the device is turned off or reset.
     c) Web servers: Web servers are designed to take a request, return a webpage and then wait indefinitely for the next request.

Q : Why do we have do_while loop when while and for loop is available?

A : The Do - While loop unlike FOR and WHILE loop will execute atleast once, even if the conditions required to execute a loop is not met.
    this comes in handy in a menu driven program where the termination condition depends upon the end user.
    This feature of Do- While loop can be very useful, hence its availibilty in Java is important. 

Q : Write difference between while, do.while and for loop?

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
           
Q : What is obfuscation?

A : Obfuscation is the action of making the code unclear by doing some modifications in the executable code but the code remains fully functional.
    The purpose of using obfuscation is to make the code hard to see or understand for an external entity (ex. an hacker).

Q : Difference between Obfuscation and Encoding ?

A : OBFUSCATION is a technique that is normally used to hide the meaning of some software by rearranging the operations,
    An obfuscated program should produce exactly the same results as an unobfuscated one.
    Where as The purpose of ENCODING is to transform data so that it can be properly (and safely) consumed by a different type of system, e.g. binary data being sent       over email, or viewing special characters on a web page. The goal is not to keep information secret, but rather to ensure that it’s able to be properly consumed.       Encoding transforms data into another format using a scheme that is publicly available so that it can easily be reversed.        

Q : Why do we need break in switch case ?

A : The break statement notifies the program to exit out of the switch case, if break statement is not provided, the switch case will keep running and possibly throw
    an incorrect solution/requirement/answer.
    
Q : What is limitation in Switch Case?

A : Limitations of Swtich Case : 

      a) Switch case doesn't allow floating numbers. (It only allows int, short, byte, long, char,String )
      
      b) Each case should be configured with either a constant value or a final value variable. Otherwise, the program will not compile.


Q : What is basic difference between Logical and Bitwise operators?

A : 
