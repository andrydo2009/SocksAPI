# OnlineStoreOfSocks
Реализовано веб-приложение, с помощью которого склад может учитывать и автоматизировать учет товаров на складе интернет-магазина носков. 

#Пользователь (работник склада) имеет возможность:

- учитывать приход и отпуск носков;
- узнать общее количество носков определенного цвета и состава в данный момент времени;
- дополнительно иметь возможность парсить (читать и преобразовывать данные) файлы с данными по товару.

#Внешний интерфейс приложения представлен в виде REST API.

#Товар имеет следующие характеристики: 

- цвет носков, 
- размер носков
- состав носков,
- наличие на складе.

- Веб-приложение выполнено в виде RESTful-сервиса.
- Веб-приложение основано на Spring(Boot) Framework.
- Написаны  CRUD-методы :
    - POST — на склад можно добавить новый товар;
    - PUT — можно забрать товар со склада;
    - GET — можно получить данные о товаре на складке: общее количество и данные по составу;
    - DELETE — со склада можно списать бракованный товар.
- Все CRUD-методы работают и возвращают значения согласно описанию функционала выше.
- Отработаны ошибки при некорректно введенных данных.
- В качестве UI-части приложения используется API-клиент (Swagger-ui).

# Проект реализован при помощи технологий: 
Spring framework, Maven, REST API, Swagger,Lombook,GoogleCodeGson,GoggleCodeJsonSimple.

# Проект написан на языке Java 17