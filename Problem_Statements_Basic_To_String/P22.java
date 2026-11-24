package Problem_Statements_Basic_To_String;

// 22 Write a program to take 2 numbers from user and find out the distance between them. (How to
//compute distance: If number is 10 and 18 then 10 in binary 1010 and 18 in binary is 10010 and
//distance is 2 means total number of bits that needs to be changed when 10 is converted into 18
//or 18 is converted into 10, do not convert the number into binary)

// 01010
// 10010
public class P22 {
    public static int solution(int n1, int n2) {
        int countOfBits = 0;

        while (n1 > 0 ||  n2 > 0) {
            if (n1 % 2 != n2 % 2) countOfBits++;

            n1 /= 2;
            n2 /= 2;
        }

        return countOfBits;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 18));
    }
}
