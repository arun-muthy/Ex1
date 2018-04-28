
public class Exercise_1 {
	public static void main(String[]args) {

		System.out.println("Hello World!");	//exercise 1. "Hello World!"

		String msg = "Hello World!";
		System.out.println(msg); //exercise 1. ASSIGNMENT

		method(); //exercise 1.PARAMETERS

		System.out.println(methodA()); // exercise1. RETURN TYPES // not called in same scope as method
		                               
		System.out.println(methodB(3,5)); //excercise1. PARAMETERS/OPERATORS	

		System.out.println(methodC(2,5,true));//exercise1. CONDITIONALS
		System.out.println(methodC(3,3,false));//exercise1. CONDITIONALS

		System.out.println(methodD(3,0,true)); //exercise1. CONDITIONALS2
		System.out.println(methodD(0,5,true)); //exercise1. CONDITIONALS2
		System.out.println(methodD(4,5,true)); //exercise1. CONDITIONALS2


		for (int a = 0; a<10; a++) {                      //exercise1. ITERATION
			System.out.println(methodE( a,  5, false));   //exercise1. ITERATION
		}

		int[] array10 = {2,3,4,5,6,7,8,9,10,11};          //exercise1. ARRAYS
		for (int a = 0; a<10; a++) {                      //exercise1. ARRAYS
		System.out.println(methodF(a,array10[a],false));  //exercise1. ARRAYS

		for (int x = 0; x<10; x++) {                      //exercise1. ITERATION/ARRAYS
			System.out.println(array10[x]);               //exercise1. ITERATION/ARRAYS
		    }
		}

		int[] array4 = new int[4];                        //exercise1. ITERATION/ARRAYS2
		for (int y=0;y<4;y++) {                           //exercise1. ITERATION/ARRAYS2
			System.out.println(array4[y]=y);              //exercise1. ITERATION/ARRAYS2
		}
		for (int y=0;y<4;y++) {
			System.out.println(array4[y]=y*10);           //exercise1. ITERATION/ARRAYS2
		}



		}

		public static void method() {             //ref.line10
			System.out.println("Hello World!");
			}

		public static String methodA() {          //ref.line12
		    return "Hello World!";          
		    }                                         

		public static int methodB(int a,int b) {  //ref.line14
			return a + b;
		}

		public static int methodC(int a,int b,boolean num) { //ref.line16-17
			if (num==true) {
				return a+b;
			}
			else {
				return a*b;
			}
		}

		public static int methodD(int a,int b,boolean num){     //ref.line19-21
			if(a==0 && b!=0) {
				return b;
			}
			else if(a!=0 && b==0) {
				return a;
			}
			else if (num==true) {
				return a+b;
			}
			else { 
				return a*b;
			}
		}

		public static int methodE(int a, int b, boolean num) { //ref.line24-25
			
			
			if(a==0 && b!=0) {
				return b;
			}
			else if(a!=0 && b==0) {
				return a;
			}
			else if (num==true) {
				return a+b;
			}
			else { 
				return a*b;
			}
		}


		public static int methodF(int a,int b,boolean num){   //ref.line28-30
			if(a==0 && b!=0) {
				return b;
			}
			else if(a!=0 && b==0) {
				return a;
			}
			else if (num==true) {
				return a+b;
			}
			else { 
				return a*b;
			}
		}


}
