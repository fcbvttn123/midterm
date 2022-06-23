/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 */
public class ArithmeticBase 
{
    double x,y;

    double calculate(double x, double y) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        int s= sc.nextInt();
        operations z = operations.PLUS;
        switch (s) 
        {
            case operations.PLUS.:
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}

enum operations{
    PLUS(1), MINUS(2), TIMES(3), DIVIDE(4);
    int x; 

    operations(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

}
