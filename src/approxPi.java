public class approxPi {
    public static void main(String[] args){
        int numberOfPoints = Integer.parseInt(args[0]);
        int hits = 0;

        for(int i = 0; i< numberOfPoints; i++){
            double x = Math.random();
            double y = Math.random();

            if(x*x + y*y <= 1)
                hits++;
        }

        double piEstimation = (double)hits/numberOfPoints*4;

        System.out.println("Total Number of points: " + args[0]);
        System.out.println("Points within circle: " + hits);
        System.out.printf("Pi estimation: %.5f \n", piEstimation);

    }
}
