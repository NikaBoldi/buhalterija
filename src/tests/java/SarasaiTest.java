import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SarasaiTest extends Sarasai {


    private Sarasai sarasai;
    private List <Preke> prekes;


    @Test
    public void tikrinaArGriztaSarasas () {

        prekes = sarasai.surandaPrekePagalKaina(60.0);
        Assert.assertEquals(60,prekes.indexOf(""));

    }
}
