package Element;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Element
public class IntegerArry {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
			//static used to prepare a field,method or inner classes as a class field.
			//void: it is void if the method does not return a value.
			//main:it is a function name When a program starts running, it has to start execution from somewhere.
			//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.

		int a[] = new int [5];           //here I'm creating an array  size of index  five 

		a[0] =10;  //here I am initializing and declaring the  5 elements of array  
		a[1] =24; //taking a[1]equal to 24
		a[2] =29;//taking a[2]equal to 29
		a[3] =35;//taking a[3]equal to 35
		a[4] =47;//taking a[4]equal to  47
		System.out.println( a[5]=90);
		 //system : system is a class in java language.lang package
	  	//out : out is the static member of system class.It's type PrintStream
	  	//println: which is used to print the output.

	}

}
