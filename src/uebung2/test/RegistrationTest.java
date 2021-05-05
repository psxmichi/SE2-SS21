/**
 * @author mlehma2s
 */
package uebung2.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uebung2.control.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistrationTest {

    private User user = new User();

    @BeforeEach
    void setUp() {
        this.user = new User();
    }

    @Test
    void addUser(){
        assertEquals(1, this.user.getUserid(1));
        assertEquals("Peter", user.getFirstName("Peter"));
        assertEquals("Peter", user.getLastName("Peter"));
        assertEquals("mail@googlemail.com", user.getEmail("mail@googlemail.com"));
        assertEquals("passwort", user.getPassword("passwort"));
    }


    User us2 = new UserBuilder()
                .withUserid(1)
                .withFirstName("Peter")
                .withLastName("Lauch")
                .withEmail("bestemail@gmx.de")
                .withPassword("1234")
                .build();

}
