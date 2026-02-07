package tlmi.user.service.algebra;

import ac4y.service.domain.Ac4yServiceResponse;
import tlmi.user.domain.TlmiTranslateUser;

public class GetTranslateUserByNameResponseAlgebra extends Ac4yServiceResponse {

    public TlmiTranslateUser getObject() {
        return object;
    }

    public void setObject(TlmiTranslateUser object) {
        this.object = object;
    }

    TlmiTranslateUser object;

}
