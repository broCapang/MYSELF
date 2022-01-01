package exercises.tutorial8;

public class Connection {
    private static int connection=0;
    private String connectionName;
    public Connection(){
        this.connectionName="noname";
        connection+=1;
    }
    public Connection(String connectionName) {
        this.connectionName = connectionName;
        connection+=1;
    }

    public int getConnection() {
        return connection;
    }
}
