/**
 * @author mlehma2s
 */
package uebung2.factory;

import uebung2.control.User;

public class UserFactory {
    public UserFactory(){

    }

    public User createNewUser(){
        User user = new User();
        int userid = user.getUserid(1);
        user.setFirstName("Peter");
        user.setLastName("Lachmann");
        user.setEmail("p.lachmann@web.de");
        user.setPassword("istbloed1234");
        return user;
    }
}
