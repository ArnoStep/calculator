public class Operation {
    private double _firstValue;
    private double _secondValue;

    Operation(double _firstValue, double _secondValue) {
        set_firstValue(_firstValue);
        set_secondValue(_secondValue);
    }

    public double get_firstValue() {
        return _firstValue;
    }

    public void set_firstValue(double _firstValue) {
        this._firstValue = _firstValue;
    }

    public double get_secondValue() {
        return _secondValue;
    }

    public void set_secondValue(double _secondValue) {
        this._secondValue = _secondValue;
    }

    public void execute() {
        System.out.println(get_firstValue() + " " + get_secondValue() + '\n');
    };
}
