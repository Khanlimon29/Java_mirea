package bikeproject;

public interface MountainParts {
    final String TERRAIN = "off_road";

    public String getSuspension();
    public String getType();

    public void setSuspension(String newValue);
    public void setType(String newValue);
}
