
package Tugas9_no2.MyBook;
import java.util.ArrayList;
public class BukuKu {
     public static void main(String[] args) {
        Buku buku1=new Buku("After", "Anna Todd", 2014);
        Buku buku2=new Buku("To All The Boys I've Love Before", "Jenny Hann", 2014);
        Buku buku3=new Buku("Pride and Pejudice", "Jane Austen", 1813);
        Buku buku4=new Buku("SIN", "Faradita", 2018);

        ArrayList<Buku> BukuAku=new ArrayList<Buku>();
        BukuAku.add(buku1);
        BukuAku.add(buku2);
        BukuAku.add(buku3);
        BukuAku.add(buku4);

        for(Buku buku: BukuAku){
            buku.infoBuku();
        }
    }
}
