public class Main {
    public static void main(String[] args) {
        Trapezoid trapezoidOne = new Trapezoid(5, 10, 5, 5, 10);
        System.out.println("Hình thang 1 :" + trapezoidOne);
        Trapezoid trapezoidTwo = new Trapezoid(7, 15, 5, 5, 10);
        System.out.println("Hình thang 2 :" + trapezoidTwo);

        double areaOne = trapezoidOne.getArea();
        double areaTwo = trapezoidTwo.getArea();
        if (areaOne > areaTwo) {
            System.out.println("diện tích hình thang 1 > diện tích hình thang 2");
        } else {
            System.out.println("diện tích hình thang 1 < diện tích hình thang 2");
        }

        double perimeterOne = trapezoidOne.getPerimeter();
        double perimeterTwo = trapezoidTwo.getPerimeter();
        if (perimeterOne > perimeterTwo) {
            System.out.println("chu vi hình thang 1 > chu vi hình thang 2");
        } else {
            System.out.println("chu vi hình thang 1 < chu vi hình thang 2");
        }
    }
}