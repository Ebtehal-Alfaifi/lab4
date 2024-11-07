public class Circal extends Shap{
    private double rad;

    Circal(){

    }

    public Circal(double rad) {
        this.rad = rad;
    }

    public void setRad(){
        this.rad=rad;
    }




    public double getRad(){

        return rad;
    }




    @Override
    public double calculateArea() {
        return  3.14*rad*rad;
    }

    @Override
    public double calculateCircumference() {
        return 2 * 3.14 * rad * rad;
    }
}
