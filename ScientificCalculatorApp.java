//app entry point, Handles user interaction and orchestrates the flow of the program.

public class ScientificCalculatorApp{
    public static void main(String[] args){

            CommandlineInterface cli = new CommandlineInterface();
            cli.startInteractiveMode();
    }
}