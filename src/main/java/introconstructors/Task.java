package introconstructors;

import java.time.LocalDateTime;

public class Task {

    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void start() {
        startDateTime = LocalDateTime.now();

    }

    public static void main(String[] args) {

        String testTitle = "testTitle";
        String testDescription = "testDescription";
        int testDuration = 20;

        Task instTask = new Task(testTitle, testDescription, testDuration);

        instTask.start();

        System.out.println("\n Title: " + instTask.getTitle() );
        System.out.println(" Description: " + instTask.getDescription() );
        System.out.println(" Duration: " + instTask.getDuration() + " min");
        System.out.println(" Current time: " + instTask.getStartDateTime() );
    }
}

