public class App {
    public static void main(String[] args) throws Exception {
        double value1 = 100.0d;
        double value2 = 50.0d;
        double result = 0.0d;
        String option = "a";
        if (option == "a")
            result = value1 + value2;
        else if (option == "s")
            result = value1 - value2;
        else if (option == "m")
            result = value1 * value2;
        else if (option == "d")
            result = value1 / value2;
        else
            result = 0.0d;
        System.out.println(result);
    }
}
