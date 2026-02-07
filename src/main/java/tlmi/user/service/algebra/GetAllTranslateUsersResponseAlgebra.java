package tlmi.user.service.algebra;

import ac4y.service.domain.Ac4yServiceResponse;
import tlmi.user.domain.TlmiTranslateUser;

import java.util.List;

public class GetAllTranslateUsersResponseAlgebra extends Ac4yServiceResponse {

    public List<TlmiTranslateUser> getList() {
        return list;
    }

    public void setList(List<TlmiTranslateUser> list) {
        this.list = list;
    }

    public List<TlmiTranslateUser> list;

}
