public class DbConnection {
    private static DbConnection dbConnection =null;

    private DbConnection() {
    }
    public static DbConnection getInstance(){
        synchronized (DbConnection.class) {
            if (dbConnection == null) {
                dbConnection = new DbConnection();
                return dbConnection;
            } else {
                return dbConnection;
            }
        }
    }

//lazy -> memory is better ->slower//on run -> memory worse -> faster
}
