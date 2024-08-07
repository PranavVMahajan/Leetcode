class Solution {
  public int findTheWinner(int n, int k) {
    boolean[] friends = new boolean[n];
    int friendCount = n;
    int fp = n; // friends' index
    while (friendCount > 1) {
      for (int i = 0; i < k; ++i, ++fp)
        while (friends[fp % n])
          ++fp;                
      friends[(fp - 1) % n] = true;
      --friendCount;
    }

    for (fp = 0; friends[fp]; ++fp)
      ;
    return fp + 1;
  }
}