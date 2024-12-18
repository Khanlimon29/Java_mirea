package bikeproject;

public interface RoadParts {
    final String terrain = "track_racing";

    public int getTyreWidth();
    public int getPostHeight();

    public void setTyreWidth(int newValue);
    public void setPostHeight(int newValue);
}
