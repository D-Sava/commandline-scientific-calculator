package src;
//Manages input and output for the command-line interface.
//Provides options for interactive or batch processing.
import java.util.Scanner;

public class CommandlineInterface {
    private final Calculator calculator;

    public CommandlineInterface(){
        this.calculator = new Calculator();
    }

    public void startInteractiveMode(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scientific calculator (type 'exit' to quit): ");

        while(true){
            System.out.print("> ");
            String input = scanner.nextLine();

            if(input.equalsIgnoreCase("exit"))
                break;

            try{
                double result = calculator.evaluate(input);//TODO create evalute method
                System.out.println("Result: " +result);

            } catch(CalculatorException e){
                System.out.println("Error: " +e.getMessage());//TODO create getMessage method
            }
        }
    }
}
