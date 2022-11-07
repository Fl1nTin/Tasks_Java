package tasks;

/*��������� �����, ����� �� �������������� �����, ����������� ����/��������������, � ��������� �������.
������ ����� � ������ ������ ���� �������� � ��������� ����� ������ � ��� ������,
���� �������� ����� ���� �������� � ��������� �����.*/

public class Convert_String_To_Camel_Case {
    public static String toCamelCase(String s) {
        String[] words = s.split("[- _]");
        StringBuilder builder = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {
            builder.append(words[i].substring(0, 1).toUpperCase()
                    .concat(words[i].substring(1).toLowerCase()));
        }
        return builder.toString();
    }
}
