# DSA – Minimum Spanning Tree Labs (Kruskal & Prim)

Buổi thực hành tuần 13 – Cấu trúc dữ liệu & Giải thuật  
Hai nhóm triển khai cây bao trùm nhỏ nhất (MST) bằng hai thuật toán khác nhau.

## Nhóm 1 – Kruskal
Thuật toán sử dụng Union–Find để phát hiện chu trình.

**Input mẫu:** `src/test/resources/g1_graph.txt`
```
5
7
0 1 1.0
0 2 3.0
1 2 1.5
1 3 2.0
2 3 2.5
2 4 2.2
3 4 1.0
```
**Kết quả mong đợi:**
```
MST weight: 5.5
3-4 1.0
0-1 1.0
1-2 1.5
1-3 2.0
```

## Nhóm 2 – Prim
Thuật toán sử dụng hàng đợi ưu tiên để chọn cạnh nhỏ nhất nối tới tập chưa thăm.

**Input mẫu:** `src/test/resources/g2_graph.txt`
Kết quả mong đợi tương tự như Kruskal, tổng trọng số = 5.5.

## Cách chạy
1. Mở bằng IntelliJ IDEA hoặc VS Code.
2. Chạy test:
   - Kruskal: `KruskalMSTTest`
   - Prim: `PrimMSTTest`
3. Hoặc chạy chương trình chính:
```
java graphs.KruskalMain src/test/resources/g1_graph.txt
java graphs.PrimMain src/test/resources/g2_graph.txt
```

 [Tải toàn bộ bài thực hành tại đây (Release)](https://github.com/PhungTrinhUET/dsa-mst-lec9/releases)

- Nhóm 1: `group1-kruskal/`
- Nhóm 2: `group2-prim/`
- File input nằm trong `src/test/resources/`
- Chạy test: `KruskalMSTTest` hoặc `PrimMSTTest`
