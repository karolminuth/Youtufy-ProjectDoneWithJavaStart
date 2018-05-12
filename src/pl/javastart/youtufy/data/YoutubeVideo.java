package pl.javastart.youtufy.data;
 
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
 
public class YoutubeVideo {
    private StringProperty id;
    private StringProperty title;
    private StringProperty author;
     
    public YoutubeVideo() {
        id = new SimpleStringProperty();
        title = new SimpleStringProperty();
        author = new SimpleStringProperty();
    }
     
    public String getId() {
        return id.get();
    }
    public void setId(String id) {
        this.id.setValue(id);
    }
    public StringProperty idProperty() {
        if (id == null) id = new SimpleStringProperty(this, "id");
        return id; 
    }
    public String getTitle() {
        return title.get();
    }
    public void setTitle(String title) {
        this.title.setValue(title);
    }
    public StringProperty TitleProperty() {
        if (title == null) title = new SimpleStringProperty(this, "title");
        return title; 
    }
    public String getAuthor() {
        return author.get();
    }
    public void setAuthor(String author) {
        this.author.setValue(author);
    }
    public StringProperty authorProperty() {
        if (author == null) author = new SimpleStringProperty(this, "author");
        return author; 
    }
 
    @Override
    public String toString() {
        return "YoutubeVideo [id=" + id + ", title=" + title + ", author=" + author + "]";
    }
}