import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        Book book5 = new Book((-1), "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        book5.setStatus("");
        java.lang.String str15 = book5.getGenre();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        book5.setBookID((int) 'a');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        Book book5 = new Book(100, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setGenre("");
        book5.setStatus("hi!");
        book5.setStatus("");
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        Book book5 = new Book((int) (short) 10, "", "", "", "");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        Book book5 = new Book(52, "", "hi!", "", "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getStatus();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setBookID(1);
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        Book book5 = new Book(10, "hi!", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getStatus();
        int int16 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str19 = book5.getTitle();
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "hi!", "");
        book5.setStatus("");
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setStatus("");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("");
        book5.setStatus("");
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("");
        book5.setBookID((int) (short) 1);
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID(0);
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getTitle();
        book5.setBookID((int) ' ');
        int int20 = book5.getBookID();
        java.lang.String str21 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        Book book5 = new Book((int) ' ', "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        Book book5 = new Book((int) (byte) 1, "", "hi!", "", "");
        int int6 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        Book book5 = new Book((int) 'a', "", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setBookID(32);
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getAuthor();
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getStatus();
        book5.setStatus("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        book5.setBookID((int) (byte) 10);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setAuthor("");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 100);
        java.lang.String str15 = book5.getAuthor();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getTitle();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        Book book5 = new Book((-1), "", "", "", "hi!");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("");
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getStatus();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        book5.setStatus("");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("");
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        book5.setBookID(32);
        java.lang.String str18 = book5.getTitle();
        book5.setAuthor("");
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        java.lang.String str20 = book5.getGenre();
        book5.setStatus("hi!");
        int int23 = book5.getBookID();
        book5.setBookID(10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        Book book5 = new Book((int) (short) 100, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getStatus();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        int int15 = book5.getBookID();
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setStatus("");
        book5.setAuthor("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        Book book5 = new Book(0, "hi!", "hi!", "", "");
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setBookID((int) '#');
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
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
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        int int9 = book5.getBookID();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        Book book5 = new Book((int) (short) 10, "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        book5.setTitle("");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        Book book5 = new Book((int) (short) 10, "", "hi!", "hi!", "hi!");
        int int6 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        book5.setTitle("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getTitle();
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setTitle("");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        int int18 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
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
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        Book book5 = new Book(32, "", "", "", "hi!");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        Book book5 = new Book((int) '4', "", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        java.lang.String str13 = book5.getTitle();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
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
        java.lang.String str21 = book5.getStatus();
        book5.setAuthor("hi!");
        java.lang.String str24 = book5.getStatus();
        java.lang.String str25 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        Book book5 = new Book((int) (byte) 10, "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setBookID(32);
        java.lang.String str14 = book5.getGenre();
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        book5.setTitle("");
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        Book book5 = new Book((int) 'a', "", "hi!", "", "hi!");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        Book book5 = new Book((int) (short) 1, "", "hi!", "", "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        Book book5 = new Book(0, "", "", "hi!", "");
        book5.setStatus("");
        int int8 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        Book book5 = new Book((int) (short) -1, "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setBookID(52);
        book5.setAuthor("hi!");
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setGenre("");
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getTitle();
        book5.setBookID(52);
        book5.setBookID((-1));
        java.lang.Class<?> wildcardClass22 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str13 = book5.getStatus();
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((int) '#');
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        Book book5 = new Book((int) (short) -1, "hi!", "", "", "hi!");
        book5.setStatus("");
        int int8 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        Book book5 = new Book(1, "hi!", "", "", "");
        book5.setTitle("hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        Book book5 = new Book((int) (short) 0, "", "hi!", "hi!", "hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
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
        book5.setAuthor("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        Book book5 = new Book((int) (short) 1, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        Book book5 = new Book((int) 'a', "", "hi!", "", "hi!");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setBookID(1);
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setGenre("hi!");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        Book book5 = new Book((int) (short) 0, "", "hi!", "hi!", "hi!");
        book5.setGenre("");
        book5.setTitle("");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "");
        book5.setBookID(32);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setBookID((int) '4');
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((int) '#');
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setTitle("");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        java.lang.String str17 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("");
        book5.setGenre("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getStatus();
        java.lang.String str20 = book5.getTitle();
        book5.setStatus("");
        book5.setStatus("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
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
        book5.setAuthor("hi!");
        book5.setBookID(100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(0);
        java.lang.String str25 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        Book book5 = new Book(1, "", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        Book book5 = new Book((int) (byte) 10, "", "hi!", "", "");
        book5.setAuthor("");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID(10);
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setStatus("hi!");
        book5.setBookID((int) ' ');
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        Book book5 = new Book(1, "", "", "hi!", "hi!");
        book5.setBookID((int) (byte) 10);
        book5.setGenre("hi!");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        book5.setBookID((int) (byte) 10);
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str19 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setTitle("");
        java.lang.String str18 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
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
        java.lang.String str23 = book5.getStatus();
        java.lang.String str24 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
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
        book5.setAuthor("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        int int21 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
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
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        Book book5 = new Book(10, "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        Book book5 = new Book(1, "hi!", "hi!", "", "");
        book5.setGenre("");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        int int15 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) 0);
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getStatus();
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        Book book5 = new Book(0, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getTitle();
        int int8 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
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
        java.lang.String str19 = book5.getAuthor();
        book5.setBookID(35);
        java.lang.String str22 = book5.getTitle();
        book5.setBookID((int) (byte) 1);
        java.lang.String str25 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str28 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        Book book5 = new Book((int) ' ', "hi!", "", "", "");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str15 = book5.getGenre();
        book5.setBookID((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        book5.setStatus("hi!");
        int int18 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        Book book5 = new Book((int) 'a', "", "hi!", "", "hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("");
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getGenre();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        java.lang.String str19 = book5.getAuthor();
        book5.setAuthor("");
        int int22 = book5.getBookID();
        java.lang.String str23 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(32);
        book5.setAuthor("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.String str21 = book5.getStatus();
        java.lang.String str22 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str15 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str18 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getStatus();
        book5.setBookID((int) (short) 1);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        int int10 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str14 = book5.getStatus();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        int int8 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setTitle("");
        int int16 = book5.getBookID();
        book5.setGenre("");
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        book5.setTitle("hi!");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        book5.setGenre("");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setGenre("hi!");
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        book5.setBookID(1);
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setGenre("");
        int int17 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str21 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setGenre("hi!");
        book5.setTitle("hi!");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        book5.setBookID((int) (short) 10);
        book5.setGenre("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        Book book5 = new Book((int) 'a', "", "hi!", "", "hi!");
        book5.setTitle("");
        book5.setAuthor("");
        int int10 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        int int9 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getAuthor();
        int int16 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        Book book5 = new Book((int) (byte) 1, "", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        int int17 = book5.getBookID();
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setStatus("");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setStatus("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getGenre();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getGenre();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        book5.setAuthor("hi!");
        book5.setBookID(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        book5.setBookID(32);
        java.lang.String str18 = book5.getTitle();
        java.lang.String str19 = book5.getGenre();
        book5.setTitle("");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getGenre();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (short) 10);
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("hi!");
        int int17 = book5.getBookID();
        book5.setBookID(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        Book book5 = new Book((int) (byte) 10, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str19 = book5.getTitle();
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        java.lang.String str24 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        Book book5 = new Book(100, "", "hi!", "", "hi!");
        book5.setGenre("");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        Book book5 = new Book((int) ' ', "", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str13 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setTitle("");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setBookID(1);
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setStatus("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        book5.setGenre("");
        book5.setBookID((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        Book book5 = new Book((int) (short) -1, "", "", "", "hi!");
        int int6 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setBookID((int) (short) 100);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        Book book5 = new Book((int) (short) 100, "hi!", "hi!", "hi!", "");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        Book book5 = new Book((int) (short) 100, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        book5.setGenre("");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        java.lang.String str13 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
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
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getAuthor();
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        Book book5 = new Book(0, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) 10);
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        Book book5 = new Book(1, "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str17 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        Book book5 = new Book((int) '4', "", "", "hi!", "hi!");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        Book book5 = new Book(0, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        Book book5 = new Book(32, "hi!", "", "", "");
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getGenre();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setBookID(35);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "", "");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
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
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        Book book5 = new Book(0, "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        Book book5 = new Book((int) (short) 1, "hi!", "", "", "");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        Book book5 = new Book((int) (short) 100, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        Book book5 = new Book(52, "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        book5.setTitle("");
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setGenre("");
        book5.setGenre("hi!");
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getGenre();
        book5.setStatus("");
        java.lang.String str21 = book5.getGenre();
        java.lang.String str22 = book5.getTitle();
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        Book book5 = new Book((int) 'a', "", "", "hi!", "hi!");
        book5.setBookID((int) ' ');
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(10);
        book5.setTitle("");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str23 = book5.getGenre();
        java.lang.Class<?> wildcardClass24 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("hi!");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        java.lang.String str19 = book5.getAuthor();
        book5.setAuthor("");
        int int22 = book5.getBookID();
        java.lang.Class<?> wildcardClass23 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        book5.setBookID((int) (short) 100);
        book5.setAuthor("hi!");
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        book5.setBookID((int) '#');
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        Book book5 = new Book((int) '4', "hi!", "", "", "");
        book5.setBookID((int) '4');
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getGenre();
        book5.setBookID((int) (short) 100);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        int int11 = book5.getBookID();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        Book book5 = new Book((int) (short) 1, "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str21 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        Book book5 = new Book((int) '4', "", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setStatus("hi!");
        book5.setGenre("");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setBookID(52);
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("");
        int int14 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        Book book5 = new Book((int) ' ', "", "", "", "hi!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("");
        book5.setBookID((int) (byte) 10);
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
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
        java.lang.String str24 = book5.getStatus();
        int int25 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 52 + "'", int25 == 52);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str17 = book5.getGenre();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        book5.setBookID((int) (short) 10);
        book5.setGenre("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        book5.setStatus("hi!");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        Book book5 = new Book((int) ' ', "", "hi!", "", "");
        book5.setAuthor("");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setBookID((int) '4');
        java.lang.String str13 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
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
        java.lang.String str19 = book5.getAuthor();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(10);
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        Book book5 = new Book((int) (byte) 1, "", "", "", "");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID((int) (byte) 100);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getAuthor();
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("hi!");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) 10);
        book5.setGenre("hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
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
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        int int15 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        Book book5 = new Book((int) 'a', "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        int int16 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        Book book5 = new Book((int) (short) 100, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str17 = book5.getGenre();
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        Book book5 = new Book((int) (short) 1, "", "", "hi!", "");
        book5.setAuthor("hi!");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getAuthor();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        int int16 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setBookID(10);
        book5.setStatus("");
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getGenre();
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        java.lang.String str19 = book5.getAuthor();
        book5.setBookID(35);
        java.lang.String str22 = book5.getTitle();
        java.lang.String str23 = book5.getGenre();
        book5.setAuthor("");
        book5.setBookID(10);
        java.lang.Class<?> wildcardClass28 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        book5.setStatus("");
        java.lang.String str15 = book5.getGenre();
        book5.setAuthor("");
        book5.setBookID((int) ' ');
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        Book book5 = new Book((-1), "", "", "hi!", "");
        int int6 = book5.getBookID();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        Book book5 = new Book((int) (short) 100, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setGenre("");
        int int8 = book5.getBookID();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setBookID((int) ' ');
        int int9 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        book5.setBookID((int) ' ');
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setBookID(10);
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setAuthor("");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str19 = book5.getStatus();
        java.lang.String str20 = book5.getTitle();
        java.lang.String str21 = book5.getTitle();
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
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
        java.lang.String str19 = book5.getAuthor();
        book5.setBookID(35);
        java.lang.String str22 = book5.getTitle();
        java.lang.String str23 = book5.getGenre();
        book5.setAuthor("");
        book5.setBookID(10);
        java.lang.String str28 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getStatus();
        int int15 = book5.getBookID();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setBookID((int) '4');
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str19 = book5.getStatus();
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
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
        java.lang.String str21 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("");
        int int26 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        Book book5 = new Book((int) ' ', "", "", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setGenre("");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getGenre();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        book5.setBookID(1);
        book5.setGenre("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        Book book5 = new Book((int) ' ', "hi!", "hi!", "", "hi!");
        book5.setBookID((int) ' ');
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getGenre();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        java.lang.String str17 = book5.getAuthor();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setStatus("");
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str15 = book5.getAuthor();
        java.lang.String str16 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setAuthor("");
        int int11 = book5.getBookID();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(1);
        book5.setTitle("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        Book book5 = new Book(100, "", "", "", "");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str14 = book5.getAuthor();
        book5.setBookID(100);
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getStatus();
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        book5.setBookID(35);
        java.lang.String str22 = book5.getGenre();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        Book book5 = new Book(52, "hi!", "", "hi!", "hi!");
        book5.setBookID(35);
        book5.setStatus("hi!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        Book book5 = new Book(0, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
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
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        book5.setBookID((int) (short) -1);
        java.lang.String str24 = book5.getAuthor();
        java.lang.String str25 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setGenre("");
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        Book book5 = new Book(97, "hi!", "", "hi!", "hi!");
        book5.setStatus("");
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        book5.setBookID((int) ' ');
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
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
        book5.setGenre("hi!");
        int int22 = book5.getBookID();
        java.lang.String str23 = book5.getStatus();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        book5.setBookID((int) ' ');
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getGenre();
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        Book book5 = new Book(10, "hi!", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "hi!", "");
        book5.setStatus("");
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        book5.setTitle("");
        int int15 = book5.getBookID();
        book5.setBookID((int) (short) -1);
        book5.setTitle("hi!");
        java.lang.String str20 = book5.getTitle();
        java.lang.String str21 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        java.lang.String str12 = book5.getTitle();
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getGenre();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }
}

