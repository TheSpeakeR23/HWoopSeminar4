package repository;

import data.Student;
import data.User;

public interface UserRepository <E extends User, I> extends Repository {
    void save(Student entity);

    E findByFio(String fio);
}
