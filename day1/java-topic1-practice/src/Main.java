import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        new Main().showMenu();
    }

    public String[] bookName() {
        return new String[]{
                "Java Untuk Pemula",
                "Spring Framework untuk Pemula",
                "Mendalami Spring Framework",
                " Pemrograman Java",
                "Latihan pemrograman java"};
    }

    public int[] bookPrice(){
       return new int[]{50000, 40000, 45000, 60000, 75000};
    }

    public void showMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di BookStore");
        System.out.println("1. View book\n2. Buy book \n3. Exit");
        System.out.print("Masukan pilihan anda :");
        int pilihan = input.nextInt();

        if (pilihan == 1){
            showBookList();
            showMenu();
        } else if(pilihan == 2){
            buyBook();
            showMenu();
        } else {
            System.out.println("Terima Kasih Sudah Berbelanja");
        }

    }

    public void showBookList(){
        String[] bookName = bookName();
        int[] bookPrice = bookPrice();

        for (int i = 0; i < bookName.length; i++){
            System.out.println((i + 1) + "." + bookName[i] + " @ Rp." + bookPrice[i]);
        }
    }

    public void buyBook(){

        String[] bookName = bookName();
        int[] bookPrice = bookPrice();
        Scanner input = new Scanner(System.in);

        System.out.print("Pilih buku :");
        int selectBook = input.nextInt() - 1;
        System.out.print("Masukan jumlah Buku :");
        int bookQuantity = input.nextInt();

        int totalPrice = bookQuantity * bookPrice[selectBook];

        System.out.println("anda membeli buku " + bookName[selectBook] + " Sejumlah :" + bookQuantity + "dengan harga :" + totalPrice);

    }
}