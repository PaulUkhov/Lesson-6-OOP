  * 1. Первый принцип - Прнпцип ед.ответственности! Нельзя помещать несколько зон ответственности в одном классе
  Поэтому мы разделяем код на пакеты в частности controller, data, service, view
  По сути в моем понимании это MVC - Модель представления контроллер
  * 2. Второй принцип - Принцип открытия и закрытия! Класс открыт для разширения, но закрыт для модификации
  Суть в том что бы можно было создавать по необходимости новый класс и имплементировать оттуда новый метод, а не изменять или дополнять старый метод
  делается путем создания интерфейса в этом коде, принцип прослеживается в Pakcage: service, view и controller
  * 3. Третий принцип - Принцип подстановки Бабары Линков.
  В котором код может наследоваться не только от родительского класса, но и от другого наследника родительского класса
  Либо заранее продумывать код в родительском классе так что бы методы были корректными,а в подклассах дополнялись собственными по необходимости
  В данном коде этому принципу характерно то что в подсклассах наследниках Teacher и Student есть методы которые присущи только им, а именно getTeacherId() и getStudentId()
  * 4. Четвертый принцип - Принцип разделения интерфейсов. Можно имплементироваться от интерфейсов которые нужны классу.
  В данном коде не вижу конкретного примера, но могу предположить, что если бы интерфейс HomeWork для студента и HomeWorkCheck для учителя,
  то они работали только с одним наследником род. класса
  * 5. Пятый принцип - Принцип инверсии заввисимости. Заключается в том, что бы не связывать модуль верхнего уровня с нижним уровнем.
  Если интерфейс содержит общий метод в классах, которые его имплементируют и реализовывают.
  В данном коде это было бы возможно если существовал класс TeacherService он бы мог имплементировать интерфейс UserService,
  а так же TeacherView имплементировать интерфейс UserView, а так же TeacherCotroller имплементировать интерфейс UserController
