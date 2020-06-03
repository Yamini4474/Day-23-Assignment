public class usingMethod{
        public static final int
        IS_FULL_TIME=1;
        public static final int
        IS_PART_TIME=0;
        public static final int
        RATE_PER_HOUR=20;
        public static final int
        NUMBER_OF_WORKING_DAYS=10;
        public static final int
        HOURS_PER_MONTH=20;
        public static int WORK_HOURS=0;
        public static int
        WAGE=0,totalhrs=0,totaldays=0;
        public static double empCheck=0;

        public static void main(String[]args){
                emppresentcheck();
                calculatewage(WORK_HOURS);
        }
        public static int
                emppresentcheck(){
                while(totaldays&lt;=NUMBER_OF_WORKING_DAYS &amp;&amp;
                        totalhrs&lt;=HOURS_PER_MONTH){
                        totaldays++;
                        totalhrs++;
                        empCheck=Math.floor(Math.random() * 10) % 3;
                switch((int)empCheck){
                case IS_FULL_TIME:
                        WORK_HOURS=8;
                break;
                case IS_PART_TIME:
                        WORK_HOURS=4;
                break;
                default:
                        WORK_HOURS=0;
                break;

                }
        }
                        System.out.println(&quot;employee worked hours:&quot;+totalhrs);
                        System.out.println(&quot;employee worked days:&quot;+totaldays);
                return WORK_HOURS;
}
        public static void
                calculatewage(int WORK_HOURS){
                WAGE=WORK_HOURS*RATE_PER_HOUR;
                        System.out.println(&quot;emply wage is:&quot;+WAGE);

