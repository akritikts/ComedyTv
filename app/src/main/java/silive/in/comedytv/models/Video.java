package silive.in.comedytv.models;

/**
 * Created by akriti on 13/6/17.
 */

public class Video {
    private String name_of_video;
    private String category;

    public Video(String name_of_video, String category) {
        this.name_of_video = name_of_video;
        this.category = category;
    }

    public String getName_of_video() {
        return name_of_video;
    }

    public void setName_of_video(String name_of_video) {
        this.name_of_video = name_of_video;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
