# Java-santander-dev-week-2023
- Java RESTFul API criada para Santander dev week 2023


| Estudos    | Java                                                |
|------------|-----------------------------------------------------|
| Módulo     | Explorando Padrões de Projetos na Prática com Java  |
| Bootcamp   | Santander Bootcamp 2023 - Fullstack Java+Angular    |
| Com        | Venilton FalvoJr - @falvojr                         |
| Plataforma | DIO                                                 |

## Diagrama de classes

```mermaid
classDiagram
  class User {
    -String name
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
```

### Tecnologias utilizadas:

<div>
  <img align="center" alt="diva-Java" height="30" width="40" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg">
  <img align="center" alt="SpringBoot" height="25" width="25" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" />
</div>


