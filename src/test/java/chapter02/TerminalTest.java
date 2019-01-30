package chapter02;

import org.junit.*;

import static org.junit.Assert.*;

public class TerminalTest {
    private static Terminal terminal;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        terminal = new Terminal();
        terminal.netConnect();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        terminal.netDisconnect();
    }

    @Before
    public void setUp() {
        terminal.logon("guest", "guest");
    }

    @After
    public void tearDown() {
        terminal.logoff("guest", "guest");
    }

    @Test
    public void testTerminalConnected() throws Exception {
        assertTrue(terminal.isLogon());
        System.out.println("== logon test");
    }

    @Test
    public void testGetReturnMessage() throws Exception {
        terminal.senMessage("hello");
        assertEquals("world", terminal.getReturnMessage());
        System.out.println("== message test");
    }

}