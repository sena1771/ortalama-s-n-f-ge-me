import java.util.Scanner;
public class odev {

    public static void main(String[] args) {
        int a,b,c,d,e,f,g,h,j,l,i,m;
        float ortalama,ortalama_1,ortalama_2,ortalama_3,ortalama_4,ortalama_5,ortalama_6;

        Scanner input= new Scanner(System.in);
        System.out.print("Türkçe sinav puanı 1:");
        a= input.nextInt();
                 System.out.println(a);
                 System.out.print("Türkçe sınav puanı 2:");
                 b= input.nextInt();
                 System.out.println(b);
                 ortalama= (a+b)/2;
System.out.println("Türkçe ortalamanız: ");
System.out.println(ortalama);
System.out.println("Matematik sınav puanı 1:");
c= input.nextInt();
System.out.println(c);
System.out.println("Matematik sınav puanı 2:");
d= input.nextInt();
System.out.println(d);
System.out.println("Matematik sınav ortalamanız: ");
ortalama_1=(c+d)/2;
System.out.println(ortalama_1);
System.out.println("Fizik sınav notu 1:");
e= input.nextInt();
System.out.println(e);
System.out.println("Fizik sınav notu 2:");
f= input.nextInt();
System.out.println(f);
System.out.println("Fizik sınav ortalamanız: ");
ortalama_2=(e+f)/2;
System.out.println(ortalama_2);
System.out.println("Kimya sınav notu 1: ");
g= input.nextInt();
System.out.println(g);
System.out.println("Kimya sınav notu 2: ");
h= input.nextInt();
System.out.println(h);
System.out.println("Kimya sınav ortalamanız: ");
ortalama_3=(g+h)/2;
System.out.println(ortalama_3);
System.out.println("Tarih sınav notu 1: ");
j= input.nextInt();
System.out.println(j);
System.out.println("Tarih sınav notu 2:");
l= input.nextInt();
System.out.println(l);
System.out.println("Tarih sınav ortalamanız: ");
ortalama_4=(j+l)/2;
System.out.println(ortalama_4);
System.out.println("Müzik sınav notu 1: ");
i= input.nextInt();
System.out.println(i);
System.out.println("Müzik sınav notu 2: ");
m= input.nextInt();
System.out.println(m);
System.out.println("Müzik sınav ortalamanız: ");
ortalama_5=(m+i)/2;
System.out.println(ortalama_5);
System.out.println("Tüm derslerin ortalaması: ");
ortalama_6=(ortalama_1+ortalama+ortalama_2+ortalama_3+ortalama_4+ortalama_5)/6;
        System.out.println(ortalama_6);
boolean kosul1= ortalama_6 < 60;
        String str= kosul1 ? "Sınfta kaldı" : "Sınıfı geçti";
System.out.println(str);









    }
}
