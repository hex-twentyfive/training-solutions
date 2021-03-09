package week15d03;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PostFinderTest {

    @Test
    public void createNewPost() {
        String testTitle = "Message";
        LocalDate testPublishedAt = LocalDate.of(2021,3,9);
        String testContent = "Message test content.";
        String testOwner = "John Doe";
        Post post = new Post(testTitle,testPublishedAt,testContent,testOwner);
        PostFinder access = new PostFinder(new ArrayList<>(List.of(post)));

        assertEquals(1, access.getPosts().size());
    }

    @Test
    public void testFindPostFor() {
        Post post1 = new Post("Message",LocalDate.of(2021,3,8),"Message test content.","John Doe");
        Post post2 = new Post("Message",LocalDate.of(2021,3,8),"Message test content.","Jack Doe");
        PostFinder access = new PostFinder(new ArrayList<>(List.of(post1, post2)));

        assertEquals(1,access.findPostsFor("John Doe").size());
        assertEquals("John Doe", access.findPostsFor("John Doe").get(0).getOwner());
    }

    @Test
    public void testFindPostForException() {
        Post postWithWrongDate = new Post("Message",LocalDate.of(2025,3,8),"Message test content.","John Doe");
        Post postWithEmptyContent = new Post("Message",LocalDate.of(2021,3,8),"","John Doe");
        Post postWithEmptyTittle = new Post("",LocalDate.of(2021,3,8),"Message test content.","John Doe");
        PostFinder access = new PostFinder(new ArrayList<>(List.of(postWithWrongDate, postWithEmptyContent,postWithEmptyTittle)));

        assertEquals(0,access.findPostsFor("John Doe").size());
    }

}