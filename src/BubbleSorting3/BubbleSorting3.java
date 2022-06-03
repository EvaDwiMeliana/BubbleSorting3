package BubbleSorting3;

public class BubbleSorting3 {
    public static void main(String[] args) {
        String nama [] = {"Ilman","Anwar","Fajar","Putri","Supri"};
        String temp;
        System.out.println("Strings in sorted order:");
        for (int j = 0; j< nama.length; j++){
            for (int i = j + 1; i< nama.length; i++){
                if (nama[i].compareTo(nama[j]) < 0){    //membandingkan String yang berdekatan//
                    temp = nama[j];
                    nama[j] = nama[i];
                    nama[i] = temp;
                }
            }
            System.out.println(nama[j]);
        }
    }
}
// EVADWIMELIANA_21090082_2D


