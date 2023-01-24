public class Main {


        public static void main(String[] args) {
            String city = "Columbus";
            String ZipCode = "43123";
            System.out.println("Zip Code: " + ZipCode);
            System.out.println("City: " + city);
            int[] dailyHighs = new int[]{32, 25, 27, 40, 45};
            float avg = (float)((double)(dailyHighs[0] + dailyHighs[1] + dailyHighs[2] + dailyHighs[3] + dailyHighs[4]) / 5.0);
            System.out.println(avg);
        }
    }
