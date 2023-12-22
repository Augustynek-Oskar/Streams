import java.util.Comparator;

public class CinemaHall implements Comparable<CinemaHall> {
    private final String roomName;
    private final RoomDimensionType type;

    public CinemaHall(String roomName, RoomDimensionType type) {
        this.roomName = roomName;
        this.type = type;
    }

    public String getRoomName() {
        return roomName;
    }

    public RoomDimensionType getType() {
        return type;
    }

    @Override
    public int compareTo(CinemaHall other){
        int typeComparison = this.type.compareTo(other.type);
        if (typeComparison == 0){
            return this.roomName.compareTo(other.roomName);
        }
        return typeComparison;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "roomName='" + roomName + '\'' +
                ", type=" + type +
                '}';
    }
}
