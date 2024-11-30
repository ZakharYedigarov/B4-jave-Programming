package Day_19_NestedLoops;


    /*
        1 month - 4 weeks.
                    each week we 7 days


        Week 1
            Day 1
            Day 2
            Day 3
            Day 4
            Day 5
            Day 6
            Day 7

        Week 2
            Day 1
            Day 2
            ...
            Day 6
            Day 7

     */
    public class Month {
        public static void main(String[] args) {

            for (int i = 1; i <= 4; i++) {
                System.out.println("Week " + i);

                for (int j = 1; j <= 7 ; j++) {
                    System.out.println("\tDay " + j);

                    for (int k = 1; k <= 24 ; k++) {
                        System.out.println("\t\tHour " + k);
                    }
                    System.out.println();

                }
                System.out.println();


            }

            // For each Day can you print:
        /*
            Hour 1
            Hour 2
            ...
            Hour 24
         */



        }

    }
