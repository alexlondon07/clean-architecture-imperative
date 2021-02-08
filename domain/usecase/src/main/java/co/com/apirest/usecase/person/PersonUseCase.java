package co.com.apirest.usecase.person;

import co.com.apirest.model.person.Person;

import java.util.List;

public interface PersonUseCase {
    List<Person> findAll();
}
