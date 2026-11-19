import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

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
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        Book book5 = new Book(1, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        Book book5 = new Book((int) (short) 0, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getAuthor();
        int int16 = book5.getBookID();
        book5.setStatus("");
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        book5.setAuthor("");
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        book5.setAuthor("hi!");
        java.lang.String str19 = book5.getStatus();
        int int20 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str9 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setBookID((int) (byte) 10);
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setBookID(52);
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str22 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setBookID((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        Book book5 = new Book((int) '#', "", "hi!", "", "");
        book5.setTitle("");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        book5.setAuthor("");
        java.lang.String str21 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        Book book5 = new Book(100, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        Book book5 = new Book(1, "", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str12 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
        java.lang.String str20 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        Book book5 = new Book((int) (short) 100, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        int int6 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        book5.setBookID((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        Book book5 = new Book(32, "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str10 = book5.getGenre();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        int int16 = book5.getBookID();
        book5.setBookID((int) (short) 1);
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        book5.setGenre("");
        book5.setStatus("hi!");
        int int12 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getGenre();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
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
        book5.setTitle("");
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        Book book5 = new Book(97, "", "hi!", "hi!", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setBookID((int) (short) 1);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str18 = book5.getTitle();
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getGenre();
        java.lang.String str20 = book5.getGenre();
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID((int) (short) 1);
        java.lang.String str19 = book5.getTitle();
        book5.setBookID((int) ' ');
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setStatus("");
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        Book book5 = new Book((int) (short) 10, "", "", "", "");
        book5.setAuthor("");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
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
        book5.setBookID((int) (short) 0);
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "hi!", "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        book5.setBookID(32);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str13 = book5.getStatus();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        book5.setBookID((int) (byte) 100);
        int int15 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setStatus("hi!");
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setAuthor("");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getTitle();
        book5.setGenre("");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) -1);
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setGenre("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        Book book5 = new Book((int) (byte) 1, "", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        Book book5 = new Book((int) (byte) 100, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        Book book5 = new Book((int) 'a', "", "", "", "");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        Book book5 = new Book(1, "hi!", "", "", "");
        int int6 = book5.getBookID();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
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
        book5.setBookID(10);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        Book book5 = new Book(0, "", "", "hi!", "");
        book5.setBookID((int) '4');
        book5.setBookID(97);
        book5.setTitle("hi!");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
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
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        Book book5 = new Book(52, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        Book book5 = new Book((int) (byte) -1, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(10);
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        int int8 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("hi!");
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setBookID(0);
        int int16 = book5.getBookID();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        book5.setGenre("hi!");
        java.lang.String str24 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        Book book5 = new Book((int) (byte) 0, "", "", "hi!", "hi!");
        book5.setStatus("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getGenre();
        book5.setGenre("hi!");
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setBookID((int) ' ');
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setAuthor("");
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        Book book5 = new Book((int) (short) -1, "", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        java.lang.String str9 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        Book book5 = new Book((int) '4', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        book5.setBookID((int) '4');
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        Book book5 = new Book((int) '#', "hi!", "", "", "");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        Book book5 = new Book((int) 'a', "", "hi!", "", "");
        book5.setGenre("");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        Book book5 = new Book(0, "hi!", "", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((-1));
        java.lang.String str9 = book5.getGenre();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        Book book5 = new Book((int) ' ', "", "hi!", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        Book book5 = new Book((int) (short) 1, "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 0);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str15 = book5.getGenre();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        Book book5 = new Book(35, "", "hi!", "hi!", "");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        java.lang.String str23 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        java.lang.String str9 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        Book book5 = new Book((int) '#', "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        book5.setAuthor("");
        book5.setTitle("");
        int int18 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str21 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        book5.setBookID(1);
        book5.setGenre("");
        java.lang.String str17 = book5.getAuthor();
        int int18 = book5.getBookID();
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        Book book5 = new Book((int) ' ', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
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
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getStatus();
        int int21 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }
}

