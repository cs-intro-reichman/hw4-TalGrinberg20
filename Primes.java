public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] initialArray = new boolean[n+1];
        double countPrime = 0; 
        for (int i = 0; i < initialArray.length; i++) {
            initialArray[i] = i > 1;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = i+1; j < initialArray.length; j++) {
                //skipping false values
                if (initialArray[j]) {
                initialArray[j] = (j % i != 0);                
                }
            
        }
        }
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 0; i < initialArray.length; i++) {
            if (initialArray[i]) {
                System.out.println(i);
                countPrime ++;
            }
        }
        System.out.println("There are " + (int)countPrime + " primes between 2 and " + n + " (" + (int) ((countPrime/n)*100) + "%" + " are primes)");
}
}