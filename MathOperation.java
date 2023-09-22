public class MathOperation {
    public static String mathFunction(int number1, int number2, int number3) {
        if (number1 + number2 == number3) {
            return "+";
        }
        if (number1 - number2 == number3) {
            return "-";
        }
        if (number1 * number2 == number3) {
            return "*";
        }
        if (number2 != 0 && number1 / number2 == number3) {
            return "/";
        }
        return "None";
    }
}

