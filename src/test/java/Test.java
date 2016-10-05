import static org.junit.Assert.assertEquals;

public class Test {

    SubString subString;

    @org.junit.Test
    public void testForLengthOfSubstring() {
        System.out.println("Check length of substring");
        String str = "asdfghds";
        String subStr = subString.findSubString(str);
        boolean strL = (str.length() > 0);
        boolean subStrL = (subStr.length() > 0);
        assertEquals("Length of substring should be longer then 0",
                strL, subStrL);
    }

    @org.junit.Test
    public void testForContains() {
        System.out.println("Check for string contains substring");
        String str = "asdfghds";
        String subStr = subString.findSubString(str);
        boolean result = str.contains(subStr);
        assertEquals("Length of substring should be longer then 0",
                true, result);
    }
}
