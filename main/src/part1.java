import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class part1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("main/resources/input.txt"));
            String line = reader.readLine();

            int currSum = 0;
            int maxSum = 0;

            while(line != null){
                if(line.equals("")){
                    if(currSum > maxSum){
                        maxSum = currSum;
                    }
                    currSum = 0;
                }
                else{
                    currSum += Integer.parseInt(line.strip());
                }
                line = reader.readLine();
            }

            System.out.println(maxSum);

        } catch (Exception e){
            throw e;
        }


    }
}
