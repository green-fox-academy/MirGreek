public class Homework {
  public static void main(String[] args) {

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