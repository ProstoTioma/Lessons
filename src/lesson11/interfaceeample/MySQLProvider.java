package lesson11.interfaceeample;

public class MySQLProvider implements DbProvider {

    @Override
    public void connectToDb() {
        //some logic for mysql
    }

    @Override
    public void disconnectFromDb() {
        //some logic for mysql
    }

    @Override
    public void encryptData() {
        ///some logic for mysql
    }
}
