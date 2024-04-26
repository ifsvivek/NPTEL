public class HelloWorld {
    // public class -> name -> name.java
    // public (blue ) -> keywords (special status in  java) -> access modifier (visibility)
    // class (blue) -> keywords -> class
    public static void main(String[] args) {   // main  function
        // static -> keyword -> you dont need an object to call it. (existence)
        // void -> data type (does not return anything)
        // main () -> special function (Java compiler (JVM) - willfirst look out for main())
        // String[] args -> String[] - array of string , args - arguments
        System.out.print("Hello World");
        // System.out.print -> method , to print something, C-> printf(), c++ -> cout, python -> print()
        System.out.print("Hello World"); // this is statement
        int n = 5; // n=5 expression

//        int n        =        1000   ;
        System.out.print (
                "Hello"
                +
                        "World"
        )
                ;
        int var = 100;
        System.out.println("Hellow"); // Free formatting styling
    }
}
