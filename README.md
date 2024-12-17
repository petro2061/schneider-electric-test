# schneider-electric-test
Описати алгоритм роботи за допомогою основних логічних операцій та арифметичних операцій.


Ви розробляєте процес, за допомогою якого бак має бути заповнений за допомогою насоса (P) і
клапана (V1).
Вам також буде потрібен зливний клапан (V2) рівень аналоговий (LT1).

Ви повинні гарантувати такі функціональні умови:
* Насос може працювати тільки при відкритому наливному клапані
* Насос вмикається при рівні 30% та вимикається при рівні 100%
* Завдання насоса P1 FC - різниця між верхньою границею рівня та актуальним значенням
* Заправний клапан (V1) і зливний клапан (V2) не повинні бути відкриті одночасно
* Зливний клапан (V2) відкривається по кнопці
