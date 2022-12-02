import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Part1 {

    private static final int rock = 1;
    private static final int paper = 2;
    private static final int scissors = 3;
    private static final int win = 6;
    private static final int loss = 0;
    private static final int draw = 3;


    public static void main(String[] args) throws IOException {
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader("main/resources/input.txt"));
                String line = reader.readLine();
                int finalScore = 0;
                while(line != null) {
                    String[] round = line.split(" ");
                    int roundScore = 0;
                    String opponent = round[0];
                    String me = round[1];
                    if(opponent.equals("A")){
                        if(me.equals("Y")){
                            roundScore = paper + win;
                        }
                        else if(me.equals("X")){
                            roundScore = rock + draw;
                        }
                        else{
                            roundScore = scissors + loss;
                        }
                    }
                    else if(opponent.equals("B")){
                        if(me.equals("Z")){
                            roundScore = scissors + win;
                        }
                        else if(me.equals("Y")){
                            roundScore = paper + draw;
                        }
                        else{
                            roundScore = rock + loss;
                        }
                    }
                    else{
                        if(me.equals("X")){
                            roundScore = rock + win;
                        }
                        else if(me.equals("Z")){
                            roundScore = scissors + draw;
                        }
                        else{
                            roundScore = paper + loss;
                        }
                    }

                    finalScore += roundScore;
                    line = reader.readLine();
                }

                System.out.println(finalScore);

            }
            catch (Exception e){
                throw e;
            }
    }
}
