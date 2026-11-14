import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReadingStatusRegression1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test501");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "To Read", "hi!", "Unknown", (int) ' ', (int) (short) 1, true);
        int int8 = readingStatusRecord7.getTotalPages();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        java.lang.String str11 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "To Read" + "'", str9, "To Read");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "To Read" + "'", str10, "To Read");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unknown" + "'", str11, "Unknown");
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test502");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord14 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str15 = readingStatusService6.determineStatus(readingStatusRecord14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList17 = readingStatusService6.viewBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown" + "'", str15, "Unknown");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test503");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        int int26 = readingStatusRecord22.getCurrentPage();
        java.lang.String str27 = readingStatusRecord22.getStatus();
        java.lang.String str28 = readingStatusRecord22.getGenre();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Finished" + "'", str28, "Finished");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test504");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str8 = readingStatusRecord7.getAuthor();
        readingStatusRecord7.setStatus("Unknown");
        int int11 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test505");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        java.util.Scanner scanner55 = null;
        ReadingStatusView readingStatusView56 = new ReadingStatusView(readingStatusService3, scanner55);
        java.util.Scanner scanner57 = null;
        ReadingStatusView readingStatusView58 = new ReadingStatusView(readingStatusService3, scanner57);
        java.util.Scanner scanner59 = null;
        ReadingStatusView readingStatusView60 = new ReadingStatusView(readingStatusService3, scanner59);
        ReadingStatusRecord readingStatusRecord68 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str69 = readingStatusRecord68.getGenre();
        readingStatusRecord68.setStatus("hi!");
        java.lang.String str72 = readingStatusRecord68.getTitle();
        java.lang.String str73 = readingStatusRecord68.getTitle();
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord68);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Finished" + "'", str72, "Finished");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Finished" + "'", str73, "Finished");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Unknown" + "'", str74, "Unknown");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test506");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str8 = readingStatusRecord7.getTitle();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test507");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        BookManager bookManager24 = null;
        ReadingProgressData readingProgressData25 = null;
        ReadingStatusData readingStatusData26 = new ReadingStatusData(bookManager24, readingProgressData25);
        ReadingStatusService readingStatusService27 = new ReadingStatusService(readingStatusData26);
        ReadingStatusRecord readingStatusRecord35 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord35.setStatus("");
        double double38 = readingStatusService27.calculateProgressPercent(readingStatusRecord35);
        ReadingStatusRecord readingStatusRecord46 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord46.setStatus("hi!");
        java.lang.String str49 = readingStatusService27.determineStatus(readingStatusRecord46);
        ReadingStatusRecord readingStatusRecord57 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str58 = readingStatusRecord57.getAuthor();
        double double59 = readingStatusService27.calculateProgressPercent(readingStatusRecord57);
        java.lang.String str61 = readingStatusService27.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str70 = readingStatusRecord69.getTitle();
        double double71 = readingStatusService27.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str80 = readingStatusRecord79.getGenre();
        double double81 = readingStatusService27.calculateProgressPercent(readingStatusRecord79);
        java.lang.String str83 = readingStatusService27.parseStatusText("");
        ReadingStatusRecord readingStatusRecord91 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str92 = readingStatusService27.determineStatus(readingStatusRecord91);
        java.lang.String str93 = readingStatusService3.determineStatus(readingStatusRecord91);
        boolean boolean94 = readingStatusRecord91.hasProgress();
        java.lang.String str95 = readingStatusRecord91.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Unknown" + "'", str49, "Unknown");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Currently Reading" + "'", str58, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "To Read" + "'", str61, "To Read");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "To Read" + "'", str70, "To Read");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Unknown" + "'", str80, "Unknown");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Unknown" + "'", str92, "Unknown");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Unknown" + "'", str93, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test508");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        boolean boolean52 = readingStatusRecord49.hasProgress();
        boolean boolean53 = readingStatusRecord49.hasProgress();
        boolean boolean54 = readingStatusRecord49.hasProgress();
        java.lang.String str55 = readingStatusService3.determineStatus(readingStatusRecord49);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test509");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        BookManager bookManager30 = null;
        ReadingProgressData readingProgressData31 = null;
        ReadingStatusData readingStatusData32 = new ReadingStatusData(bookManager30, readingProgressData31);
        ReadingStatusService readingStatusService33 = new ReadingStatusService(readingStatusData32);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord41.setStatus("");
        double double44 = readingStatusService33.calculateProgressPercent(readingStatusRecord41);
        ReadingStatusRecord readingStatusRecord52 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord52.setStatus("hi!");
        java.lang.String str55 = readingStatusService33.determineStatus(readingStatusRecord52);
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str64 = readingStatusRecord63.getAuthor();
        double double65 = readingStatusService33.calculateProgressPercent(readingStatusRecord63);
        java.lang.String str67 = readingStatusService33.parseStatusText("To Read");
        BookManager bookManager68 = null;
        ReadingProgressData readingProgressData69 = null;
        ReadingStatusData readingStatusData70 = new ReadingStatusData(bookManager68, readingProgressData69);
        ReadingStatusService readingStatusService71 = new ReadingStatusService(readingStatusData70);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord79.setStatus("");
        double double82 = readingStatusService71.calculateProgressPercent(readingStatusRecord79);
        double double83 = readingStatusService33.calculateProgressPercent(readingStatusRecord79);
        int int84 = readingStatusRecord79.getTotalPages();
        double double85 = readingStatusService3.calculateProgressPercent(readingStatusRecord79);
        java.lang.String str86 = readingStatusRecord79.getGenre();
        int int87 = readingStatusRecord79.getTotalPages();
        java.lang.Class<?> wildcardClass88 = readingStatusRecord79.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Currently Reading" + "'", str64, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "To Read" + "'", str67, "To Read");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Finished" + "'", str86, "Finished");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 1 + "'", int87 == 1);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test510");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        java.lang.String str7 = readingStatusService5.parseStatusText("Unknown");
        BookManager bookManager8 = null;
        ReadingProgressData readingProgressData9 = null;
        ReadingStatusData readingStatusData10 = new ReadingStatusData(bookManager8, readingProgressData9);
        ReadingStatusService readingStatusService11 = new ReadingStatusService(readingStatusData10);
        ReadingStatusRecord readingStatusRecord19 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord19.setStatus("");
        double double22 = readingStatusService11.calculateProgressPercent(readingStatusRecord19);
        ReadingStatusRecord readingStatusRecord30 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord30.setStatus("hi!");
        java.lang.String str33 = readingStatusService11.determineStatus(readingStatusRecord30);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str42 = readingStatusRecord41.getAuthor();
        double double43 = readingStatusService11.calculateProgressPercent(readingStatusRecord41);
        java.lang.String str45 = readingStatusService11.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord53 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str54 = readingStatusRecord53.getTitle();
        double double55 = readingStatusService11.calculateProgressPercent(readingStatusRecord53);
        java.util.Scanner scanner56 = null;
        ReadingStatusView readingStatusView57 = new ReadingStatusView(readingStatusService11, scanner56);
        ReadingStatusRecord readingStatusRecord65 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord65.setStatus("hi!");
        int int68 = readingStatusRecord65.getCurrentPage();
        int int69 = readingStatusRecord65.getTotalPages();
        int int70 = readingStatusRecord65.getTotalPages();
        java.lang.String str71 = readingStatusRecord65.getTitle();
        double double72 = readingStatusService11.calculateProgressPercent(readingStatusRecord65);
        java.lang.String str73 = readingStatusRecord65.getStoredStatus();
        java.lang.String str74 = readingStatusService5.determineStatus(readingStatusRecord65);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unknown" + "'", str7, "Unknown");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Unknown" + "'", str33, "Unknown");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Currently Reading" + "'", str42, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "To Read" + "'", str45, "To Read");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "To Read" + "'", str54, "To Read");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 1 + "'", int70 == 1);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Finished" + "'", str71, "Finished");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Unknown" + "'", str74, "Unknown");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test511");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "Currently Reading", "Unknown", "", 0, (int) (short) 10, false);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test512");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str8 = readingStatusRecord7.getTitle();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getStatus();
        java.lang.String str11 = readingStatusRecord7.getAuthor();
        int int12 = readingStatusRecord7.getCurrentPage();
        java.lang.String str13 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Unknown" + "'", str10, "Unknown");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unknown" + "'", str11, "Unknown");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Finished" + "'", str13, "Finished");
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test513");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str8 = readingStatusRecord7.getTitle();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getStatus();
        java.lang.String str11 = readingStatusRecord7.getAuthor();
        int int12 = readingStatusRecord7.getCurrentPage();
        readingStatusRecord7.setStatus("To Read");
        java.lang.String str15 = readingStatusRecord7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Unknown" + "'", str10, "Unknown");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unknown" + "'", str11, "Unknown");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "To Read" + "'", str15, "To Read");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test514");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str15 = readingStatusRecord11.getStatus();
        java.lang.String str16 = readingStatusRecord11.getStatus();
        int int17 = readingStatusRecord11.getCurrentPage();
        boolean boolean18 = readingStatusRecord11.hasProgress();
        boolean boolean19 = readingStatusRecord11.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test515");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord65 = new ReadingStatusRecord("Finished", "", "Finished", "", (int) (short) 10, (int) '#', true);
        java.lang.String str66 = readingStatusService3.determineStatus(readingStatusRecord65);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord68 = readingStatusService3.viewBookDetails("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Title must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Finished" + "'", str66, "Finished");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test516");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "hi!", "Unknown", "To Read", (int) (byte) 0, 100, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test517");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str8 = readingStatusRecord7.getAuthor();
        java.lang.String str9 = readingStatusRecord7.getGenre();
        boolean boolean10 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test518");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord14 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str15 = readingStatusService6.determineStatus(readingStatusRecord14);
        int int16 = readingStatusRecord14.getTotalPages();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown" + "'", str15, "Unknown");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test519");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        BookManager bookManager30 = null;
        ReadingProgressData readingProgressData31 = null;
        ReadingStatusData readingStatusData32 = new ReadingStatusData(bookManager30, readingProgressData31);
        ReadingStatusService readingStatusService33 = new ReadingStatusService(readingStatusData32);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord41.setStatus("");
        double double44 = readingStatusService33.calculateProgressPercent(readingStatusRecord41);
        ReadingStatusRecord readingStatusRecord52 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord52.setStatus("hi!");
        java.lang.String str55 = readingStatusService33.determineStatus(readingStatusRecord52);
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str64 = readingStatusRecord63.getAuthor();
        double double65 = readingStatusService33.calculateProgressPercent(readingStatusRecord63);
        java.lang.String str67 = readingStatusService33.parseStatusText("To Read");
        BookManager bookManager68 = null;
        ReadingProgressData readingProgressData69 = null;
        ReadingStatusData readingStatusData70 = new ReadingStatusData(bookManager68, readingProgressData69);
        ReadingStatusService readingStatusService71 = new ReadingStatusService(readingStatusData70);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord79.setStatus("");
        double double82 = readingStatusService71.calculateProgressPercent(readingStatusRecord79);
        double double83 = readingStatusService33.calculateProgressPercent(readingStatusRecord79);
        int int84 = readingStatusRecord79.getTotalPages();
        double double85 = readingStatusService3.calculateProgressPercent(readingStatusRecord79);
        java.lang.String str86 = readingStatusRecord79.getGenre();
        java.lang.String str87 = readingStatusRecord79.getStatus();
        int int88 = readingStatusRecord79.getCurrentPage();
        java.lang.String str89 = readingStatusRecord79.getGenre();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Currently Reading" + "'", str64, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 0.0d + "'", double65 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "To Read" + "'", str67, "To Read");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Finished" + "'", str86, "Finished");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Finished" + "'", str89, "Finished");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test520");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        java.util.Scanner scanner48 = null;
        ReadingStatusView readingStatusView49 = new ReadingStatusView(readingStatusService3, scanner48);
        ReadingStatusRecord readingStatusRecord57 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord57);
        java.lang.String str59 = readingStatusRecord57.getAuthor();
        java.lang.String str60 = readingStatusRecord57.getStatus();
        java.lang.String str61 = readingStatusRecord57.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Currently Reading" + "'", str58, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "To Read" + "'", str61, "To Read");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test521");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        BookManager bookManager58 = null;
        ReadingProgressData readingProgressData59 = null;
        ReadingStatusData readingStatusData60 = new ReadingStatusData(bookManager58, readingProgressData59);
        ReadingStatusService readingStatusService61 = new ReadingStatusService(readingStatusData60);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord69.setStatus("hi!");
        double double72 = readingStatusService61.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double81 = readingStatusService61.calculateProgressPercent(readingStatusRecord80);
        java.lang.String str82 = readingStatusService3.determineStatus(readingStatusRecord80);
        int int83 = readingStatusRecord80.getTotalPages();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Unknown" + "'", str82, "Unknown");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test522");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str8 = readingStatusRecord7.getAuthor();
        java.lang.String str9 = readingStatusRecord7.getStoredStatus();
        boolean boolean10 = readingStatusRecord7.hasProgress();
        boolean boolean11 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Finished" + "'", str9, "Finished");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test523");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = readingStatusService3.countBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test524");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager26 = null;
        ReadingProgressData readingProgressData27 = null;
        ReadingStatusData readingStatusData28 = new ReadingStatusData(bookManager26, readingProgressData27);
        ReadingStatusService readingStatusService29 = new ReadingStatusService(readingStatusData28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("");
        double double40 = readingStatusService29.calculateProgressPercent(readingStatusRecord37);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord48.setStatus("hi!");
        java.lang.String str51 = readingStatusService29.determineStatus(readingStatusRecord48);
        ReadingStatusRecord readingStatusRecord59 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str60 = readingStatusRecord59.getAuthor();
        double double61 = readingStatusService29.calculateProgressPercent(readingStatusRecord59);
        java.lang.String str63 = readingStatusService29.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str72 = readingStatusRecord71.getTitle();
        double double73 = readingStatusService29.calculateProgressPercent(readingStatusRecord71);
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord71);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord76 = readingStatusService3.viewBookDetails("Currently Reading");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Currently Reading" + "'", str60, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "To Read" + "'", str63, "To Read");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "To Read" + "'", str72, "To Read");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "To Read" + "'", str74, "To Read");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test525");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        readingStatusRecord11.setStatus("Unknown");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("", "", "", "", (int) ' ', (int) (short) 100, true);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        int int24 = readingStatusRecord22.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 312.5d + "'", double14 == 312.5d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 312.5d + "'", double23 == 312.5d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test526");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        java.lang.String str35 = readingStatusService3.determineStatus(readingStatusRecord33);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Unknown" + "'", str35, "Unknown");
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test527");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        java.lang.String str20 = readingStatusService3.parseStatusText("To Read");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList22 = readingStatusService3.viewBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "To Read" + "'", str20, "To Read");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test528");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        ReadingStatusRecord readingStatusRecord47 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord47.setStatus("hi!");
        int int50 = readingStatusRecord47.getCurrentPage();
        int int51 = readingStatusRecord47.getCurrentPage();
        int int52 = readingStatusRecord47.getCurrentPage();
        int int53 = readingStatusRecord47.getCurrentPage();
        java.lang.String str54 = readingStatusService3.determineStatus(readingStatusRecord47);
        java.lang.String str55 = readingStatusRecord47.getGenre();
        java.lang.String str56 = readingStatusRecord47.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Unknown" + "'", str54, "Unknown");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Finished" + "'", str55, "Finished");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test529");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Unknown", "Currently Reading", "To Read", "To Read", 0, (int) '4', true);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test530");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner17 = null;
        ReadingStatusView readingStatusView18 = new ReadingStatusView(readingStatusService3, scanner17);
        BookManager bookManager19 = null;
        ReadingProgressData readingProgressData20 = null;
        ReadingStatusData readingStatusData21 = new ReadingStatusData(bookManager19, readingProgressData20);
        ReadingStatusService readingStatusService22 = new ReadingStatusService(readingStatusData21);
        ReadingStatusRecord readingStatusRecord30 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str31 = readingStatusRecord30.getTitle();
        boolean boolean32 = readingStatusRecord30.hasProgress();
        double double33 = readingStatusService22.calculateProgressPercent(readingStatusRecord30);
        readingStatusRecord30.setStatus("");
        java.lang.String str36 = readingStatusService3.determineStatus(readingStatusRecord30);
        BookManager bookManager37 = null;
        ReadingProgressData readingProgressData38 = null;
        ReadingStatusData readingStatusData39 = new ReadingStatusData(bookManager37, readingProgressData38);
        ReadingStatusService readingStatusService40 = new ReadingStatusService(readingStatusData39);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord48.setStatus("");
        double double51 = readingStatusService40.calculateProgressPercent(readingStatusRecord48);
        ReadingStatusRecord readingStatusRecord59 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord59.setStatus("hi!");
        java.lang.String str62 = readingStatusService40.determineStatus(readingStatusRecord59);
        ReadingStatusRecord readingStatusRecord70 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str71 = readingStatusRecord70.getAuthor();
        double double72 = readingStatusService40.calculateProgressPercent(readingStatusRecord70);
        java.lang.String str74 = readingStatusService40.parseStatusText("To Read");
        BookManager bookManager75 = null;
        ReadingProgressData readingProgressData76 = null;
        ReadingStatusData readingStatusData77 = new ReadingStatusData(bookManager75, readingProgressData76);
        ReadingStatusService readingStatusService78 = new ReadingStatusService(readingStatusData77);
        ReadingStatusRecord readingStatusRecord86 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord86.setStatus("");
        double double89 = readingStatusService78.calculateProgressPercent(readingStatusRecord86);
        double double90 = readingStatusService40.calculateProgressPercent(readingStatusRecord86);
        java.lang.String str91 = readingStatusService3.determineStatus(readingStatusRecord86);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Currently Reading" + "'", str16, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Finished" + "'", str31, "Finished");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Unknown" + "'", str36, "Unknown");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Unknown" + "'", str62, "Unknown");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Currently Reading" + "'", str71, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "To Read" + "'", str74, "To Read");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 0.0d + "'", double89 == 0.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Unknown" + "'", str91, "Unknown");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test531");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int8 = readingStatusRecord7.getCurrentPage();
        java.lang.String str9 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test532");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner17 = null;
        ReadingStatusView readingStatusView18 = new ReadingStatusView(readingStatusService3, scanner17);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList19 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Currently Reading" + "'", str16, "Currently Reading");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test533");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        java.util.Scanner scanner58 = null;
        ReadingStatusView readingStatusView59 = new ReadingStatusView(readingStatusService3, scanner58);
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("", "Finished", "To Read", "", (int) (byte) 100, (int) (byte) 100, false);
        double double68 = readingStatusService3.calculateProgressPercent(readingStatusRecord67);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 100.0d + "'", double68 == 100.0d);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test534");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        java.lang.String str45 = readingStatusRecord39.getGenre();
        readingStatusRecord39.setStatus("Finished");
        java.lang.String str48 = readingStatusRecord39.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Finished" + "'", str45, "Finished");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Finished" + "'", str48, "Finished");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test535");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        int int8 = readingStatusRecord7.getTotalPages();
        int int9 = readingStatusRecord7.getCurrentPage();
        java.lang.String str10 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test536");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        BookManager bookManager35 = null;
        ReadingProgressData readingProgressData36 = null;
        ReadingStatusData readingStatusData37 = new ReadingStatusData(bookManager35, readingProgressData36);
        ReadingStatusService readingStatusService38 = new ReadingStatusService(readingStatusData37);
        ReadingStatusRecord readingStatusRecord46 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord46.setStatus("");
        double double49 = readingStatusService38.calculateProgressPercent(readingStatusRecord46);
        ReadingStatusRecord readingStatusRecord57 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord57.setStatus("hi!");
        java.lang.String str60 = readingStatusService38.determineStatus(readingStatusRecord57);
        ReadingStatusRecord readingStatusRecord68 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str69 = readingStatusRecord68.getAuthor();
        double double70 = readingStatusService38.calculateProgressPercent(readingStatusRecord68);
        java.lang.String str72 = readingStatusService38.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str81 = readingStatusRecord80.getTitle();
        double double82 = readingStatusService38.calculateProgressPercent(readingStatusRecord80);
        java.util.Scanner scanner83 = null;
        ReadingStatusView readingStatusView84 = new ReadingStatusView(readingStatusService38, scanner83);
        ReadingStatusRecord readingStatusRecord92 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str93 = readingStatusService38.determineStatus(readingStatusRecord92);
        java.lang.String str94 = readingStatusRecord92.getAuthor();
        double double95 = readingStatusService3.calculateProgressPercent(readingStatusRecord92);
        java.lang.String str96 = readingStatusRecord92.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Currently Reading" + "'", str69, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "To Read" + "'", str72, "To Read");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "To Read" + "'", str81, "To Read");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Currently Reading" + "'", str93, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Unknown" + "'", str94, "Unknown");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "To Read" + "'", str96, "To Read");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test537");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        readingStatusRecord11.setStatus("Unknown");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        int int15 = readingStatusRecord11.getTotalPages();
        readingStatusRecord11.setStatus("Currently Reading");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 312.5d + "'", double14 == 312.5d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test538");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "", "To Read", "hi!", 100, (int) ' ', false);
        int int8 = readingStatusRecord7.getTotalPages();
        int int9 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test539");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.lang.String str63 = readingStatusRecord61.getStatus();
        java.lang.String str64 = readingStatusRecord61.getGenre();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Unknown" + "'", str63, "Unknown");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test540");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView27.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test541");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Finished");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Finished" + "'", str45, "Finished");
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test542");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord33.setStatus("hi!");
        int int36 = readingStatusRecord33.getCurrentPage();
        int int37 = readingStatusRecord33.getTotalPages();
        java.lang.String str38 = readingStatusRecord33.getStoredStatus();
        java.lang.String str39 = readingStatusRecord33.getGenre();
        java.lang.String str40 = readingStatusRecord33.getAuthor();
        double double41 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str43 = readingStatusService3.parseStatusText("hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Finished" + "'", str39, "Finished");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Finished" + "'", str40, "Finished");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test543");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        BookManager bookManager15 = null;
        ReadingProgressData readingProgressData16 = null;
        ReadingStatusData readingStatusData17 = new ReadingStatusData(bookManager15, readingProgressData16);
        ReadingStatusService readingStatusService18 = new ReadingStatusService(readingStatusData17);
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord26.setStatus("");
        double double29 = readingStatusService18.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("hi!");
        java.lang.String str40 = readingStatusService18.determineStatus(readingStatusRecord37);
        java.util.Scanner scanner41 = null;
        ReadingStatusView readingStatusView42 = new ReadingStatusView(readingStatusService18, scanner41);
        BookManager bookManager43 = null;
        ReadingProgressData readingProgressData44 = null;
        ReadingStatusData readingStatusData45 = new ReadingStatusData(bookManager43, readingProgressData44);
        ReadingStatusService readingStatusService46 = new ReadingStatusService(readingStatusData45);
        ReadingStatusRecord readingStatusRecord54 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord54.setStatus("");
        double double57 = readingStatusService46.calculateProgressPercent(readingStatusRecord54);
        java.lang.String str58 = readingStatusService18.determineStatus(readingStatusRecord54);
        java.lang.String str60 = readingStatusService18.parseStatusText("Currently Reading");
        java.util.Scanner scanner61 = null;
        ReadingStatusView readingStatusView62 = new ReadingStatusView(readingStatusService18, scanner61);
        ReadingStatusRecord readingStatusRecord70 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str71 = readingStatusRecord70.getStoredStatus();
        int int72 = readingStatusRecord70.getCurrentPage();
        java.lang.String str73 = readingStatusService18.determineStatus(readingStatusRecord70);
        readingStatusRecord70.setStatus("Currently Reading");
        double double76 = readingStatusService3.calculateProgressPercent(readingStatusRecord70);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Currently Reading" + "'", str60, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Unknown" + "'", str73, "Unknown");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test544");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str56 = readingStatusRecord55.getStoredStatus();
        int int57 = readingStatusRecord55.getCurrentPage();
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord55);
        ReadingStatusRecord readingStatusRecord66 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str67 = readingStatusRecord66.getAuthor();
        java.lang.String str68 = readingStatusRecord66.getStoredStatus();
        java.lang.String str69 = readingStatusRecord66.getStatus();
        java.lang.String str70 = readingStatusService3.determineStatus(readingStatusRecord66);
        java.lang.Class<?> wildcardClass71 = readingStatusRecord66.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Currently Reading" + "'", str67, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Finished" + "'", str68, "Finished");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Unknown" + "'", str69, "Unknown");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Finished" + "'", str70, "Finished");
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test545");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        int int8 = readingStatusRecord7.getTotalPages();
        java.lang.String str9 = readingStatusRecord7.getTitle();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Finished" + "'", str9, "Finished");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test546");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord6 = readingStatusService4.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test547");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("hi!");
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test548");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "To Read", "Unknown", (int) (short) 100, (int) (byte) 1, false);
        int int8 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test549");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        BookManager bookManager58 = null;
        ReadingProgressData readingProgressData59 = null;
        ReadingStatusData readingStatusData60 = new ReadingStatusData(bookManager58, readingProgressData59);
        ReadingStatusService readingStatusService61 = new ReadingStatusService(readingStatusData60);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord69.setStatus("hi!");
        double double72 = readingStatusService61.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double81 = readingStatusService61.calculateProgressPercent(readingStatusRecord80);
        java.lang.String str82 = readingStatusService3.determineStatus(readingStatusRecord80);
        ReadingStatusRecord readingStatusRecord90 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord90.setStatus("hi!");
        int int93 = readingStatusRecord90.getCurrentPage();
        int int94 = readingStatusRecord90.getCurrentPage();
        java.lang.String str95 = readingStatusRecord90.getTitle();
        java.lang.String str96 = readingStatusService3.determineStatus(readingStatusRecord90);
        readingStatusRecord90.setStatus("Currently Reading");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Unknown" + "'", str82, "Unknown");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Finished" + "'", str95, "Finished");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Unknown" + "'", str96, "Unknown");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test550");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        readingStatusRecord11.setStatus("Unknown");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        int int15 = readingStatusRecord11.getTotalPages();
        int int16 = readingStatusRecord11.getTotalPages();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 312.5d + "'", double14 == 312.5d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test551");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test552");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        java.util.Scanner scanner58 = null;
        ReadingStatusView readingStatusView59 = new ReadingStatusView(readingStatusService3, scanner58);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList61 = readingStatusService3.viewBooksByStatus("Unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test553");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.util.Scanner scanner63 = null;
        ReadingStatusView readingStatusView64 = new ReadingStatusView(readingStatusService3, scanner63);
        java.lang.String str66 = readingStatusService3.parseStatusText("Unknown");
        ReadingStatusRecord readingStatusRecord74 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str75 = readingStatusRecord74.getTitle();
        java.lang.String str76 = readingStatusRecord74.getAuthor();
        java.lang.String str77 = readingStatusRecord74.getAuthor();
        double double78 = readingStatusService3.calculateProgressPercent(readingStatusRecord74);
        ReadingStatusRecord readingStatusRecord86 = new ReadingStatusRecord("", "", "", "", (int) ' ', (int) (short) 100, true);
        java.lang.String str87 = readingStatusRecord86.getStoredStatus();
        double double88 = readingStatusService3.calculateProgressPercent(readingStatusRecord86);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Unknown" + "'", str66, "Unknown");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Currently Reading" + "'", str76, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Currently Reading" + "'", str77, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 312.5d + "'", double88 == 312.5d);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test554");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str58 = readingStatusRecord55.getStoredStatus();
        java.lang.String str59 = readingStatusRecord55.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Finished" + "'", str58, "Finished");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Currently Reading" + "'", str59, "Currently Reading");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test555");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.util.Scanner scanner15 = null;
        ReadingStatusView readingStatusView16 = new ReadingStatusView(readingStatusService3, scanner15);
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        java.util.Scanner scanner43 = null;
        ReadingStatusView readingStatusView44 = new ReadingStatusView(readingStatusService20, scanner43);
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        ReadingStatusRecord readingStatusRecord56 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord56.setStatus("");
        double double59 = readingStatusService48.calculateProgressPercent(readingStatusRecord56);
        java.lang.String str60 = readingStatusService20.determineStatus(readingStatusRecord56);
        java.lang.String str61 = readingStatusRecord56.getGenre();
        java.lang.String str62 = readingStatusRecord56.getStoredStatus();
        int int63 = readingStatusRecord56.getCurrentPage();
        java.lang.String str64 = readingStatusService3.determineStatus(readingStatusRecord56);
        ReadingStatusRecord readingStatusRecord72 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        int int73 = readingStatusRecord72.getTotalPages();
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord72);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord76 = readingStatusService3.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Finished" + "'", str61, "Finished");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Unknown" + "'", str74, "Unknown");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test556");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "Finished", "To Read", "hi!", 100, (int) (byte) 100, false);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test557");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord60 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord60.setStatus("hi!");
        java.lang.String str63 = readingStatusService41.determineStatus(readingStatusRecord60);
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str72 = readingStatusRecord71.getAuthor();
        double double73 = readingStatusService41.calculateProgressPercent(readingStatusRecord71);
        java.lang.String str75 = readingStatusService41.parseStatusText("To Read");
        java.util.Scanner scanner76 = null;
        ReadingStatusView readingStatusView77 = new ReadingStatusView(readingStatusService41, scanner76);
        java.lang.String str79 = readingStatusService41.parseStatusText("");
        ReadingStatusRecord readingStatusRecord87 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean88 = readingStatusRecord87.hasProgress();
        java.lang.String str89 = readingStatusRecord87.getAuthor();
        java.lang.String str90 = readingStatusRecord87.getStatus();
        double double91 = readingStatusService41.calculateProgressPercent(readingStatusRecord87);
        double double92 = readingStatusService3.calculateProgressPercent(readingStatusRecord87);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList94 = readingStatusService3.viewBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Unknown" + "'", str63, "Unknown");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Currently Reading" + "'", str72, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "To Read" + "'", str75, "To Read");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Unknown" + "'", str79, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Unknown" + "'", str90, "Unknown");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1000.0d + "'", double91 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1000.0d + "'", double92 == 1000.0d);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test558");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str56 = readingStatusRecord55.getStoredStatus();
        int int57 = readingStatusRecord55.getCurrentPage();
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord55);
        java.lang.String str60 = readingStatusService3.parseStatusText("Unknown");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList62 = readingStatusService3.viewBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test559");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService8 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService9 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService10 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList11 = readingStatusData2.loadAllRecords();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test560");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("", "Finished", "", "", (int) ' ', (int) (byte) 10, true);
        java.lang.String str64 = readingStatusService3.determineStatus(readingStatusRecord63);
        int int65 = readingStatusRecord63.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Currently Reading" + "'", str64, "Currently Reading");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test561");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        readingStatusRecord61.setStatus("Finished");
        readingStatusRecord61.setStatus("To Read");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test562");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        java.util.Scanner scanner48 = null;
        ReadingStatusView readingStatusView49 = new ReadingStatusView(readingStatusService3, scanner48);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = readingStatusService3.countBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test563");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.lang.String str39 = readingStatusService3.parseStatusText("Currently Reading");
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord41 = readingStatusService3.viewBookDetails("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Title must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Currently Reading" + "'", str39, "Currently Reading");
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test564");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService8 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = readingStatusService8.countBooksByStatus("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test565");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = readingStatusService3.countBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test566");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        int int54 = readingStatusRecord49.getCurrentPage();
        int int55 = readingStatusRecord49.getTotalPages();
        int int56 = readingStatusRecord49.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test567");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "To Read", "Unknown", "Finished", (int) (byte) 100, (int) (short) 100, true);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Finished" + "'", str8, "Finished");
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test568");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        readingStatusRecord11.setStatus("Unknown");
        readingStatusRecord11.setStatus("");
        boolean boolean20 = readingStatusRecord11.hasProgress();
        int int21 = readingStatusRecord11.getTotalPages();
        java.lang.String str22 = readingStatusRecord11.getStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test569");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStatus();
        int int9 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown" + "'", str8, "Unknown");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test570");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean68 = readingStatusRecord67.hasProgress();
        java.lang.String str69 = readingStatusRecord67.getAuthor();
        java.lang.String str70 = readingStatusRecord67.getAuthor();
        double double71 = readingStatusService3.calculateProgressPercent(readingStatusRecord67);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList73 = readingStatusService3.viewBooksByStatus("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1000.0d + "'", double71 == 1000.0d);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test571");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Unknown", "Currently Reading", "Unknown", "Unknown", (int) (short) 1, 52, false);
        readingStatusRecord7.setStatus("To Read");
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test572");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        java.lang.String str9 = readingStatusRecord7.getStoredStatus();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        java.lang.String str11 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Finished" + "'", str10, "Finished");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test573");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService8 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService9 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService10 = new ReadingStatusService(readingStatusData2);
        java.lang.String str12 = readingStatusService10.parseStatusText("Unknown");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Unknown" + "'", str12, "Unknown");
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test574");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getTitle();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Finished" + "'", str9, "Finished");
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test575");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        boolean boolean26 = readingStatusRecord22.hasProgress();
        java.lang.Class<?> wildcardClass27 = readingStatusRecord22.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test576");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = readingStatusService3.countBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test577");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str58 = readingStatusRecord55.getStoredStatus();
        int int59 = readingStatusRecord55.getCurrentPage();
        java.lang.String str60 = readingStatusRecord55.getGenre();
        java.lang.String str61 = readingStatusRecord55.getAuthor();
        java.lang.String str62 = readingStatusRecord55.getStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Finished" + "'", str58, "Finished");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Currently Reading" + "'", str61, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Unknown" + "'", str62, "Unknown");
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test578");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord33.setStatus("hi!");
        int int36 = readingStatusRecord33.getCurrentPage();
        int int37 = readingStatusRecord33.getTotalPages();
        java.lang.String str38 = readingStatusRecord33.getStoredStatus();
        java.lang.String str39 = readingStatusRecord33.getGenre();
        java.lang.String str40 = readingStatusRecord33.getAuthor();
        double double41 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.util.Scanner scanner42 = null;
        ReadingStatusView readingStatusView43 = new ReadingStatusView(readingStatusService3, scanner42);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView43.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Finished" + "'", str39, "Finished");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Finished" + "'", str40, "Finished");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test579");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str26 = readingStatusRecord22.getStatus();
        boolean boolean27 = readingStatusRecord22.hasProgress();
        java.lang.String str28 = readingStatusRecord22.getAuthor();
        java.lang.String str29 = readingStatusRecord22.getAuthor();
        java.lang.String str30 = readingStatusRecord22.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Finished" + "'", str28, "Finished");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Finished" + "'", str29, "Finished");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Finished" + "'", str30, "Finished");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test580");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        int int48 = readingStatusRecord45.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test581");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str27 = readingStatusRecord26.getStatus();
        double double28 = readingStatusService3.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord36 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord36.setStatus("hi!");
        int int39 = readingStatusRecord36.getCurrentPage();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord36);
        java.lang.String str42 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord50 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean51 = readingStatusRecord50.hasProgress();
        java.lang.String str52 = readingStatusRecord50.getAuthor();
        java.lang.String str53 = readingStatusRecord50.getAuthor();
        int int54 = readingStatusRecord50.getTotalPages();
        int int55 = readingStatusRecord50.getTotalPages();
        int int56 = readingStatusRecord50.getTotalPages();
        java.lang.String str57 = readingStatusService3.determineStatus(readingStatusRecord50);
        boolean boolean58 = readingStatusRecord50.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unknown" + "'", str27, "Unknown");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Currently Reading" + "'", str42, "Currently Reading");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Finished" + "'", str57, "Finished");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test582");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        java.lang.String str16 = readingStatusRecord11.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test583");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        readingStatusRecord11.setStatus("Unknown");
        readingStatusRecord11.setStatus("");
        boolean boolean20 = readingStatusRecord11.hasProgress();
        int int21 = readingStatusRecord11.getTotalPages();
        java.lang.String str22 = readingStatusRecord11.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Finished" + "'", str22, "Finished");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test584");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        int int36 = readingStatusRecord33.getCurrentPage();
        java.lang.String str37 = readingStatusRecord33.getTitle();
        int int38 = readingStatusRecord33.getCurrentPage();
        int int39 = readingStatusRecord33.getCurrentPage();
        int int40 = readingStatusRecord33.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 100 + "'", int40 == 100);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test585");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager26 = null;
        ReadingProgressData readingProgressData27 = null;
        ReadingStatusData readingStatusData28 = new ReadingStatusData(bookManager26, readingProgressData27);
        ReadingStatusService readingStatusService29 = new ReadingStatusService(readingStatusData28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("");
        double double40 = readingStatusService29.calculateProgressPercent(readingStatusRecord37);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord48.setStatus("hi!");
        java.lang.String str51 = readingStatusService29.determineStatus(readingStatusRecord48);
        ReadingStatusRecord readingStatusRecord59 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str60 = readingStatusRecord59.getAuthor();
        double double61 = readingStatusService29.calculateProgressPercent(readingStatusRecord59);
        java.lang.String str63 = readingStatusService29.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str72 = readingStatusRecord71.getTitle();
        double double73 = readingStatusService29.calculateProgressPercent(readingStatusRecord71);
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord71);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord76 = readingStatusService3.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Currently Reading" + "'", str60, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "To Read" + "'", str63, "To Read");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "To Read" + "'", str72, "To Read");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "To Read" + "'", str74, "To Read");
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test586");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Unknown", "To Read", "Currently Reading", (int) (byte) 100, (int) 'a', true);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test587");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList56 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test588");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        java.lang.String str35 = readingStatusRecord28.getTitle();
        readingStatusRecord28.setStatus("Finished");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Finished" + "'", str35, "Finished");
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test589");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str26 = readingStatusRecord22.getStatus();
        java.lang.String str27 = readingStatusRecord22.getTitle();
        java.lang.String str28 = readingStatusRecord22.getTitle();
        java.lang.Class<?> wildcardClass29 = readingStatusRecord22.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Finished" + "'", str27, "Finished");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Finished" + "'", str28, "Finished");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test590");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.util.Scanner scanner65 = null;
        ReadingStatusView readingStatusView66 = new ReadingStatusView(readingStatusService3, scanner65);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView66.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test591");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.util.Scanner scanner28 = null;
        ReadingStatusView readingStatusView29 = new ReadingStatusView(readingStatusService3, scanner28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Currently Reading", "Finished", "Finished", "Finished", (-1), 100, true);
        double double38 = readingStatusService3.calculateProgressPercent(readingStatusRecord37);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test592");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        BookManager bookManager24 = null;
        ReadingProgressData readingProgressData25 = null;
        ReadingStatusData readingStatusData26 = new ReadingStatusData(bookManager24, readingProgressData25);
        ReadingStatusService readingStatusService27 = new ReadingStatusService(readingStatusData26);
        ReadingStatusRecord readingStatusRecord35 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord35.setStatus("");
        double double38 = readingStatusService27.calculateProgressPercent(readingStatusRecord35);
        ReadingStatusRecord readingStatusRecord46 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord46.setStatus("hi!");
        java.lang.String str49 = readingStatusService27.determineStatus(readingStatusRecord46);
        ReadingStatusRecord readingStatusRecord57 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str58 = readingStatusRecord57.getAuthor();
        double double59 = readingStatusService27.calculateProgressPercent(readingStatusRecord57);
        java.lang.String str61 = readingStatusService27.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str70 = readingStatusRecord69.getTitle();
        double double71 = readingStatusService27.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str80 = readingStatusRecord79.getGenre();
        double double81 = readingStatusService27.calculateProgressPercent(readingStatusRecord79);
        java.lang.String str83 = readingStatusService27.parseStatusText("");
        ReadingStatusRecord readingStatusRecord91 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str92 = readingStatusService27.determineStatus(readingStatusRecord91);
        java.lang.String str93 = readingStatusService3.determineStatus(readingStatusRecord91);
        java.lang.String str94 = readingStatusRecord91.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Unknown" + "'", str49, "Unknown");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Currently Reading" + "'", str58, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "To Read" + "'", str61, "To Read");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "To Read" + "'", str70, "To Read");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Unknown" + "'", str80, "Unknown");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Unknown" + "'", str92, "Unknown");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Unknown" + "'", str93, "Unknown");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test593");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        int int26 = readingStatusRecord22.getCurrentPage();
        java.lang.String str27 = readingStatusRecord22.getStatus();
        java.lang.String str28 = readingStatusRecord22.getStoredStatus();
        java.lang.String str29 = readingStatusRecord22.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Finished" + "'", str29, "Finished");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test594");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str15 = readingStatusRecord11.getStatus();
        int int16 = readingStatusRecord11.getTotalPages();
        java.lang.String str17 = readingStatusRecord11.getTitle();
        readingStatusRecord11.setStatus("");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Finished" + "'", str17, "Finished");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test595");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        BookManager bookManager58 = null;
        ReadingProgressData readingProgressData59 = null;
        ReadingStatusData readingStatusData60 = new ReadingStatusData(bookManager58, readingProgressData59);
        ReadingStatusService readingStatusService61 = new ReadingStatusService(readingStatusData60);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord69.setStatus("hi!");
        double double72 = readingStatusService61.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double81 = readingStatusService61.calculateProgressPercent(readingStatusRecord80);
        java.lang.String str82 = readingStatusService3.determineStatus(readingStatusRecord80);
        // The following exception was thrown during execution in test generation
        try {
            int int84 = readingStatusService3.countBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Unknown" + "'", str82, "Unknown");
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test596");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "To Read", "hi!", "Unknown", (int) ' ', (int) (short) 1, true);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        int int10 = readingStatusRecord7.getTotalPages();
        boolean boolean11 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test597");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean8 = readingStatusRecord7.hasProgress();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        java.lang.String str10 = readingStatusRecord7.getStatus();
        java.lang.String str11 = readingStatusRecord7.getTitle();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Unknown" + "'", str10, "Unknown");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Currently Reading" + "'", str11, "Currently Reading");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test598");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        java.lang.String str16 = readingStatusRecord11.getStoredStatus();
        java.lang.String str17 = readingStatusRecord11.getStatus();
        int int18 = readingStatusRecord11.getTotalPages();
        int int19 = readingStatusRecord11.getTotalPages();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test599");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        boolean boolean9 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test600");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList61 = readingStatusService3.viewBooksByStatus("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test601");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.util.Scanner scanner36 = null;
        ReadingStatusView readingStatusView37 = new ReadingStatusView(readingStatusService3, scanner36);
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        ReadingStatusRecord readingStatusRecord47 = new ReadingStatusRecord("To Read", "", "To Read", "hi!", 100, (int) ' ', false);
        int int48 = readingStatusRecord47.getTotalPages();
        double double49 = readingStatusService3.calculateProgressPercent(readingStatusRecord47);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 32.0d + "'", double49 == 32.0d);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test602");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        readingStatusRecord11.setStatus("Unknown");
        java.lang.String str18 = readingStatusRecord11.getTitle();
        java.lang.String str19 = readingStatusRecord11.getStoredStatus();
        java.lang.String str20 = readingStatusRecord11.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Finished" + "'", str18, "Finished");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Finished" + "'", str20, "Finished");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test603");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Unknown", "Unknown", "Unknown", "To Read", (int) ' ', (int) 'a', false);
        boolean boolean8 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test604");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        ReadingStatusRecord readingStatusRecord24 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        double double25 = readingStatusService3.calculateProgressPercent(readingStatusRecord24);
        BookManager bookManager26 = null;
        ReadingProgressData readingProgressData27 = null;
        ReadingStatusData readingStatusData28 = new ReadingStatusData(bookManager26, readingProgressData27);
        ReadingStatusService readingStatusService29 = new ReadingStatusService(readingStatusData28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("");
        double double40 = readingStatusService29.calculateProgressPercent(readingStatusRecord37);
        boolean boolean41 = readingStatusRecord37.hasProgress();
        readingStatusRecord37.setStatus("Unknown");
        readingStatusRecord37.setStatus("");
        double double46 = readingStatusService3.calculateProgressPercent(readingStatusRecord37);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test605");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Unknown", "Finished", "Currently Reading", 10, (int) (short) 0, false);
        readingStatusRecord7.setStatus("Unknown");
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        java.lang.String str11 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Currently Reading" + "'", str10, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Finished" + "'", str11, "Finished");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test606");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        boolean boolean9 = readingStatusRecord7.hasProgress();
        java.lang.String str10 = readingStatusRecord7.getGenre();
        int int11 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Finished" + "'", str10, "Finished");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test607");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord7 = readingStatusService5.viewBookDetails("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Title must not be empty.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test608");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "", "", "Unknown", 97, (int) (byte) -1, false);
        readingStatusRecord7.setStatus("hi!");
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test609");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "To Read", "hi!", "Unknown", (int) ' ', (int) (short) 1, true);
        int int8 = readingStatusRecord7.getTotalPages();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        readingStatusRecord7.setStatus("To Read");
        int int12 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test610");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        int int9 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test611");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.util.Scanner scanner15 = null;
        ReadingStatusView readingStatusView16 = new ReadingStatusView(readingStatusService3, scanner15);
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        java.util.Scanner scanner43 = null;
        ReadingStatusView readingStatusView44 = new ReadingStatusView(readingStatusService20, scanner43);
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        ReadingStatusRecord readingStatusRecord56 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord56.setStatus("");
        double double59 = readingStatusService48.calculateProgressPercent(readingStatusRecord56);
        java.lang.String str60 = readingStatusService20.determineStatus(readingStatusRecord56);
        java.lang.String str61 = readingStatusRecord56.getGenre();
        java.lang.String str62 = readingStatusRecord56.getStoredStatus();
        int int63 = readingStatusRecord56.getCurrentPage();
        java.lang.String str64 = readingStatusService3.determineStatus(readingStatusRecord56);
        boolean boolean65 = readingStatusRecord56.hasProgress();
        java.lang.String str66 = readingStatusRecord56.getStoredStatus();
        java.lang.String str67 = readingStatusRecord56.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Finished" + "'", str61, "Finished");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Finished" + "'", str67, "Finished");
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test612");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int62 = readingStatusRecord61.getCurrentPage();
        readingStatusRecord61.setStatus("Unknown");
        double double65 = readingStatusService3.calculateProgressPercent(readingStatusRecord61);
        java.lang.String str67 = readingStatusService3.parseStatusText("Unknown");
        ReadingStatusRecord readingStatusRecord75 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean76 = readingStatusRecord75.hasProgress();
        java.lang.String str77 = readingStatusRecord75.getAuthor();
        java.lang.String str78 = readingStatusRecord75.getAuthor();
        int int79 = readingStatusRecord75.getTotalPages();
        int int80 = readingStatusRecord75.getTotalPages();
        int int81 = readingStatusRecord75.getTotalPages();
        double double82 = readingStatusService3.calculateProgressPercent(readingStatusRecord75);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.309278350515463d + "'", double65 == 10.309278350515463d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 10 + "'", int81 == 10);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 1000.0d + "'", double82 == 1000.0d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test613");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.util.Scanner scanner15 = null;
        ReadingStatusView readingStatusView16 = new ReadingStatusView(readingStatusService3, scanner15);
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        java.util.Scanner scanner43 = null;
        ReadingStatusView readingStatusView44 = new ReadingStatusView(readingStatusService20, scanner43);
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        ReadingStatusRecord readingStatusRecord56 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord56.setStatus("");
        double double59 = readingStatusService48.calculateProgressPercent(readingStatusRecord56);
        java.lang.String str60 = readingStatusService20.determineStatus(readingStatusRecord56);
        java.lang.String str61 = readingStatusRecord56.getGenre();
        java.lang.String str62 = readingStatusRecord56.getStoredStatus();
        int int63 = readingStatusRecord56.getCurrentPage();
        java.lang.String str64 = readingStatusService3.determineStatus(readingStatusRecord56);
        boolean boolean65 = readingStatusRecord56.hasProgress();
        java.lang.String str66 = readingStatusRecord56.getStoredStatus();
        readingStatusRecord56.setStatus("Currently Reading");
        java.lang.String str69 = readingStatusRecord56.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Finished" + "'", str61, "Finished");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Finished" + "'", str69, "Finished");
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test614");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "Currently Reading", "", "hi!", (int) '4', (int) (short) 1, false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test615");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.lang.String str65 = readingStatusRecord62.getTitle();
        java.lang.String str66 = readingStatusRecord62.getGenre();
        boolean boolean67 = readingStatusRecord62.hasProgress();
        int int68 = readingStatusRecord62.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Finished" + "'", str65, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Finished" + "'", str66, "Finished");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test616");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "To Read", "hi!", "Unknown", (int) ' ', (int) (short) 1, true);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getGenre();
        java.lang.Class<?> wildcardClass11 = readingStatusRecord7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test617");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord60 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord60.setStatus("hi!");
        java.lang.String str63 = readingStatusService41.determineStatus(readingStatusRecord60);
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str72 = readingStatusRecord71.getAuthor();
        double double73 = readingStatusService41.calculateProgressPercent(readingStatusRecord71);
        java.lang.String str75 = readingStatusService41.parseStatusText("To Read");
        java.util.Scanner scanner76 = null;
        ReadingStatusView readingStatusView77 = new ReadingStatusView(readingStatusService41, scanner76);
        java.lang.String str79 = readingStatusService41.parseStatusText("");
        ReadingStatusRecord readingStatusRecord87 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean88 = readingStatusRecord87.hasProgress();
        java.lang.String str89 = readingStatusRecord87.getAuthor();
        java.lang.String str90 = readingStatusRecord87.getStatus();
        double double91 = readingStatusService41.calculateProgressPercent(readingStatusRecord87);
        double double92 = readingStatusService3.calculateProgressPercent(readingStatusRecord87);
        int int93 = readingStatusRecord87.getTotalPages();
        java.lang.String str94 = readingStatusRecord87.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Unknown" + "'", str63, "Unknown");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Currently Reading" + "'", str72, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "To Read" + "'", str75, "To Read");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Unknown" + "'", str79, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "Unknown" + "'", str90, "Unknown");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 1000.0d + "'", double91 == 1000.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 1000.0d + "'", double92 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 10 + "'", int93 == 10);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test618");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        BookManager bookManager15 = null;
        ReadingProgressData readingProgressData16 = null;
        ReadingStatusData readingStatusData17 = new ReadingStatusData(bookManager15, readingProgressData16);
        ReadingStatusService readingStatusService18 = new ReadingStatusService(readingStatusData17);
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord26.setStatus("");
        double double29 = readingStatusService18.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("hi!");
        java.lang.String str40 = readingStatusService18.determineStatus(readingStatusRecord37);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str49 = readingStatusRecord48.getAuthor();
        double double50 = readingStatusService18.calculateProgressPercent(readingStatusRecord48);
        int int51 = readingStatusRecord48.getCurrentPage();
        java.lang.String str52 = readingStatusRecord48.getStoredStatus();
        int int53 = readingStatusRecord48.getCurrentPage();
        java.lang.String str54 = readingStatusService3.determineStatus(readingStatusRecord48);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Currently Reading" + "'", str49, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Finished" + "'", str52, "Finished");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Finished" + "'", str54, "Finished");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test619");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("hi!");
        int int10 = readingStatusRecord7.getCurrentPage();
        int int11 = readingStatusRecord7.getTotalPages();
        java.lang.String str12 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Finished" + "'", str12, "Finished");
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test620");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean68 = readingStatusRecord67.hasProgress();
        java.lang.String str69 = readingStatusRecord67.getAuthor();
        java.lang.String str70 = readingStatusRecord67.getAuthor();
        double double71 = readingStatusService3.calculateProgressPercent(readingStatusRecord67);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord79.setStatus("hi!");
        int int82 = readingStatusRecord79.getCurrentPage();
        int int83 = readingStatusRecord79.getTotalPages();
        int int84 = readingStatusRecord79.getTotalPages();
        java.lang.String str85 = readingStatusService3.determineStatus(readingStatusRecord79);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1000.0d + "'", double71 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 1 + "'", int84 == 1);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Unknown" + "'", str85, "Unknown");
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test621");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("hi!");
        java.lang.String str10 = readingStatusRecord7.getGenre();
        int int11 = readingStatusRecord7.getCurrentPage();
        java.lang.String str12 = readingStatusRecord7.getTitle();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Finished" + "'", str10, "Finished");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Finished" + "'", str12, "Finished");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test622");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int8 = readingStatusRecord7.getCurrentPage();
        readingStatusRecord7.setStatus("Unknown");
        int int11 = readingStatusRecord7.getCurrentPage();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        int int13 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test623");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord14 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str15 = readingStatusService6.determineStatus(readingStatusRecord14);
        BookManager bookManager16 = null;
        ReadingProgressData readingProgressData17 = null;
        ReadingStatusData readingStatusData18 = new ReadingStatusData(bookManager16, readingProgressData17);
        ReadingStatusService readingStatusService19 = new ReadingStatusService(readingStatusData18);
        ReadingStatusRecord readingStatusRecord27 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord27.setStatus("");
        double double30 = readingStatusService19.calculateProgressPercent(readingStatusRecord27);
        ReadingStatusRecord readingStatusRecord38 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord38.setStatus("hi!");
        java.lang.String str41 = readingStatusService19.determineStatus(readingStatusRecord38);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str50 = readingStatusRecord49.getAuthor();
        double double51 = readingStatusService19.calculateProgressPercent(readingStatusRecord49);
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getCurrentPage();
        double double54 = readingStatusService6.calculateProgressPercent(readingStatusRecord49);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown" + "'", str15, "Unknown");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Currently Reading" + "'", str50, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test624");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "", "", "", (int) ' ', (int) (short) 100, true);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test625");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager26 = null;
        ReadingProgressData readingProgressData27 = null;
        ReadingStatusData readingStatusData28 = new ReadingStatusData(bookManager26, readingProgressData27);
        ReadingStatusService readingStatusService29 = new ReadingStatusService(readingStatusData28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("");
        double double40 = readingStatusService29.calculateProgressPercent(readingStatusRecord37);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord48.setStatus("hi!");
        java.lang.String str51 = readingStatusService29.determineStatus(readingStatusRecord48);
        ReadingStatusRecord readingStatusRecord59 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str60 = readingStatusRecord59.getAuthor();
        double double61 = readingStatusService29.calculateProgressPercent(readingStatusRecord59);
        java.lang.String str63 = readingStatusService29.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str72 = readingStatusRecord71.getTitle();
        double double73 = readingStatusService29.calculateProgressPercent(readingStatusRecord71);
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord71);
        int int75 = readingStatusRecord71.getCurrentPage();
        java.lang.String str76 = readingStatusRecord71.getStoredStatus();
        java.lang.Class<?> wildcardClass77 = readingStatusRecord71.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Currently Reading" + "'", str60, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "To Read" + "'", str63, "To Read");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "To Read" + "'", str72, "To Read");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "To Read" + "'", str74, "To Read");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "To Read" + "'", str76, "To Read");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test626");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord12 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        double double13 = readingStatusService4.calculateProgressPercent(readingStatusRecord12);
        java.lang.String str14 = readingStatusRecord12.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test627");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        java.lang.String str45 = readingStatusRecord39.getGenre();
        readingStatusRecord39.setStatus("Finished");
        java.lang.String str48 = readingStatusRecord39.getStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Finished" + "'", str45, "Finished");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Finished" + "'", str48, "Finished");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test628");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Currently Reading");
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord18 = readingStatusService3.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Currently Reading" + "'", str16, "Currently Reading");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test629");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        boolean boolean65 = readingStatusRecord62.hasProgress();
        java.lang.String str66 = readingStatusRecord62.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Finished" + "'", str66, "Finished");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test630");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str15 = readingStatusRecord11.getStatus();
        java.lang.String str16 = readingStatusRecord11.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test631");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str27 = readingStatusRecord26.getStatus();
        double double28 = readingStatusService3.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord36 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord36.setStatus("hi!");
        int int39 = readingStatusRecord36.getCurrentPage();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord36);
        java.lang.String str42 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord50 = new ReadingStatusRecord("hi!", "hi!", "Unknown", "Currently Reading", 97, (int) 'a', false);
        double double51 = readingStatusService3.calculateProgressPercent(readingStatusRecord50);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unknown" + "'", str27, "Unknown");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Currently Reading" + "'", str42, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test632");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        BookManager bookManager40 = null;
        ReadingProgressData readingProgressData41 = null;
        ReadingStatusData readingStatusData42 = new ReadingStatusData(bookManager40, readingProgressData41);
        ReadingStatusService readingStatusService43 = new ReadingStatusService(readingStatusData42);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("");
        double double54 = readingStatusService43.calculateProgressPercent(readingStatusRecord51);
        java.lang.String str56 = readingStatusService43.parseStatusText("Finished");
        java.lang.String str58 = readingStatusService43.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord66 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str67 = readingStatusRecord66.getStatus();
        double double68 = readingStatusService43.calculateProgressPercent(readingStatusRecord66);
        double double69 = readingStatusService3.calculateProgressPercent(readingStatusRecord66);
        ReadingStatusRecord readingStatusRecord77 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord77.setStatus("hi!");
        int int80 = readingStatusRecord77.getCurrentPage();
        int int81 = readingStatusRecord77.getCurrentPage();
        int int82 = readingStatusRecord77.getCurrentPage();
        int int83 = readingStatusRecord77.getCurrentPage();
        java.lang.String str84 = readingStatusRecord77.getGenre();
        double double85 = readingStatusService3.calculateProgressPercent(readingStatusRecord77);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Finished" + "'", str56, "Finished");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Currently Reading" + "'", str58, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Finished" + "'", str84, "Finished");
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.0d + "'", double85 == 0.0d);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test633");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int62 = readingStatusRecord61.getCurrentPage();
        readingStatusRecord61.setStatus("Unknown");
        double double65 = readingStatusService3.calculateProgressPercent(readingStatusRecord61);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord67 = readingStatusService3.viewBookDetails("Unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.309278350515463d + "'", double65 == 10.309278350515463d);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test634");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "Currently Reading", "", 97, 1, true);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test635");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        java.lang.String str47 = readingStatusService3.parseStatusText("Finished");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Finished" + "'", str47, "Finished");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test636");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str55 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord63.setStatus("hi!");
        int int66 = readingStatusRecord63.getCurrentPage();
        int int67 = readingStatusRecord63.getTotalPages();
        int int68 = readingStatusRecord63.getTotalPages();
        double double69 = readingStatusService3.calculateProgressPercent(readingStatusRecord63);
        java.util.Scanner scanner70 = null;
        ReadingStatusView readingStatusView71 = new ReadingStatusView(readingStatusService3, scanner70);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView71.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test637");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord67.setStatus("hi!");
        int int70 = readingStatusRecord67.getCurrentPage();
        int int71 = readingStatusRecord67.getTotalPages();
        int int72 = readingStatusRecord67.getTotalPages();
        java.lang.String str73 = readingStatusRecord67.getStatus();
        java.lang.String str74 = readingStatusRecord67.getStoredStatus();
        java.lang.String str75 = readingStatusService3.determineStatus(readingStatusRecord67);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList76 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Unknown" + "'", str75, "Unknown");
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test638");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.lang.String str65 = readingStatusRecord62.getTitle();
        java.lang.String str66 = readingStatusRecord62.getGenre();
        java.lang.Class<?> wildcardClass67 = readingStatusRecord62.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Finished" + "'", str65, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Finished" + "'", str66, "Finished");
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test639");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord67.setStatus("hi!");
        int int70 = readingStatusRecord67.getCurrentPage();
        int int71 = readingStatusRecord67.getTotalPages();
        int int72 = readingStatusRecord67.getTotalPages();
        java.lang.String str73 = readingStatusRecord67.getStatus();
        java.lang.String str74 = readingStatusRecord67.getStoredStatus();
        java.lang.String str75 = readingStatusService3.determineStatus(readingStatusRecord67);
        java.lang.String str76 = readingStatusRecord67.getGenre();
        java.lang.String str77 = readingStatusRecord67.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Unknown" + "'", str75, "Unknown");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Finished" + "'", str76, "Finished");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Finished" + "'", str77, "Finished");
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test640");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str12 = readingStatusRecord11.getTitle();
        boolean boolean13 = readingStatusRecord11.hasProgress();
        java.lang.String str14 = readingStatusRecord11.getTitle();
        double double15 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord23 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord23.setStatus("hi!");
        int int26 = readingStatusRecord23.getCurrentPage();
        int int27 = readingStatusRecord23.getTotalPages();
        int int28 = readingStatusRecord23.getTotalPages();
        java.lang.String str29 = readingStatusRecord23.getStatus();
        java.lang.String str30 = readingStatusRecord23.getStoredStatus();
        double double31 = readingStatusService3.calculateProgressPercent(readingStatusRecord23);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Finished" + "'", str12, "Finished");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Finished" + "'", str14, "Finished");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test641");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.util.Scanner scanner63 = null;
        ReadingStatusView readingStatusView64 = new ReadingStatusView(readingStatusService3, scanner63);
        java.lang.String str66 = readingStatusService3.parseStatusText("Unknown");
        ReadingStatusRecord readingStatusRecord74 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str75 = readingStatusRecord74.getTitle();
        java.lang.String str76 = readingStatusRecord74.getAuthor();
        java.lang.String str77 = readingStatusRecord74.getAuthor();
        double double78 = readingStatusService3.calculateProgressPercent(readingStatusRecord74);
        BookManager bookManager79 = null;
        ReadingProgressData readingProgressData80 = null;
        ReadingStatusData readingStatusData81 = new ReadingStatusData(bookManager79, readingProgressData80);
        ReadingStatusService readingStatusService82 = new ReadingStatusService(readingStatusData81);
        ReadingStatusRecord readingStatusRecord90 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord90.setStatus("");
        double double93 = readingStatusService82.calculateProgressPercent(readingStatusRecord90);
        java.lang.String str94 = readingStatusRecord90.getStatus();
        boolean boolean95 = readingStatusRecord90.hasProgress();
        int int96 = readingStatusRecord90.getTotalPages();
        double double97 = readingStatusService3.calculateProgressPercent(readingStatusRecord90);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Unknown" + "'", str66, "Unknown");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Currently Reading" + "'", str76, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Currently Reading" + "'", str77, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 0.0d + "'", double93 == 0.0d);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 1 + "'", int96 == 1);
        org.junit.Assert.assertTrue("'" + double97 + "' != '" + 0.0d + "'", double97 == 0.0d);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test642");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        int int9 = readingStatusRecord7.getCurrentPage();
        int int10 = readingStatusRecord7.getCurrentPage();
        java.lang.String str11 = readingStatusRecord7.getGenre();
        java.lang.String str12 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Finished" + "'", str11, "Finished");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test643");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        java.lang.String str46 = readingStatusRecord42.getStatus();
        int int47 = readingStatusRecord42.getTotalPages();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Unknown" + "'", str46, "Unknown");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test644");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        BookManager bookManager44 = null;
        ReadingProgressData readingProgressData45 = null;
        ReadingStatusData readingStatusData46 = new ReadingStatusData(bookManager44, readingProgressData45);
        ReadingStatusService readingStatusService47 = new ReadingStatusService(readingStatusData46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord55.setStatus("");
        double double58 = readingStatusService47.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusRecord55.getStatus();
        java.lang.String str60 = readingStatusRecord55.getStatus();
        java.lang.String str61 = readingStatusService3.determineStatus(readingStatusRecord55);
        java.util.Scanner scanner62 = null;
        ReadingStatusView readingStatusView63 = new ReadingStatusView(readingStatusService3, scanner62);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Unknown" + "'", str61, "Unknown");
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test645");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        int int26 = readingStatusRecord22.getCurrentPage();
        int int27 = readingStatusRecord22.getTotalPages();
        int int28 = readingStatusRecord22.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test646");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.lang.String str65 = readingStatusRecord62.getTitle();
        java.lang.String str66 = readingStatusRecord62.getStatus();
        java.lang.String str67 = readingStatusRecord62.getStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Finished" + "'", str65, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Unknown" + "'", str66, "Unknown");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test647");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int8 = readingStatusRecord7.getCurrentPage();
        readingStatusRecord7.setStatus("Unknown");
        int int11 = readingStatusRecord7.getCurrentPage();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        readingStatusRecord7.setStatus("To Read");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test648");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList57 = readingStatusService3.viewBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test649");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str68 = readingStatusService3.determineStatus(readingStatusRecord67);
        BookManager bookManager69 = null;
        ReadingProgressData readingProgressData70 = null;
        ReadingStatusData readingStatusData71 = new ReadingStatusData(bookManager69, readingProgressData70);
        ReadingStatusService readingStatusService72 = new ReadingStatusService(readingStatusData71);
        ReadingStatusService readingStatusService73 = new ReadingStatusService(readingStatusData71);
        ReadingStatusRecord readingStatusRecord81 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        double double82 = readingStatusService73.calculateProgressPercent(readingStatusRecord81);
        java.lang.String str83 = readingStatusService3.determineStatus(readingStatusRecord81);
        ReadingStatusRecord readingStatusRecord91 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord91.setStatus("");
        java.lang.String str94 = readingStatusRecord91.getStoredStatus();
        java.lang.String str95 = readingStatusRecord91.getStoredStatus();
        java.lang.String str96 = readingStatusService3.determineStatus(readingStatusRecord91);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Unknown" + "'", str68, "Unknown");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "Unknown" + "'", str96, "Unknown");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test650");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        boolean boolean15 = readingStatusRecord11.hasProgress();
        java.lang.String str16 = readingStatusRecord11.getStoredStatus();
        java.lang.String str17 = readingStatusRecord11.getStatus();
        java.lang.String str18 = readingStatusRecord11.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Finished" + "'", str18, "Finished");
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test651");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str56 = readingStatusRecord55.getStoredStatus();
        int int57 = readingStatusRecord55.getCurrentPage();
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord55);
        ReadingStatusRecord readingStatusRecord66 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int67 = readingStatusRecord66.getCurrentPage();
        int int68 = readingStatusRecord66.getTotalPages();
        java.lang.String str69 = readingStatusService3.determineStatus(readingStatusRecord66);
        boolean boolean70 = readingStatusRecord66.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Currently Reading" + "'", str69, "Currently Reading");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test652");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int8 = readingStatusRecord7.getCurrentPage();
        int int9 = readingStatusRecord7.getTotalPages();
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test653");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        java.util.Scanner scanner58 = null;
        ReadingStatusView readingStatusView59 = new ReadingStatusView(readingStatusService3, scanner58);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView59.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test654");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str58 = readingStatusRecord55.getStoredStatus();
        int int59 = readingStatusRecord55.getTotalPages();
        java.lang.String str60 = readingStatusRecord55.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Finished" + "'", str58, "Finished");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Finished" + "'", str60, "Finished");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test655");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList9 = readingStatusService7.viewBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test656");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int62 = readingStatusRecord61.getCurrentPage();
        readingStatusRecord61.setStatus("Unknown");
        double double65 = readingStatusService3.calculateProgressPercent(readingStatusRecord61);
        java.lang.String str67 = readingStatusService3.parseStatusText("Unknown");
        java.lang.String str69 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner70 = null;
        ReadingStatusView readingStatusView71 = new ReadingStatusView(readingStatusService3, scanner70);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.309278350515463d + "'", double65 == 10.309278350515463d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "To Read" + "'", str69, "To Read");
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test657");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Unknown");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList47 = readingStatusService3.viewBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test658");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        int int9 = readingStatusRecord7.getCurrentPage();
        int int10 = readingStatusRecord7.getCurrentPage();
        int int11 = readingStatusRecord7.getCurrentPage();
        java.lang.String str12 = readingStatusRecord7.getStoredStatus();
        java.lang.String str13 = readingStatusRecord7.getStoredStatus();
        int int14 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test659");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = readingStatusService3.countBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test660");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        int int36 = readingStatusRecord33.getCurrentPage();
        int int37 = readingStatusRecord33.getCurrentPage();
        java.lang.String str38 = readingStatusRecord33.getTitle();
        boolean boolean39 = readingStatusRecord33.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test661");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord14 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str15 = readingStatusService6.determineStatus(readingStatusRecord14);
        int int16 = readingStatusRecord14.getCurrentPage();
        int int17 = readingStatusRecord14.getTotalPages();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Unknown" + "'", str15, "Unknown");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test662");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str8 = readingStatusRecord7.getTitle();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "To Read" + "'", str8, "To Read");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Unknown" + "'", str10, "Unknown");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test663");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        int int46 = readingStatusRecord42.getTotalPages();
        boolean boolean47 = readingStatusRecord42.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test664");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "hi!", "Finished", "hi!", (int) '#', 1, true);
        java.lang.String str8 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test665");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        java.lang.String str45 = readingStatusRecord39.getStoredStatus();
        java.lang.String str46 = readingStatusRecord39.getAuthor();
        readingStatusRecord39.setStatus("Currently Reading");
        int int49 = readingStatusRecord39.getTotalPages();
        readingStatusRecord39.setStatus("");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Finished" + "'", str46, "Finished");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test666");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean8 = readingStatusRecord7.hasProgress();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        int int11 = readingStatusRecord7.getTotalPages();
        int int12 = readingStatusRecord7.getTotalPages();
        int int13 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test667");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        java.util.Scanner scanner48 = null;
        ReadingStatusView readingStatusView49 = new ReadingStatusView(readingStatusService3, scanner48);
        java.lang.String str51 = readingStatusService3.parseStatusText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList52 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test668");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList47 = readingStatusService3.viewBooksByStatus("Currently Reading");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test669");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Finished", "Finished", "To Read", (int) ' ', (int) (byte) 10, true);
        java.lang.String str8 = readingStatusRecord7.getStatus();
        java.lang.String str9 = readingStatusRecord7.getGenre();
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        java.lang.String str11 = readingStatusRecord7.getTitle();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown" + "'", str8, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Finished" + "'", str9, "Finished");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "To Read" + "'", str10, "To Read");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test670");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.util.Scanner scanner63 = null;
        ReadingStatusView readingStatusView64 = new ReadingStatusView(readingStatusService3, scanner63);
        java.lang.String str66 = readingStatusService3.parseStatusText("Unknown");
        ReadingStatusRecord readingStatusRecord74 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str75 = readingStatusRecord74.getTitle();
        java.lang.String str76 = readingStatusRecord74.getAuthor();
        java.lang.String str77 = readingStatusRecord74.getAuthor();
        double double78 = readingStatusService3.calculateProgressPercent(readingStatusRecord74);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList79 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Unknown" + "'", str66, "Unknown");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Currently Reading" + "'", str76, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Currently Reading" + "'", str77, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test671");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        java.lang.String str11 = readingStatusRecord7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unknown" + "'", str11, "Unknown");
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test672");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.Class<?> wildcardClass54 = readingStatusRecord49.getClass();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test673");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList47 = readingStatusService3.viewBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test674");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str38 = readingStatusRecord37.getTitle();
        boolean boolean39 = readingStatusRecord37.hasProgress();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord37);
        readingStatusRecord37.setStatus("To Read");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Finished" + "'", str38, "Finished");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test675");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str27 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord50 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord50.setStatus("hi!");
        java.lang.String str53 = readingStatusService31.determineStatus(readingStatusRecord50);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService31, scanner54);
        BookManager bookManager56 = null;
        ReadingProgressData readingProgressData57 = null;
        ReadingStatusData readingStatusData58 = new ReadingStatusData(bookManager56, readingProgressData57);
        ReadingStatusService readingStatusService59 = new ReadingStatusService(readingStatusData58);
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord67.setStatus("");
        double double70 = readingStatusService59.calculateProgressPercent(readingStatusRecord67);
        java.lang.String str71 = readingStatusService31.determineStatus(readingStatusRecord67);
        java.lang.String str72 = readingStatusRecord67.getGenre();
        java.lang.String str73 = readingStatusRecord67.getStoredStatus();
        java.lang.String str74 = readingStatusRecord67.getAuthor();
        java.lang.String str75 = readingStatusRecord67.getAuthor();
        double double76 = readingStatusService3.calculateProgressPercent(readingStatusRecord67);
        // The following exception was thrown during execution in test generation
        try {
            int int78 = readingStatusService3.countBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "To Read" + "'", str27, "To Read");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Unknown" + "'", str53, "Unknown");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Unknown" + "'", str71, "Unknown");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Finished" + "'", str72, "Finished");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Finished" + "'", str74, "Finished");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Finished" + "'", str75, "Finished");
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test676");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Unknown", "Unknown", "Unknown", "", (int) ' ', (int) (byte) 1, true);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test677");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        BookManager bookManager44 = null;
        ReadingProgressData readingProgressData45 = null;
        ReadingStatusData readingStatusData46 = new ReadingStatusData(bookManager44, readingProgressData45);
        ReadingStatusService readingStatusService47 = new ReadingStatusService(readingStatusData46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord55.setStatus("");
        double double58 = readingStatusService47.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusRecord55.getStatus();
        java.lang.String str60 = readingStatusRecord55.getStatus();
        java.lang.String str61 = readingStatusService3.determineStatus(readingStatusRecord55);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str70 = readingStatusRecord69.getGenre();
        readingStatusRecord69.setStatus("hi!");
        java.lang.String str73 = readingStatusRecord69.getGenre();
        java.lang.String str74 = readingStatusService3.determineStatus(readingStatusRecord69);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList76 = readingStatusService3.viewBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Unknown" + "'", str61, "Unknown");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Unknown" + "'", str74, "Unknown");
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test678");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        java.util.Scanner scanner48 = null;
        ReadingStatusView readingStatusView49 = new ReadingStatusView(readingStatusService3, scanner48);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test679");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        java.lang.String str11 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Currently Reading" + "'", str11, "Currently Reading");
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test680");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        java.lang.String str45 = readingStatusRecord39.getStoredStatus();
        java.lang.String str46 = readingStatusRecord39.getAuthor();
        java.lang.String str47 = readingStatusRecord39.getAuthor();
        java.lang.String str48 = readingStatusRecord39.getGenre();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Finished" + "'", str46, "Finished");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Finished" + "'", str47, "Finished");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Finished" + "'", str48, "Finished");
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test681");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        ReadingStatusRecord readingStatusRecord70 = new ReadingStatusRecord("hi!", "", "Finished", "Finished", 0, (int) (byte) -1, true);
        double double71 = readingStatusService3.calculateProgressPercent(readingStatusRecord70);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = readingStatusService3.countBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test682");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        BookManager bookManager60 = null;
        ReadingProgressData readingProgressData61 = null;
        ReadingStatusData readingStatusData62 = new ReadingStatusData(bookManager60, readingProgressData61);
        ReadingStatusService readingStatusService63 = new ReadingStatusService(readingStatusData62);
        ReadingStatusRecord readingStatusRecord71 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord71.setStatus("");
        double double74 = readingStatusService63.calculateProgressPercent(readingStatusRecord71);
        ReadingStatusRecord readingStatusRecord82 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord82.setStatus("hi!");
        java.lang.String str85 = readingStatusService63.determineStatus(readingStatusRecord82);
        java.lang.String str86 = readingStatusRecord82.getStatus();
        boolean boolean87 = readingStatusRecord82.hasProgress();
        java.lang.String str88 = readingStatusService3.determineStatus(readingStatusRecord82);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Unknown" + "'", str85, "Unknown");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Unknown" + "'", str88, "Unknown");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test683");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("");
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        int int11 = readingStatusRecord7.getCurrentPage();
        int int12 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test684");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        int int26 = readingStatusRecord22.getCurrentPage();
        java.lang.String str27 = readingStatusRecord22.getStatus();
        boolean boolean28 = readingStatusRecord22.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test685");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Finished", "Unknown", "Unknown", 0, (int) (byte) 0, false);
        int int8 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test686");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("");
        readingStatusRecord7.setStatus("To Read");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test687");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean8 = readingStatusRecord7.hasProgress();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        int int11 = readingStatusRecord7.getTotalPages();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test688");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str26 = readingStatusRecord22.getStatus();
        java.lang.String str27 = readingStatusRecord22.getGenre();
        java.lang.String str28 = readingStatusRecord22.getStatus();
        java.lang.String str29 = readingStatusRecord22.getGenre();
        java.lang.String str30 = readingStatusRecord22.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Finished" + "'", str27, "Finished");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Finished" + "'", str29, "Finished");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test689");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        readingStatusRecord39.setStatus("Currently Reading");
        java.lang.String str47 = readingStatusRecord39.getTitle();
        java.lang.String str48 = readingStatusRecord39.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Finished" + "'", str47, "Finished");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test690");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "hi!", "", "hi!", (-1), 32, true);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test691");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        int int9 = readingStatusRecord7.getCurrentPage();
        int int10 = readingStatusRecord7.getCurrentPage();
        java.lang.String str11 = readingStatusRecord7.getGenre();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Finished" + "'", str11, "Finished");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test692");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord53 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord53.setStatus("hi!");
        int int56 = readingStatusRecord53.getCurrentPage();
        java.lang.String str57 = readingStatusRecord53.getGenre();
        double double58 = readingStatusService3.calculateProgressPercent(readingStatusRecord53);
        java.util.Scanner scanner59 = null;
        ReadingStatusView readingStatusView60 = new ReadingStatusView(readingStatusService3, scanner59);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView60.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Finished" + "'", str57, "Finished");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test693");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord9 = readingStatusService7.viewBookDetails("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test694");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Unknown");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        java.util.Scanner scanner43 = null;
        ReadingStatusView readingStatusView44 = new ReadingStatusView(readingStatusService20, scanner43);
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        ReadingStatusRecord readingStatusRecord56 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord56.setStatus("");
        double double59 = readingStatusService48.calculateProgressPercent(readingStatusRecord56);
        java.lang.String str60 = readingStatusService20.determineStatus(readingStatusRecord56);
        ReadingStatusRecord readingStatusRecord68 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord68.setStatus("hi!");
        double double71 = readingStatusService20.calculateProgressPercent(readingStatusRecord68);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str80 = readingStatusRecord79.getStoredStatus();
        double double81 = readingStatusService20.calculateProgressPercent(readingStatusRecord79);
        java.lang.String str82 = readingStatusRecord79.getTitle();
        java.lang.String str83 = readingStatusService3.determineStatus(readingStatusRecord79);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Unknown" + "'", str16, "Unknown");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.0d + "'", double71 == 0.0d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 0.0d + "'", double81 == 0.0d);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Finished" + "'", str82, "Finished");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test695");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "hi!", "To Read", "To Read", (int) '4', (int) '#', true);
        boolean boolean8 = readingStatusRecord7.hasProgress();
        int int9 = readingStatusRecord7.getTotalPages();
        int int10 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test696");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int8 = readingStatusRecord7.getCurrentPage();
        int int9 = readingStatusRecord7.getTotalPages();
        boolean boolean10 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test697");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        java.util.Scanner scanner4 = null;
        ReadingStatusView readingStatusView5 = new ReadingStatusView(readingStatusService3, scanner4);
        ReadingStatusRecord readingStatusRecord13 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord13.setStatus("hi!");
        int int16 = readingStatusRecord13.getCurrentPage();
        int int17 = readingStatusRecord13.getCurrentPage();
        java.lang.String str18 = readingStatusRecord13.getTitle();
        java.lang.String str19 = readingStatusService3.determineStatus(readingStatusRecord13);
        int int20 = readingStatusRecord13.getTotalPages();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Finished" + "'", str18, "Finished");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown" + "'", str19, "Unknown");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test698");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getGenre();
        java.lang.String str45 = readingStatusRecord39.getStoredStatus();
        java.lang.String str46 = readingStatusRecord39.getAuthor();
        java.lang.String str47 = readingStatusRecord39.getAuthor();
        java.lang.String str48 = readingStatusRecord39.getStoredStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Finished" + "'", str46, "Finished");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Finished" + "'", str47, "Finished");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test699");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService7 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService8 = new ReadingStatusService(readingStatusData2);
        java.util.Scanner scanner9 = null;
        ReadingStatusView readingStatusView10 = new ReadingStatusView(readingStatusService8, scanner9);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = readingStatusService8.countBooksByStatus("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test700");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("To Read", "hi!", "", "hi!", (-1), 32, true);
        readingStatusRecord7.setStatus("");
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test701");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord50 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str51 = readingStatusRecord50.getAuthor();
        double double52 = readingStatusService20.calculateProgressPercent(readingStatusRecord50);
        java.lang.String str54 = readingStatusService20.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str63 = readingStatusRecord62.getTitle();
        double double64 = readingStatusService20.calculateProgressPercent(readingStatusRecord62);
        java.util.Scanner scanner65 = null;
        ReadingStatusView readingStatusView66 = new ReadingStatusView(readingStatusService20, scanner65);
        java.lang.String str68 = readingStatusService20.parseStatusText("hi!");
        ReadingStatusRecord readingStatusRecord76 = new ReadingStatusRecord("Finished", "hi!", "Currently Reading", "Unknown", (int) ' ', (int) (byte) 100, false);
        boolean boolean77 = readingStatusRecord76.hasProgress();
        java.lang.String str78 = readingStatusRecord76.getAuthor();
        double double79 = readingStatusService20.calculateProgressPercent(readingStatusRecord76);
        java.lang.String str80 = readingStatusService3.determineStatus(readingStatusRecord76);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Currently Reading" + "'", str51, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "To Read" + "'", str54, "To Read");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "To Read" + "'", str63, "To Read");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Unknown" + "'", str68, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 312.5d + "'", double79 == 312.5d);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Unknown" + "'", str80, "Unknown");
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test702");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        BookManager bookManager35 = null;
        ReadingProgressData readingProgressData36 = null;
        ReadingStatusData readingStatusData37 = new ReadingStatusData(bookManager35, readingProgressData36);
        ReadingStatusService readingStatusService38 = new ReadingStatusService(readingStatusData37);
        ReadingStatusRecord readingStatusRecord46 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord46.setStatus("");
        double double49 = readingStatusService38.calculateProgressPercent(readingStatusRecord46);
        ReadingStatusRecord readingStatusRecord57 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord57.setStatus("hi!");
        java.lang.String str60 = readingStatusService38.determineStatus(readingStatusRecord57);
        ReadingStatusRecord readingStatusRecord68 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str69 = readingStatusRecord68.getAuthor();
        double double70 = readingStatusService38.calculateProgressPercent(readingStatusRecord68);
        java.lang.String str72 = readingStatusService38.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str81 = readingStatusRecord80.getTitle();
        double double82 = readingStatusService38.calculateProgressPercent(readingStatusRecord80);
        java.util.Scanner scanner83 = null;
        ReadingStatusView readingStatusView84 = new ReadingStatusView(readingStatusService38, scanner83);
        ReadingStatusRecord readingStatusRecord92 = new ReadingStatusRecord("To Read", "Unknown", "Finished", "Currently Reading", 0, (-1), true);
        java.lang.String str93 = readingStatusService38.determineStatus(readingStatusRecord92);
        java.lang.String str94 = readingStatusRecord92.getAuthor();
        double double95 = readingStatusService3.calculateProgressPercent(readingStatusRecord92);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord97 = readingStatusService3.viewBookDetails("Finished");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.0d + "'", double49 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Currently Reading" + "'", str69, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "To Read" + "'", str72, "To Read");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "To Read" + "'", str81, "To Read");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 0.0d + "'", double82 == 0.0d);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Currently Reading" + "'", str93, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Unknown" + "'", str94, "Unknown");
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 0.0d + "'", double95 == 0.0d);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test703");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        BookManager bookManager30 = null;
        ReadingProgressData readingProgressData31 = null;
        ReadingStatusData readingStatusData32 = new ReadingStatusData(bookManager30, readingProgressData31);
        ReadingStatusService readingStatusService33 = new ReadingStatusService(readingStatusData32);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord41.setStatus("");
        double double44 = readingStatusService33.calculateProgressPercent(readingStatusRecord41);
        boolean boolean45 = readingStatusRecord41.hasProgress();
        double double46 = readingStatusService3.calculateProgressPercent(readingStatusRecord41);
        java.lang.String str48 = readingStatusService3.parseStatusText("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList49 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Unknown" + "'", str48, "Unknown");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test704");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("hi!", "", "", "", (int) 'a', (int) (byte) 10, true);
        int int62 = readingStatusRecord61.getCurrentPage();
        readingStatusRecord61.setStatus("Unknown");
        double double65 = readingStatusService3.calculateProgressPercent(readingStatusRecord61);
        java.lang.String str67 = readingStatusService3.parseStatusText("Unknown");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList68 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.309278350515463d + "'", double65 == 10.309278350515463d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test705");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        BookManager bookManager30 = null;
        ReadingProgressData readingProgressData31 = null;
        ReadingStatusData readingStatusData32 = new ReadingStatusData(bookManager30, readingProgressData31);
        ReadingStatusService readingStatusService33 = new ReadingStatusService(readingStatusData32);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord41.setStatus("");
        double double44 = readingStatusService33.calculateProgressPercent(readingStatusRecord41);
        boolean boolean45 = readingStatusRecord41.hasProgress();
        double double46 = readingStatusService3.calculateProgressPercent(readingStatusRecord41);
        java.util.Scanner scanner47 = null;
        ReadingStatusView readingStatusView48 = new ReadingStatusView(readingStatusService3, scanner47);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView48.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test706");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        // The following exception was thrown during execution in test generation
        try {
            readingStatusView55.start();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test707");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.lang.String str63 = readingStatusRecord61.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test708");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        boolean boolean54 = readingStatusRecord49.hasProgress();
        java.lang.String str55 = readingStatusRecord49.getAuthor();
        int int56 = readingStatusRecord49.getCurrentPage();
        boolean boolean57 = readingStatusRecord49.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Finished" + "'", str55, "Finished");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test709");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.util.Scanner scanner15 = null;
        ReadingStatusView readingStatusView16 = new ReadingStatusView(readingStatusService3, scanner15);
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("hi!");
        java.lang.String str42 = readingStatusService20.determineStatus(readingStatusRecord39);
        java.util.Scanner scanner43 = null;
        ReadingStatusView readingStatusView44 = new ReadingStatusView(readingStatusService20, scanner43);
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        ReadingStatusRecord readingStatusRecord56 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord56.setStatus("");
        double double59 = readingStatusService48.calculateProgressPercent(readingStatusRecord56);
        java.lang.String str60 = readingStatusService20.determineStatus(readingStatusRecord56);
        java.lang.String str61 = readingStatusRecord56.getGenre();
        java.lang.String str62 = readingStatusRecord56.getStoredStatus();
        int int63 = readingStatusRecord56.getCurrentPage();
        java.lang.String str64 = readingStatusService3.determineStatus(readingStatusRecord56);
        boolean boolean65 = readingStatusRecord56.hasProgress();
        java.lang.String str66 = readingStatusRecord56.getStoredStatus();
        int int67 = readingStatusRecord56.getCurrentPage();
        java.lang.String str68 = readingStatusRecord56.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Unknown" + "'", str42, "Unknown");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.0d + "'", double59 == 0.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Unknown" + "'", str60, "Unknown");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Finished" + "'", str61, "Finished");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Finished" + "'", str68, "Finished");
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test710");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        int int36 = readingStatusRecord33.getCurrentPage();
        java.lang.String str37 = readingStatusRecord33.getTitle();
        int int38 = readingStatusRecord33.getCurrentPage();
        int int39 = readingStatusRecord33.getTotalPages();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test711");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord62.setStatus("hi!");
        int int65 = readingStatusRecord62.getCurrentPage();
        int int66 = readingStatusRecord62.getCurrentPage();
        int int67 = readingStatusRecord62.getCurrentPage();
        int int68 = readingStatusRecord62.getCurrentPage();
        double double69 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.lang.String str71 = readingStatusService3.parseStatusText("Currently Reading");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Currently Reading" + "'", str71, "Currently Reading");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test712");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str27 = readingStatusRecord26.getStatus();
        double double28 = readingStatusService3.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord36 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord36.setStatus("hi!");
        int int39 = readingStatusRecord36.getCurrentPage();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord36);
        java.lang.String str42 = readingStatusService3.parseStatusText("Currently Reading");
        java.lang.String str44 = readingStatusService3.parseStatusText("");
        BookManager bookManager45 = null;
        ReadingProgressData readingProgressData46 = null;
        ReadingStatusData readingStatusData47 = new ReadingStatusData(bookManager45, readingProgressData46);
        ReadingStatusService readingStatusService48 = new ReadingStatusService(readingStatusData47);
        java.util.Scanner scanner49 = null;
        ReadingStatusView readingStatusView50 = new ReadingStatusView(readingStatusService48, scanner49);
        ReadingStatusRecord readingStatusRecord58 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord58.setStatus("hi!");
        int int61 = readingStatusRecord58.getCurrentPage();
        int int62 = readingStatusRecord58.getCurrentPage();
        java.lang.String str63 = readingStatusRecord58.getTitle();
        java.lang.String str64 = readingStatusService48.determineStatus(readingStatusRecord58);
        int int65 = readingStatusRecord58.getCurrentPage();
        java.lang.String str66 = readingStatusRecord58.getGenre();
        java.lang.String str67 = readingStatusService3.determineStatus(readingStatusRecord58);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unknown" + "'", str27, "Unknown");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Currently Reading" + "'", str42, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Unknown" + "'", str44, "Unknown");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Finished" + "'", str63, "Finished");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Unknown" + "'", str64, "Unknown");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Finished" + "'", str66, "Finished");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test713");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "To Read", "", (int) (short) -1, (int) (short) 10, false);
        java.lang.String str8 = readingStatusRecord7.getStatus();
        java.lang.String str9 = readingStatusRecord7.getStatus();
        java.lang.String str10 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown" + "'", str8, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Finished" + "'", str10, "Finished");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test714");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.lang.String str29 = readingStatusService3.parseStatusText("");
        BookManager bookManager30 = null;
        ReadingProgressData readingProgressData31 = null;
        ReadingStatusData readingStatusData32 = new ReadingStatusData(bookManager30, readingProgressData31);
        ReadingStatusService readingStatusService33 = new ReadingStatusService(readingStatusData32);
        ReadingStatusRecord readingStatusRecord41 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord41.setStatus("");
        double double44 = readingStatusService33.calculateProgressPercent(readingStatusRecord41);
        boolean boolean45 = readingStatusRecord41.hasProgress();
        double double46 = readingStatusService3.calculateProgressPercent(readingStatusRecord41);
        java.lang.String str47 = readingStatusRecord41.getStatus();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Unknown" + "'", str29, "Unknown");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.0d + "'", double46 == 0.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test715");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str26 = readingStatusRecord22.getStatus();
        boolean boolean27 = readingStatusRecord22.hasProgress();
        java.lang.String str28 = readingStatusRecord22.getGenre();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Finished" + "'", str28, "Finished");
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test716");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord12 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        double double13 = readingStatusService4.calculateProgressPercent(readingStatusRecord12);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord15 = readingStatusService4.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test717");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str56 = readingStatusRecord55.getGenre();
        double double57 = readingStatusService3.calculateProgressPercent(readingStatusRecord55);
        java.lang.String str59 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord67 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str68 = readingStatusService3.determineStatus(readingStatusRecord67);
        java.lang.String str70 = readingStatusService3.parseStatusText("");
        java.lang.String str72 = readingStatusService3.parseStatusText("hi!");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Unknown" + "'", str56, "Unknown");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.0d + "'", double57 == 0.0d);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Unknown" + "'", str59, "Unknown");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Unknown" + "'", str68, "Unknown");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Unknown" + "'", str70, "Unknown");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "Unknown" + "'", str72, "Unknown");
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test718");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str27 = readingStatusRecord26.getStatus();
        double double28 = readingStatusService3.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord36 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord36.setStatus("hi!");
        int int39 = readingStatusRecord36.getCurrentPage();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord36);
        readingStatusRecord36.setStatus("");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unknown" + "'", str27, "Unknown");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test719");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str44 = readingStatusRecord39.getTitle();
        java.lang.String str45 = readingStatusRecord39.getTitle();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Finished" + "'", str44, "Finished");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Finished" + "'", str45, "Finished");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test720");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean50 = readingStatusRecord49.hasProgress();
        java.lang.String str51 = readingStatusRecord49.getAuthor();
        java.lang.String str52 = readingStatusRecord49.getStatus();
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.util.Scanner scanner54 = null;
        ReadingStatusView readingStatusView55 = new ReadingStatusView(readingStatusService3, scanner54);
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str64 = readingStatusRecord63.getGenre();
        java.lang.String str65 = readingStatusRecord63.getStoredStatus();
        java.lang.String str66 = readingStatusRecord63.getGenre();
        double double67 = readingStatusService3.calculateProgressPercent(readingStatusRecord63);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList69 = readingStatusService3.viewBooksByStatus("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Unknown" + "'", str52, "Unknown");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 1000.0d + "'", double53 == 1000.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 100.0d + "'", double67 == 100.0d);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test721");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService6 = new ReadingStatusService(readingStatusData2);
        BookManager bookManager7 = null;
        ReadingProgressData readingProgressData8 = null;
        ReadingStatusData readingStatusData9 = new ReadingStatusData(bookManager7, readingProgressData8);
        ReadingStatusService readingStatusService10 = new ReadingStatusService(readingStatusData9);
        ReadingStatusRecord readingStatusRecord18 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord18.setStatus("");
        double double21 = readingStatusService10.calculateProgressPercent(readingStatusRecord18);
        java.util.Scanner scanner22 = null;
        ReadingStatusView readingStatusView23 = new ReadingStatusView(readingStatusService10, scanner22);
        BookManager bookManager24 = null;
        ReadingProgressData readingProgressData25 = null;
        ReadingStatusData readingStatusData26 = new ReadingStatusData(bookManager24, readingProgressData25);
        ReadingStatusService readingStatusService27 = new ReadingStatusService(readingStatusData26);
        ReadingStatusRecord readingStatusRecord35 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord35.setStatus("");
        double double38 = readingStatusService27.calculateProgressPercent(readingStatusRecord35);
        ReadingStatusRecord readingStatusRecord46 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord46.setStatus("hi!");
        java.lang.String str49 = readingStatusService27.determineStatus(readingStatusRecord46);
        java.util.Scanner scanner50 = null;
        ReadingStatusView readingStatusView51 = new ReadingStatusView(readingStatusService27, scanner50);
        BookManager bookManager52 = null;
        ReadingProgressData readingProgressData53 = null;
        ReadingStatusData readingStatusData54 = new ReadingStatusData(bookManager52, readingProgressData53);
        ReadingStatusService readingStatusService55 = new ReadingStatusService(readingStatusData54);
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord63.setStatus("");
        double double66 = readingStatusService55.calculateProgressPercent(readingStatusRecord63);
        java.lang.String str67 = readingStatusService27.determineStatus(readingStatusRecord63);
        java.lang.String str68 = readingStatusRecord63.getGenre();
        java.lang.String str69 = readingStatusRecord63.getStoredStatus();
        int int70 = readingStatusRecord63.getCurrentPage();
        java.lang.String str71 = readingStatusService10.determineStatus(readingStatusRecord63);
        ReadingStatusRecord readingStatusRecord79 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        int int80 = readingStatusRecord79.getTotalPages();
        java.lang.String str81 = readingStatusService10.determineStatus(readingStatusRecord79);
        java.lang.String str82 = readingStatusService6.determineStatus(readingStatusRecord79);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Unknown" + "'", str49, "Unknown");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 0.0d + "'", double66 == 0.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Unknown" + "'", str67, "Unknown");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Finished" + "'", str68, "Finished");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Unknown" + "'", str71, "Unknown");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 10 + "'", int80 == 10);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Unknown" + "'", str81, "Unknown");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Unknown" + "'", str82, "Unknown");
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test722");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str26 = readingStatusRecord22.getStatus();
        java.lang.String str27 = readingStatusRecord22.getAuthor();
        int int28 = readingStatusRecord22.getCurrentPage();
        int int29 = readingStatusRecord22.getCurrentPage();
        java.lang.String str30 = readingStatusRecord22.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Finished" + "'", str27, "Finished");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Finished" + "'", str30, "Finished");
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test723");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        BookManager bookManager58 = null;
        ReadingProgressData readingProgressData59 = null;
        ReadingStatusData readingStatusData60 = new ReadingStatusData(bookManager58, readingProgressData59);
        ReadingStatusService readingStatusService61 = new ReadingStatusService(readingStatusData60);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord69.setStatus("");
        double double72 = readingStatusService61.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord80.setStatus("hi!");
        java.lang.String str83 = readingStatusService61.determineStatus(readingStatusRecord80);
        java.lang.String str84 = readingStatusService3.determineStatus(readingStatusRecord80);
        java.lang.String str86 = readingStatusService3.parseStatusText("Currently Reading");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Unknown" + "'", str84, "Unknown");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Currently Reading" + "'", str86, "Currently Reading");
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test724");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getAuthor();
        java.lang.String str10 = readingStatusRecord7.getStatus();
        java.lang.String str11 = readingStatusRecord7.getStatus();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown" + "'", str8, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Currently Reading" + "'", str9, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Unknown" + "'", str10, "Unknown");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Unknown" + "'", str11, "Unknown");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test725");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        java.util.Scanner scanner28 = null;
        ReadingStatusView readingStatusView29 = new ReadingStatusView(readingStatusService3, scanner28);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = readingStatusService3.countBooksByStatus("Unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test726");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str12 = readingStatusRecord11.getTitle();
        boolean boolean13 = readingStatusRecord11.hasProgress();
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.Class<?> wildcardClass15 = readingStatusService3.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Finished" + "'", str12, "Finished");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test727");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("hi!");
        boolean boolean10 = readingStatusRecord7.hasProgress();
        boolean boolean11 = readingStatusRecord7.hasProgress();
        int int12 = readingStatusRecord7.getCurrentPage();
        int int13 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test728");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str56 = readingStatusRecord55.getStoredStatus();
        int int57 = readingStatusRecord55.getCurrentPage();
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord55);
        readingStatusRecord55.setStatus("Currently Reading");
        int int61 = readingStatusRecord55.getTotalPages();
        java.lang.String str62 = readingStatusRecord55.getTitle();
        java.lang.String str63 = readingStatusRecord55.getAuthor();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Finished" + "'", str63, "Finished");
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test729");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getStoredStatus();
        int int9 = readingStatusRecord7.getCurrentPage();
        int int10 = readingStatusRecord7.getCurrentPage();
        int int11 = readingStatusRecord7.getCurrentPage();
        java.lang.String str12 = readingStatusRecord7.getStoredStatus();
        int int13 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test730");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "Currently Reading", "Currently Reading", "hi!", (int) (byte) 1, 32, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Currently Reading" + "'", str8, "Currently Reading");
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test731");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager17 = null;
        ReadingProgressData readingProgressData18 = null;
        ReadingStatusData readingStatusData19 = new ReadingStatusData(bookManager17, readingProgressData18);
        ReadingStatusService readingStatusService20 = new ReadingStatusService(readingStatusData19);
        ReadingStatusRecord readingStatusRecord28 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord28.setStatus("");
        double double31 = readingStatusService20.calculateProgressPercent(readingStatusRecord28);
        java.lang.String str32 = readingStatusRecord28.getStatus();
        int int33 = readingStatusRecord28.getTotalPages();
        java.lang.String str34 = readingStatusService3.determineStatus(readingStatusRecord28);
        ReadingStatusRecord readingStatusRecord42 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str43 = readingStatusRecord42.getStoredStatus();
        java.lang.String str44 = readingStatusRecord42.getStoredStatus();
        java.lang.String str45 = readingStatusService3.determineStatus(readingStatusRecord42);
        ReadingStatusRecord readingStatusRecord53 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str54 = readingStatusRecord53.getTitle();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord53);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord57 = readingStatusService3.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Unknown" + "'", str34, "Unknown");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Unknown" + "'", str45, "Unknown");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Finished" + "'", str54, "Finished");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test732");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        BookManager bookManager26 = null;
        ReadingProgressData readingProgressData27 = null;
        ReadingStatusData readingStatusData28 = new ReadingStatusData(bookManager26, readingProgressData27);
        ReadingStatusService readingStatusService29 = new ReadingStatusService(readingStatusData28);
        ReadingStatusRecord readingStatusRecord37 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord37.setStatus("");
        double double40 = readingStatusService29.calculateProgressPercent(readingStatusRecord37);
        ReadingStatusRecord readingStatusRecord48 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord48.setStatus("hi!");
        java.lang.String str51 = readingStatusService29.determineStatus(readingStatusRecord48);
        java.util.Scanner scanner52 = null;
        ReadingStatusView readingStatusView53 = new ReadingStatusView(readingStatusService29, scanner52);
        BookManager bookManager54 = null;
        ReadingProgressData readingProgressData55 = null;
        ReadingStatusData readingStatusData56 = new ReadingStatusData(bookManager54, readingProgressData55);
        ReadingStatusService readingStatusService57 = new ReadingStatusService(readingStatusData56);
        ReadingStatusRecord readingStatusRecord65 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord65.setStatus("");
        double double68 = readingStatusService57.calculateProgressPercent(readingStatusRecord65);
        java.lang.String str69 = readingStatusService29.determineStatus(readingStatusRecord65);
        ReadingStatusRecord readingStatusRecord77 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord77.setStatus("hi!");
        double double80 = readingStatusService29.calculateProgressPercent(readingStatusRecord77);
        ReadingStatusRecord readingStatusRecord88 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str89 = readingStatusRecord88.getStoredStatus();
        double double90 = readingStatusService29.calculateProgressPercent(readingStatusRecord88);
        java.lang.String str91 = readingStatusRecord88.getTitle();
        java.lang.String str92 = readingStatusRecord88.getGenre();
        java.lang.String str93 = readingStatusService3.determineStatus(readingStatusRecord88);
        java.util.Scanner scanner94 = null;
        ReadingStatusView readingStatusView95 = new ReadingStatusView(readingStatusService3, scanner94);
        java.util.Scanner scanner96 = null;
        ReadingStatusView readingStatusView97 = new ReadingStatusView(readingStatusService3, scanner96);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Unknown" + "'", str69, "Unknown");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 0.0d + "'", double80 == 0.0d);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.0d + "'", double90 == 0.0d);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Finished" + "'", str91, "Finished");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Finished" + "'", str92, "Finished");
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Unknown" + "'", str93, "Unknown");
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test733");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        java.util.Scanner scanner4 = null;
        ReadingStatusView readingStatusView5 = new ReadingStatusView(readingStatusService3, scanner4);
        ReadingStatusRecord readingStatusRecord13 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord13.setStatus("hi!");
        int int16 = readingStatusRecord13.getCurrentPage();
        int int17 = readingStatusRecord13.getCurrentPage();
        java.lang.String str18 = readingStatusRecord13.getTitle();
        java.lang.String str19 = readingStatusService3.determineStatus(readingStatusRecord13);
        ReadingStatusRecord readingStatusRecord27 = new ReadingStatusRecord("To Read", "To Read", "hi!", "Unknown", (int) ' ', (int) (short) 1, true);
        int int28 = readingStatusRecord27.getTotalPages();
        java.lang.String str29 = readingStatusRecord27.getAuthor();
        double double30 = readingStatusService3.calculateProgressPercent(readingStatusRecord27);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Finished" + "'", str18, "Finished");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Unknown" + "'", str19, "Unknown");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "To Read" + "'", str29, "To Read");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 3.125d + "'", double30 == 3.125d);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test734");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Finished", "Finished", "To Read", (int) ' ', (int) (byte) 10, true);
        java.lang.String str8 = readingStatusRecord7.getStatus();
        java.lang.String str9 = readingStatusRecord7.getGenre();
        java.lang.String str10 = readingStatusRecord7.getStoredStatus();
        java.lang.String str11 = readingStatusRecord7.getTitle();
        java.lang.String str12 = readingStatusRecord7.getStatus();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Unknown" + "'", str8, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Finished" + "'", str9, "Finished");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "To Read" + "'", str10, "To Read");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Unknown" + "'", str12, "Unknown");
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test735");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("", "Currently Reading", "", "", (int) (short) 0, 1, true);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        java.lang.String str9 = readingStatusRecord7.getGenre();
        boolean boolean10 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test736");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str8 = readingStatusRecord7.getTitle();
        boolean boolean9 = readingStatusRecord7.hasProgress();
        java.lang.String str10 = readingStatusRecord7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Finished" + "'", str8, "Finished");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Finished" + "'", str10, "Finished");
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test737");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        java.lang.String str7 = readingStatusService5.parseStatusText("hi!");
        java.lang.String str9 = readingStatusService5.parseStatusText("");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unknown" + "'", str7, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test738");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str55 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord63.setStatus("hi!");
        int int66 = readingStatusRecord63.getCurrentPage();
        int int67 = readingStatusRecord63.getTotalPages();
        int int68 = readingStatusRecord63.getTotalPages();
        double double69 = readingStatusService3.calculateProgressPercent(readingStatusRecord63);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = readingStatusService3.countBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test739");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.util.Scanner scanner40 = null;
        ReadingStatusView readingStatusView41 = new ReadingStatusView(readingStatusService3, scanner40);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList42 = readingStatusService3.viewAllBooks();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test740");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        ReadingStatusRecord readingStatusRecord51 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord51.setStatus("hi!");
        double double54 = readingStatusService3.calculateProgressPercent(readingStatusRecord51);
        ReadingStatusRecord readingStatusRecord62 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str63 = readingStatusRecord62.getStoredStatus();
        double double64 = readingStatusService3.calculateProgressPercent(readingStatusRecord62);
        java.util.Scanner scanner65 = null;
        ReadingStatusView readingStatusView66 = new ReadingStatusView(readingStatusService3, scanner65);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList68 = readingStatusService3.viewBooksByStatus("Unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.0d + "'", double64 == 0.0d);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test741");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.lang.String str27 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord35 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord35.setStatus("hi!");
        int int38 = readingStatusRecord35.getCurrentPage();
        int int39 = readingStatusRecord35.getTotalPages();
        int int40 = readingStatusRecord35.getTotalPages();
        java.lang.String str41 = readingStatusRecord35.getStatus();
        java.lang.String str42 = readingStatusRecord35.getStoredStatus();
        java.lang.String str43 = readingStatusRecord35.getGenre();
        java.lang.String str44 = readingStatusService3.determineStatus(readingStatusRecord35);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = readingStatusService3.countBooksByStatus("Currently Reading");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "To Read" + "'", str27, "To Read");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Finished" + "'", str43, "Finished");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Unknown" + "'", str44, "Unknown");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test742");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Unknown", "", "Currently Reading", "Finished", 10, 10, false);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test743");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord7.setStatus("hi!");
        int int10 = readingStatusRecord7.getCurrentPage();
        int int11 = readingStatusRecord7.getCurrentPage();
        int int12 = readingStatusRecord7.getCurrentPage();
        int int13 = readingStatusRecord7.getCurrentPage();
        java.lang.String str14 = readingStatusRecord7.getGenre();
        boolean boolean15 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Finished" + "'", str14, "Finished");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test744");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        readingStatusRecord7.setStatus("hi!");
        java.lang.String str11 = readingStatusRecord7.getGenre();
        boolean boolean12 = readingStatusRecord7.hasProgress();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test745");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("hi!", "Finished", "To Read", "", 0, (int) (short) 10, false);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test746");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Finished");
        java.lang.String str18 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord26 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str27 = readingStatusRecord26.getStatus();
        double double28 = readingStatusService3.calculateProgressPercent(readingStatusRecord26);
        ReadingStatusRecord readingStatusRecord36 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord36.setStatus("hi!");
        int int39 = readingStatusRecord36.getCurrentPage();
        java.lang.String str40 = readingStatusService3.determineStatus(readingStatusRecord36);
        java.lang.String str42 = readingStatusService3.parseStatusText("Currently Reading");
        ReadingStatusRecord readingStatusRecord50 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        boolean boolean51 = readingStatusRecord50.hasProgress();
        java.lang.String str52 = readingStatusRecord50.getAuthor();
        java.lang.String str53 = readingStatusRecord50.getAuthor();
        int int54 = readingStatusRecord50.getTotalPages();
        int int55 = readingStatusRecord50.getTotalPages();
        int int56 = readingStatusRecord50.getTotalPages();
        java.lang.String str57 = readingStatusService3.determineStatus(readingStatusRecord50);
        java.util.Scanner scanner58 = null;
        ReadingStatusView readingStatusView59 = new ReadingStatusView(readingStatusService3, scanner58);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Finished" + "'", str16, "Finished");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Currently Reading" + "'", str18, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Unknown" + "'", str27, "Unknown");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Unknown" + "'", str40, "Unknown");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Currently Reading" + "'", str42, "Currently Reading");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 10 + "'", int55 == 10);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 10 + "'", int56 == 10);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Finished" + "'", str57, "Finished");
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test747");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "Finished", "Finished", "Finished", (-1), 100, true);
        java.lang.String str8 = readingStatusRecord7.getAuthor();
        int int9 = readingStatusRecord7.getCurrentPage();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Finished" + "'", str8, "Finished");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test748");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        int int8 = readingStatusRecord7.getTotalPages();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test749");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        java.util.Scanner scanner38 = null;
        ReadingStatusView readingStatusView39 = new ReadingStatusView(readingStatusService3, scanner38);
        java.lang.String str41 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("hi!");
        int int52 = readingStatusRecord49.getCurrentPage();
        int int53 = readingStatusRecord49.getTotalPages();
        int int54 = readingStatusRecord49.getCurrentPage();
        double double55 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str57 = readingStatusService3.parseStatusText("");
        BookManager bookManager58 = null;
        ReadingProgressData readingProgressData59 = null;
        ReadingStatusData readingStatusData60 = new ReadingStatusData(bookManager58, readingProgressData59);
        ReadingStatusService readingStatusService61 = new ReadingStatusService(readingStatusData60);
        ReadingStatusRecord readingStatusRecord69 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord69.setStatus("");
        double double72 = readingStatusService61.calculateProgressPercent(readingStatusRecord69);
        ReadingStatusRecord readingStatusRecord80 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord80.setStatus("hi!");
        java.lang.String str83 = readingStatusService61.determineStatus(readingStatusRecord80);
        java.lang.String str84 = readingStatusService3.determineStatus(readingStatusRecord80);
        int int85 = readingStatusRecord80.getCurrentPage();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Unknown" + "'", str41, "Unknown");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.0d + "'", double55 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Unknown" + "'", str57, "Unknown");
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Unknown" + "'", str83, "Unknown");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Unknown" + "'", str84, "Unknown");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test750");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.util.Scanner scanner63 = null;
        ReadingStatusView readingStatusView64 = new ReadingStatusView(readingStatusService3, scanner63);
        ReadingStatusRecord readingStatusRecord72 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord72.setStatus("");
        java.lang.String str75 = readingStatusRecord72.getStoredStatus();
        java.lang.String str76 = readingStatusRecord72.getAuthor();
        java.lang.String str77 = readingStatusRecord72.getGenre();
        double double78 = readingStatusService3.calculateProgressPercent(readingStatusRecord72);
        ReadingStatusRecord readingStatusRecord86 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord86.setStatus("hi!");
        int int89 = readingStatusRecord86.getCurrentPage();
        int int90 = readingStatusRecord86.getTotalPages();
        int int91 = readingStatusRecord86.getTotalPages();
        java.lang.String str92 = readingStatusRecord86.getTitle();
        int int93 = readingStatusRecord86.getCurrentPage();
        java.lang.String str94 = readingStatusRecord86.getGenre();
        int int95 = readingStatusRecord86.getTotalPages();
        double double96 = readingStatusService3.calculateProgressPercent(readingStatusRecord86);
        boolean boolean97 = readingStatusRecord86.hasProgress();
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Finished" + "'", str76, "Finished");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Finished" + "'", str77, "Finished");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Finished" + "'", str92, "Finished");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Finished" + "'", str94, "Finished");
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 1 + "'", int95 == 1);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test751");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        BookManager bookManager28 = null;
        ReadingProgressData readingProgressData29 = null;
        ReadingStatusData readingStatusData30 = new ReadingStatusData(bookManager28, readingProgressData29);
        ReadingStatusService readingStatusService31 = new ReadingStatusService(readingStatusData30);
        ReadingStatusRecord readingStatusRecord39 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord39.setStatus("");
        double double42 = readingStatusService31.calculateProgressPercent(readingStatusRecord39);
        java.lang.String str43 = readingStatusService3.determineStatus(readingStatusRecord39);
        java.lang.String str45 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner46 = null;
        ReadingStatusView readingStatusView47 = new ReadingStatusView(readingStatusService3, scanner46);
        ReadingStatusRecord readingStatusRecord55 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        java.lang.String str56 = readingStatusRecord55.getStoredStatus();
        int int57 = readingStatusRecord55.getCurrentPage();
        java.lang.String str58 = readingStatusService3.determineStatus(readingStatusRecord55);
        ReadingStatusRecord readingStatusRecord66 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str67 = readingStatusRecord66.getAuthor();
        java.lang.String str68 = readingStatusRecord66.getStoredStatus();
        java.lang.String str69 = readingStatusRecord66.getStatus();
        java.lang.String str70 = readingStatusService3.determineStatus(readingStatusRecord66);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList72 = readingStatusService3.viewBooksByStatus("Currently Reading");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Unknown" + "'", str43, "Unknown");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Currently Reading" + "'", str45, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Unknown" + "'", str58, "Unknown");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Currently Reading" + "'", str67, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Finished" + "'", str68, "Finished");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Unknown" + "'", str69, "Unknown");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Finished" + "'", str70, "Finished");
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test752");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        java.lang.String str16 = readingStatusService3.parseStatusText("Currently Reading");
        java.util.Scanner scanner17 = null;
        ReadingStatusView readingStatusView18 = new ReadingStatusView(readingStatusService3, scanner17);
        BookManager bookManager19 = null;
        ReadingProgressData readingProgressData20 = null;
        ReadingStatusData readingStatusData21 = new ReadingStatusData(bookManager19, readingProgressData20);
        ReadingStatusService readingStatusService22 = new ReadingStatusService(readingStatusData21);
        ReadingStatusRecord readingStatusRecord30 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str31 = readingStatusRecord30.getTitle();
        boolean boolean32 = readingStatusRecord30.hasProgress();
        double double33 = readingStatusService22.calculateProgressPercent(readingStatusRecord30);
        readingStatusRecord30.setStatus("");
        java.lang.String str36 = readingStatusService3.determineStatus(readingStatusRecord30);
        java.util.Scanner scanner37 = null;
        ReadingStatusView readingStatusView38 = new ReadingStatusView(readingStatusService3, scanner37);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Currently Reading" + "'", str16, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Finished" + "'", str31, "Finished");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Unknown" + "'", str36, "Unknown");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test753");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        java.lang.String str55 = readingStatusService3.parseStatusText("");
        ReadingStatusRecord readingStatusRecord63 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord63.setStatus("hi!");
        int int66 = readingStatusRecord63.getCurrentPage();
        int int67 = readingStatusRecord63.getTotalPages();
        int int68 = readingStatusRecord63.getTotalPages();
        double double69 = readingStatusService3.calculateProgressPercent(readingStatusRecord63);
        java.util.Scanner scanner70 = null;
        ReadingStatusView readingStatusView71 = new ReadingStatusView(readingStatusService3, scanner70);
        java.util.Scanner scanner72 = null;
        ReadingStatusView readingStatusView73 = new ReadingStatusView(readingStatusService3, scanner72);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Unknown" + "'", str55, "Unknown");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 1 + "'", int68 == 1);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.0d + "'", double69 == 0.0d);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test754");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        BookManager bookManager38 = null;
        ReadingProgressData readingProgressData39 = null;
        ReadingStatusData readingStatusData40 = new ReadingStatusData(bookManager38, readingProgressData39);
        ReadingStatusService readingStatusService41 = new ReadingStatusService(readingStatusData40);
        ReadingStatusRecord readingStatusRecord49 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord49.setStatus("");
        double double52 = readingStatusService41.calculateProgressPercent(readingStatusRecord49);
        double double53 = readingStatusService3.calculateProgressPercent(readingStatusRecord49);
        ReadingStatusRecord readingStatusRecord61 = new ReadingStatusRecord("Currently Reading", "hi!", "Unknown", "", (int) (byte) 10, 100, true);
        java.lang.String str62 = readingStatusService3.determineStatus(readingStatusRecord61);
        java.util.Scanner scanner63 = null;
        ReadingStatusView readingStatusView64 = new ReadingStatusView(readingStatusService3, scanner63);
        java.lang.String str66 = readingStatusService3.parseStatusText("Unknown");
        ReadingStatusRecord readingStatusRecord74 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str75 = readingStatusRecord74.getTitle();
        java.lang.String str76 = readingStatusRecord74.getAuthor();
        java.lang.String str77 = readingStatusRecord74.getAuthor();
        double double78 = readingStatusService3.calculateProgressPercent(readingStatusRecord74);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord80 = readingStatusService3.viewBookDetails("To Read");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.0d + "'", double52 == 0.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.0d + "'", double53 == 0.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Finished" + "'", str62, "Finished");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Unknown" + "'", str66, "Unknown");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "Currently Reading" + "'", str76, "Currently Reading");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Currently Reading" + "'", str77, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.0d + "'", double78 == 0.0d);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test755");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService5 = new ReadingStatusService(readingStatusData2);
        java.lang.String str7 = readingStatusService5.parseStatusText("hi!");
        java.lang.String str9 = readingStatusService5.parseStatusText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList11 = readingStatusService5.viewBooksByStatus("Unknown");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Unknown" + "'", str7, "Unknown");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Unknown" + "'", str9, "Unknown");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test756");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusService readingStatusService4 = new ReadingStatusService(readingStatusData2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<ReadingStatusRecord> readingStatusRecordList6 = readingStatusService4.viewBooksByStatus("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test757");
        ReadingStatusRecord readingStatusRecord7 = new ReadingStatusRecord("Finished", "", "hi!", "", (int) (short) 10, (int) (short) 10, false);
        java.lang.String str8 = readingStatusRecord7.getGenre();
        readingStatusRecord7.setStatus("hi!");
        java.lang.String str11 = readingStatusRecord7.getTitle();
        java.lang.String str12 = readingStatusRecord7.getGenre();
        java.lang.String str13 = readingStatusRecord7.getAuthor();
        java.lang.String str14 = readingStatusRecord7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Finished" + "'", str11, "Finished");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test758");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("hi!");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        double double23 = readingStatusService3.calculateProgressPercent(readingStatusRecord22);
        java.lang.String str25 = readingStatusService3.parseStatusText("Finished");
        java.util.Scanner scanner26 = null;
        ReadingStatusView readingStatusView27 = new ReadingStatusView(readingStatusService3, scanner26);
        ReadingStatusRecord readingStatusRecord35 = new ReadingStatusRecord("Finished", "Currently Reading", "", "To Read", (int) (byte) -1, (int) 'a', true);
        int int36 = readingStatusRecord35.getTotalPages();
        int int37 = readingStatusRecord35.getTotalPages();
        int int38 = readingStatusRecord35.getCurrentPage();
        java.lang.String str39 = readingStatusService3.determineStatus(readingStatusRecord35);
        // The following exception was thrown during execution in test generation
        try {
            ReadingStatusRecord readingStatusRecord41 = readingStatusService3.viewBookDetails("Currently Reading");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"BookManager.getAllBooks()\" because \"this.bookManager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Finished" + "'", str25, "Finished");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "To Read" + "'", str39, "To Read");
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ReadingStatusRegression1.test759");
        BookManager bookManager0 = null;
        ReadingProgressData readingProgressData1 = null;
        ReadingStatusData readingStatusData2 = new ReadingStatusData(bookManager0, readingProgressData1);
        ReadingStatusService readingStatusService3 = new ReadingStatusService(readingStatusData2);
        ReadingStatusRecord readingStatusRecord11 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord11.setStatus("");
        double double14 = readingStatusService3.calculateProgressPercent(readingStatusRecord11);
        ReadingStatusRecord readingStatusRecord22 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord22.setStatus("hi!");
        java.lang.String str25 = readingStatusService3.determineStatus(readingStatusRecord22);
        ReadingStatusRecord readingStatusRecord33 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str34 = readingStatusRecord33.getAuthor();
        double double35 = readingStatusService3.calculateProgressPercent(readingStatusRecord33);
        java.lang.String str37 = readingStatusService3.parseStatusText("To Read");
        ReadingStatusRecord readingStatusRecord45 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str46 = readingStatusRecord45.getTitle();
        double double47 = readingStatusService3.calculateProgressPercent(readingStatusRecord45);
        java.util.Scanner scanner48 = null;
        ReadingStatusView readingStatusView49 = new ReadingStatusView(readingStatusService3, scanner48);
        java.lang.String str51 = readingStatusService3.parseStatusText("hi!");
        ReadingStatusRecord readingStatusRecord59 = new ReadingStatusRecord("To Read", "", "Unknown", "To Read", (int) (byte) 0, (int) (byte) 10, false);
        java.lang.String str60 = readingStatusService3.determineStatus(readingStatusRecord59);
        BookManager bookManager61 = null;
        ReadingProgressData readingProgressData62 = null;
        ReadingStatusData readingStatusData63 = new ReadingStatusData(bookManager61, readingProgressData62);
        ReadingStatusService readingStatusService64 = new ReadingStatusService(readingStatusData63);
        ReadingStatusRecord readingStatusRecord72 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord72.setStatus("");
        double double75 = readingStatusService64.calculateProgressPercent(readingStatusRecord72);
        ReadingStatusRecord readingStatusRecord83 = new ReadingStatusRecord("Finished", "Finished", "Finished", "", 1, 0, false);
        readingStatusRecord83.setStatus("hi!");
        java.lang.String str86 = readingStatusService64.determineStatus(readingStatusRecord83);
        ReadingStatusRecord readingStatusRecord94 = new ReadingStatusRecord("hi!", "Currently Reading", "Unknown", "Finished", (-1), (int) (byte) 100, true);
        java.lang.String str95 = readingStatusRecord94.getAuthor();
        double double96 = readingStatusService64.calculateProgressPercent(readingStatusRecord94);
        java.lang.String str97 = readingStatusRecord94.getGenre();
        java.lang.String str98 = readingStatusRecord94.getStoredStatus();
        java.lang.String str99 = readingStatusService3.determineStatus(readingStatusRecord94);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Unknown" + "'", str25, "Unknown");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Currently Reading" + "'", str34, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "To Read" + "'", str37, "To Read");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "To Read" + "'", str46, "To Read");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Unknown" + "'", str51, "Unknown");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "To Read" + "'", str60, "To Read");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "Unknown" + "'", str86, "Unknown");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "Currently Reading" + "'", str95, "Currently Reading");
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "Unknown" + "'", str97, "Unknown");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "Finished" + "'", str98, "Finished");
        org.junit.Assert.assertEquals("'" + str99 + "' != '" + "Finished" + "'", str99, "Finished");
    }
}

