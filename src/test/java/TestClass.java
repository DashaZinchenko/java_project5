import org.testng.Assert;
import org.testng.annotations.Test;
import utils.MyUtils;
import utils.MyDataProvider;
import org.testng.annotations.Ignore;

public class TestClass {
    @Test (dataProviderClass = MyDataProvider.class, expectedExceptions = Exception.class, dataProvider = "data")
    public void checkReversWord (String testString) {
        MyUtils.reverseWord(testString);
    }
    @Ignore

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void checkNull() {
        MyUtils.reverseWord(null);
    }
    @Test (expectedExceptions = RuntimeException.class)
    public void checkEmptyString(){
        MyUtils.reverseWord("");
            }
    @Test (expectedExceptions = RuntimeException.class)
    public void checkOneSimbolString(){
        MyUtils.reverseWord("#");
    }
    @Test (expectedExceptions = RuntimeException.class)
    public void checkSpaceString() {
        MyUtils.reverseWord(" ");
    }
    @Test

    public void checkReversString() {
    String stringTest = "123";
    String expectedString ="321";

        String actualString = MyUtils.reverseWord(stringTest);

        Assert.assertEquals(actualString, expectedString, "Актуальное не соответсвует ожидаемому");
    }
}
