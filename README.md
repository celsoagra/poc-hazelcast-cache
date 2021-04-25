# POC Hazelcast Cache Example

## getting started

type to initialize the application:

```
mvnw spring-boot:run
```

## Tests

tests can be done just calling the following APIs:

* `http://localhost:8080/with-cache`
* `http://localhost:8080/without-cache`

The first one will use cache after the first request, and second one will retrieve info from database.

#### References

* https://reflectoring.io/spring-boot-cache/
* https://start.spring.io/
* https://www.h2database.com/html/commands.html
* http://h2-database.66688.n3.nabble.com/SELECT-Triggers-Not-Firing-td4025694.html
* https://stackoverflow.com/questions/29993308/h2-how-to-create-a-database-trigger-that-log-a-row-change-to-another-table
