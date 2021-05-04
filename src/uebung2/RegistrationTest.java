package uebung2;

public class RegistrationTest {
    User user = new UserBuilder()
                .withUserid(1)
                .withFirstName("Peter")
                .withLastName("Lauch")
                .withEmail("bestemail@gmx.de")
                .withPassword("1234")
                .build();

}
