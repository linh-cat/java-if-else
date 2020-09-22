public class App {
    public static void main(String[] args) throws Exception {
        double value1 = 100.0d;
        double value2 = 0.0d;
        double result = 0.0d;
        String option = "e";
        if (option == "a")
            result = value1 + value2;
        else if (option == "s")
            result = value1 - value2;
        else if (option == "m")
            result = value1 * value2;
        else if (option == "d") {
            if (value2 != 0) {
                result = value1 / value2;
            }
        } else {
            System.out.println("Invalid option: " + option);
            result = 0.0d;

        }
        System.out.println(result);
    }
}
