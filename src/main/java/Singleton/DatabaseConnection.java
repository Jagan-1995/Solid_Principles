package Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance = null;

//    Lock lock;

    String dbUrl;
    String userName;
    String password;

    // Double check locking
    public static DatabaseConnection getInstance(){ // Lock lock
        if (instance == null){
            synchronized (DatabaseConnection.class){  // lock.lock();
                if (instance == null){
                    instance = new DatabaseConnection();
                }
            }  // lock.unlock();
        }
        return instance;
    }

    private DatabaseConnection(){

    }
}
