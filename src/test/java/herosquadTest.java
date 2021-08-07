import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class herosquadTest {

    @Test
    public void runherosquad_addHeroName_ArrayList(){
        herosquad testherosquad = new herosquad();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add("name");
        assertEquals(expectedOutput, testherosquad.runherosquad("name"));


    }
}