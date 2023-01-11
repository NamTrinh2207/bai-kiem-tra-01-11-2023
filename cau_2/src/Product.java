public class Product {
    private String code;
    private String name;
    private double price;
    private int number;
    private double sale;


    public Product(String code, String name, double price, int number, double sale) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.number = number;
        this.sale = sale;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double total() {
        return this.price * this.number;
    }


    public double sale() {
        return (this.price - (this.price * this.sale / 100)) * this.number;
    }


    @Override
    public String toString() {
        return
                "mã SP :" + code +
                        ", tên SP :" + name +
                        ", giá SP :" + price +
                        ", số lượng :" + number +
                        ", khuyến mãi :" + sale + " %";
    }
}
