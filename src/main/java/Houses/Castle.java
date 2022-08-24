package Houses;

import Houses.House;

public class Castle extends House {

    private int age;
    private String customMoat;
    private int wavierNumber;

    public Castle(String address, int cost, int salePrice){
        super(address,cost,salePrice);
    }

    public String addMoat(){
        return ("water moat added");
    }

    public String addMoat(String customMoat, int wavierNumber){
        return ("A "+ customMoat +" moat was added, your wavier number is " + wavierNumber + ".");
    }








}
