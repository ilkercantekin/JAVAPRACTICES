package day7;

import java.util.ArrayList;

public class ArraylarinOrtakElemaniniBulmaForLoopile {
/*========================= FOR LOOP İLE===============================*/
        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily}
         *
         * Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]

*/
public static void main(String[] args) {


    String[] array1 = {"John", "Brad", "Ange", "Sofia", "Emily"};
    String[] array2 = {"sofia", "brad", "grace", "emily", "hazel"};

    arraylerinOrtakElemanlariniListe(array1, array2);
}
    private static void arraylerinOrtakElemanlariniListe(String[] array1, String[] array2) {
        ArrayList<String> arrList = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if (array1[i].equalsIgnoreCase(array2[j])) {
                    arrList.add(array1[i]);
                }
            }
        }
        System.out.println(arrList);
    }
}
