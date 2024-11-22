public class TuitionCalc {
    public static void main(String[] args) throws Exception {
        double uniTuition = 10000;
        double yearlyIncrease = 1.05;
        double fourYrTotal = 0;
        for(int i = 0; i < 14; i++){
            uniTuition *= yearlyIncrease;

            if (i == 9){
                System.out.println("Tuition in 10 years is: "+ uniTuition);
            }

            if (i > 9){
                fourYrTotal += uniTuition;

            }
        }
        System.out.println("The four year total after 10 years is: "+fourYrTotal);
        }


            
        
    }
