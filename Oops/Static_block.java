/*
 * Static block executed before the main method
 */

package Java_practice.Oops;

public class Static_block {
    static
    {
        System.out.println("this is static block");
    }

    public static void main(String[] args) {
        System.out.println("This is main method");
    }
}

// Output
//this is static block
// This is main method
