# Q&A 3rd Assignment


### Q : Write some use case with 'this' keyword ?
A : 
                                          
   a)  _this can be used to refer current class instance variable_
                              
    class Student{  
    int rollno;  
    String name;  
    float fee;  
    Student(int rollno,String name,float fee){  
    this.rollno=rollno;  
    this.name=name;  
    this.fee=fee;  
 b) _this can be used to invoke current class method (implicitly)_
 
      class A{  
      void m(){System.out.println("hello m");}  
      void n(){  
      System.out.println("hello n");  
      //m();//same as this.m()  
      this.m();  
      }  
      }  
   
   c) _this() can be used to invoke current class constructor._
    
    **Calling default constructor from parameterized constructor:**
    class A{  
    A(){System.out.println("hello a");}  
    A(int x){  
    this();  
    System.out.println(x);  
    }  
    }
    **Calling parameterized constructor from default constructor:**
    class A{  
    A(){  
    this(5);  
    System.out.println("hello a");  
    }  
    A(int x){  
    System.out.println(x);  
    }  
    }  

d) _this can be passed as an argument in the method call._
     
    class S2{  
    void m(S2 obj){  
    System.out.println("method is invoked");  
    }  
    void p(){  
    m(this);  
    }  

e) _this can be passed as argument in the constructor call._
       
    class B{  
    A4 obj;  
    B(A4 obj){  
    this.obj=obj;  
    }  
    void display(){  
    System.out.println(obj.data);//using data member of A4 class  
    }  
    }  
    class A4{  
    int data=10;  
    A4(){  
    B b=new B(this);  
    b.display();  
    }  
    
f) _this can be used to return the current class instance from the method._

    A getA(){  
    return this;  
    }  

### Q : What is instance, static and local varibales?
A : 
  +  _Instance_ : The variables that are declared inside the class but outside the scope of any method are called instance variables in Java.
    
  + _Static_ :   A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share                    it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.
   
  + _Local_ :    A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in                  the class aren't even aware that the variable exists. A local variable cannot be defined with "static" keyword.

### Q : Which variable type is not defined by default? instance, local or static ?
A : Local variable  are not defined by default and have to be coded in.

### Q : Write the visibility of all four access modifiers? public, private, default and protected.
A : 
   + **_Public_** : The public access modifier is accessible everywhere. It has the widest scope among all other modifiers.
   + **_Private_** : The private access modifier is accessible only within the class.
   + **_Default_** : The default modifier is accessible only within package.
   + **_Protected_** : The protected access modifier is accessible within package and outside the package but through inheritance only.

### Q : Which class cannot have access modifier as private and protected & Why ?
A : Outer or top level class connot be defined as Private or Protected
   - If we are allowed to declare a class as `Private`, the class will become private to its package and will not be accessible from outside of the package.
      So defining private access to the class will make it accessible inside the same package which default keyword already do for us, Therefore there is no benefit of       defining a class private it will only make things ambiguous.
     
   - If we are allowed to make a class `Protected` then we can access it inside the package very easily but for accessing that class outside of the package we first        need to extend that entity in which this class is defined which is again is its package.
     And since a package can not be extended (can be imported) defining a class protected will again make it similar to defining it as default which we can already do.      So again there is no benefit of defining a class protected.

### Q : Write Static and Instance variable and check visibility with private, default, protected and public
A :  **__Static variable visibility__**
            
    - Private : only within class.
    - Default : only within class and package.
    - Protected : within class ,package and outside package with subclass (using extends)only.
    - Public : Accesible everywhere 
  
  **__Instance variable visibility__**(Should be accesed in a non static way)
   
    - Private : only within class.
    - Default : only within class and package.
    - Protected : within class ,package and outside package with subclass (using extends)only.
    - Public : Accesible everywhere 

### Q : Write Static and Non-Static Method and check visibility with private, default, protected and public
A : **__Static Method visibility__**

    package java_push;
    class Scopechecker{
    static void good() {
    System.out.println("I am Visible here");
    }
    }
- Private : only within class.
- Default : only within class and package.
- Protected : within class ,package and outside package with subclass (using extends)only.
- Public : Accesible everywhere 

**__Non-Static Method visibility__**

    package java_push;
    class Scopechecker{
     void good() {
    System.out.println("I am Visible here");
    }
    }
- Private : only within class.
- Default : only within class and package.
- Protected : within class ,package and outside package with subclass (using extends)only.
- Public : Accesible everywhere 

### Q : Create classes with all access modifier and check behaviour
A :
+ **illegal modifier a class cannot be declared as private or protected**
   
      private class A{
    
      }

+ **default class works and doesnt show any error** 
        
        class B{

        }

+ **illegal modifier a class cannot be declared as private or protected**
     
      protected class C{

      }

+ **only one public class within a file (the public type D must be defined in its own file)**
          
          public class D{

         }

      public class Demo{
      public static void main(String[] args){
      A a1 = new A();
      B a1 = new B();
      C a1 = new C();
      D a1 = new D();
      }
      }
