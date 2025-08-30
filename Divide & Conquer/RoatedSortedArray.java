class RoatedSortedArray {
    public static int roatedSortedArray(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
            // kaam
            int mid = si + (ei - si) / 2;
            // casefound
            if (arr[mid] == tar) {
                return mid;
            }

            // on line l1
            if (arr[si] <= arr[mid]) {
                // on left part
                if (arr[si] <= tar && tar <= arr[mid]) {
                    return roatedSortedArray(arr, tar, si, mid - 1);
                } else {
                    return roatedSortedArray(arr, tar, mid + 1, ei);
                }
            } else {
                // on l2 mid lies
                if (arr[mid] <= tar && tar <= arr[ei]) {
                    return roatedSortedArray(arr, tar, mid + 1, ei);
                } else {
                    return roatedSortedArray(arr, tar, si, mid - 1);
                }

            }
        }

    

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 1, 2, 3 };
        int target = 3;
        int ans = roatedSortedArray(arr, target, 0, arr.length - 1);
        System.out.println(ans);

    }
}