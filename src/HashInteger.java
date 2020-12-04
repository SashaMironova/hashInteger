import java.util.ArrayList;
import java.util.Iterator;
import java.util.MissingResourceException;

public class HashInteger {
    static ArrayList<Integer>[] array = new ArrayList[13];
    public HashInteger() {
        for (int i=0; i<13; i++) {
            array[i] = new ArrayList<Integer>();
        }
    }

    public static Integer isDigit(String str) {
//        try {
            return Integer.parseInt(str);
//        } catch (NumberFormatException e) {
//            return e;
//        }
    }

    public void insert(String str){
        int number = isDigit(str);
        switch (number % 13){
            case 0:
                array[0].add(number);
                break;
            case 1:
                array[1] = new ArrayList<>();
                array[1].add(number);
                break;
            case 2:
                array[2].add(number);
                break;
            case 3:
                array[3].add(number);
                break;
            case 4:
                array[4].add(number);
                break;
            case 5:
                array[5].add(number);
                break;
            case 6:
                array[6].add(number);
                break;
            case 7:
                array[7].add(number);
                break;
            case 8:
                array[8].add(number);
                break;
            case 9:
                array[9].add(number);
                break;
            case 10:
                array[10].add(number);
                break;
            case 11:
                array[11].add(number);
                break;
            case 12:
                array[12].add(number);
                break;
        }
    }

    public String delete(String str){
        int number = isDigit(str);
        int ost = number % 13;
        boolean isExist = false;
        Iterator<Integer> i = array[ost].iterator();
        while (i.hasNext()) {
            int n = i.next();
            if (n == number) {
                isExist = true;
                i.remove();
                break;
            }
        }

        if (isExist == false) {
            System.out.println("Такого числа для удаления нет");
            throw new IllegalArgumentException();
        }else{
            return "Число удалено";
        }
    }

    public String find(String str){
        int number = isDigit(str);
        int ost = number % 13;
        boolean isExist = false;
        for(int i: array[ost]) {
            if (i == number) {
                isExist = true;
                break;
            }
        }
        if (isExist == false){
            System.out.println("Такого числа нет");
            throw new IllegalArgumentException();
        } else {
            return "Число найдено";
        }
    }
}
