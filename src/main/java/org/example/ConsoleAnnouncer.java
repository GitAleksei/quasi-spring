package org.example;

public class ConsoleAnnouncer implements Announcer {
    @InjectByType
    private Recommender recommender;

    @Override
    public void announce(String msg) {
        System.out.println(msg);
        recommender.recommend();
    }
}
