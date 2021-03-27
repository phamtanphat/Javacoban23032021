public class Main {

    public static void main(String [] args) throws Exception{
        /*
         1 : Comment code
         ctrl + /

            System.out.print("Hello Word");
            System.out.print("Hello Word");
            System.out.print("Hello Word");
            System.out.print("Hello Word");
            System.out.print("Hello Word");

         2 : Kiểu dữ liệu
         Nhóm kiểu dữ liệu nguyên thủy : Không hỗ trợ phương thức xử lý
         Nhóm kiểu dữ liệu đối tượng : Hỗ trợ các phương thức xử lý
         int , boolean , double , float , char ...
         String , Integer, Boolean , Double , Float , CharSequence

         3 : Khai báo biến

         String name = "Phạm Tấn Phát";
         int age = 15;
         float s1 = 1.5f;
         double s2 = 1.5;
         char s3 = 'a';

         4 : Toán tử
         Toán hạng : 1 ,2 ,3
         Toán tử : + - * /
         Biểu thức : phải có giá trị trả về

         int a = 5;
         int b = 5;

         int ketqua = a-- + --b - --b - --a + b-- - --a;
         5 + --b - --b - --a + b-- - --a; a = 4 , b = 5
         5 + 4 - --b - --a + b-- - --a; a = 4 , b = 4
         5 + 4 - 3 - --a + b-- - --a; a = 4 , b = 3
         5 + 4 - 3 - 3 + b-- - --a; a = 3 , b = 3
         5 + 4 - 3 - 3 + 3 - --a; a = 3 , b = 2
         5 + 4 - 3 - 3 + 3 - 2; a = 2 , b = 2
         9 - 6 + 1
         4

         Số : ++ , -- , // , **
         System.out.print(ketqua);

         5 : Câu điều kiện (if else)
          {} : scope (Phạm vi)
         */

        int a = 12;
        int b = 10;
        int ketqua = 0;

        // a > b = 1;
        // a < b = -1;
        // a == b = 0

        if (a > b) ketqua = 1;
        else if (a == b) ketqua = 0;
        else ketqua = -1;

        System.out.print(ketqua);


    }
}
