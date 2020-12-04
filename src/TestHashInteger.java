import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class TestHashInteger{

    HashInteger hashInteger = new HashInteger();

    @Before
    public void before() {
//        HashInteger hashInteger1 = new HashInteger();
        hashInteger.insert("7");
        hashInteger.insert("5");
    }

    @Test
    public void insertCorrect(){
//        HashInteger hashInteger = new HashInteger();
        int number = 5;
        hashInteger.insert("5");
        int result = 14;
        for (int j =0; j<13; j++) {
            for (int i : hashInteger.array[j]){
                if (i == number % 13) {
                    result = j;
                }
            }
        }
        Assert.assertEquals(5, result);
    }

    @Test
    public void deleteCorrect(){
        String result = hashInteger.delete("5");
        Assert.assertEquals("Число удалено", result);
    }

    @Test
    public void findCorrect(){
        String result = hashInteger.find("7");
        Assert.assertEquals("Число найдено", result);
    }

    @Test
    public void bigNumberCorrect(){
//        HashInteger hashInteger = new HashInteger();
        int number = 21;
        hashInteger.insert("21");
        int result = 14;
        for (int j =0; j<13; j++) {
            for (int i : hashInteger.array[j]){
                if (i == number) {
                    result = j;
                }
            }
        }
        Assert.assertEquals(8, result);
    }

    @Test(expected = NumberFormatException.class)
    public void argumentIsNumber() {
        hashInteger.insert("qwerty");
    }

    @Test
    public void numberToFindExists(){
        boolean thrown = false;
        try {
            hashInteger.find("54");
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }

    @Test
    public void numberToDeleteExists(){
        boolean thrown = false;
        try {
            hashInteger.delete("65");
        } catch (IllegalArgumentException e) {
            thrown = true;
        }
        Assert.assertTrue(thrown);
    }
}
