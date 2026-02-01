# BDD with Cucumber (Java)
## Java
It's a free Course from Cucumber School available in [https://school.cucumber.io/courses/bdd-with-cucumber-java](https://school.cucumber.io/courses/bdd-with-cucumber-java)

### Executando cucumber com Java puro
Entre no diretório:
```bash
cd java
```

Execute os testes:
```bash
mvn clean test
```

O relatório em HTML so testes fica em: `java/target/cucumber-html-report/index.html`

## Spring
### Executando cucumber com Spring
Entre no diretório:
```bash
cd spring
```

Inicie a aplicação:
```bash
mvn spring-boot:run
```

Em outro terminal, execute os testes:
```bash
mvn test
```

> No intellij basta ter o plugin [cucumber for java](https://plugins.jetbrains.com/plugin/7212-cucumber-for-java) e [Gherkin](https://plugins.jetbrains.com/plugin/9164-gherkin). Clique com o mouse com o botão direito do mouse no arquivo `src/test/resources/feature/version.feature` > Run

O relatório em HTML dos testes fica em `./spring/target/cucumber-report.html`
