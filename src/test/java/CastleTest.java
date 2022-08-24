import Houses.Castle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CastleTest {

    private Castle castle;


    @BeforeEach
    public void setUp(){
        castle = new Castle("big castle road", 10000, 50);
    }

    @Test
    public void getAddress(){
        String expected = "big castle road";
        String actual = castle.getAddress();
        assertEquals(expected,actual);
    }

    @Test
    public void getCost(){
        assertEquals(castle.getCost(),10000);
    }

    @Test
    public void calculateCommission(){
        assertEquals(castle.calculateCommission(),9950);
    }



}
