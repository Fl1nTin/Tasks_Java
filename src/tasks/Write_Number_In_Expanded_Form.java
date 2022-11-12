package tasks;

/*Вам будет присвоен номер, и вам нужно будет вернуть его в виде строки в развернутом виде.
Например: 70304 return "70000 + 300 + 4"
ПРИМЕЧАНИЕ: Все числа будут целыми, больше 0.*/

public class Write_Number_In_Expanded_Form {
    public static String expandedForm(int num)
    {
        int size = (int)Math.ceil(Math.log10(num));
        String zero = "0".repeat(size - 1);

        StringBuilder result = new StringBuilder();
        String res = Integer.toString(num);
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) > '0' && res.charAt(i) <= '9') {
                String a = res.charAt(i) + zero.substring(i);
                result.append(a + " + ");
            }
        }

        return result.delete(result.length() - 3,result.length()).toString();
    }
}
