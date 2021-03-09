package week15d03;

/*  Adott az alábbi osztály:
    public class Post {
    private String title;
    private LocalDate publishedAt;
    private String content;
    private String owner;
    }
    Implementáljunk a PostFinder osztályban egy public List<Post> findPostsFor(String user) metódust az alábbi módon:
    1. Csak olyan Post-ot adjunk vissza, amelynek az owner-e megegyezik a megadott user-rel
    2. A Post publishedAt dátuma korábbi kell, hogy legyen, mint a LocalDate.now()
    3. A content és a title nem lehet üres
    0. Tároljunk egy List<Post> objektumot a PostFinder osztályban, melyet konstruktor paraméterként kap meg és ezt használjuk!
*/

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PostFinder {

    private List<Post> posts;                           //0.

    public PostFinder(List<Post> posts) {               //0.
        this.posts = posts;
    }

    public List<Post> findPostsFor(String user) {
        List<Post> result = new ArrayList<>();
        for (Post e : posts) {
            if (e.getOwner().equals(user)                               //1.
                    && e.getPublishedAt().isBefore(LocalDate.now())     //2.
                    && !e.getContent().isEmpty()                        //3.
                    && !e.getTitle().isEmpty()) {                       //3.
                result.add(e);
            }
        }
        return result;
    }

    public List<Post> getPosts() {
        return posts;
    }

}