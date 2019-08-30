public class Animal {
  
  protected String voice;
  protected String name;
  
  Animal(String givenName){
    name = givenName;
  }
  
  public String toString(){
    return name;
  }
}