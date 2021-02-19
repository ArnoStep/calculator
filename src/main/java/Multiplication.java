public class Multiplication extends Operation{
    Multiplication(double _firstValue, double _secondValue) {
        super(_firstValue, _secondValue);
    }

    @Override
    public void execute() {
        System.out.println("Result: " + (get_firstValue() * get_secondValue()));
    }
}
