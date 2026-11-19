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
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "", "", "");
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) 'a');
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        int int36 = bookManager0.getBookCount();
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "");
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        Book[] bookArray33 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass34 = bookArray33.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        Book[] bookArray33 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        int int4 = bookManager0.getBookCount();
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.DeleteBook(100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        Book[] bookArray9 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass10 = bookArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) 'a');
        boolean boolean37 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "");
        boolean boolean43 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean45 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((int) ' ', "", "", "", "");
        bookManager0.AddBook(2, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) 'a');
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        int int33 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(4);
        Book[] bookArray17 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(0);
        boolean boolean30 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        Book[] bookArray39 = bookManager0.getAllBooks();
        boolean boolean45 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook(3, "", "hi!", "", "");
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(6, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 100);
        int int6 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        boolean boolean42 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int43 = bookManager0.getBookCount();
        Book[] bookArray44 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "hi!");
        boolean boolean52 = bookManager0.DeleteBook(3);
        Book[] bookArray53 = bookManager0.getAllBooks();
        Book[] bookArray54 = bookManager0.getAllBooks();
        boolean boolean60 = bookManager0.UpdateBook(7, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(bookArray53);
        org.junit.Assert.assertNotNull(bookArray54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean47 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        int int54 = bookManager0.getBookCount();
        boolean boolean60 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        boolean boolean62 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        Book[] bookArray36 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "");
        Book[] bookArray43 = bookManager0.getAllBooks();
        boolean boolean45 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(bookArray36);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(10, "", "", "hi!", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean41 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass27 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray11 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass21 = bookArray20.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(0);
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 100, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "hi!", "", "", "");
        int int36 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean15 = bookManager0.DeleteBook(6);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        boolean boolean24 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean32 = bookManager0.DeleteBook((int) '4');
        boolean boolean38 = bookManager0.UpdateBook(3, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean17 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook(4, "hi!", "", "hi!", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(0, "", "", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook(6);
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(3, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(3, "", "", "", "");
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook((int) '#');
        java.lang.Class<?> wildcardClass27 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(0);
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) 'a');
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        Book[] bookArray39 = bookManager0.getAllBooks();
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook(5);
        boolean boolean32 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        BookManager bookManager0 = new BookManager();
        bookManager0.AddBook(100, "hi!", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(0);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        int int8 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(6, "hi!", "", "", "");
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray29 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook(0, "hi!", "", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean26 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "hi!");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean30 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        boolean boolean32 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray33 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook(0, "", "hi!", "", "");
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((-1), "", "", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookArray12.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass6 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "hi!");
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean41 = bookManager0.UpdateBook(7, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "", "hi!", "");
        boolean boolean20 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookArray21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        Book[] bookArray29 = bookManager0.getAllBooks();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) 10);
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "hi!");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 0);
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "hi!");
        int int35 = bookManager0.getBookCount();
        int int36 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean8 = bookManager0.DeleteBook(5);
        Book[] bookArray9 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass10 = bookArray9.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        boolean boolean5 = bookManager0.DeleteBook(0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.DeleteBook((int) (short) 1);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        boolean boolean13 = bookManager0.DeleteBook(0);
        int int14 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass15 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean32 = bookManager0.UpdateBook(1, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) -1);
        int int32 = bookManager0.getBookCount();
        boolean boolean38 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
        int int39 = bookManager0.getBookCount();
        Book[] bookArray40 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        int int38 = bookManager0.getBookCount();
        Book[] bookArray39 = bookManager0.getAllBooks();
        boolean boolean41 = bookManager0.DeleteBook((int) (byte) 0);
        int int42 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        int int38 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean41 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "");
        int int42 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 4 + "'", int42 == 4);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean21 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        boolean boolean23 = bookManager0.DeleteBook(4);
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook(4, "", "", "hi!", "");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        boolean boolean17 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "hi!", "", "", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        boolean boolean39 = bookManager0.UpdateBook(3, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean32 = bookManager0.DeleteBook(3);
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass14 = bookArray13.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook((int) (short) 1);
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean19 = bookManager0.DeleteBook(2);
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "");
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "", "", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(4);
        boolean boolean40 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "");
        boolean boolean46 = bookManager0.UpdateBook(1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(6);
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((-1), "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean27 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        Book[] bookArray44 = bookManager0.getAllBooks();
        Book[] bookArray45 = bookManager0.getAllBooks();
        int int46 = bookManager0.getBookCount();
        boolean boolean52 = bookManager0.UpdateBook(2, "", "hi!", "", "");
        int int53 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook(7);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook(2, "", "", "", "hi!");
        bookManager0.AddBook(7, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "");
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean42 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        boolean boolean44 = bookManager0.DeleteBook(0);
        int int45 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean35 = bookManager0.DeleteBook(2);
        boolean boolean41 = bookManager0.UpdateBook(7, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook(3, "", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.DeleteBook(0);
        boolean boolean29 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "");
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean55 = bookManager0.UpdateBook(3, "", "", "", "");
        boolean boolean57 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) '#', "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        bookManager0.AddBook(10, "", "", "", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        Book[] bookArray44 = bookManager0.getAllBooks();
        boolean boolean46 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 1);
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean23 = bookManager0.DeleteBook(4);
        boolean boolean29 = bookManager0.UpdateBook(6, "", "hi!", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) 'a');
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        boolean boolean5 = bookManager0.DeleteBook(0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        Book[] bookArray31 = bookManager0.getAllBooks();
        boolean boolean37 = bookManager0.UpdateBook(5, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        int int11 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        BookManager bookManager0 = new BookManager();
        bookManager0.AddBook(100, "hi!", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(100, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean47 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean59 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "hi!");
        boolean boolean61 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean22 = bookManager0.DeleteBook(100);
        boolean boolean28 = bookManager0.UpdateBook((int) ' ', "", "", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        boolean boolean46 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean31 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "hi!");
        int int45 = bookManager0.getBookCount();
        boolean boolean51 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "hi!", "", "", "");
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(0);
        Book[] bookArray25 = bookManager0.getAllBooks();
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(1);
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean29 = bookManager0.DeleteBook(0);
        boolean boolean31 = bookManager0.DeleteBook((int) ' ');
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray24 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass25 = bookArray24.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        int int8 = bookManager0.getBookCount();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook(6);
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(0);
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        Book[] bookArray44 = bookManager0.getAllBooks();
        int int45 = bookManager0.getBookCount();
        Book[] bookArray46 = bookManager0.getAllBooks();
        boolean boolean48 = bookManager0.DeleteBook((int) (byte) 10);
        java.lang.Class<?> wildcardClass49 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(bookArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int27 = bookManager0.getBookCount();
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        boolean boolean36 = bookManager0.UpdateBook(1, "", "", "hi!", "");
        Book[] bookArray37 = bookManager0.getAllBooks();
        boolean boolean43 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook(2, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        int int13 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "", "hi!", "", "");
        bookManager0.AddBook(7, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean11 = bookManager0.DeleteBook(10);
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        boolean boolean19 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        int int25 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        int int11 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass31 = bookArray30.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(2, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook(5, "hi!", "hi!", "hi!", "");
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook(2, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "");
        boolean boolean15 = bookManager0.DeleteBook(7);
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean13 = bookManager0.DeleteBook(100);
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(100);
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        int int29 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) 'a');
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        Book[] bookArray39 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass40 = bookArray39.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.DeleteBook((int) ' ');
        boolean boolean25 = bookManager0.DeleteBook(2);
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean19 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.DeleteBook(5);
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray34 = bookManager0.getAllBooks();
        int int35 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean43 = bookManager0.DeleteBook((int) (short) 0);
        int int44 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        boolean boolean25 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(7, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean29 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook(0);
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        boolean boolean26 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "hi!", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean36 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean38 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        int int45 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 100, "", "", "", "");
        boolean boolean26 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(6, "", "hi!", "hi!", "hi!");
        boolean boolean36 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        int int42 = bookManager0.getBookCount();
        Book[] bookArray43 = bookManager0.getAllBooks();
        int int44 = bookManager0.getBookCount();
        boolean boolean46 = bookManager0.DeleteBook(4);
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook(0, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook((int) (short) -1);
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean25 = bookManager0.DeleteBook(0);
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.DeleteBook(10);
        bookManager0.AddBook(6, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean29 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook(10);
        boolean boolean16 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(3, "hi!", "", "hi!", "");
        boolean boolean31 = bookManager0.UpdateBook(100, "", "", "", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean26 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "", "", "", "");
        boolean boolean29 = bookManager0.DeleteBook(7);
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook(4, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "");
        bookManager0.AddBook(10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        int int8 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        Book[] bookArray29 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        int int36 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        int int32 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((int) '4', "hi!", "", "", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(3, "hi!", "", "hi!", "");
        boolean boolean40 = bookManager0.DeleteBook(7);
        bookManager0.AddBook((-1), "hi!", "", "", "hi!");
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 10);
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        int int18 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.DeleteBook(7);
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean15 = bookManager0.DeleteBook(6);
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(1, "", "", "", "");
        boolean boolean23 = bookManager0.DeleteBook(4);
        boolean boolean29 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) '#');
        boolean boolean33 = bookManager0.DeleteBook((int) '4');
        boolean boolean39 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        boolean boolean45 = bookManager0.UpdateBook(0, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((-1), "", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "", "", "");
        int int24 = bookManager0.getBookCount();
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean33 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean35 = bookManager0.DeleteBook(10);
        Book[] bookArray36 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int38 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean27 = bookManager0.DeleteBook(4);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(5, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) (byte) 0);
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (short) 0, "", "", "hi!", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean31 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((-1), "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook(10);
        boolean boolean26 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        boolean boolean5 = bookManager0.DeleteBook(0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean14 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) ' ', "", "", "", "");
        boolean boolean33 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 100);
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(100);
        boolean boolean24 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) ' ');
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "", "hi!", "");
        int int27 = bookManager0.getBookCount();
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "");
        Book[] bookArray31 = bookManager0.getAllBooks();
        int int32 = bookManager0.getBookCount();
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean40 = bookManager0.UpdateBook((int) '4', "", "", "", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook((int) '#');
        boolean boolean24 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        Book[] bookArray42 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray42);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean37 = bookManager0.UpdateBook(100, "hi!", "", "hi!", "");
        boolean boolean43 = bookManager0.UpdateBook((int) '4', "", "", "", "");
        int int44 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean29 = bookManager0.UpdateBook(100, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((int) '#');
        boolean boolean18 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean23 = bookManager0.DeleteBook(4);
        boolean boolean29 = bookManager0.UpdateBook(6, "", "hi!", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 10, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((-1));
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass10 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(3);
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean16 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        boolean boolean34 = bookManager0.DeleteBook((int) (short) 100);
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "");
        Book[] bookArray40 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook(100);
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass34 = bookArray33.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass15 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        bookManager0.AddBook(0, "", "", "hi!", "");
        Book[] bookArray43 = bookManager0.getAllBooks();
        Book[] bookArray44 = bookManager0.getAllBooks();
        boolean boolean50 = bookManager0.UpdateBook(10, "", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "hi!", "hi!");
        boolean boolean62 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "");
        boolean boolean68 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray69 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(bookArray69);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) '4', "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        int int24 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookArray15.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "", "hi!", "hi!", "hi!");
        boolean boolean37 = bookManager0.DeleteBook(0);
        Book[] bookArray38 = bookManager0.getAllBooks();
        Book[] bookArray39 = bookManager0.getAllBooks();
        boolean boolean45 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        bookManager0.AddBook(4, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "");
        boolean boolean45 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "");
        boolean boolean15 = bookManager0.DeleteBook(7);
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "", "");
        Book[] bookArray43 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        Book[] bookArray26 = bookManager0.getAllBooks();
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(2);
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.UpdateBook(100, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook(2);
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean37 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook((int) ' ');
        boolean boolean31 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean37 = bookManager0.UpdateBook((-1), "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(6, "", "", "hi!", "hi!");
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook(6);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 10, "", "", "", "hi!");
        boolean boolean26 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean37 = bookManager0.UpdateBook(100, "hi!", "", "hi!", "");
        boolean boolean39 = bookManager0.DeleteBook(10);
        boolean boolean41 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray42 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray42);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray26 = bookManager0.getAllBooks();
        Book[] bookArray27 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean41 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray29 = bookManager0.getAllBooks();
        boolean boolean35 = bookManager0.UpdateBook((int) '4', "", "", "", "hi!");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean30 = bookManager0.UpdateBook(7, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) ' ');
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "hi!");
        boolean boolean42 = bookManager0.DeleteBook((int) (byte) -1);
        int int43 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean55 = bookManager0.UpdateBook(6, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "hi!", "", "");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(100, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.DeleteBook(7);
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook(10);
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        boolean boolean48 = bookManager0.UpdateBook(3, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        boolean boolean33 = bookManager0.UpdateBook((-1), "", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        bookManager0.AddBook(0, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(3);
        boolean boolean24 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) '4', "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook(10);
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        Book[] bookArray29 = bookManager0.getAllBooks();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray32 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean47 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) ' ', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        int int28 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "");
        int int31 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        int int4 = bookManager0.getBookCount();
        int int5 = bookManager0.getBookCount();
        Book[] bookArray6 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass7 = bookArray6.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(5, "", "", "", "hi!");
        bookManager0.AddBook(5, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 1);
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook(6, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) (short) -1);
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        int int28 = bookManager0.getBookCount();
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "");
        Book[] bookArray31 = bookManager0.getAllBooks();
        int int32 = bookManager0.getBookCount();
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean36 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean23 = bookManager0.DeleteBook(4);
        boolean boolean25 = bookManager0.DeleteBook((int) '#');
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(2, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.DeleteBook((int) 'a');
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook(0);
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '#', "hi!", "", "hi!", "hi!");
        boolean boolean25 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        boolean boolean38 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "hi!");
        Book[] bookArray39 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        boolean boolean40 = bookManager0.DeleteBook(10);
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean13 = bookManager0.DeleteBook((int) ' ');
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "");
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "", "hi!", "hi!", "hi!");
        boolean boolean37 = bookManager0.DeleteBook(0);
        Book[] bookArray38 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass39 = bookArray38.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean20 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "", "hi!");
        boolean boolean36 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(5);
        boolean boolean42 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "hi!");
        bookManager0.AddBook(5, "", "", "hi!", "hi!");
        Book[] bookArray49 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass50 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook(0, "", "", "", "");
        int int33 = bookManager0.getBookCount();
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "");
        int int30 = bookManager0.getBookCount();
        Book[] bookArray31 = bookManager0.getAllBooks();
        Book[] bookArray32 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass33 = bookArray32.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook(1);
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "", "", "");
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        Book[] bookArray42 = bookManager0.getAllBooks();
        int int43 = bookManager0.getBookCount();
        boolean boolean45 = bookManager0.DeleteBook((int) (short) 1);
        int int46 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook(0);
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(0);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass30 = bookArray29.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        boolean boolean42 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int43 = bookManager0.getBookCount();
        Book[] bookArray44 = bookManager0.getAllBooks();
        int int45 = bookManager0.getBookCount();
        int int46 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook(5, "", "", "", "");
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(0);
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) '4');
        boolean boolean31 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        boolean boolean33 = bookManager0.DeleteBook(10);
        boolean boolean35 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean23 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (short) 10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        boolean boolean32 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean38 = bookManager0.UpdateBook((int) ' ', "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 100);
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean22 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean11 = bookManager0.DeleteBook(10);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        boolean boolean42 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int43 = bookManager0.getBookCount();
        Book[] bookArray44 = bookManager0.getAllBooks();
        int int45 = bookManager0.getBookCount();
        boolean boolean47 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "");
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "hi!", "");
        boolean boolean35 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "");
        boolean boolean31 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean37 = bookManager0.UpdateBook(7, "", "", "hi!", "hi!");
        boolean boolean39 = bookManager0.DeleteBook(1);
        boolean boolean41 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean47 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "");
        Book[] bookArray48 = bookManager0.getAllBooks();
        int int49 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookArray48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) 'a');
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean38 = bookManager0.UpdateBook(10, "hi!", "", "", "");
        Book[] bookArray39 = bookManager0.getAllBooks();
        Book[] bookArray40 = bookManager0.getAllBooks();
        boolean boolean42 = bookManager0.DeleteBook((int) (short) 10);
        int int43 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "", "", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "", "", "");
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook(2, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        int int28 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook(4, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "hi!", "hi!");
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean19 = bookManager0.UpdateBook(10, "", "", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(10, "", "", "hi!", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        bookManager0.AddBook(7, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.DeleteBook((int) 'a');
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 1);
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass11 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean41 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        bookManager0.AddBook(0, "", "", "hi!", "");
        Book[] bookArray43 = bookManager0.getAllBooks();
        bookManager0.AddBook(7, "", "", "", "hi!");
        bookManager0.AddBook(0, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int15 = bookManager0.getBookCount();
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((-1));
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook(7, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        boolean boolean13 = bookManager0.DeleteBook(0);
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook(1);
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) '4', "hi!", "", "hi!", "hi!");
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 10);
        int int35 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(0);
        Book[] bookArray29 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass30 = bookArray29.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook(10);
        boolean boolean16 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(0);
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) '4');
        boolean boolean31 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        boolean boolean33 = bookManager0.DeleteBook(10);
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        int int39 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "hi!", "", "hi!");
        int int14 = bookManager0.getBookCount();
        int int15 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean23 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean31 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "");
        boolean boolean37 = bookManager0.UpdateBook(7, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(5);
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray24 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray17 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean18 = bookManager0.DeleteBook(4);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook(1, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        boolean boolean42 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int43 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) '4', "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) '#', "", "", "", "");
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        Book[] bookArray44 = bookManager0.getAllBooks();
        int int45 = bookManager0.getBookCount();
        boolean boolean51 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "hi!");
        Book[] bookArray58 = bookManager0.getAllBooks();
        boolean boolean64 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(bookArray58);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean20 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        boolean boolean29 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "");
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook(6, "", "hi!", "", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean23 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) ' ');
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "", "", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook(10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean22 = bookManager0.UpdateBook(4, "", "", "", "");
        boolean boolean24 = bookManager0.DeleteBook((-1));
        boolean boolean30 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        bookManager0.AddBook((int) 'a', "hi!", "", "", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "hi!");
        boolean boolean50 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean22 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook((int) ' ', "", "", "", "");
        boolean boolean41 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) 'a');
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 0);
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(5);
        boolean boolean42 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        boolean boolean48 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean11 = bookManager0.DeleteBook(10);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(10);
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook(2);
        bookManager0.AddBook(10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean46 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "hi!");
        int int53 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        boolean boolean44 = bookManager0.UpdateBook(10, "hi!", "hi!", "hi!", "");
        boolean boolean50 = bookManager0.UpdateBook(7, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(3);
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook(4, "hi!", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook(4);
        boolean boolean17 = bookManager0.DeleteBook(3);
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean33 = bookManager0.DeleteBook((int) 'a');
        boolean boolean39 = bookManager0.UpdateBook(10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        int int18 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.DeleteBook(1);
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookArray21.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(100);
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "");
        boolean boolean35 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "");
        boolean boolean42 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.UpdateBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "hi!", "", "hi!", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) 'a');
        boolean boolean37 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "", "", "hi!", "");
        Book[] bookArray44 = bookManager0.getAllBooks();
        boolean boolean46 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) -1);
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "hi!");
        int int38 = bookManager0.getBookCount();
        boolean boolean40 = bookManager0.DeleteBook(6);
        Book[] bookArray41 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass42 = bookArray41.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "", "hi!", "hi!");
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean26 = bookManager0.DeleteBook((int) 'a');
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        boolean boolean39 = bookManager0.UpdateBook(5, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 0);
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean47 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        int int54 = bookManager0.getBookCount();
        boolean boolean60 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 4 + "'", int54 == 4);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "hi!", "", "", "");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean27 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "hi!", "", "", "");
        bookManager0.AddBook(5, "", "", "hi!", "hi!");
        boolean boolean43 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(0, "", "", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook(6);
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook(2);
        bookManager0.AddBook(10, "", "hi!", "hi!", "hi!");
        boolean boolean40 = bookManager0.DeleteBook((int) ' ');
        boolean boolean46 = bookManager0.UpdateBook(6, "hi!", "", "", "hi!");
        int int47 = bookManager0.getBookCount();
        boolean boolean53 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass54 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(6, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean7 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook(0, "", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) '#');
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean40 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean42 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.DeleteBook(0);
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) -1);
        int int32 = bookManager0.getBookCount();
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(2, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        int int11 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(4);
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook(2);
        bookManager0.AddBook(1, "hi!", "", "", "hi!");
        int int39 = bookManager0.getBookCount();
        boolean boolean45 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "hi!");
        boolean boolean51 = bookManager0.UpdateBook(7, "", "", "hi!", "hi!");
        boolean boolean57 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean59 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        Book[] bookArray11 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass15 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook(2);
        Book[] bookArray33 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray40 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(6);
        int int37 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean33 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean35 = bookManager0.DeleteBook(10);
        boolean boolean37 = bookManager0.DeleteBook(0);
        boolean boolean39 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        bookManager0.AddBook(3, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(5, "hi!", "hi!", "", "");
        bookManager0.AddBook(7, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(5);
        boolean boolean23 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(100, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "", "hi!", "");
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }
}

