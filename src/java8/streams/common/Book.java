package java8.streams.common;

public class Book {

  String id;
  String title;
  String author;
  double price;
  int rating;

  public Book(String id, String title, String author, double price, int rating) {
    this.id = id;
    this.title = title;
    this.author = author;
    this.price = price;
    this.rating = rating;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Book{" +
            "id='" + id + '\'' +
            ", title='" + title + '\'' +
            ", author='" + author + '\'' +
            ", price=" + price +
            ", rating=" + rating +
            '}';
  }

}
