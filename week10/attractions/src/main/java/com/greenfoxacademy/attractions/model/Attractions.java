package com.greenfoxacademy.attractions.model;

import javax.persistence.*;

@Entity
public class Attractions {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Integer id;
  @Column(name="attrName")
  String name;
  String city;
  String category;
  int price;
  float longitude;
  float latitude;
  float recommendedAge;
  int duration;


  public Attractions(String name, String city, String category, int price, float longitude, float latitude, float recommendedAge, int duration) {
    this.name = name;
    this.city = city;
    this.category = category;
    this.price = price;
    this.longitude = longitude;
    this.latitude = latitude;
    this.recommendedAge = recommendedAge;
    this.duration = duration;
  }

  public Attractions() {
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public float getLongitude() {
    return longitude;
  }

  public void setLongitude(float longitude) {
    this.longitude = longitude;
  }

  public float getLatitude() {
    return latitude;
  }

  public void setLatitude(float latitude) {
    this.latitude = latitude;
  }

  public float getRecommendedAge() {
    return recommendedAge;
  }

  public void setRecommendedAge(float recommendedAge) {
    this.recommendedAge = recommendedAge;
  }

  public int getDuration() {
    return duration;
  }

  public void setDuration(int duration) {
    this.duration = duration;
  }
}
