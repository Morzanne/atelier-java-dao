package fr.wildcodeschool.students.Repository;

import fr.wildcodeschool.students.models.Student;
import java.util.List;


public interface StudentDao {

  public List<Student> findAll();

}
