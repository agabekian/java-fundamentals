/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test void testRollDice(){
        int test = 4;
        int goal = 4;
        Library sut = new Library();
        int res = ((sut.rollDice(test))).length;
        assertEquals(res,goal);
    }

    @Test void testContainsDuplicates(){
        Integer[] test1 = {1,2,1};
        int[] test2 = {1,2,3};
        Library sut = new Library();
        boolean t = true;
        boolean res = sut.containsDuplicates(test1);

        boolean res2 = sut.containsDuplicates2(test2);
//        assertEquals(res,true);
        assertFalse(res2, String.valueOf(t));
    }
    @Test void testCalcAvg(){
        int[] testarr = {22,33,44,55};
        Library sut = new Library();
        float expected = 38.5f;
        float res = sut.calculateAverage(testarr);
        assertEquals(res,expected);
    }

    @Test void testAssArrays(){
        int[][] weeklyTemps ={
                {100,110,120,130},
                {22,33,44,55},
                {33,44,55,66}
        };

        Library sut = new Library();
        float expected = 38.5f;
        float res = sut.arrayOfArrays(weeklyTemps);
        assertEquals(res,expected);
    }
}
