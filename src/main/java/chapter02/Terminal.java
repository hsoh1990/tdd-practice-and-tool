package chapter02;

public class Terminal {

    public void netConnect() {
        System.out.println("Network is established");
    }

    public void netDisconnect() {
        System.out.println("Network is disconnected");
    }

    public void logon(String id, String pw) {
        System.out.println(">> logon "+ id + ":" + pw);
    }

    public void logoff(String id, String pw) {
        System.out.println(">> logoff "+ id + ":" + pw);
    }

    public boolean isLogon() {
        return true;
    }

    public void senMessage(String hello) {
        return;
    }

    public String getReturnMessage() {
        return "world";
    }
}
