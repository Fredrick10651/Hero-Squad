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
    public void runherosquad_includeWeaknesses_String(){
        herosquad testherosquad = new herosquad();
        String expectedOutput = new String();
        expectedOutput = "weaknesses";
        assertEquals(expectedOutput, testherosquad.includeherosquad("weaknesses"));
    }

    @Test
    public void runherosquad_enterAge_Integer(){
        herosquad testherosquad =new herosquad();
        Integer expectedOutput = new Integer(12);
        expectedOutput = 12;
        assertEquals(expectedOutput, testherosquad.enterherosquad(12));
    }

    @Test
    public void runherosquad_maxSquadSize_Interger(){
        herosquad testherosquad = new herosquad();
        Integer expectedOutput = new Integer(4);
        expectedOutput = 4;
        assertEquals(expectedOutput, testherosquad.maxherosquad(4));

    }




}
