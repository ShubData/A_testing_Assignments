### Q : What is package in Java ?
A : A java package is a group of similar types of classes, interfaces and sub-packages.Package in java can be categorized in two form, built-in package and user-           defined package. A Java package organizes Java classes into namespaces, providing a unique namespace for each type it contains. Classes in the same package can         access each other's package-private and protected members

### Q : Which package is correct ?
A : **to create test2 package inside test1 package** :
+ `package test1/test2` : Unvalid
+ `package test1.test2` : Valid
+ `package test1 test2` : Unvalid


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

