import java.util.ArrayList;

public class Homework {
  public static void main(String[] args) {
    ArrayList<Mentor> mentors = new ArrayList<>();
    ArrayList<Mentor> studnents = new ArrayList<>();
    ArrayList<Mentor> people = new ArrayList<>();
    ArrayList<Mentor> sponsors = new ArrayList<>();

    Person person = new Person();
    person.name = "Mir";
    person.age = 27;
    person.gender = "girl";

    person.introduce();
    person.myGoal();

    Person person1 =new Person();
    person1.name = "Jane Doe";
    person1.age = 30;
    person1.gender = "female";

    person1.introduce();
    person1.myGoal();

    Student student = new Student("Jane Doe",30, "female" ,"School of Life",0);
     /*student.name = "Jane Doe";
    student.age = 30;
    student.gender = "female";
    student.previousOrganization = "School of Life";
    student.skippedDays = 0;*/
    student.introduce();
    student.myGoal();
    student.skipDays(3);


    Mentor mentor = new Mentor("Jane Doe",30, "female" ,"intermediate");
    /*mentor.name = "Jane Doe";
    mentor.age = 30;
    mentor.gender = "female";
    mentor.level = "intermediate";*/
    mentor.introduce();
    mentor.myGoal();


    Sponsor sponsor = new Sponsor("Jane Doe",30, "female" , "Google",0);
    sponsor.introduce();
    sponsor.myGoal();



    for (int i = 0; i <5 ; i++) {

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