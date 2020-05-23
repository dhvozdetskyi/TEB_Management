package entity;

/**
 * Created by d.hvozdetskyi on 2020-05-10.
 */
public class User {
    public final static String USER_SEPARATOR = "#";
    private Long id;
    private String login;
    private String password;
    public User(Long id, String login, String password){
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public Long getID(){
        return id;
    }
    public String getLogin(){
        return login;
    }
    public String getPassword(){
        return password;
    }

    public String toString(){
        return "Object User: id = " + getID() + " login = " + getLogin() + " password = " + getPassword();
    }

}
