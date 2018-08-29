package PACKAGE_NAME;

public class StudentCounter {
}
int sumCounter = 0;
for (int i = 0; i < 6; i++) {
  Integer obj = (Integer)   map.get(i).get("candies");
  int age = (int) map.get(i).get("age");
 
  if (obj > 4) {
  System.out.println(map.get(i).get("name"));
  } else if (obj < 5) {
    sumCounter = sumCounter + age;
}
