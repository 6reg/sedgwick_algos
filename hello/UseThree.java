/*********************************************
 * Compilation: javac UseThree.java
 * Execution:   java UseThree.java yourname
 *
 * % java UseArgument Bob
 * Hi, Bob. How are you?
 *
 * % java UseArgument Alice
 * Hi, Alice. How are you?
 *
 * ******************************************/

public class UseThree {
    public static void main(String[] args) {
        System.out.print("Hi ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.print(args[0]);
        System.out.println(".");
    }
}
 
 
