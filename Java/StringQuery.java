import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int i =0;
    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i = 0; i<queries.length;i++){
            if(map.containsKey(queries[i]) == false){
                map.put(queries[i],0);
            } 
        }
        for(int i = 0; i<strings.length; i++){
            if(map.containsKey(strings[i]) == true){
                map.put(strings[i],map.get(strings[i]) +1);
            }
        }
        int[] arr = new int[queries.length];

        // int i = 0;
        // map.forEach((k,v)->{
        //     arr[i] = v;
        //     i++;
        // });
        for(int i = 0; i< queries.length;i++){
            
            arr[i]=map.get(queries[i]);
        }
        return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] strings = new String[stringsCount];

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = scanner.nextLine();
            strings[i] = stringsItem;
        }

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] queries = new String[queriesCount];

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = scanner.nextLine();
            queries[i] = queriesItem;
        }

        int[] res = matchingStrings(strings, queries);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(String.valueOf(res[i]));

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
