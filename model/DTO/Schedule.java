package model.DTO;

import lombok.*; // Gọi thư viện để tạo getter và setter

@Getter // Khởi tạo getter tự động
@Setter // Khởi tạo setter tự động
@NoArgsConstructor // Khởi tạo phi tham số
@AllArgsConstructor // Khởi tạo có tham số

public class Schedule {
    private int startStationID; // Mã trạm đầu
    private int endStationID; // Mã trạm đích
    private int timeTravel; // Thời gian đi từ đầu đến đích
    private String routeDetail; // Lịch trình chi tiết
}