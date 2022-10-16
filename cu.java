import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class cu{
    public static void main(String[] args) {
Random rand = new Random();
int number=rand.nextInt(100);
int[] wrong = new int[5];
Scanner input = new Scanner(System.in);
int right =0;
boolean isWin=false,isWrong = false;

while(right<5){
System.out.println("tuttuğun sayıyı gir: ");
int sayi = input.nextInt();

if(sayi<0 || sayi>99){
    System.out.println("0-100 arasında bir sayı olması gerek ! ");
    if(isWrong){
        right++;
        System.out.println("çok fazla hatalı giriş yaptın. Kalan hak sayısı: "+ (5-right));
    }else {
        isWrong= true;
        System.out.println("Bir dahaki hatalı girişte hakkınızdan silinecektir");
    }
continue;
}

if(sayi == number){
    System.out.println("tebrkler doğru doğru tahmin ! Tahmin ettiğin sayı: "+ number);
    isWin=true;
    break;
}else{
    System.out.println("Hatalı bir sayı girdin ! ");
}

if(sayi>number){
    System.out.println(sayi+" Sayısı gizli sayıdan büyüktür.");
}else{
    System.out.println(sayi+" Sayısı gizli sayıdan küçüktür");
}

wrong[right++]=sayi;
System.out.println("Kalan hakkı : " + (5 - right));
}
if(!isWin){
    System.out.println("Kaybettin :/");
    System.out.println("Doğtu cevap "+ number+" olacaktı");
}
if(!isWrong){
    System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
}
}
}
