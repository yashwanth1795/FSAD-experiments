# FSAD Experiment 14 - User Authentication & Session Management

Full-stack application with React frontend and Spring Boot backend for user authentication.

## Frontend (React)

- Register: Create new user account
- Login: Authenticate user and store in localStorage
- Home: Protected page for logged-in users
- Profile: Display user details fetched from backend
- Logout: Clear session and redirect to login

## Backend (Spring Boot)

- POST /auth/register: Register new user
- POST /auth/login: Login user
- GET /auth/profile/{id}: Get user profile

## Run

### Backend
```bash
cd backend
./mvnw spring-boot:run
```

### Frontend
```bash
cd frontend
npm install
npm run dev
```

Frontend runs on http://localhost:5173, backend on http://localhost:8080.
