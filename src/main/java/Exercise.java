import java.util.*;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {
        List<CinemaHall>cinema = new ArrayList<>();
        cinema.add(new CinemaHall("Room 1", RoomDimensionType.TYPE_2D));
        cinema.add(new CinemaHall("Room 2", RoomDimensionType.TYPE_3D));
        cinema.add(new CinemaHall("Room 3", RoomDimensionType.TYPE_2D));
        cinema.add(new CinemaHall("Room 4", RoomDimensionType.TYPE_4D));
        cinema.add(new CinemaHall("Room 5", RoomDimensionType.TYPE_3D));
        cinema.add(new CinemaHall("Room 6", RoomDimensionType.TYPE_3D));
        cinema.add(new CinemaHall("Room 7", RoomDimensionType.TYPE_2D));
        cinema.add(new CinemaHall("Room 8", RoomDimensionType.TYPE_3D));
        cinema.add(new CinemaHall("Room 9", RoomDimensionType.TYPE_4D));
        cinema.add(new CinemaHall("Room 10", RoomDimensionType.TYPE_4D));

        TreeSet<CinemaHall>cinemaRoomsSorted = new TreeSet<>(cinema);
        System.out.println("Rooms sorted by type: ");

        cinemaRoomsSorted.stream().forEach(room -> System.out.println(room));

        showNumberOfRoomTypes(cinema);
    }
    public static Long getNumberOfTwoDimensionRooms(List<CinemaHall> list){
        Long D2type = list.stream()
                .filter(room -> room.getType().equals(RoomDimensionType.TYPE_2D))
                .count();
        return D2type;
    }
    public static Long getNumberOfThreeDimensionRooms(List<CinemaHall> list){
        Long D3type = list.stream()
                .filter(room -> room.getType().equals(RoomDimensionType.TYPE_3D))
                .count();
        return D3type;
    }
    public static Long getNumberOfFourDimensionRooms(List<CinemaHall> list){
        Long D4type = list.stream()
                .filter(room -> room.getType().equals(RoomDimensionType.TYPE_4D))
                .count();
        return D4type;
    }
    public static void showNumberOfRoomTypes(List<CinemaHall> list){
        System.out.println("Number of 2D rooms is: " + getNumberOfTwoDimensionRooms(list));
        System.out.println("Number of 3D rooms is: " + getNumberOfThreeDimensionRooms(list));
        System.out.println("Number of 4D rooms is: " + getNumberOfFourDimensionRooms(list));
    }
}
