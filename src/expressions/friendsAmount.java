package expressions;

public class friendsAmount {
    public static void main(String[] args) {

        int friends = 10;
        int friendsPlusOne = 10;
        int friendsMinusOne = 10;
        int friendsMultiply = 10;
        int friendsDevide = 10;

        friends = friends;
        friendsPlusOne = friendsPlusOne + 1;
        /* friends++; */
        friendsMinusOne = friendsMinusOne - 1;
        /* friends--; */
        friendsMultiply = friendsMultiply * 2;
        friendsDevide = friendsDevide / 2;
        /* В случае с делением часто могут возникнуть проблемы в виде не полного деления, для этого стоит использовать double */

        double friendsFullDevide = 10;
        friendsFullDevide = (double) friendsFullDevide / 3;

        System.out.println("Friends: " + friends);
        System.out.println("Friends + 1: " + friendsPlusOne);
        System.out.println("Friends - 1: " + friendsMinusOne);
        System.out.println("Friends * 2: " + friendsMultiply);
        System.out.println("Friends / 2: " + friendsDevide);
        System.out.println("Friends / 3: " + friendsFullDevide);
    }
}
