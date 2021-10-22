import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestCases
{
    @Test
    public void TemplateTestCase()
    {
        IndianResident indianResident=new IndianResident();
        indianResident.prepareDocuments();
        IndianResident indianResident1=new IndianResident();
        indianResident1.prepareDocuments();

        assertNotEquals(indianResident,indianResident1);

    }

    @Test
    public  void StrategyTestCase()
    {
        boolean result=OnlineVerification.isValidPassportNo("A22 18457");
        boolean result2=OnlineVerification.isValidPassportNo("A28457");
        assertEquals(result,true);

        assertEquals(result2,false);
    }
}
