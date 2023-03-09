
## Executa Todos os Testes (Unitarios e Integrados)

```sh
mvn clean verify
```

## Executa Somente Testes Integrados

```sh
mvn clean verify -DskipTests
```

## Executa Somente Testes Unitarios

```sh
mvn clean verify -DskipITs
```