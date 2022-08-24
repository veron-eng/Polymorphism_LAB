package Houses;

public abstract class House {

    private String address;
    private int cost;
    private int salePrice;

    public House(String address, int cost, int salePrice){
        this.address = address;
        this.cost = cost;
        this.salePrice = salePrice;
    }

    public String getAddress(){
        return address;
    }

    public int getCost(){
        return cost;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public int calculateCommission(){
        return (cost - salePrice);
    }


}
