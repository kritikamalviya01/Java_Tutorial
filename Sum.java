public class Sum {
    public static void main(String[] args) {
        sum(5, 4);
        sum(5, 4, 8);
        
        int a = add(2, 4);
        System.out.println(a);
    }

    static void sum(int firstNumber, int secondNumber){
        System.out.println("Sum of two numbers is: " + (firstNumber+secondNumber));
    }

    static void sum(int firstNumber, int secondNumber, int thirdNumber){
        System.out.println("Sum of two three is: " + (firstNumber+secondNumber+thirdNumber));
    }

    // This have integer return type which will return value
    static int add(int firstNumber, int secondNumber){
        int sum = firstNumber+secondNumber;
        return sum;
    }


    // Arguments( Value Passed in Method)
    // Parameter ( Method definition)

    // Method Overloading concepts are shown with 2 method with same name but having more parameters
}
