import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class StringConcatServer implements Remote {

    public String concatenateStrings(String str1, String str2) throws RemoteException {
        return str1 + str2;
    }

    public static void main(String[] args) {
        try {
            // Start RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Create the server object
            StringConcatServer obj = new StringConcatServer();

            // Bind the object to the RMI registry
            Naming.rebind("StringConcatService", obj);

            System.out.println("Server is ready.");
        } catch (Exception e) {
            System.out.println("Server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
