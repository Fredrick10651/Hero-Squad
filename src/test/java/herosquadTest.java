import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class herosquadTest {

    @Test
    public void runherosquad_inputHeroName_String(){
        herosquad testherosquad = new herosquad();
        String expectedOutput = new String();
        expectedOutput = "name";
        assertEquals(expectedOutput, testherosquad.inputherosquad("name"));
    }

    @Test
    public void runherosquad_addSpecialPowers_String(){
        herosquad testherosquad = new herosquad();
        String expectedOutput = new String();
        expectedOutput = "special powers";
        assertEquals(expectedOutput, testherosquad.addherosquad("special powers"));

    }

    @Test




}
