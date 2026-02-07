package tlmi.user.service.client;

import ac4y.service.adapter.Ac4yRestServiceClient;
import ac4y.service.domain.Ac4yProcessResult;
import ac4y.service.domain.Ac4yServiceResponse;
import com.google.gson.Gson;
import tlmi.user.service.domain.*;

import java.io.IOException;

public class TlmiUserServiceClient {

    public TlmiUserServiceClient(String host) {
        this.setHost(host);
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    protected String host;

    public GetAllTranslateUsersResponse getAllTranslateUsers() {
/*
        GetAllTranslateUsersResponse getAllTranslateUsersResponse = new GetAllTranslateUsersResponse();
        getAllTranslateUsersResponse.setResult(new Ac4yProcessResult());
        getAllTranslateUsersResponse.getResult().setCode(0);
        return getAllTranslateUsersResponse;
        System.out.print(new Ac4yRestServiceClient().request(this.getHost()+"/user/translateuser", "GET", null));

*/

        try {
            return (GetAllTranslateUsersResponse) new Gson().fromJson(
                    new Ac4yRestServiceClient().request(this.getHost()+"/user/translateuser", "GET", null)
                    ,GetAllTranslateUsersResponse.class
            );
        } catch (IOException exception) {
            return (GetAllTranslateUsersResponse) new GetAllTranslateUsersResponse().error(new Ac4yRestServiceClient().getStackTraceAsString(exception));
        }

    } // getAllTranslateUsersResponse

    public GetTranslateUserByIdResponse getTranslateUserById(GetTranslateUserByIdRequest request) {

        try {
            return (GetTranslateUserByIdResponse) new Gson().fromJson(
                    new Ac4yRestServiceClient().request(this.getHost()+"/user/translateuser/"+request.getId(),"GET", null)
                    ,GetTranslateUserByIdResponse.class
            );
        } catch (IOException exception) {
            return (GetTranslateUserByIdResponse) new GetTranslateUserByIdResponse().error(new Ac4yRestServiceClient().getStackTraceAsString(exception));
        }

    } // getTranslateUserById

    public GetTranslateUserByNameResponse getTranslateUserByName(GetTranslateUserByNameRequest request) {

        try {
            return (GetTranslateUserByNameResponse) new Gson().fromJson(
                    new Ac4yRestServiceClient().request(
                            this.getHost()+"/user/translateuser/byname/"+request.getName()
                            ,"GET"
                            , null
                    )
                    ,GetTranslateUserByNameResponse.class
            );
        } catch (IOException exception) {
            return (GetTranslateUserByNameResponse) new GetTranslateUserByNameResponse().error(new Ac4yRestServiceClient().getStackTraceAsString(exception));
        }

    } // getTranslateUserByName

    public InsertUserResponse insertUser(InsertUserRequest request) {

        System.out.println("insertUser.request:"+new Gson().toJson(request));

        try {
            return (InsertUserResponse) new Gson().fromJson(
                    new Ac4yRestServiceClient().request(
                            this.getHost()+"/user/translateuser"
                            ,"POST"
                            , new Gson().toJson(request.getUser())
                    )
                    ,InsertUserResponse.class
            );
        } catch (IOException exception) {
            return (InsertUserResponse) new InsertUserResponse().error(new Ac4yRestServiceClient().getStackTraceAsString(exception));
        }

    } // insertUser

} // TlmiUserServiceClient
