import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
    @Test
    public void test_problema_1 (){
        Problema1 problema1 = new Problema1();

        String[] strings = problema1.numeros();

        Assertions.assertEquals(20, strings.length );
    }
}
