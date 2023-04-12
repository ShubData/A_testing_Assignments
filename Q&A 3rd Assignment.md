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


