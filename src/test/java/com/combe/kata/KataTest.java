package com.combe.kata;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class KataTest {

    @Test
    public void commandTest() throws Exception {
        ///// First iteration : test coffee
        Coffe c = new Coffe(1, false);
        String answer1 = CommandServicee.command(c,1);
        //assert
        assertEquals("the coffee machine should return 1 coffee with 1 sugar with 1 Stirrer","C:1:0",answer1);

        /////// Second iteration : test juice with low amount
        Juice j = new Juice();
        String answer2 = CommandServicee.command(j,0.1);
        //assert
        assertEquals("the coffee machine should refuse low amount","M: you need to add 0.5 euro",answer2);

        ///// Third iteration : test hot tea
        Tea t = new Tea(0, true);
        String answer3 = CommandServicee.command(t,1);
        //assert
        assertEquals("the coffee machine should return 1  hot tea  without sugar and without Stirrer","Th::",answer3);

        ///// Fourth  iteration : get report
        Report.printReport();

        ///// Fifth iteration : shortage
        //arrange
        Chocolate h = new Chocolate(2,false);
        BeverageQuantityChecker beverageQuantityChecker = Mockito.mock(BeverageQuantityChecker.class);
        Mockito.when(beverageQuantityChecker.isEmpty(h.getType())).thenReturn(true);

        //action
        CommandServicee.empty = beverageQuantityChecker.isEmpty(h.getType());
        String answer4 = CommandServicee.command(h,5);
        //assert
        assertEquals("The coffee machine can not deliver the drink because of shortage",answer4);
    }
}
