package pattern.creational.singleton;

public class DBConnection {
    private static volatile DBConnection DBConnectionObject;
    private DBConnection() {
        System.out.println(Thread.currentThread().getName() + " " + this);
    }

    public static synchronized DBConnection getDBConnection() {
        if (DBConnectionObject == null)
            DBConnectionObject = new DBConnection();
        return DBConnectionObject;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
}
