package tasks;

/*Напишите функцию, которая принимает неотрицательное целое число (секунды)
в качестве входных данных и возвращает время в удобочитаемом формате (ЧЧ: ММ: СС)*/

public class Human_Readable_Time {
    public static String makeReadable(int seconds) {
        int hh = seconds / 3600;
        int mm = seconds / 60 % 60;
        int ss = seconds % 60;
        return String.format("%02d:%02d:%02d", hh, mm, ss);
    }
}
