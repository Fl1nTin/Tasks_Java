package task;

/*Вы только что переехали на идеально прямую улицу с ровно n одинаковыми домами по обе стороны дороги.
Естественно, вы хотели бы узнать номер дома людей на другой стороне улицы.
События увеличиваются справа; шансы уменьшаются слева.
Номера домов начинаются с 1 и увеличиваются без промежутков. Когда n = 3, 1 находится
напротив 6, 3 - напротив 4, а 5 - напротив 2.*/

public class Over_The_Road {
    public static long overTheRoad(long address, long n) {
        return 2 * n + 1 - address;
    }
}
