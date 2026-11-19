import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook(2, "", "", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(10);
        boolean boolean23 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((-1), "", "", "", "");
        int int12 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
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
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean23 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(5);
        bookManager0.AddBook(0, "hi!", "", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
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
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "", "", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook(7, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((int) '4', "hi!", "", "", "");
        bookManager0.AddBook(2, "", "", "hi!", "hi!");
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
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
        boolean boolean20 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
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
        boolean boolean54 = bookManager0.UpdateBook(100, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
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
        boolean boolean39 = bookManager0.UpdateBook((int) '4', "hi!", "", "hi!", "hi!");
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
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass27 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
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
        int int46 = bookManager0.getBookCount();
        boolean boolean48 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
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
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook(10, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook(2, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
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
        Book[] bookArray23 = bookManager0.getAllBooks();
        int int24 = bookManager0.getBookCount();
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
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook(0, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
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
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "");
        bookManager0.AddBook(6, "", "", "", "");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean15 = bookManager0.DeleteBook(6);
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean23 = bookManager0.UpdateBook(0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean19 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        bookManager0.AddBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean37 = bookManager0.DeleteBook((int) (short) -1);
        bookManager0.AddBook(3, "hi!", "", "", "");
        boolean boolean49 = bookManager0.UpdateBook((int) (short) 0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
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
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        boolean boolean7 = bookManager0.DeleteBook((int) '4');
        boolean boolean9 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        Book[] bookArray37 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass38 = bookArray37.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        int int8 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass9 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
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
        boolean boolean31 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
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
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
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
        Book[] bookArray46 = bookManager0.getAllBooks();
        boolean boolean52 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookArray46);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        int int4 = bookManager0.getBookCount();
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        bookManager0.AddBook(5, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
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
        bookManager0.AddBook(7, "hi!", "hi!", "", "");
        boolean boolean37 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        int int33 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "hi!", "", "", "");
        boolean boolean45 = bookManager0.UpdateBook(1, "", "", "", "");
        Book[] bookArray46 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookArray46);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean26 = bookManager0.DeleteBook(2);
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook(5);
        int int22 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        bookManager0.AddBook((int) '4', "", "", "", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray6 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
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
        bookManager0.AddBook(10, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
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
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        boolean boolean38 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        boolean boolean40 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(2, "", "", "", "");
        boolean boolean24 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
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
        boolean boolean38 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        boolean boolean50 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
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
        boolean boolean31 = bookManager0.DeleteBook((-1));
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
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
        int int25 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        int int8 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass9 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        int int30 = bookManager0.getBookCount();
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(1, "", "", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        int int12 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        boolean boolean40 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean42 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray43 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        bookManager0.AddBook((-1), "", "", "hi!", "");
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
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
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        boolean boolean17 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
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
        Book[] bookArray52 = bookManager0.getAllBooks();
        int int53 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
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
        java.lang.Class<?> wildcardClass50 = bookArray49.getClass();
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
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean13 = bookManager0.DeleteBook((int) '4');
        boolean boolean15 = bookManager0.DeleteBook((int) '#');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        boolean boolean23 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        bookManager0.AddBook(2, "hi!", "", "", "");
        boolean boolean31 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        int int35 = bookManager0.getBookCount();
        Book[] bookArray36 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
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
        bookManager0.AddBook((-1), "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "");
        int int20 = bookManager0.getBookCount();
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
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
        Book[] bookArray35 = bookManager0.getAllBooks();
        Book[] bookArray36 = bookManager0.getAllBooks();
        int int37 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertNotNull(bookArray36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        int int4 = bookManager0.getBookCount();
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.DeleteBook(100);
        bookManager0.AddBook(1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
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
        int int47 = bookManager0.getBookCount();
        int int48 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(bookArray46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 5 + "'", int47 == 5);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) '4', "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean29 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
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
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        int int29 = bookManager0.getBookCount();
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray31 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean35 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook((int) '#', "", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(0, "hi!", "", "hi!", "");
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        int int18 = bookManager0.getBookCount();
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        int int36 = bookManager0.getBookCount();
        int int37 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        int int18 = bookManager0.getBookCount();
        int int19 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook(2, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
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
        boolean boolean28 = bookManager0.DeleteBook(100);
        boolean boolean30 = bookManager0.DeleteBook(5);
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook(7);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "hi!");
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean36 = bookManager0.UpdateBook((int) '#', "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(4);
        boolean boolean34 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "");
        boolean boolean36 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
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
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "", "");
        boolean boolean27 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
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
        Book[] bookArray28 = bookManager0.getAllBooks();
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
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
        boolean boolean27 = bookManager0.DeleteBook(10);
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
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
        boolean boolean45 = bookManager0.DeleteBook(0);
        boolean boolean51 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
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
        boolean boolean39 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        boolean boolean45 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
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
        bookManager0.AddBook(7, "", "hi!", "hi!", "");
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
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook(2, "hi!", "", "hi!", "");
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "hi!", "", "", "");
        boolean boolean37 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
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
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "hi!");
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
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook(10, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((-1), "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
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
        int int44 = bookManager0.getBookCount();
        int int45 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 4 + "'", int45 == 4);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        int int8 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        boolean boolean20 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass12 = bookArray11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
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
        int int46 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
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
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) '4', "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean23 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        boolean boolean25 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "", "", "", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((-1), "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "hi!", "");
        boolean boolean31 = bookManager0.DeleteBook(4);
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "", "", "", "");
        boolean boolean45 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
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
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean6 = bookManager0.DeleteBook(100);
        bookManager0.AddBook(1, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
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
        bookManager0.AddBook(6, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        boolean boolean44 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
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
        boolean boolean39 = bookManager0.UpdateBook(5, "", "", "", "hi!");
        int int40 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean20 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "");
        int int27 = bookManager0.getBookCount();
        Book[] bookArray28 = bookManager0.getAllBooks();
        Book[] bookArray29 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass30 = bookArray29.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        boolean boolean37 = bookManager0.UpdateBook((int) '4', "", "", "", "");
        bookManager0.AddBook((int) ' ', "", "", "", "hi!");
        Book[] bookArray44 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookArray44);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        boolean boolean37 = bookManager0.DeleteBook(1);
        Book[] bookArray38 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookArray38);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(100, "hi!", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook(100, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
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
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook(10, "", "", "", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook(10);
        Book[] bookArray26 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass27 = bookArray26.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) '4', "", "", "", "hi!");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
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
        java.lang.Class<?> wildcardClass34 = bookArray33.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean19 = bookManager0.DeleteBook((-1));
        boolean boolean21 = bookManager0.DeleteBook(5);
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.DeleteBook((-1));
        boolean boolean26 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        int int4 = bookManager0.getBookCount();
        boolean boolean6 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((int) '#', "hi!", "", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4163");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        int int9 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4164");
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
        int int37 = bookManager0.getBookCount();
        boolean boolean43 = bookManager0.UpdateBook(100, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4165");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean13 = bookManager0.DeleteBook(100);
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test4166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4166");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean21 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4167");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean23 = bookManager0.UpdateBook(100, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4168");
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
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        boolean boolean39 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "");
        boolean boolean45 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4169");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "");
        boolean boolean23 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4170");
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
        boolean boolean42 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean44 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test4171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4171");
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
        boolean boolean39 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "");
        boolean boolean51 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        int int52 = bookManager0.getBookCount();
        int int53 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 4 + "'", int53 == 4);
    }

    @Test
    public void test4172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4172");
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
        boolean boolean36 = bookManager0.UpdateBook(10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4173");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray26 = bookManager0.getAllBooks();
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test4174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4174");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        Book[] bookArray41 = bookManager0.getAllBooks();
        Book[] bookArray42 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray41);
        org.junit.Assert.assertNotNull(bookArray42);
    }

    @Test
    public void test4175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4175");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook(100);
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4176");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean11 = bookManager0.DeleteBook(10);
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "hi!", "hi!", "", "");
        boolean boolean26 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4177");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4178");
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
        bookManager0.AddBook(7, "", "", "hi!", "");
        boolean boolean42 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4179");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test4180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4180");
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
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4181");
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
        int int49 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass50 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test4182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4182");
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
        boolean boolean33 = bookManager0.DeleteBook(100);
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4183");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook(6, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4184");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4185");
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
        boolean boolean40 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean46 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test4186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4186");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4187");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4188");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test4189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4189");
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
        boolean boolean55 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        boolean boolean61 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test4190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4190");
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
        boolean boolean27 = bookManager0.DeleteBook(5);
        boolean boolean29 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean31 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4191");
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
        boolean boolean37 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4192");
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
        boolean boolean45 = bookManager0.DeleteBook(0);
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test4193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4193");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((-1), "", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook(5, "", "", "", "");
        bookManager0.AddBook(100, "hi!", "", "hi!", "");
        int int38 = bookManager0.getBookCount();
        int int39 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
    }

    @Test
    public void test4194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4194");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook(4, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test4195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4195");
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
        boolean boolean35 = bookManager0.UpdateBook(4, "hi!", "", "", "hi!");
        bookManager0.AddBook(6, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4196");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4197");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test4198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4198");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4199");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "");
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook(7, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4200");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook(4, "hi!", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "hi!", "", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4201");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4202");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(0, "", "", "", "");
        int int33 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4203");
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
        boolean boolean45 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test4204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4204");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(3, "", "", "", "");
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test4205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4205");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4206");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test4207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4207");
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
        boolean boolean39 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test4208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4208");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        boolean boolean42 = bookManager0.UpdateBook((int) (short) 100, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4209");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4210");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean11 = bookManager0.DeleteBook(10);
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test4211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4211");
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
        bookManager0.AddBook(10, "", "", "hi!", "");
        boolean boolean53 = bookManager0.DeleteBook(10);
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test4212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4212");
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
        int int33 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.DeleteBook((int) (byte) 10);
        int int36 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 3 + "'", int36 == 3);
    }

    @Test
    public void test4213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4213");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(0);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean20 = bookManager0.UpdateBook(3, "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4214");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4215");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4216");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        boolean boolean22 = bookManager0.DeleteBook(0);
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4217");
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
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test4218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4218");
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
        boolean boolean38 = bookManager0.DeleteBook(100);
        int int39 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
    }

    @Test
    public void test4219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4219");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(6, "", "", "", "");
        boolean boolean21 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4220");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(3, "", "", "", "");
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean32 = bookManager0.DeleteBook((-1));
        boolean boolean38 = bookManager0.UpdateBook(3, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4221");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test4222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4222");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        int int10 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass11 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4223");
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
        Book[] bookArray44 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(bookArray44);
    }

    @Test
    public void test4224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4224");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test4225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4225");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4226");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean26 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4227");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "");
        boolean boolean25 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4228");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4229");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 100);
        int int22 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4230");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4231");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean22 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '4', "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4232");
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
        boolean boolean38 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4233");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean19 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4234");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        boolean boolean35 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test4235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4235");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean40 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test4236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4236");
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
        boolean boolean56 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean58 = bookManager0.DeleteBook(10);
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
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test4237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4237");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        bookManager0.AddBook(4, "", "", "hi!", "hi!");
        boolean boolean28 = bookManager0.UpdateBook((int) '4', "hi!", "", "", "hi!");
        boolean boolean30 = bookManager0.DeleteBook(4);
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test4238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4238");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.UpdateBook(10, "", "", "hi!", "hi!");
        int int26 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.UpdateBook(1, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4239");
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
        boolean boolean29 = bookManager0.DeleteBook(5);
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test4240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4240");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test4241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4241");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook(7, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4242");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean38 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4243");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        bookManager0.AddBook(6, "hi!", "", "", "");
        Book[] bookArray31 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4244");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) ' ');
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4245");
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
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4246");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4247");
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
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean37 = bookManager0.DeleteBook((int) ' ');
        int int38 = bookManager0.getBookCount();
        Book[] bookArray39 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test4248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4248");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test4249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4249");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((-1));
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test4250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4250");
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
        Book[] bookArray43 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test4251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4251");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test4252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4252");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        java.lang.Class<?> wildcardClass7 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4253");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        int int5 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass6 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4254");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(3, "", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4255");
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
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4256");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4257");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4258");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        boolean boolean36 = bookManager0.UpdateBook(1, "", "", "hi!", "");
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test4259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4259");
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
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4260");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4261");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook((int) (byte) 1);
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4262");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.UpdateBook(2, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4263");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test4264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4264");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4265");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean23 = bookManager0.UpdateBook(2, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook(4, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4266");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4267");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean22 = bookManager0.DeleteBook(100);
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test4268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4268");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook(1, "", "", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook((int) (short) 0);
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4269");
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
        boolean boolean31 = bookManager0.DeleteBook(6);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4270");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4271");
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
        boolean boolean40 = bookManager0.DeleteBook((int) (byte) 1);
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4272");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test4273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4273");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4274");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray25 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "", "", "hi!");
        int int32 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "", "", "hi!", "");
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test4275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4275");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4276");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test4277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4277");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4278");
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
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4279");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean17 = bookManager0.DeleteBook(0);
        int int18 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4280");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
    }

    @Test
    public void test4281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4281");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4282");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook(5, "hi!", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4283");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4284");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        int int11 = bookManager0.getBookCount();
        bookManager0.AddBook((-1), "", "hi!", "", "");
        bookManager0.AddBook(2, "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4285");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean15 = bookManager0.DeleteBook(6);
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean19 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4286");
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
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test4287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4287");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean35 = bookManager0.DeleteBook(7);
        int int36 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
    }

    @Test
    public void test4288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4288");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(2);
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4289");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        bookManager0.AddBook(7, "hi!", "hi!", "hi!", "");
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
    public void test4290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4290");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean36 = bookManager0.UpdateBook(4, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4291");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4292");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        Book[] bookArray26 = bookManager0.getAllBooks();
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4293");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        boolean boolean17 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4294");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "", "hi!", "", "");
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4295");
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
        Book[] bookArray52 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "", "");
        bookManager0.AddBook(10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(bookArray52);
    }

    @Test
    public void test4296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4296");
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
        boolean boolean37 = bookManager0.UpdateBook(7, "", "hi!", "", "");
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
    public void test4297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4297");
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
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(6, "", "hi!", "", "hi!");
        Book[] bookArray48 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(bookArray48);
    }

    @Test
    public void test4298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4298");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4299");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "");
        boolean boolean24 = bookManager0.DeleteBook(6);
        int int25 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4300");
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
        Book[] bookArray34 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) 100);
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
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4301");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean22 = bookManager0.UpdateBook(3, "", "", "", "");
        boolean boolean24 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4302");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        boolean boolean19 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4303");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4304");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean22 = bookManager0.UpdateBook(7, "", "hi!", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4305");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean32 = bookManager0.DeleteBook((int) (short) 100);
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test4306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4306");
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
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test4307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4307");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        int int10 = bookManager0.getBookCount();
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook(100, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4308");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        boolean boolean29 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        bookManager0.AddBook(7, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4309");
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
        Book[] bookArray49 = bookManager0.getAllBooks();
        boolean boolean55 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookArray49);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4310");
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
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test4311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4311");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean30 = bookManager0.UpdateBook(1, "", "", "hi!", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.DeleteBook(6);
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4312");
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
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4313");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "");
        boolean boolean24 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean26 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4314");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "hi!", "hi!", "");
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4315");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4316");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        int int28 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test4317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4317");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean35 = bookManager0.DeleteBook(7);
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4318");
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
        boolean boolean55 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        Book[] bookArray56 = bookManager0.getAllBooks();
        boolean boolean62 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(bookArray56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4319");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean11 = bookManager0.DeleteBook(10);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        int int15 = bookManager0.getBookCount();
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4320");
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
        int int49 = bookManager0.getBookCount();
        boolean boolean55 = bookManager0.UpdateBook(7, "", "hi!", "", "hi!");
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test4321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4321");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4322");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "hi!");
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test4323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4323");
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
        int int57 = bookManager0.getBookCount();
        boolean boolean59 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 6 + "'", int57 == 6);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test4324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4324");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean34 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4325");
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
        boolean boolean47 = bookManager0.DeleteBook((-1));
        java.lang.Class<?> wildcardClass48 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4326");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test4327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4327");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "hi!", "hi!");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4328");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        int int12 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4329");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook(4, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4330");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 10);
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4331");
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
        bookManager0.AddBook(4, "hi!", "hi!", "", "hi!");
        boolean boolean48 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
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
    public void test4332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4332");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4333");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        Book[] bookArray11 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray11);
    }

    @Test
    public void test4334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4334");
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
        bookManager0.AddBook((int) (byte) 10, "", "", "", "hi!");
        Book[] bookArray34 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4335");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) 'a', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4336");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean22 = bookManager0.DeleteBook(2);
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test4337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4337");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean28 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4338");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean24 = bookManager0.DeleteBook(100);
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
    public void test4339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4339");
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
        int int32 = bookManager0.getBookCount();
        Book[] bookArray33 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(bookArray33);
    }

    @Test
    public void test4340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4340");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) '4', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4341");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(0, "", "", "", "hi!");
        int int25 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4342");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook(10);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) -1);
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4343");
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
        boolean boolean56 = bookManager0.DeleteBook(100);
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test4344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4344");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4345");
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
        boolean boolean42 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        boolean boolean48 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        int int49 = bookManager0.getBookCount();
        boolean boolean51 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4346");
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
        boolean boolean42 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray43 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "hi!");
        boolean boolean51 = bookManager0.DeleteBook((int) (byte) 100);
        int int52 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
    }

    @Test
    public void test4347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4347");
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
        java.lang.Class<?> wildcardClass25 = bookArray24.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4348");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
    }

    @Test
    public void test4349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4349");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test4350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4350");
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
        boolean boolean55 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test4351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4351");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(100, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4352");
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
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4353");
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
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4354");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(100);
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4355");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook(4, "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4356");
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
        bookManager0.AddBook(0, "hi!", "", "", "");
        Book[] bookArray49 = bookManager0.getAllBooks();
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
    }

    @Test
    public void test4357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4357");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(4);
        boolean boolean15 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "hi!");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4358");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4359");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) 'a');
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray32 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test4360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4360");
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
        Book[] bookArray33 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertNotNull(bookArray33);
    }

    @Test
    public void test4361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4361");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass29 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test4362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4362");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4363");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4364");
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
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
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
    public void test4365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4365");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook(10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4366");
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
        boolean boolean39 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "");
        boolean boolean51 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        int int52 = bookManager0.getBookCount();
        boolean boolean54 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 4 + "'", int52 == 4);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test4367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4367");
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
        int int49 = bookManager0.getBookCount();
        int int50 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 4 + "'", int49 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    }

    @Test
    public void test4368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4368");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) '#');
        boolean boolean7 = bookManager0.DeleteBook(2);
        Book[] bookArray8 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
    }

    @Test
    public void test4369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4369");
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
        boolean boolean28 = bookManager0.DeleteBook((int) 'a');
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test4370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4370");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4371");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean14 = bookManager0.UpdateBook(5, "", "", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(6);
        boolean boolean18 = bookManager0.DeleteBook(3);
        boolean boolean24 = bookManager0.UpdateBook(3, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4372");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean24 = bookManager0.UpdateBook(3, "", "", "hi!", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test4373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4373");
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
        boolean boolean46 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean48 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook(7, "hi!", "", "hi!", "hi!");
        Book[] bookArray55 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(bookArray55);
    }

    @Test
    public void test4374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4374");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        int int21 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4375");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4376");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(0);
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        bookManager0.AddBook(100, "", "", "", "");
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4377");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4378");
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
        boolean boolean29 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
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
    }

    @Test
    public void test4379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4379");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) '#');
        boolean boolean16 = bookManager0.DeleteBook(0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        Book[] bookArray19 = bookManager0.getAllBooks();
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4380");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4381");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4382");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        boolean boolean18 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4383");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        int int35 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
    }

    @Test
    public void test4384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4384");
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
        bookManager0.AddBook(4, "hi!", "", "", "");
        Book[] bookArray47 = bookManager0.getAllBooks();
        boolean boolean49 = bookManager0.DeleteBook(6);
        int int50 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(bookArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 4 + "'", int50 == 4);
    }

    @Test
    public void test4385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4385");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "", "");
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4386");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4387");
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
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4388");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4389");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4390");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) 'a');
        int int24 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4391");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        int int26 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4392");
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
        Book[] bookArray51 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookArray51);
    }

    @Test
    public void test4393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4393");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4394");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "");
        boolean boolean34 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4395");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook(6, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4396");
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
        bookManager0.AddBook(5, "hi!", "", "", "");
        int int30 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4397");
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
        boolean boolean55 = bookManager0.UpdateBook(100, "", "", "hi!", "hi!");
        boolean boolean57 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4398");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean11 = bookManager0.DeleteBook(10);
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test4399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4399");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "");
        boolean boolean35 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        int int36 = bookManager0.getBookCount();
        int int37 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test4400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4400");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook(3);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4401");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4402");
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
        bookManager0.AddBook(5, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4403");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        boolean boolean37 = bookManager0.UpdateBook(6, "hi!", "", "", "hi!");
        boolean boolean39 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4404");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4405");
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
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "", "");
        bookManager0.AddBook((int) '#', "", "", "hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4406");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) ' ', "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4407");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.UpdateBook(10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "hi!");
        boolean boolean33 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4408");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(7, "hi!", "", "", "");
        boolean boolean23 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4409");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(100);
        boolean boolean22 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4410");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook(100, "", "", "hi!", "");
        bookManager0.AddBook((int) ' ', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4411");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        boolean boolean15 = bookManager0.UpdateBook((int) (short) -1, "", "", "hi!", "");
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4412");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4413");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test4414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4414");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        int int8 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4415");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(1, "", "", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4416");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(100);
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4417");
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
        Book[] bookArray36 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookArray36);
    }

    @Test
    public void test4418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4418");
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
        int int39 = bookManager0.getBookCount();
        boolean boolean41 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test4419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4419");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(3, "hi!", "", "", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4420");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "hi!");
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4421");
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
        int int37 = bookManager0.getBookCount();
        int int38 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test4422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4422");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.DeleteBook((int) (short) 0);
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4423");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook(4);
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4424");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test4425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4425");
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
        boolean boolean47 = bookManager0.DeleteBook(3);
        Book[] bookArray48 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 3 + "'", int44 == 3);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookArray48);
    }

    @Test
    public void test4426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4426");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        bookManager0.AddBook(10, "hi!", "", "", "");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) -1);
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
    }

    @Test
    public void test4427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4427");
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
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean30 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4428");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(5, "hi!", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test4429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4429");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "", "hi!", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
    }

    @Test
    public void test4430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4430");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook(10, "hi!", "hi!", "", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test4431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4431");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test4432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4432");
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
        int int26 = bookManager0.getBookCount();
        Book[] bookArray27 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "");
        int int34 = bookManager0.getBookCount();
        boolean boolean36 = bookManager0.DeleteBook(3);
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test4433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4433");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) 'a');
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4434");
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
        boolean boolean56 = bookManager0.DeleteBook(100);
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        bookManager0.AddBook((-1), "hi!", "", "", "");
        java.lang.Class<?> wildcardClass69 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test4435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4435");
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
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
    }

    @Test
    public void test4436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4436");
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
        boolean boolean26 = bookManager0.UpdateBook(2, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4437");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "");
        boolean boolean35 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        int int42 = bookManager0.getBookCount();
        int int43 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test4438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4438");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(5, "hi!", "", "", "");
        boolean boolean41 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        boolean boolean43 = bookManager0.DeleteBook(7);
        boolean boolean49 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test4439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4439");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        boolean boolean24 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean31 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        bookManager0.AddBook(6, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4440");
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
        int int51 = bookManager0.getBookCount();
        int int52 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
    }

    @Test
    public void test4441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4441");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((-1), "", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((-1));
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4442");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        int int29 = bookManager0.getBookCount();
        boolean boolean35 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4443");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        bookManager0.AddBook(2, "hi!", "", "", "");
        boolean boolean28 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test4444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4444");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "", "hi!", "", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4445");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4446");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean16 = bookManager0.UpdateBook(6, "", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) -1, "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4447");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(0);
        boolean boolean27 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test4448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4448");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        bookManager0.AddBook(1, "hi!", "hi!", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook(2, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4449");
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
        int int16 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4450");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "");
        boolean boolean12 = bookManager0.DeleteBook(3);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4451");
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
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "", "");
        boolean boolean39 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test4452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4452");
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
        int int25 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test4453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4453");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4454");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean23 = bookManager0.UpdateBook(100, "", "hi!", "", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean27 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4455");
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
        bookManager0.AddBook(2, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4456");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.DeleteBook(5);
        boolean boolean21 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4457");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "hi!");
        int int25 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        boolean boolean33 = bookManager0.DeleteBook(7);
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4458");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        int int8 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) ' ');
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4459");
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
        boolean boolean27 = bookManager0.UpdateBook(100, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4460");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "hi!", "", "hi!", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(1, "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test4461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4461");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.UpdateBook(4, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4462");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        bookManager0.AddBook(7, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4463");
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
        boolean boolean39 = bookManager0.DeleteBook((int) (byte) 1);
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
    }

    @Test
    public void test4464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4464");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4465");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        bookManager0.AddBook(2, "hi!", "", "", "");
        bookManager0.AddBook(1, "", "", "", "");
        bookManager0.AddBook(5, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4466");
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
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4467");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "", "");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
    }

    @Test
    public void test4468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4468");
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
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        Book[] bookArray38 = bookManager0.getAllBooks();
        boolean boolean44 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        boolean boolean46 = bookManager0.DeleteBook(2);
        int int47 = bookManager0.getBookCount();
        Book[] bookArray48 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 3 + "'", int47 == 3);
        org.junit.Assert.assertNotNull(bookArray48);
    }

    @Test
    public void test4469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4469");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        boolean boolean18 = bookManager0.DeleteBook(10);
        boolean boolean20 = bookManager0.DeleteBook(2);
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test4470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4470");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean22 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4471");
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
        Book[] bookArray34 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4472");
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
        int int34 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test4473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4473");
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
        int int59 = bookManager0.getBookCount();
        boolean boolean65 = bookManager0.UpdateBook(5, "", "", "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 6 + "'", int59 == 6);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test4474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4474");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4475");
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
        int int57 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 7 + "'", int57 == 7);
    }

    @Test
    public void test4476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4476");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4477");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(5, "", "", "", "hi!");
        bookManager0.AddBook(2, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        boolean boolean41 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4478");
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
        boolean boolean55 = bookManager0.DeleteBook(100);
        boolean boolean61 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        boolean boolean67 = bookManager0.UpdateBook((-1), "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass68 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test4479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4479");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test4480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4480");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((-1), "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 0);
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4481");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "");
        int int19 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4482");
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
        int int37 = bookManager0.getBookCount();
        boolean boolean43 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test4483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4483");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean35 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4484");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((-1));
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook((-1));
        Book[] bookArray25 = bookManager0.getAllBooks();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test4485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4485");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.UpdateBook(2, "hi!", "hi!", "", "");
        boolean boolean22 = bookManager0.UpdateBook(4, "hi!", "", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4486");
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
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4487");
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
        bookManager0.AddBook(100, "", "", "hi!", "hi!");
        boolean boolean58 = bookManager0.DeleteBook(10);
        java.lang.Class<?> wildcardClass59 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test4488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4488");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook(6, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4489");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "hi!");
        int int32 = bookManager0.getBookCount();
        boolean boolean34 = bookManager0.DeleteBook((int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test4490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4490");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook((int) '4', "", "hi!", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test4491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4491");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test4492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4492");
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
        Book[] bookArray37 = bookManager0.getAllBooks();
        int int38 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 3 + "'", int38 == 3);
    }

    @Test
    public void test4493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4493");
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
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook((int) (short) 0);
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test4494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4494");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        Book[] bookArray25 = bookManager0.getAllBooks();
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4495");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean30 = bookManager0.UpdateBook(6, "hi!", "", "", "");
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
    public void test4496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4496");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.DeleteBook(6);
        boolean boolean30 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.UpdateBook(100, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4497");
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
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        boolean boolean50 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "hi!");
        int int51 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
    }

    @Test
    public void test4498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4498");
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
        java.lang.Class<?> wildcardClass41 = bookArray40.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4499");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean16 = bookManager0.DeleteBook(0);
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4500");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }
}

