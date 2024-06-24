import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        calculator();

    }

    public static void calculator() {
        Scanner sc = new Scanner(System.in);

        for (boolean i = true; i;) {
            boolean b = true;
            System.out.println("Enter a number:");
            int operand1 = sc.nextInt();
            int num = operand1;
            while (b) {

                System.out.println("Enter one of the following characters: '+'  '-'  '*'  '/'  's'  'C'");
                char operation = sc.next().charAt(0);
                if (operation == 's') {
                    b = false;
                    i = false;
                    break;
                } else if (operation == 'C') {
                    b = false;
                } else {
                    System.out.println("Enter a number:");
                    int operand2 = sc.nextInt();

                    switch (operation) {
                        case '+':
                            num += operand2;
                            System.out.println("--------->  " + num);
                            break;
                        case '-':
                            num -= operand2;
                            System.out.println("--------->  " + num);
                            break;
                        case '*':
                            num *= operand2;
                            System.out.println("--------->  " + num);
                            break;
                        case '/':
                            num /= operand2;
                            System.out.println("--------->  " + num);
                            break;
                        default:
                            System.out.println("You entered the wrong character");
                    }
                }
            }
        }
    }
}