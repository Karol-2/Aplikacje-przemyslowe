package pl.edu.ug.tent.springintro.domain;

public class Person {

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

  @Override
  public String toString() {
    return "Person{" +
        "firstname='" + firstname + '\'' +
        ", lastname=" + lastname +
            ", email=" + email +
            ", company_name=" + company_name +
        '}';
  }
}
