import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getAuthor();
        int int14 = book5.getBookID();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        int int20 = book5.getBookID();
        book5.setStatus("");
        int int23 = book5.getBookID();
        book5.setBookID((int) ' ');
        java.lang.String str26 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str17 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str20 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        int int19 = book5.getBookID();
        book5.setBookID(52);
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        book5.setTitle("");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((int) ' ');
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("");
        book5.setStatus("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) 10);
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getAuthor();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        book5.setBookID((int) '#');
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str18 = book5.getStatus();
        java.lang.String str19 = book5.getTitle();
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        int int20 = book5.getBookID();
        book5.setStatus("");
        int int23 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        java.lang.String str28 = book5.getGenre();
        int int29 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        book5.setTitle("");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setTitle("");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getAuthor();
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setGenre("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setAuthor("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        int int12 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        java.lang.String str19 = book5.getGenre();
        book5.setBookID((int) (byte) 0);
        java.lang.String str22 = book5.getTitle();
        int int23 = book5.getBookID();
        java.lang.String str24 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID(10);
        book5.setGenre("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        book5.setStatus("hi!");
        int int18 = book5.getBookID();
        java.lang.String str19 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        Book book5 = new Book((int) '4', "", "", "", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        Book book5 = new Book((int) '4', "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setGenre("");
        book5.setAuthor("hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        int int18 = book5.getBookID();
        book5.setBookID((int) '4');
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setAuthor("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        book5.setAuthor("");
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setBookID(100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getAuthor();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        Book book5 = new Book((int) (byte) 100, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getStatus();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setGenre("");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        int int20 = book5.getBookID();
        book5.setStatus("");
        int int23 = book5.getBookID();
        book5.setBookID((int) ' ');
        int int26 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("");
        java.lang.String str16 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        Book book5 = new Book((int) (byte) 10, "", "hi!", "hi!", "");
        book5.setAuthor("");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        book5.setTitle("hi!");
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getTitle();
        book5.setStatus("hi!");
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getAuthor();
        book5.setBookID(97);
        java.lang.String str18 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        book5.setAuthor("");
        book5.setGenre("hi!");
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getGenre();
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        Book book5 = new Book((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID(0);
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str22 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        Book book5 = new Book((int) (byte) -1, "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        Book book5 = new Book((int) (byte) 10, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        book5.setGenre("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 1);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getAuthor();
        book5.setStatus("hi!");
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        Book book5 = new Book((int) 'a', "", "", "hi!", "hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        Book book5 = new Book((int) 'a', "hi!", "", "", "hi!");
        book5.setAuthor("hi!");
        int int8 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setTitle("");
        int int16 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str19 = book5.getAuthor();
        book5.setStatus("");
        book5.setTitle("");
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        Book book5 = new Book((int) '#', "", "", "hi!", "hi!");
        book5.setTitle("hi!");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        book5.setBookID(0);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        int int19 = book5.getBookID();
        book5.setBookID(52);
        book5.setTitle("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        Book book5 = new Book((int) (byte) 0, "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        Book book5 = new Book(100, "", "hi!", "", "");
        book5.setStatus("");
        book5.setGenre("");
        book5.setTitle("");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str14 = book5.getAuthor();
        book5.setBookID(100);
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setBookID((int) 'a');
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        Book book5 = new Book((int) (short) 100, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        Book book5 = new Book(97, "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setBookID((int) '4');
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        Book book5 = new Book((int) (short) 100, "", "", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str11 = book5.getStatus();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str19 = book5.getGenre();
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getStatus();
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setStatus("");
        book5.setGenre("");
        book5.setTitle("");
        book5.setGenre("hi!");
        book5.setStatus("");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setBookID(32);
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        Book book5 = new Book((int) (short) 100, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getAuthor();
        java.lang.String str16 = book5.getGenre();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        int int13 = book5.getBookID();
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        Book book5 = new Book(32, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        Book book5 = new Book((int) (short) 10, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str19 = book5.getGenre();
        int int20 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getStatus();
        book5.setGenre("");
        book5.setStatus("");
        book5.setBookID(1);
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) -1);
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 10);
        book5.setTitle("");
        book5.setGenre("");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getAuthor();
        book5.setGenre("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        Book book5 = new Book((int) ' ', "hi!", "hi!", "", "");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        Book book5 = new Book(100, "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setTitle("");
        java.lang.String str15 = book5.getStatus();
        int int16 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setBookID(1);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        Book book5 = new Book((int) 'a', "", "", "hi!", "");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setBookID((int) (short) 100);
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getAuthor();
        int int16 = book5.getBookID();
        book5.setGenre("");
        book5.setAuthor("");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        int int15 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        book5.setTitle("");
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        Book book5 = new Book((int) '#', "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str16 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str17 = book5.getTitle();
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getTitle();
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setBookID((-1));
        book5.setBookID((int) ' ');
        java.lang.String str24 = book5.getAuthor();
        java.lang.String str25 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        int int15 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        Book book5 = new Book((-1), "", "", "", "hi!");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        Book book5 = new Book((int) (byte) 100, "", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        book5.setAuthor("");
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setGenre("");
        java.lang.String str16 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str21 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(52);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        Book book5 = new Book((int) (short) -1, "", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setAuthor("");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        book5.setTitle("");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((-1));
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        Book book5 = new Book(97, "hi!", "", "", "");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        book5.setAuthor("");
        book5.setTitle("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setBookID((int) ' ');
        book5.setBookID(0);
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("hi!");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getGenre();
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        Book book5 = new Book((-1), "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        book5.setBookID((int) '#');
        java.lang.String str21 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        Book book5 = new Book(97, "", "", "", "hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getGenre();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        int int13 = book5.getBookID();
        book5.setBookID(1);
        book5.setBookID(32);
        java.lang.String str18 = book5.getTitle();
        book5.setBookID(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        book5.setTitle("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        Book book5 = new Book((int) (byte) 0, "", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getGenre();
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setStatus("");
        book5.setBookID(0);
        int int22 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        Book book5 = new Book(1, "", "", "hi!", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "hi!");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        Book book5 = new Book(32, "hi!", "", "", "hi!");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setAuthor("hi!");
        int int13 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getAuthor();
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        Book book5 = new Book(10, "hi!", "hi!", "", "");
        book5.setStatus("hi!");
        book5.setAuthor("");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getTitle();
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        Book book5 = new Book((int) (byte) 100, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("hi!");
        book5.setStatus("");
        int int20 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str19 = book5.getGenre();
        java.lang.String str20 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setBookID(1);
        java.lang.String str25 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getAuthor();
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        Book book5 = new Book(52, "hi!", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        Book book5 = new Book(0, "", "", "hi!", "");
        book5.setBookID((int) '4');
        book5.setBookID(97);
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 10);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str21 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        book5.setBookID(0);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getTitle();
        java.lang.String str21 = book5.getGenre();
        book5.setBookID((int) (short) 10);
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        int int15 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        Book book5 = new Book((int) (byte) 0, "", "", "", "hi!");
        book5.setBookID(0);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setGenre("");
        int int9 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getAuthor();
        book5.setBookID(97);
        book5.setTitle("hi!");
        int int20 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("");
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setStatus("");
        book5.setGenre("");
        book5.setTitle("");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        book5.setGenre("");
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(52);
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        Book book5 = new Book((-1), "", "", "", "hi!");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str17 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        Book book5 = new Book(100, "", "hi!", "", "");
        book5.setStatus("");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str19 = book5.getAuthor();
        int int20 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        Book book5 = new Book((int) (byte) 100, "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        book5.setBookID(10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setBookID((int) '4');
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        book5.setBookID(97);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        Book book5 = new Book(10, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setStatus("");
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID((int) '4');
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getGenre();
        book5.setStatus("");
        book5.setStatus("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str22 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("");
        java.lang.String str14 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        int int13 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getTitle();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str19 = book5.getGenre();
        java.lang.String str20 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setBookID(1);
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setAuthor("");
        book5.setBookID(1);
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setStatus("");
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 0);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        Book book5 = new Book((int) (byte) 10, "", "", "", "");
        book5.setStatus("hi!");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getTitle();
        book5.setBookID((int) (byte) -1);
        java.lang.String str21 = book5.getTitle();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setBookID(0);
        book5.setGenre("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("");
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        int int11 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        Book book5 = new Book(35, "hi!", "", "", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        Book book5 = new Book(100, "hi!", "hi!", "", "hi!");
        book5.setGenre("");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        int int15 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (short) 1);
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setStatus("hi!");
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        Book book5 = new Book((int) (short) 100, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setStatus("");
        book5.setStatus("hi!");
        java.lang.String str22 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setAuthor("");
        book5.setBookID(100);
        java.lang.String str20 = book5.getAuthor();
        java.lang.String str21 = book5.getGenre();
        int int22 = book5.getBookID();
        java.lang.String str23 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        book5.setBookID((int) (short) 10);
        java.lang.String str18 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        Book book5 = new Book(1, "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("");
        book5.setBookID((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setStatus("hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        Book book5 = new Book(0, "hi!", "hi!", "hi!", "hi!");
        book5.setTitle("");
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        Book book5 = new Book((int) '4', "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        Book book5 = new Book(97, "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        int int21 = book5.getBookID();
        book5.setBookID((int) (short) -1);
        java.lang.Class<?> wildcardClass24 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("");
        book5.setGenre("hi!");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        book5.setAuthor("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) -1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        Book book5 = new Book(97, "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setBookID((int) '4');
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        Book book5 = new Book(32, "hi!", "hi!", "", "hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        java.lang.String str15 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getAuthor();
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setGenre("");
        java.lang.String str21 = book5.getStatus();
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (short) 10);
        int int14 = book5.getBookID();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        Book book5 = new Book(10, "", "hi!", "", "hi!");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getGenre();
        book5.setAuthor("");
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("");
        book5.setAuthor("");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setBookID((int) (short) 100);
        book5.setBookID((int) (byte) 1);
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        Book book5 = new Book((int) (short) -1, "", "", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        book5.setBookID((int) (short) 10);
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setGenre("");
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (short) 0);
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        int int19 = book5.getBookID();
        book5.setBookID(52);
        java.lang.String str22 = book5.getStatus();
        java.lang.Class<?> wildcardClass23 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        java.lang.String str16 = book5.getGenre();
        book5.setBookID(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        int int20 = book5.getBookID();
        book5.setBookID((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str21 = book5.getStatus();
        java.lang.String str22 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        Book book5 = new Book((int) (short) 100, "", "", "hi!", "");
        book5.setAuthor("");
        book5.setAuthor("");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(52);
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "", "");
        book5.setStatus("hi!");
        int int8 = book5.getBookID();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        int int12 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        Book book5 = new Book((int) (short) 10, "", "", "hi!", "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        Book book5 = new Book((-1), "", "", "hi!", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(52);
        book5.setTitle("");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((int) (short) 100);
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getGenre();
        book5.setBookID((int) '4');
        java.lang.String str23 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        int int20 = book5.getBookID();
        book5.setStatus("");
        int int23 = book5.getBookID();
        java.lang.String str24 = book5.getGenre();
        java.lang.String str25 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setStatus("");
        book5.setStatus("hi!");
        int int22 = book5.getBookID();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass25 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getTitle();
        book5.setTitle("");
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getStatus();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        java.lang.String str17 = book5.getAuthor();
        book5.setAuthor("");
        int int20 = book5.getBookID();
        int int21 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str24 = book5.getGenre();
        java.lang.Class<?> wildcardClass25 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        int int9 = book5.getBookID();
        book5.setAuthor("hi!");
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int12 = book5.getBookID();
        book5.setAuthor("");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        book5.setBookID(1);
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str25 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("");
        book5.setBookID(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setBookID((int) '#');
        int int8 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        Book book5 = new Book(52, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getStatus();
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) 10);
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setTitle("");
        int int16 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str19 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str22 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setGenre("");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        book5.setGenre("");
        book5.setStatus("");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str20 = book5.getAuthor();
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        Book book5 = new Book((int) ' ', "hi!", "hi!", "", "hi!");
        book5.setBookID((int) '#');
        book5.setTitle("hi!");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (short) 10);
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        Book book5 = new Book(1, "", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getAuthor();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("");
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        Book book5 = new Book((int) ' ', "", "", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        Book book5 = new Book((int) (byte) 100, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setBookID(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        Book book5 = new Book(1, "hi!", "", "", "");
        book5.setGenre("hi!");
        book5.setAuthor("");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setTitle("");
        int int16 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setBookID(52);
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str21 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        int int13 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("hi!");
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        Book book5 = new Book(0, "", "hi!", "hi!", "hi!");
        book5.setBookID(0);
        book5.setBookID(100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        Book book5 = new Book((-1), "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        int int7 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID(10);
        book5.setStatus("");
        java.lang.String str18 = book5.getStatus();
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setTitle("");
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getStatus();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        Book book5 = new Book(1, "", "", "hi!", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setTitle("hi!");
        int int17 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        book5.setBookID(1);
        java.lang.String str21 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setTitle("");
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("");
        book5.setGenre("hi!");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setBookID(10);
        int int8 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        Book book5 = new Book(97, "", "", "", "hi!");
        book5.setGenre("");
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str12 = book5.getGenre();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        int int13 = book5.getBookID();
        book5.setBookID(1);
        book5.setBookID(32);
        java.lang.String str18 = book5.getTitle();
        java.lang.String str19 = book5.getAuthor();
        book5.setTitle("hi!");
        int int22 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        book5.setStatus("hi!");
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getStatus();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        int int16 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setGenre("");
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getGenre();
        book5.setBookID((int) (short) 100);
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        Book book5 = new Book((-1), "", "", "hi!", "");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getAuthor();
        book5.setGenre("");
        java.lang.String str12 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        int int11 = book5.getBookID();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        int int13 = book5.getBookID();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        int int19 = book5.getBookID();
        java.lang.String str20 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setBookID(10);
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setBookID(32);
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setBookID(10);
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        Book book5 = new Book((int) (short) 0, "hi!", "", "hi!", "hi!");
        book5.setAuthor("");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) ' ');
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getTitle();
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str11 = book5.getAuthor();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str21 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        Book book5 = new Book(52, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("hi!");
        book5.setStatus("");
        int int11 = book5.getBookID();
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        book5.setTitle("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setBookID(10);
        int int14 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("");
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) -1);
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (short) 10);
        int int14 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setBookID((int) 'a');
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }
}

