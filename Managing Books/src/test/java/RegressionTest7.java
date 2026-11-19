import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import data.Book;
import business.BookManager;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "hi!", "");
        bookManager0.AddBook((-1), "", "", "hi!", "");
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray13 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(6);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean34 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook(3, "", "", "hi!", "hi!");
        int int18 = bookManager0.getBookCount();
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
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
        boolean boolean27 = bookManager0.DeleteBook((-1));
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "", "");
        Book[] bookArray34 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
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
        bookManager0.AddBook((int) '4', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        java.lang.Class<?> wildcardClass31 = bookManager0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean29 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook(10);
        boolean boolean18 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray22 = bookManager0.getAllBooks();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(2, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "", "hi!", "", "");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean39 = bookManager0.UpdateBook(3, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(4, "", "", "", "hi!");
        bookManager0.AddBook(2, "hi!", "", "", "");
        bookManager0.AddBook(7, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook(3, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean25 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "", "hi!");
        int int29 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook(4);
        boolean boolean14 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook(0);
        Book[] bookArray17 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "", "hi!", "");
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        Book[] bookArray36 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(bookArray36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook(5, "hi!", "", "", "hi!");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        int int34 = bookManager0.getBookCount();
        int int35 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
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
        java.lang.Class<?> wildcardClass36 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 4 + "'", int35 == 4);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 10, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(4, "", "", "", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        Book[] bookArray30 = bookManager0.getAllBooks();
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean16 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
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
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook(0);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
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
        boolean boolean51 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook(2);
        Book[] bookArray6 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "", "hi!", "", "");
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean14 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        int int8 = bookManager0.getBookCount();
        Book[] bookArray9 = bookManager0.getAllBooks();
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        Book[] bookArray18 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean30 = bookManager0.UpdateBook((-1), "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
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
        boolean boolean24 = bookManager0.DeleteBook(7);
        int int25 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        Book[] bookArray34 = bookManager0.getAllBooks();
        boolean boolean40 = bookManager0.UpdateBook((int) ' ', "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean24 = bookManager0.DeleteBook(100);
        boolean boolean30 = bookManager0.UpdateBook(10, "hi!", "", "", "");
        boolean boolean36 = bookManager0.UpdateBook((int) ' ', "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(10);
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "");
        bookManager0.AddBook(4, "", "hi!", "hi!", "hi!");
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
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) ' ');
        boolean boolean20 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.DeleteBook(2);
        boolean boolean24 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
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
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        Book[] bookArray46 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertNotNull(bookArray46);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int27 = bookManager0.getBookCount();
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean39 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        Book[] bookArray32 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean17 = bookManager0.UpdateBook(0, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(7, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        boolean boolean13 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.DeleteBook(5);
        boolean boolean17 = bookManager0.DeleteBook(0);
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 10, "", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        int int26 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.DeleteBook(4);
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((int) '#');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        boolean boolean33 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) '#', "hi!", "", "", "hi!");
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass12 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        boolean boolean12 = bookManager0.DeleteBook(100);
        boolean boolean14 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean32 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
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
        boolean boolean44 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "hi!");
        boolean boolean50 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass9 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
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
        int int31 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean39 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        boolean boolean35 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 0, "", "", "", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "");
        boolean boolean36 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean15 = bookManager0.UpdateBook(0, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "hi!", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        bookManager0.AddBook(7, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(4, "", "hi!", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        int int40 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
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
        boolean boolean43 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
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
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
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
        boolean boolean47 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "hi!", "");
        Book[] bookArray48 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(bookArray48);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook(0, "hi!", "", "", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray29 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook(4);
        boolean boolean23 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.DeleteBook((int) ' ');
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        bookManager0.AddBook(10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "");
        Book[] bookArray59 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertNotNull(bookArray59);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
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
        boolean boolean35 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray6 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "");
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
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        boolean boolean40 = bookManager0.UpdateBook(2, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
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
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "");
        boolean boolean38 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "hi!");
        boolean boolean44 = bookManager0.UpdateBook(2, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook(6, "", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        int int13 = bookManager0.getBookCount();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean20 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        boolean boolean34 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray35 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(bookArray35);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean6 = bookManager0.DeleteBook((int) (short) 1);
        int int7 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        int int33 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 3 + "'", int33 == 3);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
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
        boolean boolean35 = bookManager0.DeleteBook(6);
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "", "", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "");
        int int26 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass27 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(6, "", "", "", "hi!");
        boolean boolean27 = bookManager0.UpdateBook(1, "hi!", "", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        int int30 = bookManager0.getBookCount();
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
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
        Book[] bookArray46 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookArray46);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
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
        boolean boolean50 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook(100, "hi!", "", "hi!", "");
        int int31 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        bookManager0.AddBook(6, "hi!", "", "", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray18);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(10, "", "hi!", "", "hi!");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
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
        boolean boolean39 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook(5);
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "", "hi!", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((-1));
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(3, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass19 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
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
        Book[] bookArray58 = bookManager0.getAllBooks();
        boolean boolean60 = bookManager0.DeleteBook((int) 'a');
        int int61 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(bookArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 6 + "'", int61 == 6);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
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
        bookManager0.AddBook(1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        java.lang.Class<?> wildcardClass47 = bookArray46.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(bookArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "");
        int int34 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook((int) (byte) -1);
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
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        boolean boolean29 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
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
        bookManager0.AddBook(6, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook((int) ' ');
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean29 = bookManager0.UpdateBook(10, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(7, "hi!", "", "hi!", "");
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
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
        boolean boolean35 = bookManager0.UpdateBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
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

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        int int31 = bookManager0.getBookCount();
        int int32 = bookManager0.getBookCount();
        boolean boolean38 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
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
        boolean boolean51 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((-1));
        boolean boolean23 = bookManager0.UpdateBook(5, "", "hi!", "hi!", "hi!");
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray27 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook((int) 'a');
        bookManager0.AddBook((int) (byte) 0, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) 1);
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
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
        boolean boolean39 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        boolean boolean25 = bookManager0.DeleteBook(0);
        int int26 = bookManager0.getBookCount();
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookArray27.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook(5, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        boolean boolean17 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.DeleteBook(7);
        boolean boolean25 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
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
        boolean boolean40 = bookManager0.UpdateBook(5, "hi!", "", "hi!", "");
        boolean boolean46 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        bookManager0.AddBook(10, "hi!", "", "", "");
        bookManager0.AddBook(3, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
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
        boolean boolean41 = bookManager0.UpdateBook(2, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
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
        boolean boolean56 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "");
        int int57 = bookManager0.getBookCount();
        Book[] bookArray58 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertNotNull(bookArray58);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        boolean boolean33 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "hi!", "");
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook((int) ' ', "", "hi!", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        int int25 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.DeleteBook((int) 'a');
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "", "", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook(2, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        bookManager0.AddBook(4, "hi!", "", "", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "");
        boolean boolean21 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "", "");
        boolean boolean31 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook(100, "hi!", "", "", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
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
        Book[] bookArray38 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "", "", "hi!", "");
        boolean boolean46 = bookManager0.DeleteBook((int) (byte) 0);
        int int47 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 4 + "'", int47 == 4);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        int int13 = bookManager0.getBookCount();
        bookManager0.AddBook(0, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean39 = bookManager0.UpdateBook(4, "hi!", "", "hi!", "hi!");
        int int40 = bookManager0.getBookCount();
        bookManager0.AddBook(7, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        boolean boolean37 = bookManager0.DeleteBook(10);
        boolean boolean43 = bookManager0.UpdateBook(2, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(7);
        boolean boolean38 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean24 = bookManager0.DeleteBook(6);
        int int25 = bookManager0.getBookCount();
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        bookManager0.AddBook(3, "", "", "hi!", "hi!");
        boolean boolean19 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean25 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass26 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        int int23 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        bookManager0.AddBook(2, "", "", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        int int22 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "hi!", "", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "");
        boolean boolean40 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean46 = bookManager0.UpdateBook(2, "hi!", "hi!", "", "hi!");
        Book[] bookArray47 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass48 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(bookArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook(2, "", "", "", "");
        bookManager0.AddBook(5, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
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
        boolean boolean52 = bookManager0.DeleteBook((int) (short) 1);
        java.lang.Class<?> wildcardClass53 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean25 = bookManager0.DeleteBook(0);
        boolean boolean31 = bookManager0.UpdateBook((int) (short) -1, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        bookManager0.AddBook((int) ' ', "", "hi!", "", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(7);
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        boolean boolean29 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 1);
        Book[] bookArray19 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass20 = bookArray19.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        boolean boolean13 = bookManager0.DeleteBook(2);
        bookManager0.AddBook(2, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        int int14 = bookManager0.getBookCount();
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
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
        bookManager0.AddBook(100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
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
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "hi!", "");
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
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray20 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "", "hi!", "", "");
        boolean boolean19 = bookManager0.UpdateBook(2, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        int int25 = bookManager0.getBookCount();
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "hi!");
        Book[] bookArray29 = bookManager0.getAllBooks();
        int int30 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.DeleteBook(3);
        boolean boolean38 = bookManager0.UpdateBook(5, "hi!", "", "", "");
        Book[] bookArray39 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
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
        int int35 = bookManager0.getBookCount();
        Book[] bookArray36 = bookManager0.getAllBooks();
        Book[] bookArray37 = bookManager0.getAllBooks();
        boolean boolean43 = bookManager0.UpdateBook(7, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertNotNull(bookArray36);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((-1));
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "", "", "hi!", "");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook(5);
        bookManager0.AddBook(0, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) '4', "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(10, "", "", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook((int) (short) 100, "", "", "", "");
        boolean boolean40 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
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
        int int23 = bookManager0.getBookCount();
        int int24 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "");
        boolean boolean32 = bookManager0.UpdateBook((int) 'a', "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        boolean boolean20 = bookManager0.DeleteBook(1);
        Book[] bookArray21 = bookManager0.getAllBooks();
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray3 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
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
        boolean boolean26 = bookManager0.DeleteBook((int) (byte) 100);
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
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        java.lang.Class<?> wildcardClass41 = bookArray40.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
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
        Book[] bookArray21 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
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
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray37 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) -1, "", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean21 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.DeleteBook((int) (short) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        int int14 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass15 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        int int5 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(0, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) 'a');
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(bookArray20);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        bookManager0.AddBook(6, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(3, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "");
        bookManager0.AddBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
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
        bookManager0.AddBook(10, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "");
        boolean boolean64 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 4 + "'", int46 == 4);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean21 = bookManager0.DeleteBook(3);
        boolean boolean27 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        int int11 = bookManager0.getBookCount();
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "hi!", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 0, "", "", "", "");
        boolean boolean16 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook(1);
        boolean boolean15 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook(6, "hi!", "", "hi!", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        bookManager0.AddBook((int) ' ', "", "", "", "hi!");
        java.lang.Class<?> wildcardClass22 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
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
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean12 = bookManager0.DeleteBook((-1));
        java.lang.Class<?> wildcardClass13 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) ' ');
        boolean boolean17 = bookManager0.UpdateBook(5, "", "hi!", "", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook(1, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        Book[] bookArray37 = bookManager0.getAllBooks();
        int int38 = bookManager0.getBookCount();
        boolean boolean40 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
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
        bookManager0.AddBook(4, "", "hi!", "", "");
        int int44 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass45 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
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
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
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
        Book[] bookArray50 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "hi!", "", "", "hi!");
        Book[] bookArray57 = bookManager0.getAllBooks();
        boolean boolean63 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean69 = bookManager0.UpdateBook(0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
        org.junit.Assert.assertNotNull(bookArray50);
        org.junit.Assert.assertNotNull(bookArray57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 100, "", "", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook(5, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
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
        boolean boolean41 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "", "hi!");
        bookManager0.AddBook(0, "hi!", "", "", "");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean9 = bookManager0.DeleteBook(1);
        int int10 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "hi!");
        int int9 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.UpdateBook(2, "", "", "", "");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        int int18 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        Book[] bookArray13 = bookManager0.getAllBooks();
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
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
        int int59 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) (short) 0);
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "");
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        bookManager0.AddBook(4, "", "", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "hi!");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean33 = bookManager0.UpdateBook(10, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean41 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
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
        bookManager0.AddBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray45 = bookManager0.getAllBooks();
        boolean boolean47 = bookManager0.DeleteBook((int) (short) 100);
        java.lang.Class<?> wildcardClass48 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(bookArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        boolean boolean51 = bookManager0.DeleteBook(5);
        int int52 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2 + "'", int52 == 2);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "hi!");
        boolean boolean17 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
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
        boolean boolean39 = bookManager0.DeleteBook((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "", "");
        boolean boolean25 = bookManager0.UpdateBook(100, "hi!", "", "hi!", "");
        int int26 = bookManager0.getBookCount();
        boolean boolean28 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        boolean boolean21 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "", "hi!");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass28 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
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
        bookManager0.AddBook((int) (byte) -1, "hi!", "", "", "hi!");
        int int51 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '#', "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(4, "", "hi!", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        int int40 = bookManager0.getBookCount();
        boolean boolean46 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.DeleteBook(3);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook((int) '4', "hi!", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) '4', "", "", "", "hi!");
        boolean boolean33 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
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
        Book[] bookArray49 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "", "", "hi!");
        bookManager0.AddBook(6, "hi!", "hi!", "", "");
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
        org.junit.Assert.assertNotNull(bookArray49);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        bookManager0.AddBook(4, "", "hi!", "", "");
        int int44 = bookManager0.getBookCount();
        boolean boolean46 = bookManager0.DeleteBook(3);
        boolean boolean52 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 5 + "'", int44 == 5);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(10, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "hi!");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean21 = bookManager0.UpdateBook(0, "hi!", "hi!", "", "");
        int int22 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook(2, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        bookManager0.AddBook((int) '4', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "hi!");
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook(1);
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        boolean boolean31 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        int int28 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        int int26 = bookManager0.getBookCount();
        int int27 = bookManager0.getBookCount();
        boolean boolean33 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "hi!", "");
        bookManager0.AddBook(100, "", "", "", "hi!");
        boolean boolean26 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        Book[] bookArray15 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean23 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
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
        boolean boolean50 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "hi!");
        boolean boolean52 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
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
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "hi!");
        java.lang.Class<?> wildcardClass37 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 3 + "'", int30 == 3);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        int int4 = bookManager0.getBookCount();
        int int5 = bookManager0.getBookCount();
        Book[] bookArray6 = bookManager0.getAllBooks();
        int int7 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean23 = bookManager0.UpdateBook(2, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.DeleteBook(3);
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray30 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
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
        boolean boolean32 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
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
        boolean boolean46 = bookManager0.DeleteBook(2);
        boolean boolean48 = bookManager0.DeleteBook((int) 'a');
        bookManager0.AddBook((int) (short) 0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 4 + "'", int44 == 4);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook(0, "", "", "", "");
        int int33 = bookManager0.getBookCount();
        bookManager0.AddBook(7, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "hi!", "");
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook(1, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        Book[] bookArray28 = bookManager0.getAllBooks();
        int int29 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        boolean boolean41 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "hi!", "");
        bookManager0.AddBook(5, "", "", "hi!", "");
        bookManager0.AddBook(6, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
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
        int int37 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) -1, "", "", "", "");
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 10, "", "", "", "hi!");
        boolean boolean28 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
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
        java.lang.Class<?> wildcardClass44 = bookArray43.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(bookArray36);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
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
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean14 = bookManager0.DeleteBook(1);
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "hi!");
        int int21 = bookManager0.getBookCount();
        Book[] bookArray22 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(bookArray22);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook(10, "", "hi!", "hi!", "");
        bookManager0.AddBook((-1), "", "", "hi!", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "");
        Book[] bookArray33 = bookManager0.getAllBooks();
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
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
        int int24 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 0, "", "hi!", "hi!", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        boolean boolean33 = bookManager0.DeleteBook(5);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
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
        bookManager0.AddBook((int) (byte) 10, "", "", "", "hi!");
        java.lang.Class<?> wildcardClass41 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
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
        int int16 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
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
        boolean boolean33 = bookManager0.UpdateBook(4, "", "hi!", "", "");
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook((int) '#');
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
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
        boolean boolean29 = bookManager0.DeleteBook(2);
        boolean boolean35 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "");
        Book[] bookArray23 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray23);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "hi!", "hi!", "hi!", "");
        boolean boolean33 = bookManager0.UpdateBook((-1), "", "hi!", "", "hi!");
        boolean boolean39 = bookManager0.UpdateBook((int) (byte) 0, "", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "hi!", "");
        boolean boolean20 = bookManager0.DeleteBook((int) (short) -1);
        boolean boolean22 = bookManager0.DeleteBook(0);
        boolean boolean24 = bookManager0.DeleteBook((int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "");
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(2, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
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
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "");
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
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        Book[] bookArray44 = bookManager0.getAllBooks();
        boolean boolean50 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(0, "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertNotNull(bookArray44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(1, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "");
        boolean boolean27 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "hi!", "hi!");
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        bookManager0.AddBook(2, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "hi!", "hi!", "hi!", "");
        Book[] bookArray24 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray24);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
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
        Book[] bookArray37 = bookManager0.getAllBooks();
        Book[] bookArray38 = bookManager0.getAllBooks();
        boolean boolean44 = bookManager0.UpdateBook(4, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) -1, "", "", "", "hi!");
        Book[] bookArray51 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(bookArray51);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 1, "", "", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        int int7 = bookManager0.getBookCount();
        bookManager0.AddBook(7, "", "", "hi!", "");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
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
        boolean boolean45 = bookManager0.UpdateBook(1, "hi!", "", "", "");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "hi!");
        int int29 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(1, "", "", "hi!", "");
        int int44 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
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
        int int19 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean19 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook(10, "", "", "", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "");
        boolean boolean34 = bookManager0.DeleteBook(7);
        bookManager0.AddBook((int) (short) 1, "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) '#', "", "", "", "hi!");
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 10);
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
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(6, "", "hi!", "", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) ' ', "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        boolean boolean37 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
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
        Book[] bookArray41 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass42 = bookArray41.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(bookArray41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean5 = bookManager0.DeleteBook((int) (byte) 100);
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        boolean boolean13 = bookManager0.DeleteBook(0);
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
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
        int int55 = bookManager0.getBookCount();
        boolean boolean57 = bookManager0.DeleteBook(2);
        Book[] bookArray58 = bookManager0.getAllBooks();
        Book[] bookArray59 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 6 + "'", int47 == 6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 6 + "'", int48 == 6);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 6 + "'", int55 == 6);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(bookArray58);
        org.junit.Assert.assertNotNull(bookArray59);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "", "hi!");
        Book[] bookArray10 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        int int9 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) 'a');
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        int int6 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "");
        bookManager0.AddBook(100, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "hi!", "");
        boolean boolean30 = bookManager0.UpdateBook((int) '#', "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
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
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
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
        bookManager0.AddBook((int) (short) 10, "", "", "", "");
        boolean boolean39 = bookManager0.DeleteBook((int) 'a');
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
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
        boolean boolean44 = bookManager0.DeleteBook(0);
        boolean boolean50 = bookManager0.UpdateBook((int) (byte) 1, "", "", "hi!", "hi!");
        Book[] bookArray51 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(bookArray51);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook(0, "", "", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "");
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        boolean boolean34 = bookManager0.DeleteBook(5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
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
        int int39 = bookManager0.getBookCount();
        int int40 = bookManager0.getBookCount();
        boolean boolean46 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "", "");
        boolean boolean48 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((-1), "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook((int) '#', "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "", "hi!");
        boolean boolean38 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "", "hi!");
        Book[] bookArray39 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(bookArray39);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        int int23 = bookManager0.getBookCount();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean31 = bookManager0.UpdateBook((-1), "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        boolean boolean43 = bookManager0.UpdateBook((int) (byte) 0, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        boolean boolean13 = bookManager0.DeleteBook((int) '4');
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass20 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
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
        int int33 = bookManager0.getBookCount();
        int int34 = bookManager0.getBookCount();
        int int35 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook((int) '#', "hi!", "", "", "");
        int int20 = bookManager0.getBookCount();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "hi!", "hi!", "");
        int int27 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean24 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) '4', "", "hi!", "", "");
        boolean boolean26 = bookManager0.DeleteBook(7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean15 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "hi!", "");
        int int16 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook(2);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "hi!", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 100, "", "", "", "hi!");
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        boolean boolean31 = bookManager0.DeleteBook((int) '4');
        boolean boolean33 = bookManager0.DeleteBook(100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        int int12 = bookManager0.getBookCount();
        Book[] bookArray13 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean16 = bookManager0.DeleteBook(0);
        boolean boolean22 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "hi!", "");
        boolean boolean28 = bookManager0.UpdateBook((int) '4', "", "", "", "");
        boolean boolean34 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass70 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 5 + "'", int57 == 5);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
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
        boolean boolean51 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "", "hi!");
        boolean boolean53 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray54 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "");
        java.lang.Class<?> wildcardClass61 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(bookArray54);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean17 = bookManager0.UpdateBook(10, "hi!", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
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
        Book[] bookArray39 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass40 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        bookManager0.AddBook((int) '#', "hi!", "hi!", "", "");
        bookManager0.AddBook(0, "hi!", "hi!", "", "hi!");
        boolean boolean40 = bookManager0.DeleteBook(2);
        boolean boolean42 = bookManager0.DeleteBook((int) (short) 100);
        java.lang.Class<?> wildcardClass43 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean13 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean19 = bookManager0.UpdateBook((int) '4', "", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) -1, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook(5, "", "hi!", "", "");
        boolean boolean20 = bookManager0.DeleteBook((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        boolean boolean15 = bookManager0.UpdateBook((-1), "", "", "", "hi!");
        int int16 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray13 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "");
        boolean boolean21 = bookManager0.DeleteBook((-1));
        int int22 = bookManager0.getBookCount();
        int int23 = bookManager0.getBookCount();
        Book[] bookArray24 = bookManager0.getAllBooks();
        boolean boolean30 = bookManager0.UpdateBook(0, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean20 = bookManager0.UpdateBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean22 = bookManager0.DeleteBook((int) '#');
        boolean boolean24 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
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
        int int24 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        boolean boolean9 = bookManager0.DeleteBook((-1));
        boolean boolean15 = bookManager0.UpdateBook((int) (byte) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "", "");
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 1);
        int int30 = bookManager0.getBookCount();
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "hi!");
        boolean boolean32 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(6, "hi!", "hi!", "hi!", "");
        java.lang.Class<?> wildcardClass39 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        boolean boolean19 = bookManager0.DeleteBook((int) (short) -1);
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
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
        boolean boolean40 = bookManager0.UpdateBook(6, "", "", "hi!", "");
        boolean boolean42 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(5, "", "", "", "hi!");
        int int18 = bookManager0.getBookCount();
        boolean boolean24 = bookManager0.UpdateBook(10, "hi!", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.UpdateBook(1, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(3);
        int int17 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
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
        boolean boolean38 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        Book[] bookArray16 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 10, "", "hi!", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertNotNull(bookArray16);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
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
        boolean boolean37 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook(0);
        boolean boolean16 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook(5, "hi!", "hi!", "", "");
        boolean boolean31 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean33 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
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
        java.lang.Class<?> wildcardClass27 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 1, "", "", "", "");
        boolean boolean18 = bookManager0.UpdateBook(1, "", "", "", "hi!");
        Book[] bookArray19 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(bookArray19);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
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
        int int28 = bookManager0.getBookCount();
        bookManager0.AddBook(100, "hi!", "hi!", "", "hi!");
        boolean boolean36 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (short) 1, "hi!", "", "", "");
        int int43 = bookManager0.getBookCount();
        int int44 = bookManager0.getBookCount();
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((-1), "", "", "", "");
        Book[] bookArray12 = bookManager0.getAllBooks();
        int int13 = bookManager0.getBookCount();
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
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
        Book[] bookArray59 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertNotNull(bookArray59);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "hi!");
        Book[] bookArray15 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray15);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        boolean boolean17 = bookManager0.UpdateBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        boolean boolean23 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
        boolean boolean27 = bookManager0.DeleteBook((int) (short) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        Book[] bookArray13 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass14 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        Book[] bookArray6 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bookArray6);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(2, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) (byte) 1, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 100, "hi!", "", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        int int27 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
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
        int int39 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(0);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        bookManager0.AddBook((int) ' ', "hi!", "hi!", "hi!", "");
        int int14 = bookManager0.getBookCount();
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean20 = bookManager0.DeleteBook(2);
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook(100);
        int int24 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
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
        boolean boolean42 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "", "", "hi!");
        int int43 = bookManager0.getBookCount();
        int int44 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean9 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        int int10 = bookManager0.getBookCount();
        Book[] bookArray11 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook(4, "", "", "", "");
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
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
        boolean boolean33 = bookManager0.DeleteBook((int) '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
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
        bookManager0.AddBook((int) (short) 100, "hi!", "", "", "");
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
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
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
        boolean boolean70 = bookManager0.DeleteBook((int) '4');
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
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((-1), "hi!", "hi!", "", "");
        boolean boolean11 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean19 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean31 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        java.lang.Class<?> wildcardClass32 = bookManager0.getClass();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray33 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertNotNull(bookArray33);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "", "hi!");
        boolean boolean33 = bookManager0.UpdateBook(5, "", "hi!", "", "hi!");
        boolean boolean35 = bookManager0.DeleteBook(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        int int10 = bookManager0.getBookCount();
        boolean boolean12 = bookManager0.DeleteBook((int) ' ');
        boolean boolean18 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "", "hi!");
        boolean boolean20 = bookManager0.DeleteBook(4);
        boolean boolean22 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) (byte) 0, "", "", "", "hi!");
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
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
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
        boolean boolean37 = bookManager0.UpdateBook(10, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "hi!", "hi!");
        boolean boolean49 = bookManager0.UpdateBook((int) (short) 100, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
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
        boolean boolean33 = bookManager0.UpdateBook(0, "hi!", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
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
        boolean boolean25 = bookManager0.DeleteBook((int) (short) 0);
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
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
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
        bookManager0.AddBook(1, "", "", "hi!", "hi!");
        boolean boolean37 = bookManager0.UpdateBook((int) (byte) 0, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
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
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
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
        int int22 = bookManager0.getBookCount();
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean29 = bookManager0.UpdateBook((int) 'a', "", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        Book[] bookArray31 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertNotNull(bookArray31);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook(10, "hi!", "hi!", "", "");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        boolean boolean23 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        bookManager0.AddBook(2, "hi!", "", "", "");
        Book[] bookArray30 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(bookArray30);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "");
        boolean boolean27 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
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
        boolean boolean37 = bookManager0.DeleteBook((int) (byte) 1);
        java.lang.Class<?> wildcardClass38 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        int int6 = bookManager0.getBookCount();
        boolean boolean8 = bookManager0.DeleteBook((int) '4');
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook((int) 'a', "hi!", "", "", "");
        int int16 = bookManager0.getBookCount();
        Book[] bookArray17 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(bookArray17);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "", "");
        boolean boolean26 = bookManager0.UpdateBook(100, "", "", "", "hi!");
        Book[] bookArray27 = bookManager0.getAllBooks();
        bookManager0.AddBook((-1), "hi!", "", "", "hi!");
        Book[] bookArray34 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertNotNull(bookArray34);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
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
        Book[] bookArray40 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.DeleteBook((int) (byte) 0);
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) '4');
        boolean boolean12 = bookManager0.DeleteBook((int) (short) 1);
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        Book[] bookArray56 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass57 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 5 + "'", int43 == 5);
        org.junit.Assert.assertNotNull(bookArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass17 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        boolean boolean43 = bookManager0.UpdateBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean45 = bookManager0.DeleteBook(100);
        java.lang.Class<?> wildcardClass46 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 3 + "'", int37 == 3);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook(0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(3, "hi!", "", "", "");
        boolean boolean23 = bookManager0.UpdateBook(100, "", "hi!", "hi!", "");
        int int24 = bookManager0.getBookCount();
        boolean boolean30 = bookManager0.UpdateBook(10, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook(4, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        boolean boolean40 = bookManager0.UpdateBook(5, "hi!", "", "hi!", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        bookManager0.AddBook(10, "", "", "hi!", "");
        java.lang.Class<?> wildcardClass48 = bookManager0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(bookArray41);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "hi!", "");
        boolean boolean12 = bookManager0.DeleteBook(4);
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(1);
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        boolean boolean33 = bookManager0.UpdateBook(7, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass34 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        int int26 = bookManager0.getBookCount();
        boolean boolean32 = bookManager0.UpdateBook(100, "", "", "hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        bookManager0.AddBook(6, "hi!", "", "", "");
        bookManager0.AddBook((-1), "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        Book[] bookArray9 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.DeleteBook((int) (byte) -1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
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
        boolean boolean34 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass24 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        boolean boolean23 = bookManager0.DeleteBook(10);
        boolean boolean25 = bookManager0.DeleteBook((-1));
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        Book[] bookArray24 = bookManager0.getAllBooks();
        int int25 = bookManager0.getBookCount();
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
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
        boolean boolean45 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "hi!", "", "hi!", "");
        boolean boolean25 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean34 = bookManager0.DeleteBook((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook((int) '#');
        boolean boolean13 = bookManager0.DeleteBook((int) (byte) 1);
        bookManager0.AddBook((int) (short) 0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        int int12 = bookManager0.getBookCount();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 10);
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(3, "", "hi!", "", "");
        boolean boolean23 = bookManager0.DeleteBook(6);
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
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
        Book[] bookArray33 = bookManager0.getAllBooks();
        int int34 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(bookArray33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
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
        boolean boolean31 = bookManager0.UpdateBook(7, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        boolean boolean18 = bookManager0.DeleteBook(5);
        boolean boolean24 = bookManager0.UpdateBook((-1), "hi!", "", "", "hi!");
        Book[] bookArray25 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(bookArray25);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "hi!", "hi!", "", "hi!");
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        int int25 = bookManager0.getBookCount();
        int int26 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        Book[] bookArray19 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.UpdateBook(0, "", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook(3, "hi!", "", "hi!", "hi!");
        int int32 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        int int15 = bookManager0.getBookCount();
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        Book[] bookArray18 = bookManager0.getAllBooks();
        boolean boolean20 = bookManager0.DeleteBook(0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean4 = bookManager0.DeleteBook((int) 'a');
        int int5 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (byte) 0, "hi!", "", "hi!", "");
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) '4', "", "", "", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean22 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean24 = bookManager0.DeleteBook(1);
        int int25 = bookManager0.getBookCount();
        bookManager0.AddBook(3, "", "", "hi!", "hi!");
        Book[] bookArray32 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook(3);
        int int5 = bookManager0.getBookCount();
        Book[] bookArray6 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(bookArray6);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
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
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "", "", "");
        int int32 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
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
        boolean boolean42 = bookManager0.UpdateBook((int) (short) 100, "", "", "", "");
        int int43 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 4 + "'", int43 == 4);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook((int) '4');
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook((int) (short) 10, "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 10, "", "", "hi!", "hi!");
        boolean boolean29 = bookManager0.UpdateBook(1, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
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
        int int50 = bookManager0.getBookCount();
        boolean boolean56 = bookManager0.UpdateBook((int) (short) -1, "", "", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 6 + "'", int50 == 6);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
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
        boolean boolean45 = bookManager0.DeleteBook(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(bookArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        boolean boolean11 = bookManager0.DeleteBook(100);
        boolean boolean17 = bookManager0.UpdateBook(3, "", "", "hi!", "");
        bookManager0.AddBook((int) (short) 1, "", "hi!", "", "");
        boolean boolean29 = bookManager0.UpdateBook((int) 'a', "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        boolean boolean22 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        boolean boolean28 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        boolean boolean34 = bookManager0.UpdateBook((-1), "hi!", "", "", "");
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(2, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean22 = bookManager0.DeleteBook((int) 'a');
        boolean boolean28 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "hi!");
        boolean boolean40 = bookManager0.UpdateBook(6, "hi!", "hi!", "", "hi!");
        int int41 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((-1), "", "hi!", "hi!", "");
        boolean boolean10 = bookManager0.DeleteBook((int) (byte) 1);
        boolean boolean12 = bookManager0.DeleteBook((int) (byte) 0);
        boolean boolean18 = bookManager0.UpdateBook((int) 'a', "hi!", "", "", "hi!");
        bookManager0.AddBook(100, "hi!", "", "", "");
        boolean boolean26 = bookManager0.DeleteBook(2);
        int int27 = bookManager0.getBookCount();
        boolean boolean29 = bookManager0.DeleteBook((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        Book[] bookArray5 = bookManager0.getAllBooks();
        boolean boolean11 = bookManager0.UpdateBook(2, "hi!", "", "", "hi!");
        Book[] bookArray12 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "", "hi!", "", "hi!");
        boolean boolean24 = bookManager0.UpdateBook((-1), "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(bookArray5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook(2, "", "hi!", "hi!", "");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) 'a');
        boolean boolean12 = bookManager0.DeleteBook(0);
        boolean boolean14 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray15 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass16 = bookArray15.getClass();
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
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray18 = bookManager0.getAllBooks();
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) '#', "", "", "hi!", "hi!");
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook(0, "", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean19 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "", "", "hi!");
        int int20 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (byte) 1, "", "", "", "hi!");
        boolean boolean13 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "", "");
        Book[] bookArray14 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.UpdateBook(1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean25 = bookManager0.DeleteBook(10);
        bookManager0.AddBook((int) (byte) 0, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (byte) 10);
        int int17 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.UpdateBook((int) ' ', "", "", "hi!", "");
        boolean boolean29 = bookManager0.UpdateBook(3, "", "hi!", "", "hi!");
        Book[] bookArray30 = bookManager0.getAllBooks();
        Book[] bookArray31 = bookManager0.getAllBooks();
        Book[] bookArray32 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertNotNull(bookArray31);
        org.junit.Assert.assertNotNull(bookArray32);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean9 = bookManager0.DeleteBook((int) '#');
        bookManager0.AddBook((int) ' ', "hi!", "", "hi!", "hi!");
        boolean boolean21 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "", "hi!");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) -1);
        int int24 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "hi!", "");
        boolean boolean36 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean6 = bookManager0.DeleteBook(3);
        bookManager0.AddBook(10, "hi!", "", "", "");
        Book[] bookArray13 = bookManager0.getAllBooks();
        bookManager0.AddBook(0, "", "", "", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray13);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean15 = bookManager0.DeleteBook((int) (short) 1);
        Book[] bookArray16 = bookManager0.getAllBooks();
        Book[] bookArray17 = bookManager0.getAllBooks();
        boolean boolean19 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook(6, "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
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
        int int24 = bookManager0.getBookCount();
        Book[] bookArray25 = bookManager0.getAllBooks();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(bookArray25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        boolean boolean8 = bookManager0.DeleteBook(10);
        boolean boolean10 = bookManager0.DeleteBook(100);
        bookManager0.AddBook((int) '4', "", "hi!", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) ' ');
        Book[] bookArray16 = bookManager0.getAllBooks();
        int int17 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass18 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        Book[] bookArray3 = bookManager0.getAllBooks();
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook(100, "", "", "hi!", "hi!");
        bookManager0.AddBook((-1), "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        int int2 = bookManager0.getBookCount();
        bookManager0.AddBook(10, "", "", "hi!", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "hi!", "", "hi!");
        int int15 = bookManager0.getBookCount();
        boolean boolean21 = bookManager0.UpdateBook(0, "", "", "", "");
        Book[] bookArray22 = bookManager0.getAllBooks();
        java.lang.Class<?> wildcardClass23 = bookArray22.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        Book[] bookArray8 = bookManager0.getAllBooks();
        int int9 = bookManager0.getBookCount();
        bookManager0.AddBook(5, "hi!", "", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean13 = bookManager0.UpdateBook((int) 'a', "hi!", "hi!", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(1);
        bookManager0.AddBook(0, "", "", "hi!", "hi!");
        Book[] bookArray22 = bookManager0.getAllBooks();
        boolean boolean28 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "");
        boolean boolean30 = bookManager0.DeleteBook(2);
        boolean boolean32 = bookManager0.DeleteBook(4);
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(1, "", "hi!", "hi!", "hi!");
        boolean boolean18 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook(2, "hi!", "", "hi!", "");
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        boolean boolean32 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook(6);
        bookManager0.AddBook(5, "hi!", "hi!", "", "hi!");
        int int23 = bookManager0.getBookCount();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 1, "hi!", "", "hi!", "hi!");
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean20 = bookManager0.UpdateBook(3, "", "hi!", "hi!", "hi!");
        java.lang.Class<?> wildcardClass21 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
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
        boolean boolean33 = bookManager0.UpdateBook((int) (short) 10, "", "", "", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        boolean boolean15 = bookManager0.DeleteBook((int) 'a');
        int int16 = bookManager0.getBookCount();
        boolean boolean22 = bookManager0.UpdateBook((int) (short) -1, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        bookManager0.AddBook(100, "hi!", "hi!", "hi!", "");
        boolean boolean14 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "hi!", "hi!", "hi!");
        boolean boolean16 = bookManager0.DeleteBook((int) (short) 1);
        boolean boolean18 = bookManager0.DeleteBook((int) (short) 0);
        int int19 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 10, "hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        int int4 = bookManager0.getBookCount();
        boolean boolean10 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "", "hi!");
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 10, "", "", "hi!", "hi!");
        Book[] bookArray23 = bookManager0.getAllBooks();
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 10);
        Book[] bookArray26 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(bookArray26);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        Book[] bookArray2 = bookManager0.getAllBooks();
        Book[] bookArray3 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) 'a', "", "", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
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
        boolean boolean31 = bookManager0.DeleteBook(3);
        int int32 = bookManager0.getBookCount();
        java.lang.Class<?> wildcardClass33 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 4 + "'", int32 == 4);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        int int39 = bookManager0.getBookCount();
        boolean boolean45 = bookManager0.UpdateBook((int) (byte) 1, "", "hi!", "", "hi!");
        bookManager0.AddBook(0, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        int int5 = bookManager0.getBookCount();
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 10, "", "", "hi!", "");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) (byte) 1, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray7 = bookManager0.getAllBooks();
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean10 = bookManager0.DeleteBook((int) ' ');
        bookManager0.AddBook((int) ' ', "hi!", "", "", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        bookManager0.AddBook((int) '#', "", "", "", "hi!");
        boolean boolean30 = bookManager0.UpdateBook(0, "hi!", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        boolean boolean9 = bookManager0.UpdateBook((int) (short) 0, "", "", "hi!", "");
        Book[] bookArray10 = bookManager0.getAllBooks();
        int int11 = bookManager0.getBookCount();
        Book[] bookArray12 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.DeleteBook((int) (short) 0);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
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
        int int40 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 4 + "'", int39 == 4);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 4 + "'", int40 == 4);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "hi!");
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
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        int int3 = bookManager0.getBookCount();
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean12 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        int int7 = bookManager0.getBookCount();
        boolean boolean13 = bookManager0.UpdateBook((int) '4', "", "", "hi!", "hi!");
        Book[] bookArray14 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 1, "", "hi!", "hi!", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean27 = bookManager0.UpdateBook(3, "hi!", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean39 = bookManager0.UpdateBook(4, "hi!", "", "hi!", "hi!");
        Book[] bookArray40 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(bookArray40);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
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
        int int21 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (byte) 100, "", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertNotNull(bookArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(bookArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook((int) (short) 100, "hi!", "", "hi!", "");
        bookManager0.AddBook(2, "", "hi!", "", "hi!");
        Book[] bookArray26 = bookManager0.getAllBooks();
        boolean boolean32 = bookManager0.UpdateBook((int) (short) 1, "hi!", "hi!", "", "");
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        boolean boolean40 = bookManager0.DeleteBook((int) (short) 10);
        int int41 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 3 + "'", int41 == 3);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
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
        boolean boolean27 = bookManager0.UpdateBook((int) (short) 10, "hi!", "hi!", "hi!", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook(100);
        Book[] bookArray4 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "", "", "", "hi!");
        int int11 = bookManager0.getBookCount();
        int int12 = bookManager0.getBookCount();
        boolean boolean18 = bookManager0.UpdateBook(0, "", "", "", "hi!");
        int int19 = bookManager0.getBookCount();
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean22 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean24 = bookManager0.DeleteBook((int) (short) 100);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        bookManager0.AddBook((int) (short) 100, "", "", "", "");
        bookManager0.AddBook((int) (short) -1, "", "hi!", "", "");
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook(1, "", "hi!", "", "");
        Book[] bookArray7 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) 1, "hi!", "", "", "");
        boolean boolean19 = bookManager0.UpdateBook(1, "hi!", "hi!", "", "hi!");
        Book[] bookArray20 = bookManager0.getAllBooks();
        boolean boolean26 = bookManager0.UpdateBook((int) (byte) -1, "hi!", "hi!", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        bookManager0.AddBook(0, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook((int) (byte) 10, "hi!", "", "hi!", "");
        boolean boolean18 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        boolean boolean20 = bookManager0.UpdateBook((int) (short) 10, "", "hi!", "hi!", "hi!");
        boolean boolean26 = bookManager0.UpdateBook(0, "", "hi!", "hi!", "hi!");
        boolean boolean28 = bookManager0.DeleteBook(4);
        boolean boolean34 = bookManager0.UpdateBook((int) '4', "", "hi!", "", "");
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "");
        Book[] bookArray41 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(bookArray41);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) (byte) 10, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(6, "hi!", "", "hi!", "");
        java.lang.Class<?> wildcardClass30 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean7 = bookManager0.UpdateBook((int) (short) -1, "hi!", "", "", "");
        boolean boolean13 = bookManager0.UpdateBook(1, "hi!", "", "", "hi!");
        boolean boolean15 = bookManager0.DeleteBook(0);
        boolean boolean17 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean23 = bookManager0.UpdateBook((int) '#', "hi!", "", "hi!", "hi!");
        bookManager0.AddBook(6, "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
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
        boolean boolean43 = bookManager0.UpdateBook(1, "", "", "", "");
        boolean boolean45 = bookManager0.DeleteBook(0);
        bookManager0.AddBook(0, "", "hi!", "", "");
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
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        bookManager0.AddBook((int) '#', "hi!", "hi!", "hi!", "hi!");
        int int13 = bookManager0.getBookCount();
        boolean boolean15 = bookManager0.DeleteBook((int) (byte) 10);
        boolean boolean21 = bookManager0.UpdateBook((int) (byte) 100, "hi!", "hi!", "hi!", "");
        bookManager0.AddBook(3, "hi!", "hi!", "hi!", "hi!");
        Book[] bookArray28 = bookManager0.getAllBooks();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(bookArray28);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean8 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "hi!", "");
        Book[] bookArray9 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (byte) -1, "", "", "hi!", "");
        bookManager0.AddBook(1, "hi!", "hi!", "", "");
        boolean boolean23 = bookManager0.DeleteBook((int) (byte) 10);
        bookManager0.AddBook(4, "hi!", "hi!", "hi!", "");
        boolean boolean31 = bookManager0.DeleteBook(1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(bookArray9);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        int int13 = bookManager0.getBookCount();
        int int14 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "hi!", "hi!", "", "hi!");
        int int21 = bookManager0.getBookCount();
        boolean boolean23 = bookManager0.DeleteBook(6);
        boolean boolean25 = bookManager0.DeleteBook(6);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        bookManager0.AddBook((int) (byte) 10, "", "hi!", "hi!", "hi!");
        bookManager0.AddBook((int) '4', "hi!", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray43);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        boolean boolean8 = bookManager0.UpdateBook(100, "", "hi!", "", "");
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        bookManager0.AddBook((int) (short) 0, "hi!", "", "hi!", "hi!");
        bookManager0.AddBook((int) (byte) 1, "", "", "hi!", "hi!");
        int int23 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 100, "", "hi!", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        Book[] bookArray21 = bookManager0.getAllBooks();
        boolean boolean23 = bookManager0.DeleteBook((int) '4');
        boolean boolean25 = bookManager0.DeleteBook((int) (byte) 1);
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(bookArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) 10);
        boolean boolean5 = bookManager0.DeleteBook((int) '4');
        boolean boolean11 = bookManager0.UpdateBook((int) (short) 100, "", "hi!", "", "");
        bookManager0.AddBook((int) '#', "", "hi!", "hi!", "");
        boolean boolean19 = bookManager0.DeleteBook(2);
        boolean boolean25 = bookManager0.UpdateBook(7, "hi!", "hi!", "", "hi!");
        boolean boolean31 = bookManager0.UpdateBook((int) (byte) 10, "", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
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
        boolean boolean37 = bookManager0.DeleteBook(0);
        int int38 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        BookManager bookManager0 = new BookManager();
        boolean boolean2 = bookManager0.DeleteBook((int) (byte) -1);
        bookManager0.AddBook((int) (short) 10, "hi!", "hi!", "", "hi!");
        boolean boolean14 = bookManager0.UpdateBook(6, "hi!", "", "", "");
        bookManager0.AddBook(10, "", "", "", "");
        int int21 = bookManager0.getBookCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
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
        boolean boolean43 = bookManager0.UpdateBook((int) '#', "", "hi!", "hi!", "hi!");
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
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        BookManager bookManager0 = new BookManager();
        boolean boolean6 = bookManager0.UpdateBook((int) 'a', "", "", "hi!", "");
        boolean boolean12 = bookManager0.UpdateBook((int) (short) 100, "", "", "hi!", "");
        boolean boolean18 = bookManager0.UpdateBook((int) (short) -1, "", "hi!", "hi!", "");
        int int19 = bookManager0.getBookCount();
        int int20 = bookManager0.getBookCount();
        bookManager0.AddBook((int) (short) 1, "hi!", "hi!", "", "hi!");
        int int27 = bookManager0.getBookCount();
        Book[] bookArray28 = bookManager0.getAllBooks();
        boolean boolean34 = bookManager0.UpdateBook((-1), "", "hi!", "", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(bookArray28);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
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
        java.lang.Class<?> wildcardClass35 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        BookManager bookManager0 = new BookManager();
        int int1 = bookManager0.getBookCount();
        boolean boolean3 = bookManager0.DeleteBook((int) (short) -1);
        Book[] bookArray4 = bookManager0.getAllBooks();
        boolean boolean6 = bookManager0.DeleteBook(0);
        boolean boolean8 = bookManager0.DeleteBook((int) (short) -1);
        int int9 = bookManager0.getBookCount();
        Book[] bookArray10 = bookManager0.getAllBooks();
        boolean boolean16 = bookManager0.UpdateBook(2, "", "", "", "hi!");
        bookManager0.AddBook((int) (byte) 0, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass23 = bookManager0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(bookArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
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
        boolean boolean52 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
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
        bookManager0.AddBook(4, "", "hi!", "", "");
        bookManager0.AddBook((int) 'a', "hi!", "", "hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(bookArray37);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        Book[] bookArray2 = bookManager0.getAllBooks();
        boolean boolean4 = bookManager0.DeleteBook((int) (short) 100);
        boolean boolean6 = bookManager0.DeleteBook((int) (byte) 100);
        Book[] bookArray7 = bookManager0.getAllBooks();
        boolean boolean9 = bookManager0.DeleteBook(0);
        Book[] bookArray10 = bookManager0.getAllBooks();
        Book[] bookArray11 = bookManager0.getAllBooks();
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertNotNull(bookArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(bookArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(bookArray10);
        org.junit.Assert.assertNotNull(bookArray11);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        BookManager bookManager0 = new BookManager();
        Book[] bookArray1 = bookManager0.getAllBooks();
        boolean boolean7 = bookManager0.UpdateBook((int) 'a', "", "hi!", "hi!", "hi!");
        Book[] bookArray8 = bookManager0.getAllBooks();
        boolean boolean14 = bookManager0.UpdateBook((-1), "hi!", "", "hi!", "");
        bookManager0.AddBook(10, "hi!", "hi!", "", "hi!");
        boolean boolean22 = bookManager0.DeleteBook(1);
        boolean boolean28 = bookManager0.UpdateBook((int) '#', "hi!", "hi!", "", "hi!");
        boolean boolean34 = bookManager0.UpdateBook(10, "", "", "hi!", "");
        boolean boolean40 = bookManager0.UpdateBook(5, "", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(bookArray1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(bookArray8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }
}

