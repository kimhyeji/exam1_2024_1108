import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        // 일반 버전
        System.out.println("== 일반 버전!!!!!! ==");
        int[] arr = {20, 30, 22, 4, 77, 8, 3, 31, 90, 10};

        // filter
        int resultArrLen = 0;

        for ( int n : arr ) if ( n % 2 == 0) resultArrLen++;

        int[] resultArr = new int[resultArrLen];

        int resultArrLastIndex = -1;

        for ( int n : arr ) {
            if ( n % 2 != 0 ) continue;

            resultArr[++resultArrLastIndex] = n;
        }

        // map
        for ( int i = 0; i < resultArr.length; i++ ) {
            resultArr[i] *= 2;
        }

        System.out.println(Arrays.toString(resultArr));

        // 스트림 버전
        System.out.println("== 스트림 버전 ==");
        arr = new int[]{20, 30, 22, 4, 77, 8, 3, 31, 90, 10};

        resultArr = Arrays.stream(arr)
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .toArray();

        System.out.println(Arrays.toString(resultArr));

        int a = 10;
        System.out.println(a);

    }
}