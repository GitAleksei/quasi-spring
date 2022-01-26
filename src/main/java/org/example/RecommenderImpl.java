package org.example;

@Singleton
@Deprecated
public class RecommenderImpl implements Recommender {
    @InjectProperty("whisky")
    private String alcohol;

    public RecommenderImpl() {
        System.out.println("recommender was created");
    }

    @Override
    public void recommend() {
        System.out.println("To protect from COVID-19, drink " + alcohol);
    }
}
