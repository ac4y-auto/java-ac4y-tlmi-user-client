# java-ac4y-tlmi-user-client

TLMI user service client with typed request/response DTOs and algebra layer.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-tlmi-user-client`
- **Version**: `1.0.0`

## Description

Client library for the TLMI user service providing typed request/response DTOs with algebra abstractions. Supports operations: get by ID, get by name, get all, insert user, and existence check.

### Key Classes

- `TlmiUserServiceClient` - HTTP client for TLMI user service
- `GetTranslateUserByIdRequest/Response` - Get user by ID
- `GetTranslateUserByNameRequest/Response` - Get user by name
- `GetAllTranslateUsersResponse` - Get all users response
- `InsertUserRequest/Response` - Insert user
- Algebra layer: `ByIdRequestAlgebra`, `ExistsByIdRequestAlgebra`, etc.

## Dependencies

- `ac4y-tlmi-user-domain` (TlmiTranslateUser)
- `ac4y-service-domain` (service framework)
- `com.google.code.gson:gson` (JSON)

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJTlmiModule/IJTlmiUserClient`.
