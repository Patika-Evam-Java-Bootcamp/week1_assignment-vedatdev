import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    //1.Soru : String pool'dan dolayı bir obje oluşur.

    static String s1 = "code";

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 5 adet string giriniz 1 : ");
        String in1 = scanner.nextLine();
        System.out.println("2 : ");
        String in2 = scanner.nextLine();
        System.out.println("3 : ");
        String in3 = scanner.nextLine();
        System.out.println("4 : ");
        String in4 = scanner.nextLine();
        System.out.println("5 : ");
        String in5 = scanner.nextLine();


        System.out.println(stringThatContainsValue(new String[]{in1, in2, in3, in4, in5}));

    }

    public static String isContainStaticValue(String[] array){
        int i = 0;
        if (array.length > 4){
            if (isDistinct(array)){
                for (String s:array) {
                    if (s.contains(s1)){
                        i++;
                    }
                }
                return i + " tane değer içeren String var";
            }else
                return "String array elemanları farklı değil";
        }else
            return "Array 5 elemanlı değil.";

    }
    public static boolean isDistinct(String[] arr){
        Set<String> stringSet = new HashSet<String>(Arrays.asList(arr));
        return (arr.length==stringSet.size());
    }

    public static String stringThatContainsValue(String[] arr){
        String message = "";
        for (String s:arr) {
            if (s.contains(s1)){
                message = "Tanımlı value yu içeren String deger: " + s ;
                break;
            }
            else message = "Değeri içeren String bulunamadı.";
        }
        return message;
    }


}