import org.junit.Assert;
import org.junit.Test;

public class MainTest extends Main{

    @Test
    public void firstTest(){
        Student student1 = new Student("eugene", 29);
        Student student2 = new Student("alex", 29);

        Assert.assertTrue(student1.age == student2.age);

    }

}
