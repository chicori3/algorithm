class Solution {
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                return sb.append(i).append("에 있다").toString();
            }
        }
        return sb.toString();
    }
}