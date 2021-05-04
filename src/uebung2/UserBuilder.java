/**
 * @author mlehma2s
 */
package uebung2;

public class UserBuilder {
    int userid = 1;
    String firstName = "Hans";
    String lastName = "Petersen";
    String email = "bla@gmail.com";
    String password = "test1234";

    public UserBuilder(){

    }
    public UserBuilder withUserid(int userid){
        this.userid = userid;
        return this;
    }

    public UserBuilder withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withEmail(String email){
        this.email = email;
        return this;
    }

    public UserBuilder withPassword(String password){
        this.password = password;
        return this;
    }

    public User build(){
        return new User(userid, firstName, lastName, email, password);
    }

}
