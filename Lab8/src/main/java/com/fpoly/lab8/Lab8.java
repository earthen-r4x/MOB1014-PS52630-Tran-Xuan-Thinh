package com.fpoly.lab8;

import java.util.ArrayList;
import java.util.Collections;

public class Lab8 {
    public static void main(String[] args) {
        ArrayList<String> dsLop = new ArrayList<>();
        dsLop.add("Phạm Thị Mai");
        dsLop.add("Hoàng Văn Đức");
        dsLop.add("Vũ Minh Tuấn");
        dsLop.add("Đặng Thu Thảo");
        dsLop.add("Bùi Quốc Anh");
        dsLop.add("Đỗ Ngọc Ánh");
        dsLop.add("Hồ Văn Hùng");
        dsLop.add("Ngô Thanh Tùng");
        dsLop.add("Dương Gia Bảo");
        dsLop.add("Lý Phương Linh");
        dsLop.add("Đinh Quang Huy");
        dsLop.add("Trịnh Thị Hà");
        dsLop.add("Mai Xuân Trường");
        dsLop.add("Lương Thế Vinh");
        dsLop.add("Đoàn Hương Giang");
        dsLop.add("Võ Hoàng Nam");
        dsLop.add("Trương Thảo My");
        dsLop.add("Phan Trọng Khôi");
        dsLop.add("Lê Quỳnh Nga");
        dsLop.add("Nguyễn Hữu Đạt");
        
        Collections.sort(dsLop, Collections.reverseOrder());
        for (String ds : dsLop) {
            System.out.println(ds);
        }
    }
}