public class Student {

  private String id;
  private String name;
  private String dateOfBirth;
  private String classList;

  public Student(String id, String name, String dateOfBirth, String classList){
    this.id = id;
    this.name = name;
    this.dateOfBirth = dateOfBirth;
    this.classList = classList;
  }

  @Override
  public String toString(){
    return "{ id: " + id + " name: " + name + " date of birth: " + dateOfBirth + " classList: " + classList + " }";
  }
  
}
