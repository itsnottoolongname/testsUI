

после установки проверить что установка была сделана корректно с помощью команд в терминале:

java -version

mvn -version

должны отобразиться версии установленных пакетов

для запуска тестов в терминале перейти в папку frontredrtack и написать:
mvn -Dtest=НазваниеКлассаСТестом test

список классов с тестами можно найти в проекте frontredrtack/src/test/java/io/redtrack/app/tests

Если будет ошибка driver is not executable чинится командой chmod a+x frontredrtack/src/Drivers/Chrome (команда для мака)


Лог с результатами прохождения тестов пишется в frontredrtack/Log.log
