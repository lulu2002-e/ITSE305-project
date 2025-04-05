package org.example;

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
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.listAppointments();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.getAppointments()\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '4', "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) -1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        java.lang.Class<?> wildcardClass2 = appointmentBL1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(100, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) -1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) 'a', "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 100, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '4', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) ' ', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 100, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) ' ', "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) -1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) -1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("hi!", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) 'a', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(10, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) -1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) 'a', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "hi!", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 10, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) -1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(10, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.bookAppointment("", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.addAppointment(org.example.AppointmentDL)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '4', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 10, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 100, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((-1), "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((-1), "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(10, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) -1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(100, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.cancelAppointment((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) ' ', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 10, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '#', "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) -1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '4', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 0, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(100, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((-1), "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 10, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 100, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) 'a', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 100, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '#', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((-1), "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '#', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 10, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 100, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 10, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) '#', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) ' ', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (byte) 0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(1, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment((int) (short) 0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.example.Database database0 = null;
        org.example.AppointmentBL appointmentBL1 = new org.example.AppointmentBL(database0);
        // The following exception was thrown during execution in test generation
        try {
            appointmentBL1.rescheduleAppointment(1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"org.example.Database.findAppointmentById(int)\" because \"this.database\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

