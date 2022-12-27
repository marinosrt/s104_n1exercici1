package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthTest {

    @Test
    void TwelvePositionsArray(){
        Month month = new Month();
        assertEquals(12, month.monthList.size());
    }

    @Test
    void ArrayIsNotNull(){
        Month month = new Month();
        assertNotNull(month);
    }

    @Test
    void AugustAtPlace(){
        Month month = new Month();
        assertEquals("August", month.monthList.get(7));
    }

}