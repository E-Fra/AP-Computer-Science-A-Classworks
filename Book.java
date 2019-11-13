
public class Book
{
    private String title;
    private String author;
    private int pages;
    
    public Book(String t, String a, int p)
    {
        title = t;
        author = a;
        pages = p;
    }
    public void setTitle(String t)
    {
        title = t;
    }
    public void setAuhtor(String a)
    {
        author = a;
    }
    public void setTitle(int p)
    {
        pages = p;
    }
    public String getTitle()
    {
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public String toString()
    {
        return "Title: " + title  + "/nAuthor: " + author + "/nNumber of Pages: " + pages;
        
    }
}
