import org.junit.*;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private  static FizzBuzz fizzBuzz;

    @BeforeClass
    public static void beforeClass() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @AfterClass
    public static void afterClass() throws Exception {

    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void itShouldReturnFizz() {
        String result = fizzBuzz.build(9);
        // to test the return value
        Assert.assertEquals("Fizz" , result);
    }

    @Test
    public void itShouldReturnBuzz() {
        String result = fizzBuzz.build(20);
        Assert.assertEquals("Buzz" , result);
    }

    @Test
    public void itShouldReturnFizzBuzz() {
        String result = fizzBuzz.build(15);
        Assert.assertEquals("FizzBuzz" , result);
    }

    @Test
    public void itShouldReturnNumber() {
        String result = fizzBuzz.build(22);
        Assert.assertEquals("22" , result);
    }

    @Test
    public void itShouldReturnAurel() {
        String result = fizzBuzz.build(21);
        Assert.assertEquals("Aurel" , result);
    }


}