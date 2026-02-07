package tlmi.user.service.domain;

import tlmi.user.service.algebra.GetTranslateUserByNameRequestAlgebra;

public class GetTranslateUserByNameRequest extends GetTranslateUserByNameRequestAlgebra {

    public GetTranslateUserByNameRequest(String name){

        setName(name);
    }

}
