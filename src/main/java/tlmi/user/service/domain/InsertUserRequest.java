package tlmi.user.service.domain;

import tlmi.user.domain.TlmiTranslateUser;
import tlmi.user.service.algebra.InsertUserRequestAlgebra;

public class InsertUserRequest extends InsertUserRequestAlgebra {

    public InsertUserRequest(String name){

        setName(name);
    }

    public InsertUserRequest(TlmiTranslateUser user){

        setUser(user);
    }

}
