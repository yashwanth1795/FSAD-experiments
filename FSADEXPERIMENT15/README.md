# FSAD Experiment 15 - JWT-Based Authentication & Role Authorization

Spring Boot backend with JWT authentication and role-based access control.

## Features

- User registration and login with JWT tokens
- Roles: ADMIN, EMPLOYEE
- Secured endpoints:
  - /admin/add (ADMIN only)
  - /admin/delete (ADMIN only)
  - /employee/profile (EMPLOYEE only)

## Run

```bash
./mvnw spring-boot:run
```

## Test with Postman

1. Register users with roles
2. Login to get JWT token
3. Use token in Authorization header: Bearer <token>
4. Test secured endpoints

H2 Console: http://localhost:8080/h2-console
