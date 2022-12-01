import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class part2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("main/resources/input.txt"));
            String line = reader.readLine();

            int currSum = 0;
            ArrayList<Integer> allSums = new ArrayList<>();

            while(line != null){
                if(line.equals("")){
                    allSums.add(currSum);
                    currSum = 0;
                }
                else{
                    currSum += Integer.parseInt(line.strip());
                }
                line = reader.readLine();
            }

            Collections.sort(allSums);
            Collections.reverse(allSums);

            int result = allSums.get(0) + allSums.get(1) + allSums.get(2);

            System.out.println(result);

        } catch (Exception e){
            throw e;
        }


    }
}
