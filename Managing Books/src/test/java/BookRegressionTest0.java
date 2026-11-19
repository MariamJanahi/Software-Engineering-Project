import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import data.Book;
import business.BookManager; // include this too if BookManager is referenced in the test files

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRegressionTest0 {

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
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        Book book5 = new Book((-1), "", "", "", "hi!");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        int int12 = book5.getBookID();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        Book book5 = new Book((int) (byte) 1, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        java.lang.String str14 = book5.getGenre();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        int int6 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        int int14 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setBookID((int) (short) 1);
        book5.setTitle("hi!");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        book5.setStatus("hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setStatus("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getTitle();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getStatus();
        book5.setAuthor("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
        java.lang.Class<?> wildcardClass22 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        Book book5 = new Book(100, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        Book book5 = new Book((int) '4', "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getAuthor();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        Book book5 = new Book((-1), "hi!", "", "", "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (byte) 100);
        book5.setBookID(52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.String str17 = book5.getGenre();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        book5.setBookID((-1));
        int int13 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        book5.setAuthor("");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str9 = book5.getTitle();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        java.lang.String str9 = book5.getAuthor();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        book5.setBookID(0);
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("");
        book5.setBookID((int) ' ');
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setGenre("");
        book5.setAuthor("hi!");
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        Book book5 = new Book((int) (short) 100, "", "hi!", "", "hi!");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setBookID(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        int int11 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        Book book5 = new Book((int) (byte) 10, "hi!", "", "", "");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        Book book5 = new Book((int) (byte) -1, "hi!", "", "", "");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
        book5.setGenre("");
        java.lang.Class<?> wildcardClass24 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "", "");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        Book book5 = new Book((int) (byte) 1, "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        Book book5 = new Book(100, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        book5.setAuthor("hi!");
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        book5.setBookID((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
        book5.setBookID((-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setBookID(0);
        java.lang.String str17 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setAuthor("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        Book book5 = new Book((int) (short) 0, "", "hi!", "hi!", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        Book book5 = new Book((-1), "hi!", "hi!", "", "hi!");
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 0);
        book5.setAuthor("hi!");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        int int7 = book5.getBookID();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        int int10 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        Book book5 = new Book((int) (short) 10, "hi!", "", "", "");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getAuthor();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setAuthor("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        Book book5 = new Book((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        int int12 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        Book book5 = new Book((-1), "", "", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        Book book5 = new Book((int) (byte) -1, "", "", "hi!", "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        Book book5 = new Book((int) (short) 100, "hi!", "", "hi!", "");
        book5.setAuthor("");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setBookID((int) (byte) 100);
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        java.lang.String str15 = book5.getStatus();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        book5.setTitle("");
        int int16 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        Book book5 = new Book(35, "", "", "hi!", "hi!");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        Book book5 = new Book((int) (byte) 10, "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        int int13 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID(10);
        book5.setGenre("hi!");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        Book book5 = new Book(0, "", "", "hi!", "");
        book5.setBookID((int) '4');
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
        java.lang.String str23 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        Book book5 = new Book(1, "", "", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        book5.setGenre("");
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "", "hi!");
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setTitle("");
        int int16 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass19 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        Book book5 = new Book((int) (byte) 10, "hi!", "hi!", "", "");
        book5.setGenre("hi!");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getAuthor();
        java.lang.String str16 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("hi!");
        int int14 = book5.getBookID();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setGenre("hi!");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        Book book5 = new Book(10, "", "hi!", "", "");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        book5.setBookID((int) (byte) 0);
        book5.setBookID((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        Book book5 = new Book(0, "", "hi!", "", "hi!");
        book5.setGenre("");
        java.lang.String str8 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str11 = book5.getAuthor();
        book5.setBookID((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        book5.setAuthor("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        Book book5 = new Book((-1), "", "", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("hi!");
        book5.setAuthor("hi!");
        java.lang.String str18 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "hi!");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str13 = book5.getGenre();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getTitle();
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        book5.setBookID((int) ' ');
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        Book book5 = new Book((int) (short) -1, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        Book book5 = new Book((int) (short) 1, "hi!", "hi!", "", "");
        book5.setBookID(52);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        book5.setGenre("hi!");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        book5.setGenre("");
        java.lang.String str8 = book5.getGenre();
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getTitle();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        Book book5 = new Book((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getTitle();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("");
        java.lang.String str11 = book5.getTitle();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setTitle("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        Book book5 = new Book((int) (short) 1, "", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setBookID(32);
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setGenre("hi!");
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("");
        int int17 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        Book book5 = new Book((int) (byte) -1, "", "hi!", "", "hi!");
        book5.setAuthor("hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setBookID(10);
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        java.lang.String str8 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str14 = book5.getGenre();
        java.lang.String str15 = book5.getTitle();
        int int16 = book5.getBookID();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
        java.lang.String str20 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        Book book5 = new Book((int) ' ', "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        Book book5 = new Book(10, "hi!", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setAuthor("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setGenre("hi!");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        Book book5 = new Book(10, "", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (short) 10);
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        book5.setGenre("");
        book5.setTitle("hi!");
        java.lang.String str19 = book5.getAuthor();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getAuthor();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        Book book5 = new Book((-1), "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        java.lang.String str9 = book5.getStatus();
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        Book book5 = new Book((int) (byte) 100, "", "", "", "");
        book5.setBookID((int) (byte) -1);
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("");
        java.lang.String str15 = book5.getTitle();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        Book book5 = new Book(1, "", "hi!", "", "hi!");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        book5.setTitle("");
        java.lang.String str11 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        Book book5 = new Book((int) (byte) 100, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setGenre("");
        book5.setGenre("");
        book5.setBookID((int) ' ');
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        book5.setBookID(10);
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        Book book5 = new Book(0, "", "", "", "");
        book5.setAuthor("hi!");
        java.lang.String str8 = book5.getStatus();
        book5.setAuthor("");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("");
        book5.setBookID(32);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        Book book5 = new Book((-1), "", "", "", "hi!");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getTitle();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        Book book5 = new Book((int) (short) 1, "hi!", "", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        Book book5 = new Book(52, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setGenre("");
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) 1);
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        book5.setBookID((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        java.lang.String str14 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID(0);
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        int int13 = book5.getBookID();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        Book book5 = new Book(10, "hi!", "", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        Book book5 = new Book((int) (byte) 100, "", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getAuthor();
        book5.setStatus("");
        int int10 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        Book book5 = new Book(32, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getTitle();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        int int15 = book5.getBookID();
        book5.setTitle("");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        Book book5 = new Book((int) 'a', "", "hi!", "", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setBookID((int) (short) 100);
        int int13 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getStatus();
        java.lang.String str14 = book5.getStatus();
        int int15 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        java.lang.String str13 = book5.getStatus();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        Book book5 = new Book(0, "", "", "", "");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getTitle();
        book5.setTitle("");
        int int9 = book5.getBookID();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getStatus();
        book5.setStatus("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "");
        book5.setBookID(0);
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        book5.setAuthor("hi!");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        Book book5 = new Book((int) ' ', "hi!", "", "hi!", "");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        int int13 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        Book book5 = new Book(52, "hi!", "hi!", "", "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        java.lang.String str15 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str12 = book5.getStatus();
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setBookID(52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        book5.setBookID((-1));
        java.lang.String str15 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        Book book5 = new Book(100, "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setTitle("hi!");
        book5.setGenre("hi!");
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        book5.setGenre("");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "", "");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getGenre();
        book5.setGenre("");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID(1);
        book5.setTitle("");
        java.lang.String str16 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        Book book5 = new Book((int) (short) 0, "", "hi!", "hi!", "hi!");
        book5.setGenre("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("");
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getStatus();
        book5.setStatus("");
        java.lang.String str14 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        book5.setGenre("");
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        Book book5 = new Book(35, "hi!", "hi!", "hi!", "hi!");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setGenre("");
        book5.setTitle("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        Book book5 = new Book((int) (byte) 1, "hi!", "", "", "");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        Book book5 = new Book((int) (short) -1, "", "", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        Book book5 = new Book(1, "", "", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setAuthor("hi!");
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setTitle("hi!");
        int int19 = book5.getBookID();
        java.lang.String str20 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        Book book5 = new Book(100, "", "", "hi!", "");
        book5.setStatus("hi!");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getGenre();
        book5.setBookID((int) '#');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
        java.lang.String str20 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        book5.setBookID((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getGenre();
        book5.setAuthor("hi!");
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        int int12 = book5.getBookID();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getStatus();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        book5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        Book book5 = new Book((int) (short) 0, "hi!", "hi!", "hi!", "");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        Book book5 = new Book(10, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getAuthor();
        book5.setStatus("");
        book5.setGenre("");
        java.lang.String str19 = book5.getAuthor();
        java.lang.Class<?> wildcardClass20 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "hi!", "hi!");
        book5.setBookID(0);
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getStatus();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getAuthor();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        book5.setStatus("");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getTitle();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str12 = book5.getGenre();
        int int13 = book5.getBookID();
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getStatus();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        int int6 = book5.getBookID();
        java.lang.String str7 = book5.getAuthor();
        java.lang.String str8 = book5.getStatus();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        Book book5 = new Book((int) (short) 0, "", "hi!", "", "hi!");
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getStatus();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getGenre();
        int int10 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        Book book5 = new Book((int) (byte) 1, "", "", "", "");
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        java.lang.String str10 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID(0);
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        Book book5 = new Book((int) (byte) 10, "", "", "hi!", "");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        book5.setTitle("hi!");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setGenre("hi!");
        java.lang.String str12 = book5.getTitle();
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setGenre("hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        Book book5 = new Book(100, "", "hi!", "", "");
        book5.setStatus("");
        book5.setGenre("");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        book5.setBookID((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        Book book5 = new Book(10, "hi!", "hi!", "", "");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        int int11 = book5.getBookID();
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getTitle();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setBookID((-1));
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getGenre();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        book5.setBookID((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getStatus();
        book5.setBookID(10);
        book5.setGenre("");
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        Book book5 = new Book(0, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getTitle();
        book5.setBookID((int) (short) 0);
        java.lang.String str15 = book5.getStatus();
        java.lang.Class<?> wildcardClass16 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.String str16 = book5.getTitle();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setStatus("");
        book5.setTitle("");
        book5.setAuthor("hi!");
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        book5.setBookID((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        Book book5 = new Book(10, "", "", "hi!", "hi!");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setBookID(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setTitle("");
        book5.setStatus("");
        java.lang.String str16 = book5.getStatus();
        java.lang.String str17 = book5.getTitle();
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        book5.setStatus("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
        java.lang.String str19 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        Book book5 = new Book((int) '4', "hi!", "hi!", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setGenre("hi!");
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getStatus();
        java.lang.String str11 = book5.getTitle();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("");
        java.lang.Class<?> wildcardClass9 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        int int10 = book5.getBookID();
        java.lang.String str11 = book5.getAuthor();
        book5.setGenre("");
        java.lang.String str14 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        int int8 = book5.getBookID();
        int int9 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        Book book5 = new Book((int) (byte) 0, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        java.lang.String str9 = book5.getAuthor();
        book5.setStatus("hi!");
        book5.setBookID((int) (byte) 1);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        Book book5 = new Book((int) (short) 100, "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        book5.setStatus("");
        java.lang.String str11 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        java.lang.String str8 = book5.getTitle();
        book5.setAuthor("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getStatus();
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setStatus("hi!");
        int int13 = book5.getBookID();
        java.lang.String str14 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        Book book5 = new Book(1, "hi!", "", "hi!", "");
        java.lang.String str6 = book5.getAuthor();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getTitle();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        java.lang.String str10 = book5.getStatus();
        book5.setGenre("");
        java.lang.String str13 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setBookID((int) (short) 1);
        book5.setTitle("");
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getGenre();
        java.lang.String str8 = book5.getAuthor();
        book5.setTitle("hi!");
        int int11 = book5.getBookID();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        Book book5 = new Book((int) 'a', "", "hi!", "", "");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setStatus("hi!");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setTitle("hi!");
        book5.setGenre("");
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getGenre();
        book5.setAuthor("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str16 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        java.lang.String str9 = book5.getAuthor();
        java.lang.String str10 = book5.getTitle();
        java.lang.Class<?> wildcardClass11 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("");
        book5.setBookID(10);
        book5.setAuthor("");
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getTitle();
        book5.setBookID((int) (short) -1);
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getAuthor();
        book5.setBookID((int) ' ');
        book5.setTitle("hi!");
        book5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        java.lang.String str9 = book5.getGenre();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        book5.setStatus("");
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        java.lang.String str16 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("hi!");
        java.lang.String str21 = book5.getGenre();
        java.lang.Class<?> wildcardClass22 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        Book book5 = new Book(0, "hi!", "", "hi!", "");
        book5.setBookID(1);
        book5.setStatus("hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        book5.setTitle("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        book5.setTitle("hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass8 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        Book book5 = new Book((int) (short) 0, "", "", "hi!", "");
        book5.setBookID(0);
        book5.setStatus("");
        java.lang.String str10 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        Book book5 = new Book((int) (short) -1, "hi!", "hi!", "hi!", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        java.lang.String str10 = book5.getAuthor();
        book5.setBookID((int) '4');
        book5.setTitle("hi!");
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getGenre();
        book5.setTitle("");
        book5.setAuthor("hi!");
        book5.setBookID(35);
        java.lang.Class<?> wildcardClass13 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        java.lang.String str13 = book5.getTitle();
        book5.setStatus("hi!");
        int int16 = book5.getBookID();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        int int8 = book5.getBookID();
        book5.setStatus("");
        book5.setAuthor("");
        book5.setStatus("");
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        java.lang.String str19 = book5.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getAuthor();
        java.lang.String str13 = book5.getStatus();
        book5.setTitle("hi!");
        book5.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        Book book5 = new Book((int) '#', "", "", "", "hi!");
        java.lang.Class<?> wildcardClass6 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setAuthor("");
        java.lang.Class<?> wildcardClass12 = book5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setStatus("");
        java.lang.String str16 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getStatus();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getStatus();
        int int12 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setStatus("hi!");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID((int) (short) 0);
        book5.setBookID(32);
        java.lang.Class<?> wildcardClass18 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        java.lang.String str12 = book5.getTitle();
        book5.setGenre("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("hi!");
        java.lang.String str9 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setAuthor("hi!");
        book5.setAuthor("");
        book5.setTitle("");
        java.lang.String str15 = book5.getGenre();
        java.lang.String str16 = book5.getGenre();
        java.lang.String str17 = book5.getStatus();
        java.lang.String str18 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str11 = book5.getStatus();
        book5.setBookID((int) (byte) 10);
        book5.setBookID(0);
        java.lang.String str16 = book5.getTitle();
        java.lang.String str17 = book5.getTitle();
        int int18 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        Book book5 = new Book((int) (short) 10, "", "", "", "");
        book5.setBookID(0);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        book5.setGenre("");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        book5.setTitle("");
        java.lang.String str8 = book5.getAuthor();
        book5.setStatus("hi!");
        java.lang.String str11 = book5.getAuthor();
        java.lang.String str12 = book5.getTitle();
        java.lang.String str13 = book5.getGenre();
        java.lang.String str14 = book5.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        Book book5 = new Book((int) 'a', "hi!", "hi!", "", "");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        java.lang.String str10 = book5.getStatus();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        java.lang.String str7 = book5.getAuthor();
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        Book book5 = new Book((int) '4', "", "hi!", "", "hi!");
        book5.setAuthor("");
        book5.setBookID((int) (short) 10);
        java.lang.String str10 = book5.getAuthor();
        book5.setTitle("hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        Book book5 = new Book(1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        Book book5 = new Book(10, "", "", "", "hi!");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        Book book5 = new Book((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
        java.lang.Class<?> wildcardClass21 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        java.lang.String str8 = book5.getStatus();
        java.lang.String str9 = book5.getTitle();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        int int10 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.String str22 = book5.getGenre();
        java.lang.String str23 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setStatus("");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        Book book5 = new Book((int) '#', "", "hi!", "hi!", "");
        book5.setStatus("hi!");
        book5.setBookID(0);
        java.lang.String str10 = book5.getGenre();
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getGenre();
        int int16 = book5.getBookID();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setGenre("hi!");
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getTitle();
        book5.setTitle("hi!");
        java.lang.String str15 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        Book book5 = new Book(100, "", "hi!", "", "");
        book5.setStatus("");
        java.lang.String str8 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        Book book5 = new Book((int) (byte) 0, "", "hi!", "", "");
        java.lang.String str6 = book5.getTitle();
        java.lang.String str7 = book5.getAuthor();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        java.lang.String str11 = book5.getGenre();
        java.lang.String str12 = book5.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        Book book5 = new Book((int) (byte) 100, "", "hi!", "", "");
        java.lang.String str6 = book5.getAuthor();
        java.lang.Class<?> wildcardClass7 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        book5.setStatus("");
        java.lang.String str10 = book5.getTitle();
        int int11 = book5.getBookID();
        book5.setGenre("");
        java.lang.Class<?> wildcardClass14 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        book5.setBookID((-1));
        book5.setGenre("hi!");
        book5.setAuthor("hi!");
        book5.setBookID(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        Book book5 = new Book((-1), "", "hi!", "", "hi!");
        book5.setBookID(100);
        java.lang.String str8 = book5.getTitle();
        book5.setBookID(0);
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        int int14 = book5.getBookID();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
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
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setTitle("hi!");
        java.lang.String str8 = book5.getGenre();
        book5.setAuthor("hi!");
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getStatus();
        book5.setGenre("hi!");
        book5.setStatus("hi!");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getGenre();
        book5.setGenre("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        Book book5 = new Book(10, "hi!", "", "", "");
        book5.setAuthor("");
        java.lang.String str8 = book5.getAuthor();
        book5.setGenre("");
        book5.setAuthor("");
        int int13 = book5.getBookID();
        book5.setBookID(0);
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        Book book5 = new Book((int) (short) -1, "hi!", "", "hi!", "hi!");
        java.lang.String str6 = book5.getGenre();
        java.lang.String str7 = book5.getTitle();
        book5.setBookID((int) (short) 1);
        book5.setStatus("hi!");
        book5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setBookID((int) (short) 10);
        int int8 = book5.getBookID();
        java.lang.String str9 = book5.getGenre();
        java.lang.String str10 = book5.getStatus();
        book5.setTitle("");
        int int13 = book5.getBookID();
        int int14 = book5.getBookID();
        java.lang.String str15 = book5.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setGenre("");
        int int8 = book5.getBookID();
        int int9 = book5.getBookID();
        java.lang.Class<?> wildcardClass10 = book5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        int int7 = book5.getBookID();
        book5.setStatus("hi!");
        book5.setTitle("");
        book5.setGenre("hi!");
        java.lang.String str14 = book5.getTitle();
        int int15 = book5.getBookID();
        java.lang.String str16 = book5.getStatus();
        java.lang.Class<?> wildcardClass17 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        book5.setTitle("hi!");
        book5.setGenre("hi!");
        book5.setGenre("");
        book5.setAuthor("");
        java.lang.String str16 = book5.getAuthor();
        java.lang.String str17 = book5.getTitle();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        book5.setTitle("");
        book5.setTitle("");
        java.lang.String str13 = book5.getTitle();
        java.lang.String str14 = book5.getGenre();
        java.lang.Class<?> wildcardClass15 = book5.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setAuthor("");
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        Book book5 = new Book((int) (byte) 10, "", "", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setTitle("hi!");
        java.lang.String str9 = book5.getStatus();
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        Book book5 = new Book((-1), "hi!", "", "hi!", "hi!");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        java.lang.String str6 = book5.getStatus();
        book5.setStatus("");
        int int9 = book5.getBookID();
        int int10 = book5.getBookID();
        int int11 = book5.getBookID();
        java.lang.String str12 = book5.getGenre();
        book5.setStatus("");
        book5.setTitle("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        Book book5 = new Book(52, "", "", "", "");
        book5.setAuthor("hi!");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        Book book5 = new Book((int) (short) -1, "", "hi!", "", "hi!");
        book5.setBookID((-1));
        java.lang.String str8 = book5.getTitle();
        int int9 = book5.getBookID();
        book5.setTitle("hi!");
        book5.setGenre("");
        book5.setBookID(100);
        book5.setAuthor("hi!");
        book5.setStatus("");
        java.lang.String str20 = book5.getGenre();
        java.lang.String str21 = book5.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        Book book5 = new Book((int) (short) 0, "", "", "", "hi!");
        book5.setGenre("");
        int int8 = book5.getBookID();
        book5.setStatus("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }
}

