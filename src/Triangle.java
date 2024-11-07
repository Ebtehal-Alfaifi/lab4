public class Triangle extends Shap {

private double high;

private double base;
  Triangle(){

high=10;
base=5.5;

}

    public Triangle(double high, double base) {
        this.high = high;
        this.base = base;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5*base*high;
    }

    @Override
    public double calculateCircumference() {
        return base*3;
    }
}

