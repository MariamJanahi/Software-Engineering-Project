import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook(3, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "");
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
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        Book[] bookArray51 = bookManager0.getAllBooks();
        boolean boolean57 = bookManager0.UpdateBook(4, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertNotNull(bookArray51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean22 = bookManager0.UpdateBook(100, "", "", "", "");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
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
        boolean boolean53 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
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
        int int57 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "hi!", "hi!", "hi!", "");
        int int64 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 6 + "'", int64 == 6);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        boolean boolean25 = bookManager0.DeleteBook(0);
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
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
        boolean boolean48 = bookManager0.UpdateBook(0, "hi!", "", "", "");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookArray15.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        boolean boolean30 = bookManager0.UpdateBook((-1), "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        boolean boolean42 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "hi!");
        Book[] bookArray43 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        boolean boolean42 = bookManager0.UpdateBook(3, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        bookManager0.AddBook(4, "", "hi!", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook(3);
        boolean boolean33 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "hi!");
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        boolean boolean27 = bookManager0.DeleteBook(4);
        boolean boolean29 = bookManager0.DeleteBook(6);
        boolean boolean31 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((-1), "", "", "", "");
        boolean boolean17 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(0, "", "", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook(6);
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((-1), "", "", "", "");
        boolean boolean17 = bookManager0.UpdateBook(6, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
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
        boolean boolean25 = bookManager0.DeleteBook(10);
        Book[] bookArray26 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.DeleteBook(7);
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(0, "", "", "", "");
        int int31 = bookManager0.getBookCount();
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(0);
        boolean boolean36 = bookManager0.DeleteBook((int) 'a');
        boolean boolean38 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        boolean boolean36 = bookManager0.UpdateBook(4, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean18 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(7);
        bookManager0.AddBook(3, "", "hi!", "", "");
        bookManager0.AddBook(5, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((-1), "hi!", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean25 = bookManager0.UpdateBook(6, "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
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
        int int33 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        boolean boolean54 = bookManager0.DeleteBook(4);
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
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "hi!");
        int int28 = bookManager0.getBookCount();
        boolean boolean34 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
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
        Book[] bookArray45 = bookManager0.getAllBooks();
        boolean boolean47 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        bookManager0.AddBook((int) 'a', "hi!", "", "", "hi!");
        boolean boolean58 = bookManager0.UpdateBook(100, "", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        boolean boolean70 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook(100);
        boolean boolean38 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(1, "", "", "", "hi!");
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(0);
        Book[] bookArray29 = bookManager0.getAllBooks();
        Book[] bookArray30 = bookManager0.getAllBooks();
        boolean boolean36 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean18 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "hi!");
        bookManager0.AddBook((int) '#', "", "hi!", "", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean22 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook(4, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        Book[] bookArray29 = bookManager0.getAllBooks();
        int int30 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean18 = bookManager0.UpdateBook((int) 'a', "hi!", "", "", "hi!");
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean26 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean19 = bookManager0.DeleteBook(0);
        boolean boolean25 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "", "");
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((-1), "hi!", "hi!", "", "");
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "", "", "hi!", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
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
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "");
        boolean boolean37 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.DeleteBook(10);
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "");
        boolean boolean36 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(6, "", "hi!", "", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "", "hi!", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook(0);
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        int int15 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(2, "hi!", "", "", "");
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        boolean boolean42 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        Book[] bookArray43 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook(100);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(4, "hi!", "hi!", "", "");
        boolean boolean29 = bookManager0.UpdateBook((-1), "", "", "hi!", "");
        boolean boolean31 = bookManager0.DeleteBook(0);
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
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
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) '#', "", "", "hi!", "");
        int int35 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray23 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        bookManager0.AddBook(0, "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "", "");
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        bookManager0.AddBook((int) (short) 10, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 100, "", "", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "", "", "", "hi!");
        boolean boolean29 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        bookManager0.AddBook(4, "", "hi!", "", "hi!");
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
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
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 3 + "'", int35 == 3);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        Book[] bookArray7 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(bookArray7);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
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
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean28 = bookManager0.UpdateBook(7, "", "", "", "");
        boolean boolean30 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        bookManager0.AddBook(3, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        bookManager0.AddBook(5, "", "", "", "");
        bookManager0.AddBook(100, "", "hi!", "hi!", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        boolean boolean14 = bookManager0.DeleteBook(100);
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
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
        boolean boolean51 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
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
        boolean boolean41 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean47 = bookManager0.UpdateBook(7, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "hi!", "", "", "hi!");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "");
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        boolean boolean40 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        bookManager0.AddBook((int) 'a', "hi!", "", "", "hi!");
        boolean boolean58 = bookManager0.UpdateBook(100, "", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "");
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        boolean boolean38 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "hi!");
        boolean boolean44 = bookManager0.UpdateBook(2, "", "", "", "");
        boolean boolean46 = bookManager0.DeleteBook((-1));
        boolean boolean52 = bookManager0.UpdateBook(6, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) (byte) 0);
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
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
        boolean boolean40 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "hi!");
        Book[] bookArray32 = bookManager0.getAllBooks();
        int int33 = bookManager0.getBookCount();
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "", "");
        boolean boolean19 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray9 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass10 = bookArray9.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
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
        int int34 = bookManager0.getBookCount();
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
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
        Book[] bookArray39 = bookManager0.getAllBooks();
        boolean boolean41 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        boolean boolean14 = bookManager0.UpdateBook((int) ' ', "", "hi!", "", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 0);
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
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
        boolean boolean32 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray33 = bookManager0.getAllBooks();
        boolean boolean35 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        Book[] bookArray19 = bookManager0.getAllBooks();
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(10, "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean21 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        boolean boolean23 = bookManager0.DeleteBook(4);
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        bookManager0.AddBook(6, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((-1), "hi!", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "");
        Book[] bookArray32 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.DeleteBook(4);
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "", "", "");
        boolean boolean29 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
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
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
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
        bookManager0.AddBook(1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        boolean boolean32 = bookManager0.DeleteBook(0);
        boolean boolean34 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
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
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        boolean boolean14 = bookManager0.DeleteBook((int) ' ');
        boolean boolean16 = bookManager0.DeleteBook(0);
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        Book[] bookArray21 = bookManager0.getAllBooks();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        bookManager0.AddBook((int) '#', "hi!", "", "", "");
        int int28 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "hi!");
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
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
        int int37 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 100, "", "", "", "");
        int int39 = bookManager0.getBookCount();
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 3 + "'", int39 == 3);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 100, "", "", "hi!", "");
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(6, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean21 = bookManager0.UpdateBook((-1), "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook(4);
        boolean boolean17 = bookManager0.DeleteBook(3);
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook(1);
        boolean boolean13 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        boolean boolean21 = bookManager0.UpdateBook((-1), "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook(7, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook(4, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
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
        int int37 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
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
        boolean boolean45 = bookManager0.DeleteBook(4);
        int int46 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 3 + "'", int46 == 3);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        bookManager0.AddBook(3, "", "hi!", "", "hi!");
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook(100);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook(2, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 100);
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
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
        boolean boolean31 = bookManager0.DeleteBook(5);
        Book[] bookArray32 = bookManager0.getAllBooks();
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        int int12 = bookManager0.getBookCount();
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "hi!", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
        boolean boolean46 = bookManager0.DeleteBook((int) '#');
        int int47 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass48 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
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
        bookManager0.AddBook(0, "", "hi!", "hi!", "");
        Book[] bookArray47 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray47);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        boolean boolean20 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
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
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        Book[] bookArray44 = bookManager0.getAllBooks();
        boolean boolean46 = bookManager0.DeleteBook((-1));
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass18 = bookArray17.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
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
        int int24 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.DeleteBook(10);
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "");
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook(6);
        int int27 = bookManager0.getBookCount();
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
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
        int int43 = bookManager0.getBookCount();
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        int int56 = bookManager0.getBookCount();
        boolean boolean62 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 7 + "'", int56 == 7);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook((int) ' ', "hi!", "", "", "hi!");
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }
}

