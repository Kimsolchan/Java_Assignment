import java.util.Arrays;

public class Ex_181852_Modify {
      public static int[] solution(int[] num_list) {
        // ==요구사항==
        // num_list에서 가장 작은 5개의 수를 제외한 수들을 
        // 오름차순하여 담은 리스트를 return하라

        // ==수정내용==
        // - 배열의 길이 : 1~30
        // - 배열의 길이가 1일 경우 그대로 출력
        // - 배열의 길이가 5미만일 경우 오름차순하여 그대로 출력

        // 기존 배열의 길이
        int len = num_list.length;
        // 기존 배열의 모든 값 오름차순
        Arrays.sort(num_list);

        // 배열의 길이가 1~5라면
        if(len <= 5){
          // 오름차순된 배열 return
          return num_list;
        }else{
          // 배열의 길이가 5초과면
          // 새로운 배열의 길이 : 기존 배열길이 - 5
          int[] answer = new int[len- 5];

          // for문은 새로운 배열의 길이만큼 반복한다.
          for(int i = 0, j = 5; i<answer.length; i++, j++){
            // 새로운 배열의 i번째 요소 = 기존 배열의 j번째 요소
            answer[i] = num_list[j];
          }
          // 새로운 배열 return
          return answer;
        }
    }
    public static void main(String[] args) {
      int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};

      System.out.println(solution(num_list));
    }
}
