public class Product {
    private int code;
    private String name;
    private double price;
    private double amount;
    private double sale;

    public Product(int code, String name, double price, int amount, double sale) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.sale = sale;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    public double total(){
        return this.price* this.amount;
    }


    public double sale() {
        return (this.price-(this.price*this.sale/100))*this.amount;
    }


    @Override
    public String toString() {
        return
                        "mã SP :" + code +
                        ", ten SP :'" + name + '\'' +
                        ", giá SP :" + price +
                        ", số lượng :" + amount +
                        ", khuyến mãi :" + sale + " %";
    }
}
