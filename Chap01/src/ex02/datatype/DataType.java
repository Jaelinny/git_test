package ex02.datatype;

public class DataType {
      public static void main(String[] args) {
         short sh = -32768; // -32,768 ~ 32,767
         int su = 32769; // -21억 ~ 21억
         
         su = sh; // 묵시적(자동) 형변환
         sh = (short)su; // 명시적 형변환 - 데이터 손실 발생(4byte를 2byte에 넣어야하므로)

         System.out.println(sh + ", "+su);
         
      }
}
