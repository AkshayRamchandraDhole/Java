class PrePostIncDemo1{

        public static void main(String args[]){

                int num = 10;
                int ans;

                ans = ++num;
                System.out.println(ans); // 11
                System.out.println(num); // 11

		ans = num++;
                System.out.println(ans); // 11
                System.out.println(num); // 12



        }
}
