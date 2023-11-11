package pl.edu.ug.tent.springintro.domain;

import java.util.UUID;

public class Person {
  private String id;

  private String firstname;
  private String lastname;

  private String email;
  private String company_name;

  public Person() {
    System.out.println("Creating person " + this);
  }

  public Person(String firstname,String lastname,String email, String company_name) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.email = email;
    this.company_name = company_name;
    this.id = generateUserId();

    System.out.println("Creating person " + this);
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getCompany_name() {
    return company_name;
  }

  public String getEmail() {
    return email;
  }

  public String getId() {
    return id;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public void setCompany_name(String company_name) {
    this.company_name = company_name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setId(String id) {
    this.id = id;
  }

  private String generateUserId() {
    UUID uuid = UUID.randomUUID();
    return uuid.toString();
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +", " +
        "firstname='" + firstname + '\'' +
        ", lastname=" + lastname +
            ", email=" + email +
            ", company_name=" + company_name +
        '}';
  }
}
