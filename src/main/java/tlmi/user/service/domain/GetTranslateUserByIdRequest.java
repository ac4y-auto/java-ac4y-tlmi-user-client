package tlmi.user.service.domain;

import tlmi.user.service.algebra.GetTranslateUserByIdRequestAlgebra;

public class GetTranslateUserByIdRequest extends GetTranslateUserByIdRequestAlgebra {

    public GetTranslateUserByIdRequest(int id){

        setId(id);
    }

}
