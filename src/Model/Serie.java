
package Model;

/**
 *
 * @author Betuyaku
 */
public class Serie extends Item{ // inheritance from Item
    private int idSeries;
    private String title;
    private int year;
    private String description;
    
    public Serie(Category Category) {
    //take one parameter declared in the child class and send it to the parent class
    //this means the parameter Category declared into the Item is now accessible to the class Movie    
        super(Category);
    }

    public int getIdSeries() {
        return idSeries;
    }

    public void setIdSeries(int idSeries) {
        this.idSeries = idSeries;
    }
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
