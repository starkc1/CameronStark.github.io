/**
 * 
 */

/**
 * @author Cameron Stark   
 *
 */
public class MovieListNode<t> {


    public t info;
    public MovieListNode<t> next;

    public MovieListNode(t info)
    {
        this.info = info;
        this.next = null;
    }


    public MovieListNode(t info, MovieListNote<t> next)
    {
        this.info = info;
        this.next = next;  
    }

    public String toString()
    {
        return info.toString();
    }
}
