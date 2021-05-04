package uebung2;

import java.util.List;

public class RegistrationControl {
    public RegistrationResult registerUser(UserDTO user){
        User us = new User();
        us.setUserid(user.getUserid());
        us.setFirstName(user.getFirstName());
        us.setLastName(user.getLastName());
        us.setEmail(user.getEmail());
        us.setPassword(user.getPassword());
        RegistrationResult regresult = new RegistrationResult();

        boolean erg = regresult.result;
            if(us.getUserid() == 0) {
            erg = false;
            }
                else if(us.getFirstName() == null || us.getLastName() == null) {
                erg = false;
                }
                    else if(us.getEmail() == null || us.getPassword() == null){
                        erg = false;
                    }
                        else {
                            erg = true;
                        }
        regresult.result = erg;
     return regresult;
    }

}
