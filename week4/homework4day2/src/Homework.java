import java.util.ArrayList;

public class Homework {
  public static void main(String[] args) {
    ArrayList<Mentor> mentors = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Person> people = new ArrayList<>();
    ArrayList<Sponsor> sponsors = new ArrayList<>();

    Person person = new Person("Mir",20,"girly");
    person.name = "Mir";
    person.age = 27;
    person.gender = "girl";
    people.add(person);

    Person person1 =new Person("Jane Doe",30, "female");
    person.name = "Jane Doe";
    person.age = 30;
    person.gender = "female";
    people.add(person1);

    Student student = new Student("Jane Doe",30, "female" ,"School of Life",0);
     /*student.name = "Jane Doe";
    student.age = 30;
    student.gender = "female";
    student.previousOrganization = "School of Life";
    student.skippedDays = 0;*/
    students.add(student);

    student.skipDays(3);


    Mentor mentor = new Mentor("Jane Doe",30, "female" ,"intermediate");
    /*mentor.name = "Jane Doe";
    mentor.age = 30;
    mentor.gender = "female";
    mentor.level = "intermediate";*/
    mentors.add(mentor);

    Sponsor sponsor = new Sponsor("Jane Doe",30, "female" , "Google",0);
    sponsors.add(sponsor);
    //iterate through the function calls

    for (int i = 0; i <3 ; i++) {
      sponsor.hire(i);
    }
    for (Person p : people) {
      person.introduce();
      person.myGoal();
    }
    for (Student s: students) {
      student.introduce();
      student.myGoal();
    }

    for (Mentor m: mentors) {
      mentor.introduce();
      mentor.myGoal();
    }

    for (Sponsor sp: sponsors) {
      sponsor.introduce();
      sponsor.myGoal();
    }
  }


}







/*
Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

introduce(): prints out "Hi, I'm name, a age year old gender."
getGoal(): prints out "My goal is: Live for the moment!"
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female
 */