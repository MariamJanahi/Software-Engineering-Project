import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import data.Book;
import business.BookManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        int int50 = bookManager0.getBookCount();
        boolean boolean56 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        boolean boolean58 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        int int38 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        boolean boolean34 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        Book[] bookArray5 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass6 = bookArray5.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(4, "", "", "", "hi!");
        boolean boolean37 = bookManager0.UpdateBook(2, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean35 = bookManager0.DeleteBook(2);
        boolean boolean37 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook(10);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean14 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
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
        Book[] bookArray33 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean30 = bookManager0.UpdateBook(1, "", "", "hi!", "hi!");
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        int int24 = bookManager0.getBookCount();
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "");
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 100);
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(5, "", "", "", "hi!");
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "hi!", "hi!", "", "hi!");
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean18 = bookManager0.UpdateBook((int) 'a', "hi!", "", "", "hi!");
        bookManager0.AddBook(100, "hi!", "", "", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean27 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        boolean boolean33 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook(5, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass40 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        bookManager0.AddBook(7, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        Book[] bookArray48 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(bookArray48);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        boolean boolean32 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(1, "", "", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        int int18 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "", "", "hi!");
        bookManager0.AddBook(1, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass47 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        boolean boolean19 = bookManager0.DeleteBook((-1));
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        int int12 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean13 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray14 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass15 = bookArray14.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) (short) -1, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        boolean boolean42 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        int int43 = bookManager0.getBookCount();
        Book[] bookArray44 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass45 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int27 = bookManager0.getBookCount();
        boolean boolean33 = bookManager0.UpdateBook(10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "", "", "");
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
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
        boolean boolean37 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "");
        bookManager0.AddBook(10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "hi!", "hi!");
        boolean boolean40 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        boolean boolean24 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        boolean boolean38 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
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
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook(3, "", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) ' ');
        boolean boolean24 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.DeleteBook(5);
        boolean boolean21 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        boolean boolean29 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook(5);
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean25 = bookManager0.DeleteBook(0);
        boolean boolean31 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        boolean boolean37 = bookManager0.UpdateBook(100, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean23 = bookManager0.UpdateBook(2, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray29 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass30 = bookArray29.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookArray12.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((int) '#');
        int int13 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 0);
        int int17 = bookManager0.getBookCount();
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        Book[] bookArray26 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass27 = bookArray26.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
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
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass20 = bookArray19.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(100, "", "hi!", "hi!", "");
        int int28 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "hi!");
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) -1);
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "", "hi!");
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean14 = bookManager0.UpdateBook(5, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "", "", "hi!", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        boolean boolean67 = bookManager0.UpdateBook(3, "hi!", "", "hi!", "hi!");
        Book[] bookArray68 = bookManager0.getAllBooks();
        boolean boolean74 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "", "hi!");
        boolean boolean76 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(bookArray68);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(100);
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean37 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean25 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean27 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (short) -1);
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        boolean boolean23 = bookManager0.DeleteBook(1);
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
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
        boolean boolean40 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
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
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.DeleteBook(5);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((int) (short) 1, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int39 = bookManager0.getBookCount();
        bookManager0.AddBook((-1), "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass11 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean33 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "");
        bookManager0.AddBook(6, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        boolean boolean33 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        bookManager0.AddBook(7, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass42 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean35 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        boolean boolean19 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.DeleteBook((int) 'a');
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) ' ', "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((-1), "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.UpdateBook(10, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        boolean boolean52 = bookManager0.UpdateBook(10, "", "", "", "");
        boolean boolean58 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass59 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(bookArray46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        bookManager0.AddBook(3, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean16 = bookManager0.DeleteBook(5);
        boolean boolean18 = bookManager0.DeleteBook((int) '4');
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "", "", "hi!", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(5, "hi!", "", "hi!", "");
        boolean boolean32 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        int int30 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean42 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean14 = bookManager0.UpdateBook(5, "", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((int) '#');
        boolean boolean18 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(0);
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean40 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass8 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
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
        int int45 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean53 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass15 = bookArray14.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean33 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) 'a', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
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
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook(4);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        int int18 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookArray15.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray9 = bookManager0.getAllBooks();
        int int10 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        Book[] bookArray11 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "", "", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean35 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        Book[] bookArray37 = bookManager0.getAllBooks();
        bookManager0.AddBook(3, "", "", "hi!", "");
        boolean boolean49 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
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
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "hi!", "hi!");
        Book[] bookArray35 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass36 = bookArray35.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
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
        boolean boolean31 = bookManager0.DeleteBook((int) '4');
        boolean boolean37 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "");
        int int38 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
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
        boolean boolean32 = bookManager0.UpdateBook(0, "", "", "hi!", "hi!");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "", "", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean36 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((-1));
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean36 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        boolean boolean42 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass43 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook(1, "", "hi!", "", "hi!");
        int int36 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook(1, "", "hi!", "", "hi!");
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 1);
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "hi!");
        int int15 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean26 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean21 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
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
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 1);
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean13 = bookManager0.DeleteBook((int) ' ');
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean6 = bookManager0.DeleteBook(100);
        boolean boolean8 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        bookManager0.AddBook(1, "hi!", "hi!", "", "hi!");
        boolean boolean26 = bookManager0.DeleteBook(0);
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (short) 10, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        bookManager0.AddBook(0, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
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
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "");
        Book[] bookArray33 = bookManager0.getAllBooks();
        boolean boolean39 = bookManager0.UpdateBook(6, "", "", "hi!", "");
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 100);
        int int16 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "");
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
        Book[] bookArray33 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass34 = bookArray33.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(1, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        int int11 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
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
        boolean boolean39 = bookManager0.UpdateBook(1, "", "", "", "hi!");
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean16 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
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
        bookManager0.AddBook((int) 'a', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        Book[] bookArray24 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass25 = bookArray24.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "hi!", "hi!", "", "");
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) 'a');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass9 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(4);
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "");
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(6, "hi!", "", "", "");
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        Book[] bookArray29 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        int int4 = bookManager0.getBookCount();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        int int28 = bookManager0.getBookCount();
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        int int20 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook(6);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(0);
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        bookManager0.AddBook(100, "", "", "", "");
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook(10, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook(2, "", "", "hi!", "hi!");
        bookManager0.AddBook(100, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) -1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        int int39 = bookManager0.getBookCount();
        boolean boolean45 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        int int11 = bookManager0.getBookCount();
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
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
        int int40 = bookManager0.getBookCount();
        int int41 = bookManager0.getBookCount();
        Book[] bookArray42 = bookManager0.getAllBooks();
        boolean boolean44 = bookManager0.DeleteBook(7);
        Book[] bookArray45 = bookManager0.getAllBooks();
        boolean boolean51 = bookManager0.UpdateBook((int) (short) -1, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
        org.junit.Assert.assertNotNull(bookArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
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
        boolean boolean45 = bookManager0.DeleteBook((int) (short) 0);
        int int46 = bookManager0.getBookCount();
        boolean boolean48 = bookManager0.DeleteBook(4);
        boolean boolean50 = bookManager0.DeleteBook(0);
        int int51 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 4 + "'", int51 == 4);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean11 = bookManager0.DeleteBook(10);
        boolean boolean17 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        bookManager0.AddBook(4, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
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
        boolean boolean36 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook(2, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        boolean boolean19 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.DeleteBook(10);
        bookManager0.AddBook(5, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int31 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 0);
        int int19 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "", "hi!", "", "");
        int int27 = bookManager0.getBookCount();
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        int int26 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "");
        int int33 = bookManager0.getBookCount();
        boolean boolean39 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean13 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean29 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        int int30 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass11 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
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
        boolean boolean27 = bookManager0.UpdateBook(2, "hi!", "hi!", "hi!", "");
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
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean25 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean33 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
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
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
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
        int int40 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
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
        boolean boolean25 = bookManager0.DeleteBook(5);
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
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "", "", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        Book[] bookArray5 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass6 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean13 = bookManager0.DeleteBook((int) ' ');
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean22 = bookManager0.DeleteBook(2);
        Book[] bookArray23 = bookManager0.getAllBooks();
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean32 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook(4, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "", "hi!", "", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
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
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "");
        int int51 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        Book[] bookArray29 = bookManager0.getAllBooks();
        boolean boolean35 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        boolean boolean13 = bookManager0.DeleteBook(6);
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "hi!", "", "", "hi!");
        int int28 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "");
        Book[] bookArray26 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass27 = bookArray26.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook(100);
        boolean boolean20 = bookManager0.DeleteBook(2);
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
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
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
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
        Book[] bookArray38 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
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
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
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
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook(10, "hi!", "", "hi!", "");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "");
        boolean boolean43 = bookManager0.UpdateBook((int) 'a', "hi!", "", "", "hi!");
        Book[] bookArray44 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass45 = bookArray44.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
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
        java.lang.Class<?> wildcardClass47 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "");
        int int28 = bookManager0.getBookCount();
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
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
        int int34 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        boolean boolean39 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray40 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass41 = bookArray40.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean25 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        boolean boolean27 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
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
        int int56 = bookManager0.getBookCount();
        Book[] bookArray57 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 6 + "'", int56 == 6);
        org.junit.Assert.assertNotNull(bookArray57);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean19 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.DeleteBook(5);
        boolean boolean23 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean32 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean17 = bookManager0.DeleteBook(7);
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
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
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean23 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(7, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.DeleteBook((int) 'a');
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((int) '#');
        boolean boolean18 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean20 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        boolean boolean29 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass4 = bookArray3.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        bookManager0.AddBook(6, "hi!", "", "", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        Book[] bookArray32 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        int int20 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
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
        boolean boolean31 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
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
        boolean boolean33 = bookManager0.DeleteBook(0);
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        Book[] bookArray39 = bookManager0.getAllBooks();
        Book[] bookArray40 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
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
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "hi!", "hi!");
        boolean boolean51 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook(0, "", "hi!", "", "");
        bookManager0.AddBook((int) '#', "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        int int26 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean29 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        bookManager0.AddBook(5, "", "", "hi!", "");
        boolean boolean41 = bookManager0.UpdateBook((int) '4', "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
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
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean17 = bookManager0.DeleteBook(7);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(2, "", "", "", "");
        bookManager0.AddBook((int) 'a', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookArray15.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
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
        java.lang.Class<?> wildcardClass44 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean6 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(100);
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(5, "hi!", "hi!", "", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
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
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean14 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean17 = bookManager0.DeleteBook(7);
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "", "", "hi!");
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) ' ');
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "");
        int int35 = bookManager0.getBookCount();
        boolean boolean37 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
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
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean56 = bookManager0.DeleteBook(4);
        boolean boolean62 = bookManager0.UpdateBook(3, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass63 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
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
        bookManager0.AddBook(3, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        Book[] bookArray57 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertNotNull(bookArray57);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
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
        boolean boolean27 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook(10);
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        int int24 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean36 = bookManager0.UpdateBook(5, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(2, "hi!", "", "hi!", "");
        boolean boolean26 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
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
        boolean boolean44 = bookManager0.DeleteBook(6);
        boolean boolean50 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) 'a');
        java.lang.Class<?> wildcardClass10 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean19 = bookManager0.DeleteBook(2);
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
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
        java.lang.Class<?> wildcardClass22 = bookArray21.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean36 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean38 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 100);
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "");
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(100);
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
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
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) ' ');
        int int26 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
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
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "");
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook(4);
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean34 = bookManager0.UpdateBook(2, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
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
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean56 = bookManager0.DeleteBook(4);
        boolean boolean62 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook(100, "hi!", "", "hi!", "");
        int int32 = bookManager0.getBookCount();
        boolean boolean38 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
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
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "hi!", "hi!", "hi!");
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
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
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        int int8 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook(4, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        boolean boolean38 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        boolean boolean14 = bookManager0.DeleteBook(100);
        int int15 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "", "hi!");
        boolean boolean10 = bookManager0.DeleteBook(3);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.DeleteBook(0);
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean25 = bookManager0.DeleteBook(0);
        boolean boolean31 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        Book[] bookArray32 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "", "", "", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean29 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        int int30 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "", "hi!", "");
        boolean boolean38 = bookManager0.DeleteBook((-1));
        Book[] bookArray39 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(7, "hi!", "", "", "");
        bookManager0.AddBook(10, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
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
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 100);
        int int15 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
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
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(2);
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook(100);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(100, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        int int35 = bookManager0.getBookCount();
        boolean boolean37 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        boolean boolean25 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
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
        boolean boolean41 = bookManager0.DeleteBook(1);
        java.lang.Class<?> wildcardClass42 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
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
        boolean boolean40 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        int int42 = bookManager0.getBookCount();
        boolean boolean44 = bookManager0.DeleteBook((int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        int int8 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
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
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((-1));
        boolean boolean17 = bookManager0.DeleteBook(1);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((-1), "", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray16 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
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
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray50 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass51 = bookArray50.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        int int30 = bookManager0.getBookCount();
        Book[] bookArray31 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook((int) '#');
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook(10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "", "", "hi!");
        bookManager0.AddBook(1, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "hi!", "", "", "");
        int int47 = bookManager0.getBookCount();
        int int48 = bookManager0.getBookCount();
        boolean boolean54 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass55 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
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
        Book[] bookArray38 = bookManager0.getAllBooks();
        int int39 = bookManager0.getBookCount();
        Book[] bookArray40 = bookManager0.getAllBooks();
        boolean boolean42 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(bookArray11);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '#', "", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((-1), "", "hi!", "", "");
        boolean boolean32 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook((int) ' ');
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "");
        boolean boolean36 = bookManager0.UpdateBook(0, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass14 = bookArray13.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean20 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
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
        Book[] bookArray38 = bookManager0.getAllBooks();
        boolean boolean44 = bookManager0.UpdateBook(6, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean23 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        boolean boolean38 = bookManager0.UpdateBook(5, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
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
        boolean boolean42 = bookManager0.UpdateBook(5, "", "", "", "");
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookArray21.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean11 = bookManager0.DeleteBook(10);
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(3, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
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
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookArray23.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.DeleteBook(6);
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean37 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
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
        bookManager0.AddBook((int) (byte) 1, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook((-1), "", "hi!", "", "hi!");
        Book[] bookArray18 = bookManager0.getAllBooks();
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
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
        Book[] bookArray39 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
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
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((-1));
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
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) ' ', "", "", "", "");
        boolean boolean27 = bookManager0.DeleteBook(4);
        int int28 = bookManager0.getBookCount();
        int int29 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook(2);
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
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        boolean boolean21 = bookManager0.UpdateBook(5, "hi!", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((int) '4', "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean32 = bookManager0.DeleteBook((int) '4');
        boolean boolean34 = bookManager0.DeleteBook((-1));
        boolean boolean40 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
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
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
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
        boolean boolean42 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        int int43 = bookManager0.getBookCount();
        Book[] bookArray44 = bookManager0.getAllBooks();
        int int45 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) '#');
        boolean boolean31 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(4, "", "", "", "hi!");
        boolean boolean37 = bookManager0.UpdateBook(2, "", "", "hi!", "hi!");
        int int38 = bookManager0.getBookCount();
        boolean boolean44 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean50 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray51 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookArray51);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        boolean boolean39 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook(1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((-1));
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray29 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean43 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        bookManager0.AddBook(10, "", "", "", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        int int44 = bookManager0.getBookCount();
        Book[] bookArray45 = bookManager0.getAllBooks();
        bookManager0.AddBook(10, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(bookArray45);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
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
        int int48 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 3 + "'", int48 == 3);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook(5, "", "", "", "");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (short) 0);
        int int11 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) ' ');
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "", "", "hi!");
        bookManager0.AddBook(1, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "hi!", "", "", "");
        int int47 = bookManager0.getBookCount();
        int int48 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass49 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((-1));
        int int26 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 100);
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean13 = bookManager0.DeleteBook((int) ' ');
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean18 = bookManager0.UpdateBook((int) 'a', "hi!", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        int int30 = bookManager0.getBookCount();
        Book[] bookArray31 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass32 = bookArray31.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((-1));
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
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
        Book[] bookArray17 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass18 = bookArray17.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook(7, "hi!", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
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
        boolean boolean29 = bookManager0.DeleteBook(5);
        boolean boolean35 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }
}

