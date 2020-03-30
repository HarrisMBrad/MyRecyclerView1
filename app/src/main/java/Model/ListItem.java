package Model;

public class ListItem {
    private String description;
    private String name;
    private String rating;


    public ListItem(String name, String description) {
        this.name = name;
        this.description = description;


    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }




}
