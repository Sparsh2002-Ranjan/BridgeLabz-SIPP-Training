import java.util.*;

class Show {
    String title;
    String time; // Format: "HH:mm"

    public Show(String title, String time) {
        this.title = title;
        this.time = time;
    }

    public int getMinutes() {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}

public class MovieTimeInsertionSort {

    public static void insertShow(List<Show> shows, Show newShow) {
        shows.add(newShow);
        int i = shows.size() - 1;
        while (i > 0 && shows.get(i).getMinutes() < shows.get(i - 1).getMinutes()) {
            Collections.swap(shows, i, i - 1);
            i--;
        }
    }

    public static void printSchedule(List<Show> shows) {
        System.out.println("Upcoming Showtimes:");
        for (Show s : shows) {
            System.out.println(s.time + " - " + s.title);
        }
    }

    public static void main(String[] args) {
        List<Show> schedule = new ArrayList<>();

        insertShow(schedule, new Show("Fast & Furious", "12:00"));
        insertShow(schedule, new Show("Inception", "09:30"));
        insertShow(schedule, new Show("Interstellar", "15:00"));
        insertShow(schedule, new Show("Oppenheimer", "13:45"));
        insertShow(schedule, new Show("Avatar 2", "11:15"));

        printSchedule(schedule);
    }
}
