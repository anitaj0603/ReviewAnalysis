import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        double sum = 0;
        for (Review r : allReviews) {
            sum += r.getRating();
        }
        return sum / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<String>();
        for (int i = 0; i < allReviews.length; i++) {
            String comment = allReviews[i].getComment();
            if (comment.contains("!")) {
                String formatted = i + "-" + comment;
                if (!formatted.endsWith(".") && !formatted.endsWith("!")) {
                    formatted += ".";
                }
                comments.add(formatted);
            }
        }
        return comments;
    }
}