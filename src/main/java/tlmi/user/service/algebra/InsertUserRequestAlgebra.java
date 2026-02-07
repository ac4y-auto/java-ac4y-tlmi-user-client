package tlmi.user.service.algebra;

import tlmi.user.domain.TlmiTranslateUser;

public class InsertUserRequestAlgebra {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public TlmiTranslateUser getUser() {
        return user;
    }

    public void setUser(TlmiTranslateUser user) {
        this.user = user;
    }

    TlmiTranslateUser user;

}
