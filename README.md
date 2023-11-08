# [SE] Тестовое задание
## Стек технологий:
- Java
- JUnit 5
- RestAssured
- Maven
- Selenide
- Lombok
## Описание проекта
В этом проекте я выполнил API-автотесты для сайта "Swagger PetStore" (https://petstore.swagger.io/), которые включают в себя: 
создание, удаление, поиск обновление информации о питомце. Также, выполнены UI-автотесты для сайтов
"Basic Calculator" (https://testsheepnz.github.io/BasicCalculator.html) и "Random Number" (https://testsheepnz.github.io/random-number.html ), 
которые соответствуют 3 кейсам тестового задания:
- Кейс 1 Разница двух целых чисел
- Кейс 2 Конкатенация двух строк
- Кейс 3 Появление сообщения при вводе строки в поле
## Структура проекта
- `src/main/java/pages` - Классы-страницы PageObject для сайтов Basic Calculator и Random Number
- `test/java/BasicCalculatorAndRandomNumber` - Классы соответствующие 3 кейсам UI-автотестов для сайтов "Basic Calculator" и "Random Number"
- `test/java/SwaggerPetStore` - Классы API-автотестов для сайта "Swagger PetStore"
- `test/java/SwaggerPetStore/DTO` - DTO-классы для работы с сайтом "Swagger PetStore"
## Запуск тестов
`mvn test`