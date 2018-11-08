/*
LeetCode Problem #841

There are N rooms and you start in room 0.  Each room has a distinct number in 0, 1, 2, ..., N-1, and each room may have
 some keys to access the next room.

Formally, each room i has a list of keys rooms[i], and each key rooms[i][j] is an integer in [0, 1, ..., N-1] where
N = rooms.length.  A key rooms[i][j] = v opens the room with number v.

Initially, all the rooms start locked (except for room 0).

You can walk back and forth between rooms freely.

Return true if and only if you can enter every room.

Runtime: 7ms, 63.53th percentile
*/

class Solution {
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Boolean result = true;

        List<Integer> keySet = new ArrayList<Integer>();
        List<Integer> keys = new ArrayList<Integer>();

        List<Boolean> roomsChecked = new ArrayList<Boolean>(Collections.nCopies(rooms.size(), false));

        List<Integer> empty = new ArrayList<Integer>(1);
        empty.add(0);
        keySet.addAll(rooms.get(0));
        keys.addAll(keySet);
        rooms.set(0, empty);
        roomsChecked.set(0, true);

        while(keys.isEmpty() == false){

            keySet.clear();

            for(int i = 0; i < keys.size(); i++){
                if((keys.get(i) == null) || keys.get(i) == 0)
                    continue;
                int temp = keys.get(i);
                roomsChecked.set(temp, true);
                keySet.addAll(rooms.get(temp));
                rooms.set(temp, empty);
            }

            keys.clear();
            keys.addAll(keySet);
        }

        if(roomsChecked.contains(false))
            return false;
        else
            return true;
    }
}
