# FSAD Experiment 8 - Spring Boot JPQL & Query Methods

Product search module with JPA queries.

## Endpoints

- GET /products/category/{category} - Find by category
- GET /products/filter?min=100&max=1000 - Price range
- GET /products/sorted - Sorted by price
- GET /products/expensive/500 - Above price

## Sample Data

- Electronics: Laptop (1200), Phone (800), Tablet (600)
- Clothing: Shirt (50), Pants (70)
- Books: Book (20)

## Run

```bash
./mvnw spring-boot:run
```

H2 Console: http://localhost:8080/h2-console
