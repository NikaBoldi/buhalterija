import org.junit.Assert;

public class SkenerisTest {

    public void tikrinaSkaicius (){

        Skeneris scan = new Skeneris();

        scan.tikrina(0);
        Assert.assertEquals("ivestas 0",0,0);
        scan.tikrina(1);
        Assert.assertEquals("ivestas 1",1,1);

    }
}
