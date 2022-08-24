package EstateAgents;

import Houses.House;

import java.util.ArrayList;

public class EstateAgent {


    private String name;
    private ArrayList<House> houses;

    public EstateAgent(String name) {
        this.name = name;
        this.houses = new ArrayList<>();
    }


    public String getName(){
        return this.name;
    }

    public ArrayList<House> getHouses(){
        return houses;
    }

    public void setHouses(ArrayList<House> houses){
        this.houses = houses;
    }

    public void addHouses(House house){
        this.houses.add(house);
    }

    public int countHouses(){
        return this.houses.size();
    }


}
