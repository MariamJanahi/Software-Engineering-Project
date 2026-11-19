import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        Book book5 = new Book((int) (short) 100, "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setBookID((int) (short) 1);
        int int8 = book5.getBookID();
        book5.setBookID((int) (short) 1);
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        Book book5 = new Book((int) '4', "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        book5.setBookID((int) (byte) 10);
        book5.setBookID(35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        book5.setStatus("");
        book5.setTitle("");
        book5.setStatus("");
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
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        book5.setBookID((int) '4');
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getAuthor();
        java.lang.String str21 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        Book book5 = new Book((int) (short) 1, "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getGenre();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        Book book5 = new Book((-1), "", "", "", "");
        book5.setStatus("");
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setBookID(100);
        book5.setAuthor("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setGenre("");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setTitle("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        book5.setBookID(0);
        java.lang.String str8 = book5.getStatus();
        book5.setBookID((int) (short) 100);
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        Book book5 = new Book(97, "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        book5.setGenre("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        java.lang.String str21 = book5.getGenre();
        java.lang.String str22 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        book5.setStatus("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        book5.setAuthor("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        Book book5 = new Book((int) 'a', "", "hi!", "", "");
        book5.setGenre("");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setAuthor("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
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
        book5.setGenre("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        Book book5 = new Book((int) (short) 10, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        Book book5 = new Book(10, "hi!", "", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        book5.setAuthor("");
        book5.setTitle("");
        int int18 = book5.getBookID();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getStatus();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        Book book5 = new Book(52, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("hi!");
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        Book book5 = new Book((-1), "", "", "", "hi!");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        Book book5 = new Book((-1), "", "", "hi!", "");
        book5.setAuthor("hi!");
        book5.setBookID((int) '#');
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        java.lang.String str13 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setBookID((int) '#');
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setTitle("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("");
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str17 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str13 = book5.getStatus();
        book5.setGenre("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        Book book5 = new Book((int) ' ', "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        Book book5 = new Book(100, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (short) 0);
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("hi!");
        int int12 = book5.getBookID();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getStatus();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        java.lang.String str21 = book5.getGenre();
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str17 = book5.getTitle();
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setBookID(32);
        int int14 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        Book book5 = new Book(32, "hi!", "hi!", "", "");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        Book book5 = new Book((-1), "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        Book book5 = new Book(1, "", "", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        java.lang.String str20 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
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
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(10);
        book5.setTitle("");
        java.lang.String str15 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        java.lang.String str22 = book5.getTitle();
        java.lang.String str23 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("");
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setBookID(52);
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str21 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        int int12 = book5.getBookID();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("");
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.String str22 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        book5.setStatus("hi!");
        int int18 = book5.getBookID();
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        int int17 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setTitle("hi!");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        java.lang.String str21 = book5.getAuthor();
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
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID(10);
        java.lang.String str12 = book5.getAuthor();
        int int13 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        Book book5 = new Book(52, "", "", "", "hi!");
        book5.setTitle("hi!");
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        Book book5 = new Book(1, "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setStatus("");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getTitle();
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getGenre();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setAuthor("");
        book5.setBookID(100);
        book5.setTitle("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        book5.setBookID((int) (short) 100);
        book5.setBookID((int) (short) 100);
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setGenre("hi!");
        book5.setBookID(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        Book book5 = new Book((int) '#', "hi!", "", "", "hi!");
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("");
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setAuthor("");
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getStatus();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getStatus();
        book5.setBookID(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        book5.setStatus("");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str14 = book5.getGenre();
        int int15 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setStatus("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        java.lang.String str24 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        Book book5 = new Book((int) '4', "hi!", "", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        int int25 = book5.getBookID();
        java.lang.String str26 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("");
        book5.setStatus("");
        book5.setBookID(0);
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        java.lang.String str19 = book5.getStatus();
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getAuthor();
        java.lang.String str22 = book5.getTitle();
        java.lang.Class<?> wildcardClass23 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        Book book5 = new Book((int) (short) -1, "", "", "hi!", "");
        book5.setAuthor("");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setGenre("");
        book5.setStatus("");
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) -1);
        book5.setStatus("hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        Book book5 = new Book((-1), "hi!", "", "hi!", "");
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) 10);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        book5.setTitle("");
        java.lang.String str16 = book5.getTitle();
        book5.setBookID((-1));
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getGenre();
        book5.setGenre("");
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "hi!");
        book5.setBookID((int) ' ');
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        int int17 = book5.getBookID();
        book5.setAuthor("");
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setBookID((int) (byte) 0);
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getAuthor();
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) 1);
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        book5.setBookID(97);
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setTitle("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        Book book5 = new Book((int) (byte) 0, "", "", "hi!", "hi!");
        book5.setStatus("");
        book5.setBookID((int) (short) 1);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
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
        java.lang.String str20 = book5.getAuthor();
        java.lang.String str21 = book5.getAuthor();
        java.lang.String str22 = book5.getTitle();
        java.lang.String str23 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        Book book5 = new Book(0, "hi!", "", "", "hi!");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setBookID((int) (short) 100);
        book5.setBookID((int) (byte) 1);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        java.lang.String str21 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        int int14 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str11 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "hi!", "hi!");
        book5.setBookID(0);
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setBookID((int) 'a');
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getStatus();
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str9 = book5.getTitle();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        book5.setBookID(1);
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        Book book5 = new Book((-1), "", "", "", "hi!");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getTitle();
        book5.setStatus("");
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        book5.setAuthor("");
        book5.setTitle("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getStatus();
        book5.setStatus("hi!");
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getGenre();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        Book book5 = new Book((int) (short) 0, "", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setBookID((int) ' ');
        java.lang.String str14 = book5.getGenre();
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        Book book5 = new Book((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        book5.setTitle("hi!");
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        book5.setTitle("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        Book book5 = new Book(0, "", "hi!", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        Book book5 = new Book((int) (short) 100, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        Book book5 = new Book(97, "", "hi!", "hi!", "");
        book5.setGenre("");
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getGenre();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setGenre("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) 'a');
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("");
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        book5.setBookID((int) 'a');
        book5.setAuthor("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        Book book5 = new Book(52, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        java.lang.String str11 = book5.getGenre();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setBookID((int) '4');
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setTitle("hi!");
        int int17 = book5.getBookID();
        java.lang.String str18 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        Book book5 = new Book(52, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getStatus();
        book5.setGenre("");
        book5.setGenre("");
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(52);
        book5.setBookID(1);
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getTitle();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        Book book5 = new Book(0, "hi!", "hi!", "", "hi!");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setStatus("hi!");
        java.lang.String str10 = book5.getAuthor();
        java.lang.String str11 = book5.getAuthor();
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setBookID((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
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
        java.lang.String str23 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID(10);
        book5.setGenre("");
        book5.setBookID((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        Book book5 = new Book((int) 'a', "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setGenre("");
        book5.setBookID((int) 'a');
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getGenre();
        java.lang.String str22 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setTitle("");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        java.lang.String str25 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("");
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setBookID((int) ' ');
        int int15 = book5.getBookID();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        book5.setGenre("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        java.lang.String str18 = book5.getAuthor();
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        book5.setBookID((int) '#');
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setAuthor("hi!");
        book5.setAuthor("");
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
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
        book5.setStatus("");
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        java.lang.String str19 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setBookID((int) (byte) 0);
        book5.setAuthor("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        book5.setAuthor("");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        Book book5 = new Book(32, "", "", "", "");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getGenre();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        book5.setTitle("");
        java.lang.String str25 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
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
        java.lang.String str19 = book5.getStatus();
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        Book book5 = new Book(0, "", "", "", "");
        book5.setGenre("");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getAuthor();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        book5.setStatus("");
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
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
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("");
        book5.setStatus("");
        book5.setTitle("hi!");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setAuthor("");
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        Book book5 = new Book((int) ' ', "", "", "hi!", "");
        book5.setStatus("hi!");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        book5.setBookID(0);
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        java.lang.String str18 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("");
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getStatus();
        int int16 = book5.getBookID();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        Book book5 = new Book(32, "", "hi!", "", "hi!");
        book5.setBookID(52);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
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
        java.lang.String str22 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getStatus();
        book5.setAuthor("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        Book book5 = new Book(100, "hi!", "", "hi!", "");
        book5.setGenre("");
        book5.setBookID((int) (short) -1);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        Book book5 = new Book((int) (byte) 1, "", "", "", "");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getAuthor();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        Book book5 = new Book(32, "", "", "hi!", "hi!");
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str19 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        Book book5 = new Book((int) (short) -1, "", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setStatus("");
        book5.setTitle("");
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        Book book5 = new Book((-1), "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getStatus();
        book5.setGenre("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
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
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        book5.setGenre("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        book5.setGenre("");
        java.lang.String str23 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        book5.setBookID(97);
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        Book book5 = new Book((int) (byte) -1, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
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
        java.lang.Class<?> wildcardClass23 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("");
        int int9 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
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
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
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
        java.lang.String str20 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        java.lang.String str13 = book5.getStatus();
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str18 = book5.getStatus();
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        Book book5 = new Book((int) (short) 100, "", "", "hi!", "");
        book5.setBookID((int) ' ');
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setGenre("");
        book5.setBookID(0);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        Book book5 = new Book(97, "", "", "hi!", "hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        Book book5 = new Book((-1), "", "", "", "hi!");
        book5.setBookID(97);
        book5.setTitle("");
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        int int13 = book5.getBookID();
        book5.setTitle("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        Book book5 = new Book((int) (byte) -1, "", "hi!", "hi!", "hi!");
        book5.setGenre("");
        int int8 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setBookID(52);
        int int17 = book5.getBookID();
        book5.setBookID((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        Book book5 = new Book(10, "", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        book5.setStatus("");
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str17 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        java.lang.String str13 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        book5.setBookID((int) '4');
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        int int6 = book5.getBookID();
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        book5.setTitle("");
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        Book book5 = new Book((int) (short) 1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setGenre("");
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) 100);
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        Book book5 = new Book((int) (short) 1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.String str10 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        book5.setStatus("");
        java.lang.String str15 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setGenre("");
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        Book book5 = new Book((int) (byte) 100, "hi!", "hi!", "hi!", "hi!");
        book5.setStatus("");
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
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
        book5.setBookID((int) 'a');
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        book5.setBookID((int) (short) 100);
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        book5.setTitle("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str19 = book5.getAuthor();
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        Book book5 = new Book((int) (short) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        java.lang.String str15 = book5.getTitle();
        book5.setAuthor("");
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str19 = book5.getTitle();
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        book5.setBookID((int) (short) 100);
        book5.setAuthor("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "");
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
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
        int int18 = book5.getBookID();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("");
        book5.setStatus("");
        java.lang.String str18 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        Book book5 = new Book(35, "hi!", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getAuthor();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        Book book5 = new Book((int) (byte) 10, "hi!", "", "", "hi!");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setBookID((int) (short) 100);
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setTitle("");
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setAuthor("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str17 = book5.getTitle();
        java.lang.String str18 = book5.getGenre();
        book5.setTitle("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        Book book5 = new Book((int) 'a', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getTitle();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
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
        java.lang.String str19 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setGenre("hi!");
        book5.setStatus("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID((int) (short) 10);
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID(0);
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) -1);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        book5.setBookID((int) (short) 100);
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("");
        java.lang.String str19 = book5.getAuthor();
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getAuthor();
        book5.setGenre("hi!");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getGenre();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        Book book5 = new Book(0, "hi!", "hi!", "hi!", "hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        int int10 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str13 = book5.getStatus();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        Book book5 = new Book((int) (byte) 1, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        Book book5 = new Book(0, "", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setBookID(100);
        book5.setAuthor("");
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        book5.setBookID((int) (byte) 10);
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        int int13 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        Book book5 = new Book((int) (byte) -1, "", "hi!", "hi!", "hi!");
        book5.setBookID((int) (byte) -1);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        Book book5 = new Book(1, "", "", "hi!", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        book5.setGenre("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        book5.setGenre("");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        int int18 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        int int10 = book5.getBookID();
        book5.setAuthor("");
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setGenre("hi!");
        int int9 = book5.getBookID();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        Book book5 = new Book((int) (short) -1, "hi!", "", "", "");
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
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
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setBookID((int) (short) 1);
        int int8 = book5.getBookID();
        book5.setGenre("");
        int int11 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
        book5.setBookID((int) (byte) 1);
        int int25 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setBookID((int) '#');
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        book5.setBookID((int) (byte) 100);
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        Book book5 = new Book(0, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        Book book5 = new Book((int) 'a', "", "hi!", "", "hi!");
        book5.setTitle("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        Book book5 = new Book((int) (byte) 1, "", "", "", "hi!");
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        int int15 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setStatus("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getAuthor();
        book5.setBookID((int) (byte) 0);
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setBookID(52);
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        book5.setAuthor("hi!");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        Book book5 = new Book((int) (short) 100, "hi!", "", "", "");
        java.lang.String str6 = book5.getTitle();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
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
        java.lang.String str23 = book5.getStatus();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        java.lang.String str18 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        book5.setGenre("hi!");
        java.lang.String str10 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        int int22 = book5.getBookID();
        java.lang.String str23 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        Book book5 = new Book(100, "hi!", "", "hi!", "");
        book5.setGenre("");
        book5.setStatus("");
        book5.setBookID(0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        book5.setStatus("");
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getGenre();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        Book book5 = new Book((int) (short) 100, "", "", "hi!", "");
        book5.setBookID(35);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        Book book5 = new Book(0, "", "", "", "");
        book5.setBookID((int) (byte) 0);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
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
        book5.setTitle("");
        java.lang.String str22 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        Book book5 = new Book(35, "", "hi!", "hi!", "hi!");
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        book5.setTitle("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        int int15 = book5.getBookID();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setBookID(32);
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getGenre();
        book5.setTitle("hi!");
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (byte) -1);
        book5.setStatus("hi!");
        int int16 = book5.getBookID();
        book5.setBookID(100);
        book5.setStatus("");
        book5.setBookID(0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        book5.setGenre("");
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
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
        book5.setAuthor("");
        int int22 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        Book book5 = new Book(35, "hi!", "", "", "");
        book5.setTitle("hi!");
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        Book book5 = new Book((int) (short) 10, "", "", "hi!", "hi!");
        int int6 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        book5.setBookID(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        int int22 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setBookID(52);
        java.lang.String str15 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        java.lang.String str16 = book5.getTitle();
        int int17 = book5.getBookID();
        int int18 = book5.getBookID();
        int int19 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("hi!");
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        Book book5 = new Book((int) (byte) 1, "", "hi!", "", "hi!");
        book5.setGenre("");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        java.lang.String str10 = book5.getTitle();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
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
        book5.setBookID((int) 'a');
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setGenre("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getGenre();
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        book5.setStatus("hi!");
        int int15 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        Book book5 = new Book((int) (short) 10, "hi!", "hi!", "", "");
        book5.setBookID((-1));
        book5.setBookID(100);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        int int9 = book5.getBookID();
        book5.setBookID((int) (short) 100);
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        Book book5 = new Book(52, "hi!", "", "hi!", "hi!");
        book5.setBookID(35);
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        java.lang.String str14 = book5.getAuthor();
        book5.setTitle("");
        java.lang.String str17 = book5.getStatus();
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str13 = book5.getAuthor();
        book5.setGenre("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        int int7 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID((int) (short) 1);
        book5.setGenre("hi!");
        book5.setGenre("");
        java.lang.String str20 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        book5.setBookID(32);
        java.lang.String str18 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }
}

