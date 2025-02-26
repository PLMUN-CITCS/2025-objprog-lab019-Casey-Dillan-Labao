import java.util.Scanner;
public class FactorialCalculator{
    public static void main(String []args){
        int number=getNonNegativeInteger();
        System.out.print("The factorial of "+ number + " is: " + calculateFactorial(number));
    }

    public static int getNonNegativeInteger(){
    Scanner input=new Scanner(System.in);
    int userInput;
    do{
    System.out.print("Enter a non-negative Integer: ");
    userInput=input.nextInt();
    if (userInput<0){
        System.out.println("Invalid Input, Try Again");
    }else{
        continue;
    }
    }while(userInput<0);
    input.close();
    return userInput;
    }

    public static int calculateFactorial(int number){
        int result=1;
        for(int a=number;a>0;a--){
            result=result*a;
        }
        return result;

    }

}