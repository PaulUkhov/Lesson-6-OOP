package ru.gb.oseminar.data;

import java.time.LocalDate;
// todo  + Первый принцип - Прнпцип ед.ответственности! Нельзя помещать несколько зон ответственности в одном классе
//  Поэтому мы разделяем код на пакеты в частности controller, data, service, view
//  По сути в моем понимании это MVC - Модель представления контроллер
// todo  + Второй принцип - Принцип открытия и закрытия! Класс открыт для разширения, но закрыт для модификации
//  Суть в том что бы можно было создавать по необходимости новый класс и имплементировать оттуда новый метод, а не изменять или дополнять старый метод
//  делается путем создания интерфейса в этом коде, принцип прослеживается в Pakcage: service, view и controller
// todo  + Третий принцип - Принцип подстановки Бабары Линков.
//  В котором код может наследоваться не только от родительского класса, но и от другого наследника родительского класса
//  Либо заранее продумывать код в родительском классе так что бы методы были корректными,а в подклассах дополнялись собственными по необходимости
//  В данном коде этому принципу характерно то что в подсклассах наследниках Teacher и Student есть методы которые присущи только им, а именно getTeacherId() и getStudentId()
//       + Четвертый принцип - Принцип разделения интерфейсов. Можно имплементироваться от интерфейсов которые нужны классу.
//  В данном коде не вижу конкретного примера, но могу предположить, что если бы интерфейс HomeWork для студента и HomeWorkCheck для учителя,
//  то они работали только с одним наследником род. класса
// todo  + Пятый принцип - Принцип инверсии заввисимости. Заключается в том, что бы не связывать модуль верхнего уровня с нижним уровнем.
//  Если интерфейс содержит общий метод в классах, которые его имплементируют и реализовывают.
//  В данном коде это было бы возможно если существовал класс TeacherService он бы мог имплементировать интерфейс UserService,
//  а так же TeacherView имплементировать интерфейс UserView, а так же TeacherCotroller имплементировать интерфейс UserController
public class User {
    private String firstName;
    private String secondName;
    private String patronymic;
    private LocalDate dateOfBirth;

    public User(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
               "firstName='" + firstName + '\'' +
               ", secondName='" + secondName + '\'' +
               ", patronymic='" + patronymic + '\'' +
               ", dateOfBirth=" + dateOfBirth +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User user = (User) o;

        if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) :
                user.getFirstName() != null) {
            return false;
        }
        if (getSecondName() != null ? !getSecondName().equals(user.getSecondName()) :
                user.getSecondName() != null) {
            return false;
        }
        if (getPatronymic() != null ? !getPatronymic().equals(user.getPatronymic()) :
                user.getPatronymic() != null) {
            return false;
        }
        return getDateOfBirth() != null ? getDateOfBirth().equals(user.getDateOfBirth()) :
                user.getDateOfBirth() == null;
    }
}
