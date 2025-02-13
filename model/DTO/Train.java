package model.DTO;

import lombok.*; // Gọi thư viện để tạo getter và setter

@Getter // Khởi tạo getter tự động
@Setter // Khởi tạo setter tự động
@NoArgsConstructor // Khởi tạo phi tham số
@AllArgsConstructor // Khởi tạo có tham số

public class Train {
    private String trainID; // Mã tàu
    private int seats; // Số ghế trên tàu
    private double speed; // Vận tốc (km/h)
    private String status; // Trạng thái (Đang vận hành, bảo trì)
}