import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = JournalManager.MAX_RATING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry7 = journalManager0.addEntry("hi!", "hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        JournalManager journalManager0 = new JournalManager();
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = JournalManager.NO_RATING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry7 = journalManager0.addEntry("", "hi!", "hi!", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int0 = JournalManager.MIN_RATING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.Class<?> wildcardClass9 = localDate8.getClass();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getReview();
        int int7 = journalEntry5.getEntryId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry10 = journalManager0.addEntry("", "hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.lang.Class<?> wildcardClass4 = journalManager3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry8 = journalManager3.addEntry("", "hi!", "", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(journalEntry2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        boolean boolean9 = journalEntry5.hasRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.lang.String str7 = journalEntry5.getReview();
        java.lang.String str8 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeReview((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry9 = journalManager0.addEntry("", "hi!", "hi!", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry8 = journalManager0.addEntry("hi!", "hi!", "", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        boolean boolean9 = journalEntry5.hasReview();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.lang.Class<?> wildcardClass6 = journalManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        boolean boolean5 = journalManager0.removeReview(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        int int7 = journalEntry5.getEntryId();
        int int8 = journalEntry5.getRating();
        int int9 = journalEntry5.getRating();
        int int10 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        java.lang.Class<?> wildcardClass10 = localDate9.getClass();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeRating((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry14 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        boolean boolean9 = journalEntry8.hasRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList10 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(journalEntryList10);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setRating((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.lang.String str9 = journalEntry8.getReview();
        int int10 = journalEntry8.getEntryId();
        java.time.LocalDate localDate11 = journalEntry8.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        journalEntry8.setNotes("hi!");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        java.lang.Class<?> wildcardClass4 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setNotes("");
        journalEntry5.setReview("");
        boolean boolean13 = journalEntry5.hasReview();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        int int7 = journalManager0.getEntryCount();
        boolean boolean10 = journalManager0.editNotes((int) '4', "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        journalEntry10.setRating(100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        java.lang.Class<?> wildcardClass7 = journalManager3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(journalEntryList4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setNotes("");
        boolean boolean11 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        int int8 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry18 = journalManager0.addEntry("", "", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        int int12 = journalEntry5.getRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry12 = journalManager0.addEntry("", "", "hi!", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        java.lang.String str11 = journalEntry10.getNotes();
        java.time.LocalDate localDate12 = journalEntry10.getDateWritten();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        boolean boolean12 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        boolean boolean8 = journalManager0.deleteEntry(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        java.lang.Class<?> wildcardClass5 = journalManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        journalEntry14.setNotes("hi!");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.Class<?> wildcardClass12 = localDate11.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalStorage0.getAllEntries();
        JournalEntry journalEntry8 = journalStorage0.getEntry((int) 'a');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNull(journalEntry5);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertNull(journalEntry8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getReview();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview(0);
        int int8 = journalManager0.getEntryCount();
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry13 = journalManager0.addEntry("", "", "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean7 = journalManager0.removeNotes(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        boolean boolean10 = journalManager0.editNotes((int) (byte) 1, "hi!");
        boolean boolean13 = journalManager0.editReview(0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalManager3.deleteEntry(2);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        int int21 = journalEntry19.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        boolean boolean12 = journalManager0.removeNotes(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        boolean boolean11 = journalEntry5.hasReview();
        java.lang.String str12 = journalEntry5.getReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        boolean boolean9 = journalEntry5.hasReview();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        boolean boolean11 = journalEntry5.hasNotes();
        boolean boolean12 = journalEntry5.hasRating();
        int int13 = journalEntry5.getRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        JournalEntry journalEntry10 = journalManager0.getEntry((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(journalEntry10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "", 100);
        int int15 = journalEntry14.getRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        boolean boolean8 = journalEntry5.hasNotes();
        java.lang.String str9 = journalEntry5.getReview();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean14 = journalManager0.editReview((int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        JournalEntry journalEntry9 = journalManager0.getEntry(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(journalEntry9);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setReview("hi!");
        boolean boolean13 = journalEntry5.hasNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeRating((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        int int10 = journalManager9.getEntryCount();
        int int11 = journalManager9.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        JournalEntry journalEntry5 = new JournalEntry(3, "", "", "", (int) (byte) 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean13 = journalManager0.editRating(52, (int) (byte) 100);
        int int14 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry8 = journalManager3.addEntry("", "hi!", "", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(journalEntry2);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        int int11 = journalEntry5.getEntryId();
        boolean boolean12 = journalEntry5.hasReview();
        boolean boolean13 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalManager0.getAllEntries();
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry16 = journalManager0.addEntry("hi!", "hi!", "", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntryList11);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeReview((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        int int10 = journalEntry8.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        int int17 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalStorage0.getAllEntries();
        java.lang.Class<?> wildcardClass19 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(journalEntryList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList7 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        int int3 = journalManager0.getEntryCount();
        java.lang.Class<?> wildcardClass4 = journalManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        journalEntry5.setNotes("hi!");
        int int15 = journalEntry5.getEntryId();
        boolean boolean16 = journalEntry5.hasNotes();
        int int17 = journalEntry5.getEntryId();
        journalEntry5.setRating(10);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        journalEntry5.setNotes("hi!");
        java.lang.String str12 = journalEntry5.getNotes();
        int int13 = journalEntry5.getRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        JournalEntry journalEntry5 = new JournalEntry(52, "hi!", "hi!", "", 10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(journalEntry14);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        java.lang.Class<?> wildcardClass12 = journalEntry5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalEntry journalEntry18 = journalStorage0.getEntry(10);
        java.util.ArrayList<JournalEntry> journalEntryList19 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNull(journalEntry18);
        org.junit.Assert.assertNotNull(journalEntryList19);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setReview("");
        java.lang.String str13 = journalEntry5.getNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        java.lang.Class<?> wildcardClass4 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        int int9 = journalStorage0.getEntryCount();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        java.util.ArrayList<JournalEntry> journalEntryList10 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertNotNull(journalEntryList10);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "hi!", "hi!", "hi!", (int) (byte) 1);
        java.lang.String str6 = journalEntry5.getReview();
        int int7 = journalEntry5.getRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry(100);
        boolean boolean16 = journalManager0.removeNotes((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        int int10 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setRating(52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        java.lang.String str11 = journalEntry10.getNotes();
        java.lang.Class<?> wildcardClass12 = journalEntry10.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean13 = journalManager0.editReview((-1), "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry18 = journalManager0.addEntry("hi!", "hi!", "hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        java.lang.Class<?> wildcardClass4 = journalEntryList3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        int int6 = journalEntry5.getEntryId();
        journalEntry5.setRating((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setNotes("hi!");
        journalEntry5.setReview("");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        java.lang.String str27 = journalEntry26.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        int int11 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setNotes("hi!");
        journalEntry5.setRating(10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeReview(0);
        int int3 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.removeRating(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean20 = journalManager17.editNotes(0, "");
        boolean boolean22 = journalManager17.removeNotes(52);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.time.LocalDate localDate9 = journalEntry8.getDateEdited();
        int int10 = journalEntry8.getRating();
        java.lang.String str11 = journalEntry8.getBookTitle();
        java.lang.Class<?> wildcardClass12 = journalEntry8.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getNotes();
        java.lang.Class<?> wildcardClass10 = journalEntry5.getClass();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setNotes("hi!");
        journalEntry5.setReview("hi!");
        java.time.LocalDate localDate12 = journalEntry5.getDateWritten();
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(0);
        boolean boolean12 = journalEntry5.hasReview();
        boolean boolean13 = journalEntry5.hasRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeReview(10);
        boolean boolean15 = journalManager0.editReview(52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setReview("");
        boolean boolean13 = journalEntry5.hasRating();
        journalEntry5.setNotes("");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        journalEntry8.setRating((int) (byte) 0);
        java.lang.String str12 = journalEntry8.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        boolean boolean21 = journalEntry19.hasRating();
        journalEntry19.setRating(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        int int7 = journalEntry5.getEntryId();
        int int8 = journalEntry5.getRating();
        int int9 = journalEntry5.getRating();
        journalEntry5.setReview("hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview((int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.getEntry((-1));
        JournalEntry journalEntry13 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        java.util.ArrayList<JournalEntry> journalEntryList14 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry13);
        org.junit.Assert.assertNotNull(journalEntryList14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        int int12 = journalEntry5.getEntryId();
        boolean boolean13 = journalEntry5.hasNotes();
        java.lang.Class<?> wildcardClass14 = journalEntry5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.getEntry((-1));
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean11 = journalManager9.removeRating((int) 'a');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(100);
        boolean boolean15 = journalManager0.editNotes((int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        java.lang.String str6 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setReview("");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        int int4 = journalStorage0.getEntryCount();
        JournalManager journalManager5 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        java.lang.String str10 = journalEntry8.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.getEntry((-1));
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry11 = journalStorage0.getEntry((int) '4');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertNull(journalEntry11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean19 = journalManager17.deleteEntry((int) (byte) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean8 = journalManager0.editNotes(1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", (int) (short) 1);
        boolean boolean17 = journalManager0.removeReview((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        boolean boolean18 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry23 = journalStorage0.addEntry("hi!", "", "", (int) (byte) -1);
        java.lang.String str24 = journalEntry23.getReview();
        java.lang.String str25 = journalEntry23.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(journalEntry23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean9 = journalManager0.deleteEntry((int) 'a');
        boolean boolean11 = journalManager0.removeRating((int) ' ');
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getNotes();
        int int9 = journalEntry5.getEntryId();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "", "", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A journal entry needs at least a note, a review or a rating.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getReview();
        journalEntry5.setNotes("");
        java.lang.String str11 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate12 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        boolean boolean5 = journalManager0.removeReview((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        boolean boolean4 = journalStorage0.deleteEntry(2);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = journalManager0.editRating(1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry12 = journalManager0.addEntry("", "", "hi!", 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        int int6 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalStorage0.getAllEntries();
        boolean boolean8 = journalStorage0.deleteEntry(52);
        boolean boolean10 = journalStorage0.deleteEntry(2);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNull(journalEntry5);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 10, "", "hi!", "hi!", (int) (short) -1);
        boolean boolean6 = journalEntry5.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        java.lang.Class<?> wildcardClass21 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        int int12 = journalEntry5.getEntryId();
        int int13 = journalEntry5.getEntryId();
        java.lang.Class<?> wildcardClass14 = journalEntry5.getClass();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeReview((int) (short) 10);
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean11 = journalManager0.deleteEntry(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalEntry journalEntry10 = journalStorage0.getEntry(10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(journalEntry10);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        int int27 = journalEntry26.getEntryId();
        java.lang.Class<?> wildcardClass28 = journalEntry26.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        boolean boolean9 = journalManager0.deleteEntry((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        journalEntry5.setReview("hi!");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate12 = journalEntry5.getDateWritten();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        int int16 = journalStorage0.getEntryCount();
        JournalEntry journalEntry18 = journalStorage0.getEntry((int) (short) -1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(journalEntry18);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        java.time.LocalDate localDate21 = journalEntry19.getDateEdited();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = localDate21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(localDate21);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        JournalEntry journalEntry5 = new JournalEntry(1, "", "", "", (int) 'a');
        boolean boolean6 = journalEntry5.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        journalEntry5.setRating(0);
        boolean boolean8 = journalEntry5.hasNotes();
        int int9 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "");
        boolean boolean15 = journalManager0.removeReview((int) 'a');
        boolean boolean17 = journalManager0.deleteEntry((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry22 = journalManager0.addEntry("hi!", "", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        journalEntry5.setReview("hi!");
        java.lang.String str13 = journalEntry5.getReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        int int18 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.lang.String str9 = journalEntry8.getReview();
        java.lang.String str10 = journalEntry8.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        int int21 = journalStorage0.getEntryCount();
        boolean boolean23 = journalStorage0.deleteEntry((int) (short) 0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 0, "", "hi!", "", (int) (short) -1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        JournalManager journalManager2 = new JournalManager(journalStorage0);
        boolean boolean5 = journalManager2.editNotes(1, "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry10 = journalManager2.addEntry("", "hi!", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        java.lang.String str12 = journalEntry5.getNotes();
        java.time.LocalDate localDate13 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate14 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.time.LocalDate localDate9 = journalEntry8.getDateEdited();
        int int10 = journalEntry8.getRating();
        java.lang.String str11 = journalEntry8.getBookTitle();
        int int12 = journalEntry8.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getNotes();
        java.lang.String str9 = journalEntry5.getReview();
        boolean boolean10 = journalEntry5.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        java.lang.String str11 = journalEntry5.getNotes();
        journalEntry5.setReview("");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        boolean boolean5 = journalManager0.removeReview(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.lang.String str9 = journalEntry8.getReview();
        java.lang.String str10 = journalEntry8.getNotes();
        java.lang.String str11 = journalEntry8.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean13 = journalManager0.editReview((-1), "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry18 = journalManager0.addEntry("hi!", "", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        journalEntry5.setNotes("hi!");
        int int15 = journalEntry5.getEntryId();
        boolean boolean16 = journalEntry5.hasNotes();
        int int17 = journalEntry5.getEntryId();
        java.time.LocalDate localDate18 = journalEntry5.getDateEdited();
        boolean boolean19 = journalEntry5.hasReview();
        java.lang.Class<?> wildcardClass20 = journalEntry5.getClass();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        java.lang.Class<?> wildcardClass11 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        int int5 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        java.lang.Class<?> wildcardClass17 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        boolean boolean9 = journalManager3.editReview(1, "");
        boolean boolean11 = journalManager3.deleteEntry((int) (short) 0);
        boolean boolean13 = journalManager3.removeNotes((int) (byte) -1);
        int int14 = journalManager3.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        java.lang.String str11 = journalEntry5.getNotes();
        int int12 = journalEntry5.getRating();
        int int13 = journalEntry5.getEntryId();
        java.lang.String str14 = journalEntry5.getBookTitle();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        JournalEntry journalEntry19 = journalStorage0.addEntry("hi!", "", "hi!", 100);
        java.util.ArrayList<JournalEntry> journalEntryList20 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNotNull(journalEntryList20);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        int int11 = journalStorage0.getEntryCount();
        JournalManager journalManager12 = new JournalManager(journalStorage0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = journalManager12.removeNotes((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: This entry has no notes to remove.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean12 = journalManager9.editReview((int) (byte) 10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList13 = journalManager9.getAllEntries();
        boolean boolean16 = journalManager9.editReview((int) (byte) 100, "hi!");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(journalEntryList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        int int13 = journalEntry5.getEntryId();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean3 = journalManager0.editRating((int) (byte) 10, (int) (short) -1);
        boolean boolean5 = journalManager0.removeRating((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry7 = journalManager0.addEntry("", "", "", 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setNotes("hi!");
        journalEntry5.setReview("hi!");
        journalEntry5.setNotes("");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        java.lang.String str11 = journalEntry5.getNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        int int11 = journalEntry5.getEntryId();
        boolean boolean12 = journalEntry5.hasReview();
        java.lang.String str13 = journalEntry5.getBookTitle();
        java.lang.String str14 = journalEntry5.getBookTitle();
        java.lang.String str15 = journalEntry5.getNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        boolean boolean9 = journalEntry8.hasNotes();
        java.time.LocalDate localDate10 = journalEntry8.getDateWritten();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        JournalEntry journalEntry6 = journalManager0.getEntry((int) 'a');
        JournalEntry journalEntry8 = journalManager0.getEntry(10);
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalManager0.getAllEntries();
        boolean boolean11 = journalManager0.removeReview(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        int int7 = journalManager0.getEntryCount();
        int int8 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        int int7 = journalEntry5.getEntryId();
        int int8 = journalEntry5.getRating();
        int int9 = journalEntry5.getRating();
        java.lang.String str10 = journalEntry5.getNotes();
        java.lang.String str11 = journalEntry5.getBookTitle();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        java.util.ArrayList<JournalEntry> journalEntryList15 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntryList15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeReview(0);
        boolean boolean4 = journalManager0.removeReview(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        java.util.ArrayList<JournalEntry> journalEntryList7 = journalManager0.getAllEntries();
        boolean boolean10 = journalManager0.editReview(4, "");
        boolean boolean12 = journalManager0.removeNotes(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertNotNull(journalEntryList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean11 = journalManager0.editReview((int) (byte) 1, "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry16 = journalManager0.addEntry("hi!", "hi!", "", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.editReview(100, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry16 = journalManager0.addEntry("", "hi!", "hi!", 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", 0);
        java.lang.String str16 = journalEntry15.getNotes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        int int9 = journalStorage0.getEntryCount();
        JournalEntry journalEntry14 = journalStorage0.addEntry("hi!", "", "hi!", (int) (byte) -1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(journalEntry14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeReview(10);
        boolean boolean15 = journalManager0.editNotes((int) (short) -1, "");
        boolean boolean17 = journalManager0.removeReview((int) (short) 100);
        boolean boolean19 = journalManager0.deleteEntry(1);
        boolean boolean22 = journalManager0.editRating((int) (byte) 0, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeReview(0);
        JournalEntry journalEntry4 = journalManager0.getEntry((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(journalEntry4);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        boolean boolean11 = journalEntry5.hasReview();
        journalEntry5.setNotes("");
        boolean boolean14 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        boolean boolean14 = journalManager0.removeRating((int) ' ');
        boolean boolean16 = journalManager0.removeRating((int) (short) 100);
        boolean boolean18 = journalManager0.removeNotes(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.removeRating(2);
        boolean boolean13 = journalManager0.deleteEntry((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        java.lang.String str12 = journalEntry5.getNotes();
        boolean boolean13 = journalEntry5.hasRating();
        boolean boolean14 = journalEntry5.hasNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        journalEntry5.setNotes("");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        JournalEntry journalEntry31 = journalStorage0.addEntry("", "hi!", "", 10);
        java.lang.String str32 = journalEntry31.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertNotNull(journalEntry31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        boolean boolean21 = journalStorage0.deleteEntry((int) 'a');
        JournalManager journalManager22 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        int int9 = journalStorage0.getEntryCount();
        int int10 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalStorage0.getAllEntries();
        JournalEntry journalEntry13 = journalStorage0.getEntry((int) 'a');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(journalEntryList11);
        org.junit.Assert.assertNull(journalEntry13);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.lang.String str9 = journalEntry8.getReview();
        java.lang.String str10 = journalEntry8.getNotes();
        int int11 = journalEntry8.getRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        boolean boolean22 = journalManager20.removeRating(52);
        boolean boolean24 = journalManager20.removeReview((int) (byte) -1);
        boolean boolean26 = journalManager20.removeRating((int) ' ');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        boolean boolean9 = journalEntry8.hasNotes();
        java.lang.String str10 = journalEntry8.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 10, "", "hi!", "hi!", (int) (short) -1);
        java.lang.String str6 = journalEntry5.getReview();
        java.time.LocalDate localDate7 = journalEntry5.getDateEdited();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        java.lang.String str12 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry7 = journalManager0.addEntry("", "", "", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        java.time.LocalDate localDate6 = journalEntry5.getDateEdited();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = localDate6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.getClass()\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        JournalEntry journalEntry5 = new JournalEntry((int) ' ', "hi!", "", "hi!", 0);
        int int6 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeNotes(0);
        boolean boolean15 = journalManager0.editReview((int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        boolean boolean21 = journalEntry19.hasRating();
        java.time.LocalDate localDate22 = journalEntry19.getDateWritten();
        java.lang.String str23 = journalEntry19.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 100, "hi!", "hi!", "hi!", (int) (byte) -1);
        java.time.LocalDate localDate6 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        JournalManager journalManager2 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalManager2.getAllEntries();
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertNotNull(journalEntryList3);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.getEntry((-1));
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry11 = journalStorage0.getEntry(3);
        int int12 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertNull(journalEntry11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        boolean boolean18 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry20 = journalStorage0.getEntry((int) (byte) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(journalEntry20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        int int9 = journalStorage0.getEntryCount();
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", (int) (short) 10);
        int int15 = journalEntry14.getRating();
        journalEntry14.setNotes("hi!");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean13 = journalManager0.editReview((-1), "");
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry18 = journalManager0.addEntry("hi!", "", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: A journal entry needs at least a note, a review or a rating.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating((int) ' ');
        boolean boolean6 = journalManager0.removeRating((int) '4');
        boolean boolean8 = journalManager0.removeNotes(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        int int11 = journalEntry5.getEntryId();
        journalEntry5.setRating(3);
        journalEntry5.setRating((int) (short) 100);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", 0);
        boolean boolean16 = journalEntry15.hasReview();
        int int17 = journalEntry15.getRating();
        java.time.LocalDate localDate18 = journalEntry15.getDateWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        boolean boolean21 = journalEntry19.hasRating();
        java.time.LocalDate localDate22 = journalEntry19.getDateEdited();
        int int23 = journalEntry19.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(100);
        boolean boolean14 = journalManager0.removeRating((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean9 = journalManager0.removeNotes((int) (short) -1);
        java.lang.Class<?> wildcardClass10 = journalManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeReview((int) (short) 10);
        boolean boolean7 = journalManager0.editReview(3, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        int int27 = journalEntry26.getEntryId();
        boolean boolean28 = journalEntry26.hasReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry(100);
        boolean boolean17 = journalManager0.editNotes((int) (short) -1, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalManager0.getAllEntries();
        boolean boolean20 = journalManager0.removeReview((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(journalEntryList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean11 = journalStorage0.deleteEntry(4);
        boolean boolean13 = journalStorage0.deleteEntry(100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        JournalEntry journalEntry10 = journalManager0.getEntry(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(journalEntry10);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        journalEntry5.setNotes("hi!");
        int int15 = journalEntry5.getEntryId();
        boolean boolean16 = journalEntry5.hasNotes();
        int int17 = journalEntry5.getEntryId();
        java.time.LocalDate localDate18 = journalEntry5.getDateEdited();
        boolean boolean19 = journalEntry5.hasReview();
        java.time.LocalDate localDate20 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        java.lang.String str17 = journalEntry16.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean12 = journalManager0.removeReview((int) '4');
        boolean boolean14 = journalManager0.removeRating(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        JournalEntry journalEntry25 = journalStorage0.addEntry("hi!", "hi!", "hi!", (int) (byte) 100);
        journalEntry25.setNotes("");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNotNull(journalEntry25);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry12 = journalStorage0.getEntry((int) (short) 0);
        boolean boolean14 = journalStorage0.deleteEntry((int) (byte) 0);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("hi!", "", "hi!", 52);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(journalEntry20);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        JournalEntry journalEntry25 = journalStorage0.addEntry("hi!", "hi!", "hi!", (int) (byte) 100);
        java.lang.String str26 = journalEntry25.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNotNull(journalEntry25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        java.lang.String str12 = journalEntry5.getNotes();
        boolean boolean13 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        boolean boolean11 = journalEntry10.hasReview();
        java.time.LocalDate localDate12 = journalEntry10.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.Class<?> wildcardClass8 = journalEntry5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        java.lang.Class<?> wildcardClass11 = journalEntry10.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean14 = journalManager0.editReview(100, "hi!");
        boolean boolean16 = journalManager0.removeNotes((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalManager10.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList11);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        java.lang.String str12 = journalEntry5.getBookTitle();
        boolean boolean13 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        java.lang.Class<?> wildcardClass11 = journalManager10.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry(100);
        boolean boolean17 = journalManager0.editNotes((int) (short) -1, "hi!");
        JournalEntry journalEntry22 = journalManager0.addEntry("hi!", "", "hi!", (int) (short) 0);
        java.lang.Class<?> wildcardClass23 = journalEntry22.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(journalEntry22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        journalEntry5.setReview("hi!");
        journalEntry5.setNotes("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = journalManager0.editReview(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Review cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        java.time.LocalDate localDate11 = journalEntry10.getDateWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        int int7 = journalEntry5.getEntryId();
        int int8 = journalEntry5.getRating();
        int int9 = journalEntry5.getRating();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setRating((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        int int6 = journalEntry5.getEntryId();
        int int7 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        boolean boolean14 = journalManager0.removeRating((int) ' ');
        java.util.ArrayList<JournalEntry> journalEntryList15 = journalManager0.getAllEntries();
        boolean boolean18 = journalManager0.editRating(10, (int) (byte) 10);
        boolean boolean21 = journalManager0.editReview(52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(journalEntryList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("", "", "", 0);
        java.lang.Class<?> wildcardClass16 = journalEntry15.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        int int8 = journalEntry5.getEntryId();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.lang.String str10 = journalEntry5.getReview();
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate12 = journalEntry5.getDateEdited();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        int int16 = journalStorage0.getEntryCount();
        boolean boolean18 = journalStorage0.deleteEntry((int) (short) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        boolean boolean10 = journalStorage0.deleteEntry((int) (short) -1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "");
        boolean boolean15 = journalManager0.removeReview((int) 'a');
        boolean boolean17 = journalManager0.removeReview((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getReview();
        int int9 = journalEntry5.getRating();
        java.lang.String str10 = journalEntry5.getNotes();
        boolean boolean11 = journalEntry5.hasRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.lang.String str9 = journalEntry8.getReview();
        java.time.LocalDate localDate10 = journalEntry8.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(localDate10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalEntry journalEntry19 = journalManager17.getEntry((int) ' ');
        boolean boolean21 = journalManager17.removeReview(4);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeNotes((int) (short) -1);
        JournalEntry journalEntry13 = journalManager0.getEntry(3);
        boolean boolean15 = journalManager0.removeNotes(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(journalEntry13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        boolean boolean11 = journalEntry5.hasNotes();
        boolean boolean12 = journalEntry5.hasRating();
        java.time.LocalDate localDate13 = journalEntry5.getDateEdited();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeNotes((int) (short) -1);
        JournalEntry journalEntry13 = journalManager0.getEntry(3);
        boolean boolean16 = journalManager0.editNotes((int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(journalEntry13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 1, "hi!", "", "", 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        boolean boolean7 = journalStorage0.deleteEntry(4);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        JournalEntry journalEntry11 = journalManager3.addEntry("hi!", "hi!", "hi!", 5);
        java.lang.Class<?> wildcardClass12 = journalManager3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(journalEntry11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeNotes(0);
        boolean boolean15 = journalManager0.editRating(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        java.lang.String str10 = journalEntry5.getNotes();
        journalEntry5.setNotes("hi!");
        boolean boolean13 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.removeRating((-1));
        boolean boolean10 = journalManager0.removeReview((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        int int4 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", (int) (short) 1);
        boolean boolean17 = journalManager0.removeRating((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(0);
        boolean boolean15 = journalManager0.editNotes((int) (byte) 100, "");
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalManager0.getAllEntries();
        boolean boolean19 = journalManager0.editNotes(100, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        JournalEntry journalEntry5 = new JournalEntry((-1), "hi!", "hi!", "", (int) '#');
        java.lang.String str6 = journalEntry5.getNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (short) 10);
        journalEntry5.setReview("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        journalEntry5.setReview("hi!");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        int int12 = journalEntry5.getEntryId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean5 = journalManager0.editReview((int) ' ', "hi!");
        boolean boolean7 = journalManager0.removeReview(4);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry12 = journalManager0.addEntry("hi!", "", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        JournalEntry journalEntry5 = new JournalEntry((-1), "hi!", "hi!", "", (int) '#');
        java.lang.String str6 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.editRating((int) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editRating((int) (short) -1, (int) 'a');
        boolean boolean8 = journalManager3.deleteEntry(100);
        java.lang.Class<?> wildcardClass9 = journalManager3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        int int27 = journalEntry26.getEntryId();
        int int28 = journalEntry26.getEntryId();
        journalEntry26.setReview("hi!");
        java.time.LocalDate localDate31 = journalEntry26.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(localDate31);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setRating((int) (short) 1);
        journalEntry5.setRating((-1));
        java.lang.String str15 = journalEntry5.getNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        boolean boolean13 = journalManager11.removeRating(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.editReview(100, "hi!");
        boolean boolean13 = journalManager0.removeReview((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry18 = journalManager0.addEntry("", "", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        int int11 = journalEntry5.getEntryId();
        java.time.LocalDate localDate12 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry12 = journalStorage0.getEntry((int) (short) 0);
        boolean boolean14 = journalStorage0.deleteEntry((int) (byte) 0);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("hi!", "hi!", "", (int) (short) 1);
        int int21 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.removeNotes((int) (short) 1);
        JournalEntry journalEntry13 = journalManager0.getEntry((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(journalEntry13);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalManager3.getAllEntries();
        JournalEntry journalEntry9 = journalManager3.addEntry("hi!", "", "", (int) (byte) 1);
        boolean boolean11 = journalManager3.deleteEntry((int) (byte) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList4);
        org.junit.Assert.assertNotNull(journalEntry9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "");
        JournalEntry journalEntry15 = journalManager0.getEntry(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(journalEntry15);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry((int) (short) 10);
        int int13 = journalManager0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList14 = journalManager0.getAllEntries();
        JournalEntry journalEntry16 = journalManager0.getEntry((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(journalEntryList14);
        org.junit.Assert.assertNull(journalEntry16);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        java.time.LocalDate localDate13 = journalEntry5.getDateWritten();
        int int14 = journalEntry5.getEntryId();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setReview("");
        java.time.LocalDate localDate13 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean14 = journalManager0.editReview(0, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        boolean boolean28 = journalStorage0.deleteEntry((int) (byte) 0);
        JournalEntry journalEntry33 = journalStorage0.addEntry("", "hi!", "", (int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(journalEntry33);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.removeReview((int) (short) 10);
        boolean boolean11 = journalManager0.editRating(10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setReview("");
        java.time.LocalDate localDate13 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate14 = journalEntry5.getDateWritten();
        boolean boolean15 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editRating((int) (short) -1, (int) 'a');
        java.lang.Class<?> wildcardClass7 = journalManager3.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean11 = journalManager0.editReview((int) (byte) 1, "");
        boolean boolean13 = journalManager0.removeReview((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        boolean boolean15 = journalEntry14.hasNotes();
        journalEntry14.setNotes("");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList12 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertNotNull(journalEntryList12);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        JournalEntry journalEntry7 = journalStorage0.addEntry("hi!", "", "", (int) (short) 0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        int int16 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList17 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(journalEntryList17);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        int int11 = journalEntry5.getEntryId();
        boolean boolean12 = journalEntry5.hasReview();
        java.lang.String str13 = journalEntry5.getBookTitle();
        journalEntry5.setNotes("hi!");
        int int16 = journalEntry5.getRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry((int) (byte) 0);
        boolean boolean11 = journalManager0.removeRating((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        boolean boolean17 = journalEntry16.hasReview();
        int int18 = journalEntry16.getRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        java.util.ArrayList<JournalEntry> journalEntryList7 = journalManager0.getAllEntries();
        boolean boolean10 = journalManager0.editReview(4, "");
        boolean boolean12 = journalManager0.removeReview((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertNotNull(journalEntryList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        journalEntry8.setRating((int) (byte) 0);
        int int12 = journalEntry8.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getReview();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        int int7 = journalManager0.getEntryCount();
        boolean boolean9 = journalManager0.deleteEntry(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        java.time.LocalDate localDate6 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        JournalEntry journalEntry5 = new JournalEntry(10, "hi!", "hi!", "hi!", 10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (byte) 10);
        int int9 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalEntry journalEntry19 = journalManager17.getEntry((int) ' ');
        int int20 = journalManager17.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        boolean boolean18 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry23 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.util.ArrayList<JournalEntry> journalEntryList24 = journalStorage0.getAllEntries();
        boolean boolean26 = journalStorage0.deleteEntry((int) (short) -1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(journalEntry23);
        org.junit.Assert.assertNotNull(journalEntryList24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalEntry journalEntry19 = journalManager17.getEntry(4);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNull(journalEntry19);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        int int4 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeReview(10);
        boolean boolean15 = journalManager0.editNotes((int) (short) -1, "");
        boolean boolean17 = journalManager0.removeReview((int) (short) 100);
        boolean boolean20 = journalManager0.editNotes((int) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 10, "hi!", "", "", (int) 'a');
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean11 = journalStorage0.deleteEntry(4);
        JournalEntry journalEntry13 = journalStorage0.getEntry(2);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(journalEntry13);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        int int10 = journalManager9.getEntryCount();
        boolean boolean13 = journalManager9.editRating((int) (short) 10, 3);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        boolean boolean6 = journalEntry5.hasNotes();
        boolean boolean7 = journalEntry5.hasNotes();
        java.lang.String str8 = journalEntry5.getNotes();
        java.lang.String str9 = journalEntry5.getReview();
        int int10 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        boolean boolean14 = journalManager0.removeRating((int) ' ');
        java.util.ArrayList<JournalEntry> journalEntryList15 = journalManager0.getAllEntries();
        boolean boolean18 = journalManager0.editRating(10, (int) (byte) 10);
        JournalEntry journalEntry23 = journalManager0.addEntry("hi!", "", "hi!", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(journalEntryList15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(journalEntry23);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getReview();
        journalEntry5.setNotes("");
        boolean boolean11 = journalEntry5.hasRating();
        java.lang.String str12 = journalEntry5.getBookTitle();
        journalEntry5.setNotes("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean13 = journalManager0.editReview((-1), "");
        boolean boolean15 = journalManager0.removeReview((int) (byte) 1);
        boolean boolean17 = journalManager0.deleteEntry((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry12 = journalStorage0.getEntry((int) (short) 0);
        boolean boolean14 = journalStorage0.deleteEntry((int) (byte) 0);
        int int15 = journalStorage0.getEntryCount();
        int int16 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        JournalEntry journalEntry5 = new JournalEntry(1, "", "", "", 100);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        int int17 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalStorage0.getAllEntries();
        JournalManager journalManager19 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(journalEntryList18);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        java.util.ArrayList<JournalEntry> journalEntryList17 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNotNull(journalEntryList17);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean10 = journalManager0.removeReview((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        int int9 = journalManager0.getEntryCount();
        boolean boolean12 = journalManager0.editReview(52, "");
        boolean boolean14 = journalManager0.deleteEntry(0);
        boolean boolean17 = journalManager0.editRating((int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean9 = journalManager0.deleteEntry((int) 'a');
        boolean boolean11 = journalManager0.removeReview((int) '#');
        boolean boolean13 = journalManager0.deleteEntry((int) (byte) 10);
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry15);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        java.time.LocalDate localDate11 = journalEntry5.getDateWritten();
        int int12 = journalEntry5.getEntryId();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalStorage0.getAllEntries();
        int int7 = journalStorage0.getEntryCount();
        JournalEntry journalEntry12 = journalStorage0.addEntry("", "hi!", "hi!", (int) (short) 1);
        int int13 = journalStorage0.getEntryCount();
        JournalEntry journalEntry15 = journalStorage0.getEntry(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNull(journalEntry5);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(journalEntry15);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        boolean boolean7 = journalManager0.removeNotes((int) 'a');
        boolean boolean10 = journalManager0.editReview(1, "hi!");
        boolean boolean12 = journalManager0.removeReview(10);
        JournalEntry journalEntry14 = journalManager0.getEntry(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(journalEntry14);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        boolean boolean10 = journalEntry8.hasNotes();
        java.time.LocalDate localDate11 = journalEntry8.getDateWritten();
        java.lang.String str12 = journalEntry8.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        boolean boolean8 = journalManager0.removeNotes(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        journalEntry5.setReview("hi!");
        java.lang.String str11 = journalEntry5.getNotes();
        journalEntry5.setReview("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        int int8 = journalEntry5.getEntryId();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.lang.String str10 = journalEntry5.getReview();
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.String str12 = journalEntry5.getBookTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean13 = journalManager0.editRating((int) (byte) 10, 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        java.lang.String str12 = journalEntry5.getBookTitle();
        java.lang.String str13 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        int int3 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setReview("hi!");
        boolean boolean12 = journalEntry5.hasNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalStorage0.getAllEntries();
        boolean boolean8 = journalStorage0.deleteEntry(52);
        boolean boolean10 = journalStorage0.deleteEntry((int) ' ');
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNull(journalEntry5);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", (int) (short) 1);
        boolean boolean16 = journalEntry15.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean13 = journalManager0.editRating(52, (int) (byte) 100);
        boolean boolean16 = journalManager0.editRating(1, (int) 'a');
        boolean boolean19 = journalManager0.editRating((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        int int6 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.getEntry((int) (short) 10);
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", (int) (short) 1);
        boolean boolean18 = journalManager0.editNotes((int) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        int int7 = journalManager0.getEntryCount();
        boolean boolean9 = journalManager0.deleteEntry((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        int int8 = journalEntry5.getEntryId();
        boolean boolean9 = journalEntry5.hasRating();
        boolean boolean10 = journalEntry5.hasRating();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes(0);
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntryList11);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean12 = journalManager0.editReview(0, "");
        JournalEntry journalEntry14 = journalManager0.getEntry(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(journalEntry14);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry(100);
        boolean boolean17 = journalManager0.editNotes((int) (short) -1, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalManager0.getAllEntries();
        JournalEntry journalEntry23 = journalManager0.addEntry("hi!", "hi!", "", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(journalEntryList18);
        org.junit.Assert.assertNotNull(journalEntry23);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean20 = journalManager17.editRating(3, 5);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setNotes("");
        boolean boolean11 = journalEntry5.hasRating();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        int int9 = journalEntry8.getRating();
        java.lang.String str10 = journalEntry8.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean11 = journalStorage0.deleteEntry(4);
        JournalEntry journalEntry16 = journalStorage0.addEntry("hi!", "hi!", "", (int) '#');
        int int17 = journalEntry16.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean13 = journalManager0.editNotes((int) (short) 0, "");
        JournalEntry journalEntry15 = journalManager0.getEntry(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(journalEntry15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.String str12 = journalEntry5.getReview();
        boolean boolean13 = journalEntry5.hasReview();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        java.lang.String str11 = journalEntry10.getNotes();
        java.time.LocalDate localDate12 = journalEntry10.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.lang.String str10 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        journalEntry5.setRating((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.removeRating((-1));
        boolean boolean10 = journalManager0.deleteEntry(10);
        boolean boolean13 = journalManager0.editRating((int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        boolean boolean9 = journalEntry8.hasNotes();
        boolean boolean10 = journalEntry8.hasNotes();
        int int11 = journalEntry8.getRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean9 = journalManager0.deleteEntry((int) 'a');
        boolean boolean11 = journalManager0.removeReview((int) '#');
        int int12 = journalManager0.getEntryCount();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = journalManager0.removeNotes((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: This entry has no notes to remove.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(100);
        JournalEntry journalEntry17 = journalManager0.addEntry("hi!", "", "hi!", 0);
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(journalEntry17);
        org.junit.Assert.assertNotNull(journalEntryList18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        boolean boolean9 = journalManager3.editReview(1, "");
        boolean boolean11 = journalManager3.removeReview((int) (byte) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        JournalEntry journalEntry22 = journalStorage0.getEntry((int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNull(journalEntry22);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 10, "", "", "hi!", 5);
        journalEntry5.setNotes("hi!");
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        java.util.ArrayList<JournalEntry> journalEntryList2 = journalStorage0.getAllEntries();
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertNotNull(journalEntryList2);
        org.junit.Assert.assertNotNull(journalEntryList3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getNotes();
        journalEntry5.setRating((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview(0);
        boolean boolean10 = journalManager0.editRating((int) (short) -1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        boolean boolean9 = journalManager3.editReview(1, "");
        boolean boolean12 = journalManager3.editReview(3, "");
        JournalEntry journalEntry14 = journalManager3.getEntry(100);
        boolean boolean16 = journalManager3.deleteEntry((int) (short) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        JournalManager journalManager2 = new JournalManager(journalStorage0);
        boolean boolean5 = journalManager2.editNotes(1, "");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager2.getAllEntries();
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        boolean boolean21 = journalStorage0.deleteEntry(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (short) 10);
        journalEntry5.setReview("");
        boolean boolean8 = journalEntry5.hasRating();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "hi!", "", "", 35);
        journalEntry5.setNotes("hi!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeRating(52);
        boolean boolean14 = journalManager0.editRating(2, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = journalManager0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.time.LocalDate localDate9 = journalEntry8.getDateEdited();
        java.lang.String str10 = journalEntry8.getReview();
        int int11 = journalEntry8.getEntryId();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        java.lang.String str12 = journalEntry5.getNotes();
        int int13 = journalEntry5.getEntryId();
        boolean boolean14 = journalEntry5.hasRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        JournalEntry journalEntry5 = new JournalEntry(2, "", "hi!", "", 2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        JournalEntry journalEntry5 = new JournalEntry(100, "hi!", "hi!", "", 1);
        java.lang.String str6 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean10 = journalManager0.removeRating((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalManager3.getAllEntries();
        JournalEntry journalEntry9 = journalManager3.addEntry("hi!", "", "", (int) (byte) 1);
        java.lang.String str10 = journalEntry9.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList4);
        org.junit.Assert.assertNotNull(journalEntry9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        int int3 = journalManager0.getEntryCount();
        JournalEntry journalEntry8 = journalManager0.addEntry("hi!", "", "hi!", 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        int int3 = journalManager0.getEntryCount();
        int int4 = journalManager0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList5 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.editRating((int) (short) 100, 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(journalEntryList5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setReview("");
        java.time.LocalDate localDate13 = journalEntry5.getDateWritten();
        boolean boolean14 = journalEntry5.hasNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean9 = journalManager0.deleteEntry(1);
        boolean boolean11 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean13 = journalManager0.removeNotes(100);
        JournalEntry journalEntry15 = journalManager0.getEntry((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(journalEntry15);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        int int9 = journalEntry5.getEntryId();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        boolean boolean11 = journalEntry5.hasRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        journalEntry5.setReview("hi!");
        boolean boolean11 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateEdited();
        java.lang.String str8 = journalEntry5.getBookTitle();
        java.lang.String str9 = journalEntry5.getNotes();
        java.lang.String str10 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        java.lang.String str11 = journalEntry5.getNotes();
        int int12 = journalEntry5.getRating();
        int int13 = journalEntry5.getEntryId();
        boolean boolean14 = journalEntry5.hasNotes();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("", "", "", 0);
        JournalEntry journalEntry20 = journalStorage0.addEntry("hi!", "", "", (int) ' ');
        int int21 = journalEntry20.getRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalManager3.getAllEntries();
        JournalEntry journalEntry9 = journalManager3.addEntry("hi!", "", "", (int) (byte) 1);
        java.time.LocalDate localDate10 = journalEntry9.getDateEdited();
        boolean boolean11 = journalEntry9.hasReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList4);
        org.junit.Assert.assertNotNull(journalEntry9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry12 = journalStorage0.getEntry(1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry12);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean9 = journalManager0.deleteEntry((int) 'a');
        boolean boolean11 = journalManager0.removeReview((int) '#');
        boolean boolean14 = journalManager0.editNotes(35, "hi!");
        boolean boolean17 = journalManager0.editReview(52, "");
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean8 = journalManager0.editReview((int) 'a', "hi!");
        boolean boolean10 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean13 = journalManager0.editRating(52, (int) (byte) 100);
        boolean boolean16 = journalManager0.editReview(52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        JournalEntry journalEntry5 = new JournalEntry((int) '4', "hi!", "", "", 2);
        boolean boolean6 = journalEntry5.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview(0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean10 = journalManager0.removeNotes(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalEntry journalEntry19 = journalStorage0.getEntry((int) (short) 10);
        java.util.ArrayList<JournalEntry> journalEntryList20 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertNull(journalEntry19);
        org.junit.Assert.assertNotNull(journalEntryList20);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        JournalManager journalManager2 = new JournalManager(journalStorage0);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertNull(journalEntry5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        boolean boolean11 = journalEntry5.hasNotes();
        boolean boolean12 = journalEntry5.hasRating();
        boolean boolean13 = journalEntry5.hasRating();
        boolean boolean14 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        JournalManager journalManager20 = new JournalManager(journalStorage0);
        boolean boolean22 = journalManager20.removeRating(52);
        boolean boolean25 = journalManager20.editNotes((-1), "hi!");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        JournalEntry journalEntry11 = journalManager3.addEntry("hi!", "hi!", "hi!", 5);
        boolean boolean13 = journalManager3.removeRating((int) (byte) -1);
        boolean boolean16 = journalManager3.editRating(2, 10);
        boolean boolean19 = journalManager3.editRating(3, 4);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(journalEntry11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        int int7 = journalManager0.getEntryCount();
        boolean boolean9 = journalManager0.removeReview((int) (short) -1);
        java.util.ArrayList<JournalEntry> journalEntryList10 = journalManager0.getAllEntries();
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "", "", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(journalEntryList10);
        org.junit.Assert.assertNotNull(journalEntry15);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        int int9 = journalStorage0.getEntryCount();
        JournalEntry journalEntry14 = journalStorage0.addEntry("hi!", "", "", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", 0);
        JournalEntry journalEntry17 = journalManager0.getEntry((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = journalManager0.removeNotes((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: An entry needs at least one part. Delete the entry instead.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertNull(journalEntry17);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.String str12 = journalEntry5.getReview();
        journalEntry5.setRating((int) (short) 100);
        java.lang.String str15 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        int int6 = journalEntry5.getEntryId();
        int int7 = journalEntry5.getRating();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setNotes("hi!");
        java.lang.String str11 = journalEntry5.getNotes();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        boolean boolean9 = journalManager3.editReview(1, "");
        boolean boolean12 = journalManager3.editNotes(52, "");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        journalEntry5.setNotes("");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalEntry journalEntry18 = journalStorage0.getEntry(1);
        java.util.ArrayList<JournalEntry> journalEntryList19 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertNotNull(journalEntry18);
        org.junit.Assert.assertNotNull(journalEntryList19);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        int int7 = journalManager0.getEntryCount();
        boolean boolean9 = journalManager0.removeReview((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry14 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Rating must be between 1 and 5.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        java.time.LocalDate localDate15 = journalEntry14.getDateEdited();
        java.lang.String str16 = journalEntry14.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        // The following exception was thrown during execution in test generation
        try {
            JournalEntry journalEntry8 = journalManager3.addEntry("", "", "", 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Book title cannot be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(journalEntry2);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        int int7 = journalManager0.getEntryCount();
        boolean boolean9 = journalManager0.removeReview((int) (short) 1);
        int int10 = journalManager0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(journalEntryList11);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        boolean boolean4 = journalStorage0.deleteEntry((int) (short) 100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "hi!", "", 3);
        int int6 = journalEntry5.getRating();
        journalEntry5.setNotes("");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        JournalEntry journalEntry10 = journalStorage0.getEntry((int) (byte) -1);
        boolean boolean12 = journalStorage0.deleteEntry((int) (byte) 0);
        boolean boolean14 = journalStorage0.deleteEntry(100);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 0, "hi!", "", "", (int) (byte) -1);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean19 = journalStorage0.deleteEntry((int) (byte) 1);
        boolean boolean21 = journalStorage0.deleteEntry((int) (short) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        JournalEntry journalEntry11 = journalManager3.addEntry("hi!", "hi!", "hi!", 5);
        boolean boolean14 = journalManager3.editNotes(0, "");
        java.util.ArrayList<JournalEntry> journalEntryList15 = journalManager3.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(journalEntry11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(journalEntryList15);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        int int8 = journalEntry5.getEntryId();
        boolean boolean9 = journalEntry5.hasRating();
        int int10 = journalEntry5.getRating();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getReview();
        int int9 = journalEntry5.getRating();
        java.lang.String str10 = journalEntry5.getNotes();
        int int11 = journalEntry5.getRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        JournalEntry journalEntry10 = journalStorage0.getEntry((int) (byte) -1);
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(journalEntry10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        int int6 = journalEntry5.getEntryId();
        java.lang.String str7 = journalEntry5.getBookTitle();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.lang.String str21 = journalEntry20.getReview();
        java.lang.String str22 = journalEntry20.getReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (short) 10);
        java.lang.String str6 = journalEntry5.getReview();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalManager journalManager18 = new JournalManager(journalStorage0);
        JournalEntry journalEntry23 = journalStorage0.addEntry("", "hi!", "hi!", 2);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertNotNull(journalEntry23);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        boolean boolean13 = journalManager10.editNotes(0, "");
        boolean boolean16 = journalManager10.editRating((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        JournalEntry journalEntry21 = journalStorage0.addEntry("hi!", "hi!", "hi!", 5);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(journalEntry21);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        JournalEntry journalEntry5 = new JournalEntry(35, "hi!", "", "", (int) '4');
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (byte) 1, (int) (byte) 1);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        int int7 = journalManager0.getEntryCount();
        JournalEntry journalEntry9 = journalManager0.getEntry(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(journalEntry9);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        int int17 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList18 = journalStorage0.getAllEntries();
        boolean boolean20 = journalStorage0.deleteEntry(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(journalEntryList18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        boolean boolean11 = journalStorage0.deleteEntry((int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        boolean boolean10 = journalEntry8.hasNotes();
        journalEntry8.setReview("");
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        int int3 = journalManager0.getEntryCount();
        boolean boolean6 = journalManager0.editReview((int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        int int4 = journalStorage0.getEntryCount();
        JournalEntry journalEntry6 = journalStorage0.getEntry(1);
        boolean boolean8 = journalStorage0.deleteEntry((int) (short) -1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.String str12 = journalEntry5.getReview();
        journalEntry5.setRating((int) (short) 100);
        boolean boolean15 = journalEntry5.hasNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalManager3.deleteEntry((int) (short) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "hi!", "", "", 35);
        java.lang.String str6 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("", "", "", 0);
        int int16 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        boolean boolean7 = journalManager0.removeReview((int) (short) 10);
        boolean boolean10 = journalManager0.editNotes((int) (byte) 100, "hi!");
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.deleteEntry((int) (short) 10);
        boolean boolean13 = journalManager0.editNotes(1, "hi!");
        JournalEntry journalEntry18 = journalManager0.addEntry("hi!", "hi!", "", 1);
        java.time.LocalDate localDate19 = journalEntry18.getDateWritten();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(journalEntry18);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) (short) -1);
        java.util.ArrayList<JournalEntry> journalEntryList5 = journalManager0.getAllEntries();
        JournalEntry journalEntry7 = journalManager0.getEntry((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(journalEntryList5);
        org.junit.Assert.assertNull(journalEntry7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        JournalEntry journalEntry13 = journalStorage0.getEntry((int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertNull(journalEntry13);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate10 = journalEntry5.getDateWritten();
        java.lang.String str11 = journalEntry5.getBookTitle();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        JournalEntry journalEntry31 = journalStorage0.addEntry("", "hi!", "", 10);
        boolean boolean32 = journalEntry31.hasNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertNotNull(journalEntry31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.deleteEntry((int) (byte) 100);
        boolean boolean10 = journalManager0.removeRating(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        JournalEntry journalEntry5 = new JournalEntry(100, "hi!", "hi!", "", 1);
        java.time.LocalDate localDate6 = journalEntry5.getDateWritten();
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "", "", "", (int) (byte) 1);
        journalEntry5.setRating(0);
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating(10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.deleteEntry((int) (short) 10);
        boolean boolean12 = journalManager0.removeRating((int) '4');
        boolean boolean14 = journalManager0.removeRating(3);
        JournalEntry journalEntry16 = journalManager0.getEntry(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(journalEntry16);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeReview(0);
        boolean boolean5 = journalManager0.editRating((int) (byte) 100, 5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 0);
        int int8 = journalManager0.getEntryCount();
        boolean boolean11 = journalManager0.editReview(100, "hi!");
        boolean boolean13 = journalManager0.removeReview((int) 'a');
        boolean boolean15 = journalManager0.removeReview((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalManager3.getAllEntries();
        java.util.ArrayList<JournalEntry> journalEntryList5 = journalManager3.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList4);
        org.junit.Assert.assertNotNull(journalEntryList5);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        JournalManager journalManager0 = new JournalManager();
        JournalEntry journalEntry5 = journalManager0.addEntry("hi!", "hi!", "hi!", (int) (byte) 1);
        java.time.LocalDate localDate6 = journalEntry5.getDateWritten();
        org.junit.Assert.assertNotNull(journalEntry5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", 0);
        JournalEntry journalEntry17 = journalManager0.getEntry((int) (byte) 100);
        boolean boolean19 = journalManager0.deleteEntry((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertNull(journalEntry17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setRating((int) (short) 1);
        int int13 = journalEntry5.getEntryId();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry(4);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        int int4 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        journalEntry5.setNotes("");
        boolean boolean13 = journalEntry5.hasReview();
        int int14 = journalEntry5.getRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.deleteEntry((int) (short) 10);
        boolean boolean13 = journalManager0.editNotes(1, "hi!");
        JournalEntry journalEntry15 = journalManager0.getEntry((int) (short) -1);
        boolean boolean17 = journalManager0.removeReview((int) ' ');
        boolean boolean20 = journalManager0.editRating(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        boolean boolean10 = journalEntry8.hasNotes();
        boolean boolean11 = journalEntry8.hasNotes();
        java.lang.String str12 = journalEntry8.getBookTitle();
        java.lang.Class<?> wildcardClass13 = journalEntry8.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        JournalEntry journalEntry19 = journalStorage0.getEntry((int) (short) 10);
        JournalEntry journalEntry21 = journalStorage0.getEntry(32);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertNull(journalEntry19);
        org.junit.Assert.assertNull(journalEntry21);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalEntry journalEntry4 = journalStorage0.getEntry(0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNull(journalEntry4);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry10 = journalStorage0.addEntry("hi!", "hi!", "", (int) ' ');
        int int11 = journalEntry10.getEntryId();
        java.time.LocalDate localDate12 = journalEntry10.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        JournalManager journalManager10 = new JournalManager(journalStorage0);
        JournalManager journalManager11 = new JournalManager(journalStorage0);
        boolean boolean13 = journalManager11.removeReview((int) (byte) 100);
        JournalEntry journalEntry15 = journalManager11.getEntry((int) (short) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(journalEntry15);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate9 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate10 = journalEntry5.getDateEdited();
        journalEntry5.setRating((int) (short) 1);
        journalEntry5.setRating((-1));
        journalEntry5.setRating(0);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry(0);
        JournalEntry journalEntry14 = journalManager0.getEntry(100);
        boolean boolean17 = journalManager0.editReview((int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        java.lang.String str17 = journalEntry16.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        journalEntry5.setNotes("");
        journalEntry5.setRating((int) (short) 1);
        java.lang.String str13 = journalEntry5.getNotes();
        java.time.LocalDate localDate14 = journalEntry5.getDateWritten();
        journalEntry5.setNotes("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        int int3 = journalStorage0.getEntryCount();
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) -1);
        java.time.LocalDate localDate9 = journalEntry8.getDateWritten();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean12 = journalManager0.deleteEntry((-1));
        JournalEntry journalEntry14 = journalManager0.getEntry((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(journalEntry14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        java.util.ArrayList<JournalEntry> journalEntryList4 = journalStorage0.getAllEntries();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean19 = journalStorage0.deleteEntry((int) (short) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("", "", "", 0);
        boolean boolean17 = journalStorage0.deleteEntry((int) (byte) 1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating((int) (short) -1, (int) (byte) 0);
        boolean boolean8 = journalManager0.editReview(5, "hi!");
        boolean boolean11 = journalManager0.editReview(4, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.time.LocalDate localDate9 = journalEntry8.getDateEdited();
        boolean boolean10 = journalEntry8.hasNotes();
        boolean boolean11 = journalEntry8.hasRating();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(100);
        JournalEntry journalEntry17 = journalManager0.addEntry("hi!", "", "hi!", 0);
        journalEntry17.setNotes("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(journalEntry17);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalManager0.getAllEntries();
        boolean boolean8 = journalManager0.removeRating((-1));
        boolean boolean10 = journalManager0.deleteEntry(10);
        java.util.ArrayList<JournalEntry> journalEntryList11 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntryList11);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setRating((int) (byte) 10);
        journalEntry5.setRating((int) (short) 10);
        journalEntry5.setReview("hi!");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 10, "hi!", "hi!", "", (int) (short) 10);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean13 = journalManager0.editReview((-1), "");
        boolean boolean15 = journalManager0.removeReview((int) (byte) 1);
        JournalEntry journalEntry17 = journalManager0.getEntry(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(journalEntry17);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating((int) '4');
        boolean boolean12 = journalEntry5.hasReview();
        java.lang.String str13 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        boolean boolean16 = journalStorage0.deleteEntry((int) (short) 100);
        boolean boolean18 = journalStorage0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry23 = journalStorage0.addEntry("hi!", "", "", (int) (byte) -1);
        JournalEntry journalEntry25 = journalStorage0.getEntry(3);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(journalEntry23);
        org.junit.Assert.assertNotNull(journalEntry25);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        java.lang.String str12 = journalEntry5.getBookTitle();
        int int13 = journalEntry5.getRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry(0);
        JournalEntry journalEntry10 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.addEntry("", "", "", 0);
        JournalEntry journalEntry20 = journalStorage0.addEntry("hi!", "", "", (int) ' ');
        int int21 = journalEntry20.getEntryId();
        java.time.LocalDate localDate22 = journalEntry20.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNull(localDate22);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        boolean boolean10 = journalEntry5.hasRating();
        boolean boolean11 = journalEntry5.hasRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalEntry journalEntry20 = journalStorage0.addEntry("", "hi!", "hi!", 5);
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry26 = journalStorage0.addEntry("hi!", "", "", (int) (byte) 10);
        JournalEntry journalEntry31 = journalStorage0.addEntry("", "hi!", "", 10);
        int int32 = journalStorage0.getEntryCount();
        JournalEntry journalEntry37 = journalStorage0.addEntry("", "", "hi!", 5);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntry20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNotNull(journalEntry26);
        org.junit.Assert.assertNotNull(journalEntry31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertNotNull(journalEntry37);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        JournalEntry journalEntry5 = new JournalEntry((int) '#', "", "hi!", "", (int) (byte) 0);
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        java.lang.String str8 = journalEntry5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry5 = journalStorage0.getEntry((int) '#');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNull(journalEntry5);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        JournalEntry journalEntry6 = journalManager0.getEntry((int) (short) 100);
        java.util.ArrayList<JournalEntry> journalEntryList7 = journalManager0.getAllEntries();
        boolean boolean10 = journalManager0.editReview(4, "");
        boolean boolean12 = journalManager0.removeNotes((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(journalEntry6);
        org.junit.Assert.assertNotNull(journalEntryList7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        JournalEntry journalEntry11 = journalManager3.addEntry("hi!", "hi!", "hi!", 5);
        boolean boolean14 = journalManager3.editReview((int) (byte) 10, "hi!");
        boolean boolean17 = journalManager3.editRating(0, (int) 'a');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(journalEntry11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean11 = journalEntry10.hasNotes();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        int int16 = journalStorage0.getEntryCount();
        JournalEntry journalEntry18 = journalStorage0.getEntry(1);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(journalEntry18);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(5);
        java.lang.String str12 = journalEntry5.getNotes();
        java.time.LocalDate localDate13 = journalEntry5.getDateEdited();
        java.time.LocalDate localDate14 = journalEntry5.getDateWritten();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean9 = journalManager0.removeRating((int) (byte) 10);
        java.util.ArrayList<JournalEntry> journalEntryList10 = journalManager0.getAllEntries();
        boolean boolean13 = journalManager0.editRating(10, 32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(journalEntryList10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.deleteEntry((int) (short) 10);
        JournalEntry journalEntry12 = journalManager0.getEntry((int) (short) 0);
        int int13 = journalManager0.getEntryCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        journalEntry5.setReview("");
        boolean boolean11 = journalEntry5.hasNotes();
        boolean boolean12 = journalEntry5.hasReview();
        boolean boolean13 = journalEntry5.hasReview();
        java.time.LocalDate localDate14 = journalEntry5.getDateEdited();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.lang.String str20 = journalEntry19.getBookTitle();
        boolean boolean21 = journalEntry19.hasNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean4 = journalManager0.removeRating(100);
        boolean boolean7 = journalManager0.editRating(5, (int) (short) 1);
        boolean boolean10 = journalManager0.editRating((int) (short) 100, (int) ' ');
        JournalEntry journalEntry12 = journalManager0.getEntry((int) (short) 10);
        boolean boolean15 = journalManager0.editNotes(5, "");
        int int16 = journalManager0.getEntryCount();
        boolean boolean19 = journalManager0.editNotes((int) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.getEntry((-1));
        JournalEntry journalEntry13 = journalStorage0.addEntry("", "", "", (int) (byte) 0);
        JournalEntry journalEntry15 = journalStorage0.getEntry((int) (short) 10);
        boolean boolean17 = journalStorage0.deleteEntry((int) '4');
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry13);
        org.junit.Assert.assertNull(journalEntry15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }
}

