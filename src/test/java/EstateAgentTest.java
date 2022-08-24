import EstateAgents.EstateAgent;
import Houses.Apartment;
import Houses.Castle;
import Houses.DetachedHome;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstateAgentTest {

    private EstateAgent estateAgent;

    @BeforeEach
    public void setUp(){
        estateAgent = new EstateAgent("john");
    }

    @Test
    public void canCountHouses(){
        assertEquals(0, estateAgent.countHouses());
    }

    @Test
    public void canAddHouse(){
        Castle castle = new Castle("new castle road",200,300);
        estateAgent.addHouses(castle);
        assertEquals(1, estateAgent.countHouses());
    }

    @Test
    public void canAddMultipleHouses(){
        DetachedHome detachedHome = new DetachedHome("new detached home road", 10000,120000);
        Apartment apartment = new Apartment("new apartment block", 500, 600);
        estateAgent.addHouses(detachedHome);
        estateAgent.addHouses(apartment);
        assertEquals(2, estateAgent.countHouses());
    }

    @Test
    public void canAddMoat(){
        Castle castle = new Castle("new castle road",200,300);
        assertEquals(castle.addMoat(),"water moat added");
    }

    @Test
    public  void canAddCustomMoat(){
        Castle castle = new Castle("new castle road",200,300);
        assertEquals(castle.addMoat("Fire and Acid",4),"A Fire and Acid moat was added, your wavier number is 4.");
    }




}
