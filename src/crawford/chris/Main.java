package crawford.chris;

import org.virtualbox_5_1.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        VirtualBoxManager mgr = VirtualBoxManager.createInstance(null);
        boolean ws = true; // or true, if we need the SOAP version

        if (ws) {
            String url = "http://localhost:18083";
            //String user = "test";
            //String passwd = "test";
            String user = null;
            String passwd = null;
            mgr.connect(url, user, passwd);
        }

        IVirtualBox vbox = mgr.getVBox();
        System.out.println("VirtualBox version: " + vbox.getVersion() + "\n");

        // get first VM name
        //String m = vbox.getMachines().get(0).getName();
        //System.out.println("\nAttempting to start VM ’" + m + "’");
        List<IMachine> l = vbox.getMachines();

        // start it
        //mgr.startVm(m, null, 7000);
        if (ws) {
            mgr.disconnect();
        }
        mgr.cleanup();
    }
}
