public class Main {
    public static void main(String[] args) {
        Product samSung = new Product(1, "sam sung", 50000, 1, 0.0);
        Product xiaomi = new Product(2, "xiaomi", 150000, 1, 0.01);
        Product iphone = new Product(3, "iphone", 250000, 1, 0.02);
        Product vSmart = new Product(4, "vSmart", 350000, 1, 0.03);
        Product nokia = new Product(5, "nokia", 450000, 1, 0.04);

        double[][] arr = {
                {samSung.sale(),samSung.totalSale()},
                {xiaomi.sale(),xiaomi.totalSale()},
                {iphone.sale(), iphone.totalSale()},
                {vSmart.sale(), vSmart.totalSale()},
                {nokia.sale(), nokia.totalSale()}
        };
        System.out.println("Tổng tiền sau khuyến mãi : "+sum(arr));
        System.out.println(sumSale(arr));

    }
    public static double sum(double[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i][0];
        }
        return sum;
    }

    public static double sumSale(double[][] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum= arr[0][i];
        }
        return sum;
    }
}