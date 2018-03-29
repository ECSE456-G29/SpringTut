package hello;

public class Greeting {

  private final long id;
  private final String content;
  
  
  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }
  
  //tag::getID[]
  public long getId() {
    return id;
  }
  //end::getID[]

  public String getContent() {
    return content;
  }
}
