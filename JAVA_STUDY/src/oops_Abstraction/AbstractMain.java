package oops_Abstraction;


public class AbstractMain {
    public static void main(String[] args)
    {
        // Create instances of the subclasses
        Google NewsSearch = new NewsSearch();
        Google imageSearch = new ImageSearch();
        Google videosSearch = new VideosSearch();

        
        // Call the search method on each instance
        
        NewsSearch.search();   
        imageSearch.search();   
        videosSearch.search();

        
        
        // Call the image method on one instance
        
        NewsSearch .Message();
    }
}