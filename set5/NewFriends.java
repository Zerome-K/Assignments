package zohoSets.set5;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class NewFriends {


    static class Friend {
        String[] friends;
        String name;

        Friend(String[] friends, String name) {
            this.friends = friends;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        NewFriends newFriends = new NewFriends();
        newFriends.init();
    }

    private void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF FRIEND : ");
        int size = scanner.nextInt();
        Friend[] friends = new Friend[size];
        int count = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("ENTER NAME : ");
            String Name = scanner.next();
            System.out.print("ENTER NO.OF FRIENDS : ");
            int size1 = scanner.nextInt();
            count += size1;
            String[] fof = new String[size1];
            for (int j = 0; j < size1; j++) fof[j] = scanner.next();
            friends[i] = new Friend(fof, Name);
        }
        System.out.println("NEW FRIENDS : " + Arrays.toString(makeFriends(friends, count)));
    }

    private String[] makeFriends(Friend[] friends, int count) {
        String[] newFriends = new String[count];
        int k = 0;
        for (Friend friend : friends) {
            String[] fof = friend.friends;
            for (String f : fof) {
                if (!contain(friends, newFriends, f)) newFriends[k++] = f;
            }
        }
        return newFriends;
    }

    private boolean contain(Friend[] friends, String[] newFriends, String f) {
        for (String x : newFriends) if (Objects.equals(x, f)) return Boolean.TRUE;
        for (Friend c : friends) if (Objects.equals(c.name, f)) return Boolean.TRUE;
        return Boolean.FALSE;
    }
}

/*
Help john to find new friends in social network
Input:
3
Mani 3 ram raj guna
Ram 2 kumar Kishore
Mughil 3 praveen Naveen Ramesh

Output : Raj guna kumar Kishore praveen Naveen Ramesh
 */