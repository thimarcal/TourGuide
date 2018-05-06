package android.udacity.tourguide.data;

public class VisitPlace {

    private String mPlaceName;
    private String mPlaceDescription;
    private int mPlaceImgResource;

    public String getPlaceName() {
        return mPlaceName;
    }

    public void setPlaceName(String mPlaceName) {
        this.mPlaceName = mPlaceName;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public void setPlaceDescription(String mPlaceDescription) {
        this.mPlaceDescription = mPlaceDescription;
    }

    public int getPlaceImgResource() {
        return mPlaceImgResource;
    }

    public void setPlaceImgResource(int mPlaceImgResource) {
        this.mPlaceImgResource = mPlaceImgResource;
    }
}
