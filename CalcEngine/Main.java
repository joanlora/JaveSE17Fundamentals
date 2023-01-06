package CalcEngine;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        double value1 = 100.0d;
        double value2 = 0.0d;
        char opCode = 'd';
        double result = 0.0d;

        if (opCode == 'a') {
            result = value1 + value2;
        } else if (opCode == 's') {
            result = value1 - value2;
        } else if (opCode == 'm') {
            result = value1 * value2;
        } else if (opCode == 'd') {
            if (value2 != 0){
                result = value1 / value2;
            }

        } else {
            System.out.println("Invalid opCode: " + opCode);
            result = 0.0d;
        }
            System.out.println(result);

    }
}