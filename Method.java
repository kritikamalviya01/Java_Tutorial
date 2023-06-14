public class Method {
    
    /*
     * Method Syntax
     * ReturnType nameOfTheMethd(){
     * Body of the Method
     * }
     */

    public static void main(String[] args) {
        sayHelloWorldThrice();
        sayHelloWorldThrice(4);
        printNumber(10);
        printSquareOfNumber(4);
        
    }

    /*Prinitng Hello world thrice */
    static void sayHelloWorldThrice(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }


     /*ReturnType nameOfTheMethod(Type Argument){
        what do we want to do in Method
     }*/

    static void printNumber(int number){
        for(int i=1 ; i<= number; i++){
            System.out.println(i);
        }
     }
    

     static void printSquareOfNumber(int number){
        for(int i=1 ; i<= number; i++){
            System.out.println(i*i);
        }
     }

     static void sayHelloWorldThrice(int number){
        for(int i=0 ; i<number ; i++){
            System.out.println("Hello World");
        }
     }
}
