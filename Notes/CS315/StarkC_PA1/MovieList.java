/**
 * 
 */

/**
 * @author Cameron Stark
 *
 */
public class MovieList<t> {

    protected MovieListNode<t> head;

    public MovieList()
    {
        head = null;
    }

    public void add(t value)
    {
        if (head == null)
        {
            head = new MovieListNode<>(value);
        }
        else 
        {
            MovieListNode<t> cur = head;
            while (cur.next != null)
            {
                cur = cur.next;
            }

            cur.next = new MovieListNode<>(value);
        }
    }

    public void printAll()
    {
        MovieListNode<t> cur = head;
        while (cur != null) 
        {
            System.out.println(cur);
            cur = cur.next;
        }
    }

}
