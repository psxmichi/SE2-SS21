/**
 * @author mlehma2s
 */
package uebung2;

// import java.sql.Date;
import java.util.Objects;

public class User implements UserDTO {
    private int userid;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public User() {
    }

    public User(int userid, String firstName, String lastName, String email, String password) {
        this.userid = userid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userid == user.userid &&
                Objects.equals(email, user.email) &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userid, email, firstName, lastName,  password, userid);
    }

    public int getUserid(int uid) {
        this.userid = uid;
        return uid;
    }

    public String getFirstName(String fn) {
        this.firstName = fn;
        return fn;
    }

    public String getLastName(String ln) {
        this.lastName = ln;
        return ln;
    }


    public String getEmail(String email) {
        this.email = email;
        return email;
    }

    public String getPassword(String pwd) {
        this.password = pwd;
        return pwd;
    }
}

