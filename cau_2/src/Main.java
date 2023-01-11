public class Main {
    public static void main(String[] args) {
        Product samSung = new Product(1, "sam sung", 50000, 1, 0.0);
        Product xiaomi = new Product(2, "xiaomi", 150000, 1, 0.1);
        Product iphone = new Product(3, "iphone", 250000, 1, 0.2);
        Product vSmart = new Product(4, "vSmart", 350000, 1, 0.3);
        Product nokia = new Product(5, "nokia", 450000, 1, 0.4);

        double[][] arr = {
                {samSung.sale(), samSung.total()},
                {xiaomi.sale(), xiaomi.total()},
                {iphone.sale(), iphone.total()},
                {vSmart.sale(), vSmart.total()},
                {nokia.sale(), nokia.total()}
        };
        System.out.println("Tổng tiền sau khuyến mãi : " + sum(arr));
        System.out.println("Tổng tiền chênh lệnh sau khi khuyến mãi: "+sumSale(arr));

    }

    public static double sum(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][0];
        }
        return sum;
    }

    public static double sumSale(double[][] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][1] - arr[i][0];
        }
        return sum;
    }
}