// class name always starts with a captial letter
class Student{
      int rno;
      String name;
      //Student() is a constructor here it should be name as class name it does not return anything like any function it just used to intialize
      // the current invoking object
    Student(int rno,String name){
           this.rno = rno;                    //1st constructor
           this.name = name;
      }
      //demonstration of calling a constructor from another constructor
      
      Student(){

            this(13, "default name");       //2nd constructor
      }
}
class Class_Example1{
      public static void main(String[] args){
        // we are creating the object of student here. Student is our user defined data type i.e. class, s1 is the reference which contains the address
        // of the object which has been made. 
        //  imp point -> here the 'new' is allocating memory of the object at the runtime not the compile time in heap memory.
        //Student(55,"subodh"); -> this is invoking the constructor which we have created in our student class
        //the constructor is called for the recently created object.
         Student s1 = new Student(55,"subodh");
         // imp -> here we are not passing anything in our Student so our and constructor is automatically calling our first constructor
         // we have set some default values in our and constructor and using this keyword we are calling it this is also a representation of
         // constructor overloading or polymorphism.
        Student s2 = new Student();
        System.out.println(s2.name); 
      }
}