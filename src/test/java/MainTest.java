import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest{

    @Test
    public void concatTest() {
        String result = "eugene " + "burdukov";
        assertEquals("eugene burdukov", result);
    }

    @Test
    public void additionTest() {
        int x = 10, y = 9, result;
        result = x + y;
        assertEquals(20, result);
    }

    @Test
    public void isAgeEqual(){
        Student student1 = new Student("eugene", 29);
        Student student2 = new Student("alex", 29);
        Assert.assertTrue(student1.age == student2.age);
    }

    @Test
    public void isNameEqual(){
        Student student1 = new Student("nikita", 31);
        Student student2 = new Student("nikita", 31);
        Assert.assertTrue(student1.name.equals(student2.name));
    }

    @Test
    public void areStudentsEqual(){
        Student student1 = new Student("nikita", 31);
        Student student2 = new Student("nikita", 31);
        Assert.assertTrue(student1.equals(student2));
    }

}
