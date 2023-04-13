### Q : Write Class Conventions for Java?
A : Class names should be `nouns`, in mixed case with the `first letter of each internal word capitalized`.
    Try to keep your class names simple and descriptive. Use whole words-avoid acronyms and abbreviations 
    (unless the abbreviation is much more widely used than the long form, such as URL or HTML).
    Only special characters allowed in class name are` _ `and `$`.
    Class name can begin with _ and $ `but is discouraged`.

### Q : Which Special character allowed in Java class first letter
A : Only `_` and `$`are allowed as Java class first letter **but discouraged to use it as naming convention**.

### Q : Which class name is valid ?
A : 
+ Training1 : Valid
+ 1Training : Unvalid
+ training : Unvalid
+ 1training : Unvalid
+ training1 : Unvalid
+ _training : Valid
+ _Training : Valid
+ $Training : Valid (but discouraged)
+ &Training : Unvalid
+ +Training : Unvalid
+ Training+ : Unvalid
+ Training$ : Valid (but discouraged)
+ Training# : Unvalid

### Q : Check Java File, is this Testing1.java correct?
A : **Testing1.java**
    
    public class Testing{
    }
    class A {
    }
    class B{
    }
   **NO, this java file is not correct as public class name is** `Testing`**and file is named as**`Testing1.java`,**it should be same.**

