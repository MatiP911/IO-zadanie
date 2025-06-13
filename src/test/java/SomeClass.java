import org.junit.Test;

public class SomeClass {
    @Test
    public void test1(){
        int value = 2;
        int value2 = 3;
        assert value + value2 == 5;
    }

    @Test
    public void test2(){
        int x = 1;
        int y = 3;
        assert y - x == 2;
    }

    @Test
    public void test3(){
        int x1 = 4;
        int y1 = 3;
        assert x1 * y1 == 12;
    }
        
    @Test
    public void test4(){
        assert (4/0)*0 == 0;
    }
}
