public class Rectangle extends Shap {
    private double width;
    private double high;


    Rectangle() {
width=10;
high=20;
    }

    public Rectangle(double width, double high) {
        this.width = width;
        this.high = high;
    }



    public double setWidth(double width) {
        this.width = width;
        return width;
    }

    public double sethigh() {
        this.high = high;
        return high;
    }


    public double getWidth() {

        return width;
    }

    public double getHigh() {

        return high;
    }




    @Override
    public double calculateArea() {
        return high* width;
    }

    @Override
    public double calculateCircumference() {
        return  (width+high)*2;
    }
}


