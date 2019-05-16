
class Dog extends Animal{  
Dog(){  
	super();  // if we are not writing super();, 
			  //compiler calls super() implicitly as a first step
	System.out.println("dog is created");  
	}  
}  