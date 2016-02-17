# Tìm Ước số chung lớn nhất, Bội chung nhỏ nhất, Tính Giai thừa, Kiểm tra số nguyên tố, Kiểm tra số Finbonacci
+ Nhập và Hiển thị 2 số bất kỳ 
+ Tìm [Ước số chung lớn nhất của 2 số (dùng thuật toán Eculid)](https://vi.wikipedia.org/wiki/Gi%E1%BA%A3i_thu%E1%BA%ADt_Euclid) vừa nhập từ bàn phím
+ Tìm [Bội số chung nhỏ nhất của 2 số](https://vi.wikipedia.org/wiki/B%E1%BB%99i_s%E1%BB%91_chung_nh%E1%BB%8F_nh%E1%BA%A5t) vừa nhập từ bàn phím
+ Tính [giai thừa 2 số](https://vi.wikipedia.org/wiki/Giai_th%E1%BB%ABa) nhập từ bàn phím
+ Kiếm tra số vừa nhập có phải là số nguyên tố không?
+ Kiếm tra số vừa nhập có thuộc dãy Finbonacci không?

##Ước số chung lớn nhất
```
//tim uoc so chung lon nhat cua 2 so a va b
    public static int USCLN(int x, int y)
    {
        int r;
            while(y!=0)
            {
                r = x % y;
                x = y;
                y = r;
            }
        return x;
    }
```

##Bội số chung nhỏ nhất
```
        //tim Boi so chung nho nhat cua a va b
            int bscnn;
            bscnn = (inputA * inputB)/USCLN(inputA, inputB);
            System.out.print("\nBSCNN cua " + inputA + " va " + inputB + " la: " + bscnn);
```

##Tính giai thừa
```
//Tinh giai thua cua 1 so
    public static int calculateGiaiThua(int x)
    {
        if(x==0)        
            return 1;
        
        return x*calculateGiaiThua(x-1);
    }
```
