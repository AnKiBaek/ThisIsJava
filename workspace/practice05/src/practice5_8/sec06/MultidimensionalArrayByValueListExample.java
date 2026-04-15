package practice5_8.sec06;

public class MultidimensionalArrayByValueListExample {
    public static void main(String[] args) {
        int[][] arr = {
            {1322, 213, 2333, 223223, 23323},
            {1232132132, 23213}
        };

        // 초기값을 배열의 첫 번째 원소로 설정
        int maxVal = arr[0][0];
        int minVal = arr[0][0];
        int totalElements = 0;

        for (int i = 0; i < arr.length; i++) {
            // 각 행의 길이를 더해 전체 요소 개수 구하기
            totalElements += arr[i].length;

            for (int k = 0; k < arr[i].length; k++) {
                // 최대값 찾기
                if (arr[i][k] > maxVal) {
                    maxVal = arr[i][k];
                }
                // 최소값 찾기
                if (arr[i][k] < minVal) {
                    minVal = arr[i][k];
                }
            }
        }

        System.out.println("전체 요소 개수: " + totalElements);
        System.out.println("최대값: " + maxVal);
        System.out.println("최소값: " + minVal);
    }
}
