package hu.target.shooting.model.domain;

public class ShoutResult {

    private final int id;
    private final String shots;
    private final int score;

    public ShoutResult(int id, String shots) {
        this.id = id;
        this.shots = shots;
        score = 0;
    }

    public int getId() {
        return id;
    }

    public String getShots() {
        return shots;
    }

    public int getScore() {
        return score;
    }
}
