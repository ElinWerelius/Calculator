import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String operator;
        String numberOne, numberTwo;
        double numberOneDouble, numberTwoDouble;
        Math math = new Math();

        System.out.println("This is a simple calculator. You chose which two numbers " +
                "and which operator that will be used. You can end the program by pressing 0! ");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write the first number: ");
            numberOne = scanner.next();

            //TODO LOOP THROUGH  - does not work
            while(true) {

                try {
                    numberOneDouble = Double.parseDouble(numberOne);
                } catch (NumberFormatException exception) {
                    System.out.println("Invalid, write a number");
                    numberOne = scanner.next();
                    numberOneDouble = Double.parseDouble(numberOne);
                    if (numberOneDouble < 0.0 || numberOneDouble > 0.0);{
                        break;
                    }
                }
            }

            System.out.println("Write the second number: ");
            numberTwo = scanner.next();

            //TODO LOOP THROUGH - same
            try{
                numberTwoDouble = Double.parseDouble(numberTwo);
            }catch(NumberFormatException exception){
                System.out.println("Invalid, write a number");
                numberTwo = scanner.next();
            }
            numberOneDouble = Double.parseDouble(numberOne);
            numberTwoDouble = Double.parseDouble(numberTwo);

            if (numberOneDouble == 0 || numberTwoDouble == 0){
                System.out.println("Programmet avslutas!");
                break;
            }

            System.out.println("Write which operator you want to use: ");
            operator = scanner.next();

            if (operator.equals("+")) {
                System.out.println(math.add(numberOneDouble, numberTwoDouble));
            } else if (operator.equals("-")){
                System.out.println(math.subtract(numberOneDouble, numberTwoDouble));
            } else if (operator.equals("/")){
                System.out.println(math.division(numberOneDouble, numberTwoDouble));
            } else if (operator.equals("*")){
                System.out.println(math.multiply(numberOneDouble, numberTwoDouble));
            } else {
                System.out.println("Invalid, programmet avslutas!");
                break;
            }
        }
    }
}


