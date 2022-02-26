package ma.education.tp2.reflection;

public class ConnectionDB {
    //ATTRIBUTS
    String url;
    String user;
    String password;
    public ConnectionDB () {

    }
    public ConnectionDB (String url,String user,String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }
}
