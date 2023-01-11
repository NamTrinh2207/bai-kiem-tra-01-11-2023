public class Main {
    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("001", "sam sung", 5000, 1, 0);
        products[1] = new Product("002", "Xiaomi", 10000, 1, 2);
        products[2] = new Product("003", "Iphone", 15000, 1, 4);
        products[3] = new Product("004", "vSmart", 20000, 1, 6);
        products[4] = new Product("005", "Nokia", 25000, 1, 8);
        System.out.println("Danh sách sản phẩm : ");
        for (Product i : products
        ) {
            System.out.println(i);
        }
        System.out.println("Tổng tiền SP chưa có khuyến mãi : " + sum(products));
        System.out.println("Tổng tiền SP sau khuyến mãi : " + sale(products));
        System.out.println("Tổng tiền SP chênh lệch sau khuyến mãi : " + sumSale(products));
    }

    public static double sum(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.total();
        }
        return Math.round(sum);
    }

    public static double sale(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.sale();
        }
        return Math.round(sum);
    }

    public static double sumSale(Product[] arr) {
        double sum = 0;
        for (Product i : arr) {
            sum += i.total() - i.sale();
        }
        return Math.round(sum);
    }
}