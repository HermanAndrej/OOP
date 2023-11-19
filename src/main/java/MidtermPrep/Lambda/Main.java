package MidtermPrep.Lambda;

public class Main {
    public static void main(String[] args) {
        Calculator calc = (x, y) -> x+y;
        int result = calc.sum(5,6);
        System.out.println(result);

        Operation add = (x, y) -> x + y;
        Operation substract = (x, y) -> x - y;

        System.out.println("2 + 4 is " + operate(2, 4, add));

    }

    static int operate(int a, int b, Operation object){
        return object.operation(a, b);
    }
}
