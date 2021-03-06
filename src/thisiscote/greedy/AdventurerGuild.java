package thisiscote.greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class AdventurerGuild {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 모험가의 수
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 모험가를 공포도순으로 정렬

        int result = 0; // 파티 수
        int count = 0; // 파티원

        // 1 2 2 2 3

        for (int i = 0; i < N; i++) {
            count += 1; // 파티원 추가
            if (count >= arr[i]) { // 파티원의 수가 공포도 이상이라면
                result += 1; // 파티 결성
                count = 0; // 파티원 초기화
            }
        }

        System.out.println(result);
    }
}
