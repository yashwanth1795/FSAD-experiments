# FSAD Experiment 5 - Spring Autowiring Demo

Demonstrates @Autowired annotation for dependency injection.

## Classes

- Certification: Component with certification details
- Student: Component with @Autowired Certification
- AppConfig: @Configuration with @ComponentScan
- MainApplication: Loads context and prints Student

## Run

```bash
mvn compile exec:java -Dexec.mainClass="com.example.fsadexperiment5.MainApplication"
```
