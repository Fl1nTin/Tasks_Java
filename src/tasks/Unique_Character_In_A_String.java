package tasks;

import java.util.HashSet;
import java.util.Set;

//�������� �������, ������� ���������� ��������� �� ��� ������� � ������. ������� ������ �����������

public class Unique_Character_In_A_String {
    public static boolean isUnique(String str){
        Set<Character> list = new HashSet<>();
        for (int i = 0; i < str.length(); i++)
            list.add(str.charAt(i));

        return list.size() == str.length();
    }
}
