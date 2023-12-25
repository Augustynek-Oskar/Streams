import java.util.*;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<CinemaHall>cinema = new ArrayList<>();
        cinema.add(new CinemaHall("Room 1", RoomDimensionType.type_2D));
        cinema.add(new CinemaHall("Room 2", RoomDimensionType.type_3D));
        cinema.add(new CinemaHall("Room 3", RoomDimensionType.type_2D));
        cinema.add(new CinemaHall("Room 4", RoomDimensionType.type_4D));
        cinema.add(new CinemaHall("Room 5", RoomDimensionType.type_3D));
        cinema.add(new CinemaHall("Room 6", RoomDimensionType.type_3D));
        cinema.add(new CinemaHall("Room 7", RoomDimensionType.type_2D));
        cinema.add(new CinemaHall("Room 8", RoomDimensionType.type_3D));
        cinema.add(new CinemaHall("Room 9", RoomDimensionType.type_4D));
        cinema.add(new CinemaHall("Room 10", RoomDimensionType.type_4D));

        TreeSet<CinemaHall>cinemaRoomsSorted = new TreeSet<>(cinema);
        System.out.println("Rooms sorted by type: ");
        for ( CinemaHall rooms : cinemaRoomsSorted){
            System.out.println(rooms);
        }

    }
    public static Long getNumberOfTwoDimensionRooms(List<CinemaHall> list){
        Long D2type = list.stream()
                .filter(room -> room.getType().equals(RoomDimensionType.type_2D))
                .count();
        System.out.println("Number of 2D rooms is: " + D2type);
        return D2type;
    }
}
