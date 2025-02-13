package model.DTO;

import lombok.*; // Gọi thư viện để tạo getter và setter

@Getter // Khởi tạo getter tự động
@Setter // Khởi tạo setter tự động
@NoArgsConstructor // Khởi tạo phi tham số
@AllArgsConstructor // Khởi tạo có tham số

public class Route {
    private int startStationID; // Trạm đầu
    private int endStationID; // Trạm đích
    private double distance; // Khoảng cách giữa 2 trạm
}