import java.util.ArrayList;
import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<CinemaHall>Cinema = new ArrayList<>();
        Cinema.add(new CinemaHall("Room 1", RoomDimensionType.type_2D));
        Cinema.add(new CinemaHall("Room 2", RoomDimensionType.type_2D));
        Cinema.add(new CinemaHall("Room 3", RoomDimensionType.type_2D));
        Cinema.add(new CinemaHall("Room 4", RoomDimensionType.type_2D));
        Cinema.add(new CinemaHall("Room 5", RoomDimensionType.type_3D));
        Cinema.add(new CinemaHall("Room 6", RoomDimensionType.type_3D));
        Cinema.add(new CinemaHall("Room 7", RoomDimensionType.type_3D));
        Cinema.add(new CinemaHall("Room 8", RoomDimensionType.type_3D));
        Cinema.add(new CinemaHall("Room 9", RoomDimensionType.type_4D));
        Cinema.add(new CinemaHall("Room 10", RoomDimensionType.type_4D));

    }

}
