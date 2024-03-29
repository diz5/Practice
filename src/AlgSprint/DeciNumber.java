package AlgSprint;

public class DeciNumber {
    public static void psuedoBinary(int n)
    {
        // Repeat below steps until n > 0
        while (n != 0)
        {
            // calculate m (A number that has same
            // number of digits as n, but has 1 in
            // place of non-zero digits 0 in place
            // of 0 digits)
            int temp = n, m = 0, p = 1;
            while(temp != 0)
            {
                int rem = temp % 10;
                temp = temp / 10;

                if (rem != 0)
                    m += p;

                p *= 10;
            }

            System.out.print(m + " ");

            // subtract m from n
            n = n - m;
        }
        System.out.println(" ");
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 130;
        psuedoBinary(n);
    }
}

