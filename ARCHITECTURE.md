# Architektura - java-ac4y-tlmi-user-client

## Attekintes

TLMI felhasznalo szolgaltatas kliens tipusos keres/valasz DTO-kkal es algebra reteggel.

## Szerkezet

```
src/main/java/tlmi/user/service/
  algebra/
    ByIdRequestAlgebra.java                     - ID alapu keres algebra
    ExistsByIdRequestAlgebra.java               - Letezik-e ID alapu keres algebra
    GetAllTranslateUsersResponseAlgebra.java    - Osszes felhasznalo valasz algebra
    GetTranslateUserByIdRequestAlgebra.java     - ID alapu lekerdezes algebra
    GetTranslateUserByIdResponseAlgebra.java    - ID alapu valasz algebra
    GetTranslateUserByNameRequestAlgebra.java   - Nev alapu lekerdezes algebra
    GetTranslateUserByNameResponseAlgebra.java  - Nev alapu valasz algebra
    InsertUserRequestAlgebra.java               - Felhasznalo beszuras keres algebra
    InsertUserResponseAlgebra.java              - Felhasznalo beszuras valasz algebra
  client/
    TlmiUserServiceClient.java                  - HTTP kliens a TLMI felhasznalo szolgaltatashoz
  domain/
    GetAllTranslateUsersResponse.java           - Osszes felhasznalo valasz
    GetTranslateUserByIdRequest.java            - ID alapu lekerdezes
    GetTranslateUserByIdResponse.java           - ID alapu valasz
    GetTranslateUserByNameRequest.java          - Nev alapu lekerdezes
    GetTranslateUserByNameResponse.java         - Nev alapu valasz
    InsertUserRequest.java                      - Felhasznalo beszuras keres
    InsertUserResponse.java                     - Felhasznalo beszuras valasz
```

## Fuggosegek

- ac4y-tlmi-user-domain (TlmiTranslateUser)
- ac4y-service-domain (szolgaltatas keretrendszer)
- com.google.code.gson:gson (JSON)

## Eredet

Az `IJTlmiModule/IJTlmiUserClient` modulbol kinyerve.
