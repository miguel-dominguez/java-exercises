package java8.matcher;

public class Command {

  String id;
  String resourceId;
  String revisionId;

  public Command(String id, String resourceId, String revisionId) {
    this.id = id;
    this.resourceId = resourceId;
    this.revisionId = revisionId;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getResourceId() {
    return resourceId;
  }

  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }

  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }

}
