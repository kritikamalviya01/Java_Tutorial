
public class Multiplication {
    public static void main(String[] args) {
        printTable(4);
        printTable(22);
    }

    static void printTable(int number){
        for(int i=1; i<=10; i++){
            System.out.printf(" %d * %d = %d",number,i, number*i).println();;
        }
    }
}
