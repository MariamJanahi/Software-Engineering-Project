import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("hi!", "hi!", "", (int) (byte) 0);
        java.lang.String str9 = journalEntry8.getReview();
        java.lang.String str10 = journalEntry8.getBookTitle();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeReview(0);
        boolean boolean5 = journalManager0.editReview((int) (byte) -1, "");
        boolean boolean7 = journalManager0.removeRating((-1));
        boolean boolean9 = journalManager0.removeNotes(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean5 = journalManager0.editReview((int) ' ', "hi!");
        boolean boolean7 = journalManager0.deleteEntry(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        JournalEntry journalEntry5 = new JournalEntry((int) 'a', "hi!", "hi!", "", (int) '4');
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (short) -1);
        boolean boolean5 = journalManager0.editNotes(10, "hi!");
        JournalEntry journalEntry10 = journalManager0.addEntry("hi!", "", "hi!", 5);
        boolean boolean13 = journalManager0.editReview((int) (short) 0, "");
        boolean boolean15 = journalManager0.removeReview((int) 'a');
        boolean boolean17 = journalManager0.deleteEntry((int) (byte) 10);
        boolean boolean19 = journalManager0.removeRating((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(journalEntry10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        boolean boolean11 = journalStorage0.deleteEntry(4);
        JournalEntry journalEntry16 = journalStorage0.addEntry("hi!", "hi!", "", (int) '#');
        java.time.LocalDate localDate17 = journalEntry16.getDateWritten();
        int int18 = journalEntry16.getEntryId();
        java.lang.String str19 = journalEntry16.getBookTitle();
        journalEntry16.setReview("");
        journalEntry16.setNotes("hi!");
        boolean boolean24 = journalEntry16.hasReview();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes(1);
        boolean boolean10 = journalManager0.editRating((int) (byte) -1, (int) (byte) 1);
        JournalEntry journalEntry15 = journalManager0.addEntry("hi!", "hi!", "", 0);
        java.lang.String str16 = journalEntry15.getReview();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(journalEntry15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) 10, "", "", "hi!", 5);
        java.lang.String str6 = journalEntry5.getNotes();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        java.util.ArrayList<JournalEntry> journalEntryList3 = journalStorage0.getAllEntries();
        JournalEntry journalEntry5 = journalStorage0.getEntry(52);
        java.util.ArrayList<JournalEntry> journalEntryList6 = journalStorage0.getAllEntries();
        int int7 = journalStorage0.getEntryCount();
        JournalEntry journalEntry12 = journalStorage0.addEntry("", "hi!", "hi!", (int) (short) 1);
        int int13 = journalStorage0.getEntryCount();
        java.lang.Class<?> wildcardClass14 = journalStorage0.getClass();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntryList3);
        org.junit.Assert.assertNull(journalEntry5);
        org.junit.Assert.assertNotNull(journalEntryList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(journalEntry12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalStorage0.getAllEntries();
        JournalEntry journalEntry18 = journalStorage0.getEntry(1);
        java.time.LocalDate localDate19 = journalEntry18.getDateEdited();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertNotNull(journalEntry18);
        org.junit.Assert.assertNull(localDate19);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        JournalStorage journalStorage0 = new JournalStorage();
        java.util.ArrayList<JournalEntry> journalEntryList1 = journalStorage0.getAllEntries();
        JournalEntry journalEntry3 = journalStorage0.getEntry((int) (short) 1);
        int int4 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNotNull(journalEntryList1);
        org.junit.Assert.assertNull(journalEntry3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean5 = journalStorage0.deleteEntry((int) (short) 10);
        JournalManager journalManager6 = new JournalManager(journalStorage0);
        boolean boolean8 = journalStorage0.deleteEntry((-1));
        java.util.ArrayList<JournalEntry> journalEntryList9 = journalStorage0.getAllEntries();
        int int10 = journalStorage0.getEntryCount();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(journalEntryList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        boolean boolean19 = journalEntry5.hasRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        java.lang.String str15 = journalEntry14.getNotes();
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.lang.String str8 = journalEntry5.getNotes();
        boolean boolean9 = journalEntry5.hasRating();
        java.lang.String str10 = journalEntry5.getBookTitle();
        java.lang.String str11 = journalEntry5.getReview();
        java.time.LocalDate localDate12 = journalEntry5.getDateWritten();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry16 = journalStorage0.getEntry((int) (byte) 1);
        JournalManager journalManager17 = new JournalManager(journalStorage0);
        boolean boolean19 = journalStorage0.deleteEntry((int) (byte) 1);
        JournalEntry journalEntry21 = journalStorage0.getEntry((int) (byte) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(journalEntry21);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.time.LocalDate localDate11 = journalEntry5.getDateEdited();
        java.lang.String str12 = journalEntry5.getReview();
        journalEntry5.setRating((int) (short) 100);
        journalEntry5.setRating(5);
        int int17 = journalEntry5.getRating();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 0, "hi!", "hi!", "hi!", 4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "hi!", "", 52);
        int int15 = journalStorage0.getEntryCount();
        JournalManager journalManager16 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        JournalEntry journalEntry8 = journalStorage0.addEntry("", "hi!", "", (int) '#');
        JournalManager journalManager9 = new JournalManager(journalStorage0);
        JournalEntry journalEntry14 = journalStorage0.addEntry("", "", "hi!", 10);
        JournalEntry journalEntry19 = journalStorage0.addEntry("", "", "", (int) ' ');
        java.util.ArrayList<JournalEntry> journalEntryList20 = journalStorage0.getAllEntries();
        java.util.ArrayList<JournalEntry> journalEntryList21 = journalStorage0.getAllEntries();
        JournalEntry journalEntry23 = journalStorage0.getEntry(10);
        JournalManager journalManager24 = new JournalManager(journalStorage0);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertNotNull(journalEntry8);
        org.junit.Assert.assertNotNull(journalEntry14);
        org.junit.Assert.assertNotNull(journalEntry19);
        org.junit.Assert.assertNotNull(journalEntryList20);
        org.junit.Assert.assertNotNull(journalEntryList21);
        org.junit.Assert.assertNull(journalEntry23);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateEdited();
        java.lang.String str9 = journalEntry5.getNotes();
        journalEntry5.setRating(0);
        boolean boolean12 = journalEntry5.hasReview();
        java.lang.String str13 = journalEntry5.getReview();
        boolean boolean14 = journalEntry5.hasRating();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        JournalEntry journalEntry5 = new JournalEntry((int) (byte) -1, "hi!", "hi!", "hi!", (int) (byte) 1);
        java.lang.String str6 = journalEntry5.getNotes();
        journalEntry5.setReview("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        JournalStorage journalStorage0 = new JournalStorage();
        JournalEntry journalEntry2 = journalStorage0.getEntry((int) (short) 1);
        JournalManager journalManager3 = new JournalManager(journalStorage0);
        boolean boolean6 = journalManager3.editReview((int) (short) -1, "hi!");
        boolean boolean9 = journalManager3.editReview(1, "");
        boolean boolean12 = journalManager3.editReview(3, "");
        boolean boolean15 = journalManager3.editRating((int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNull(journalEntry2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeRating(0);
        boolean boolean4 = journalManager0.removeReview((int) ' ');
        boolean boolean6 = journalManager0.deleteEntry(52);
        boolean boolean8 = journalManager0.deleteEntry((int) (short) 0);
        boolean boolean10 = journalManager0.removeNotes((int) ' ');
        boolean boolean12 = journalManager0.deleteEntry(0);
        boolean boolean15 = journalManager0.editNotes((int) (byte) 100, "");
        java.util.ArrayList<JournalEntry> journalEntryList16 = journalManager0.getAllEntries();
        boolean boolean18 = journalManager0.removeNotes((int) (short) -1);
        java.util.ArrayList<JournalEntry> journalEntryList19 = journalManager0.getAllEntries();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(journalEntryList16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(journalEntryList19);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        java.lang.String str6 = journalEntry5.getBookTitle();
        java.time.LocalDate localDate7 = journalEntry5.getDateWritten();
        boolean boolean8 = journalEntry5.hasNotes();
        journalEntry5.setRating((int) (short) 0);
        java.lang.String str11 = journalEntry5.getNotes();
        int int12 = journalEntry5.getEntryId();
        boolean boolean13 = journalEntry5.hasNotes();
        boolean boolean14 = journalEntry5.hasReview();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        boolean boolean11 = journalEntry5.hasRating();
        boolean boolean12 = journalEntry5.hasReview();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        JournalManager journalManager0 = new JournalManager();
        boolean boolean2 = journalManager0.removeNotes((int) (byte) 10);
        boolean boolean5 = journalManager0.editRating(0, (int) '4');
        boolean boolean7 = journalManager0.removeNotes((int) (short) 1);
        boolean boolean10 = journalManager0.editReview((int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        JournalEntry journalEntry5 = new JournalEntry((int) (short) 1, "", "hi!", "", (int) '4');
        journalEntry5.setNotes("");
        java.time.LocalDate localDate8 = journalEntry5.getDateWritten();
        java.lang.String str9 = journalEntry5.getBookTitle();
        int int10 = journalEntry5.getRating();
        java.lang.String str11 = journalEntry5.getNotes();
        boolean boolean12 = journalEntry5.hasNotes();
        int int13 = journalEntry5.getEntryId();
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }
}

