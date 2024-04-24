import java.util.Scanner;

public class Question6 {
    /*kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını
    hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız) */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrencilerin sayısı nedir:  ");
        double numberOfStudent = scanner.nextDouble();
        double totalNote = 0;
        double avgNote = 0;
        for(int i = 1; i <= numberOfStudent; i++)
        {
            System.out.print(i + ". öğrencinin ismi nedir:  ");
            String nameOfStudent = scanner.next();

            for(int j = 1; j <= 3 ; j++)
            {
                System.out.print(i + ". öğrencinin " + j + ".sınav notu:  ");
                double note = scanner.nextInt();
                totalNote += note;
                avgNote = totalNote / 3;
            }

            System.out.println(i + ". öğrencinin not ortalaması:  " + avgNote);
            totalNote = 0;
        }


    }
}
