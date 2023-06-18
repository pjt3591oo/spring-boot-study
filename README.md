# Getting Started
asdf
### env

```bash
$ export DB_URL=jdbc:mysql://localhost:3306/test
$ export DB_USERNAME=root
$ export DB_PASSWORD=password
```

###

```bash
$ ./gradlew bootRun --args='--spring.profiles.active=prod'

$ ./gradlew bootRun --args='--spring.profiles.active=dev'
```

```bash
$ ./gradlew build
```

```bash
$ java -jar *.jar --args='--spring.profiles.active=prod'

$ java -jar *.jar --args='--spring.profiles.active=dev'

```