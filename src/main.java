import java.lang.reflect.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        String str = "Hello world this is java FIRST program";
        String str1 = "eat first";
        boolean b = str.regionMatches(false,25,str1,4,5);
        String s= "   joweef     ";
        String ss [] = str.split("l");
        for (String S :ss){
            System.out.println(S);
        }
    }

    int [] searchIndex(String string , char c){
        int [] array = {};
        int index = -1;
        var str = "what are thea fans doing in the picture? find five things. tell your partner.";

        while ((index = string.indexOf(c, index + 1)) >= 0) {
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = index;
            }
        return array;
        }
    }
