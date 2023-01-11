public class Trapezoid {
    public double smallBottomEdge;
    public double bigBottomEdge;
    public double sideOne;
    public double sideTwo;
    public double height;

    public Trapezoid(double canhDayNho, double canhDayLon, double canhBen1, double canhBen2, double height) {
        this.smallBottomEdge = canhDayNho;
        this.bigBottomEdge = canhDayLon;
        this.sideOne = canhBen1;
        this.sideTwo = canhBen2;
        this.height = height;
    }

    public double getPerimeter() {
        return this.smallBottomEdge + this.bigBottomEdge + this.sideOne + this.sideTwo;
    }

    public double getArea() {
        return height * (smallBottomEdge + bigBottomEdge) / 2;
    }

    @Override
    public String toString() {
        return
                "cạnh đáy nhỏ = " + smallBottomEdge +
                        ", cạnh đáy lớn = " + bigBottomEdge +
                        ", cạnh bên 1 = " + sideOne +
                        ", cạnh bên 2 = " + sideTwo +
                        ", chiều cao = " + height
                ;
    }
}
