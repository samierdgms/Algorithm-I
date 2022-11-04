// Kullanıcıdan kütle girdisi input olarak alınır ve m olarak kodlanır
// Kullanıcıdan hız girdisi input olarak alınır ve h olarak kodlanır
// Kullanıcıdan yükseklik girdisi input olarak alınır ve y olarak kodlanır
// Kullanıcıdan alınan h değerinin karesi alınıp m ile çarpılır ve sonuç ikiye bölünerek ke olarak kodlanır
// Kullanıcıdan alınan y ve m değerleri çarpılıp sonuç da tekrardan 10 ile çarpılıp pe olarak kodlanır
// Kodlanan pe ve ke kullanıcıya println olarak yazdırılır
import java.util.Scanner;
public class Homework4 {
   

   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Lütfen Kinetik ve Potansiyel enerjisini hesaplamak istediğiniz cismin kütlesini giriniz");
    double m = input.nextDouble();
    System.out.println("Lütfen cismin hızını giriniz ")     ;
    double h = input.nextDouble();
    System.out.println("Lütfen cismin yerden yüksekliğini giriniz");
    double y = input.nextDouble();
    double ke = (h*h*m)/2;
    double pe = (y*10*m);
    System.out.println("Cismin Kinetik Enerjisi");
    System.out.println(+ ke);
    System.out.println("Cismin Potansiyel Enerjisi");
    System.out.println(+ pe);
    }
    
}
