package model.DTO;

import lombok.*; // Gọi thư viện để tạo getter và setter

@Getter // Khởi tạo getter tự động
@Setter // Khởi tạo setter tự động
@NoArgsConstructor // Khởi tạo phi tham số
@AllArgsConstructor // Khởi tạo có tham số

public class Station {
    private int stationID; // Mã trạm
    private String name; // Tên trạm
    private String address; // Địa chỉ trạm
}