package fr.wildcodeschool.students.Repository;

import fr.wildcodeschool.students.models.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepoBdx implements StudentDao {

  @Override
  public List<Student> findAll() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Joffrey"));
    students.add(new Student("Stannis"));
    students.add(new Student("Tommen"));
    return students;
  }



}
