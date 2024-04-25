import java.util.ArrayList;
import java.util.List;

class Solution {
        public List<String> solution(String[] names) {
            List<String> nameList = new ArrayList<>();
            for (int i = 0; i < names.length; i++) {
                if (i % 5 == 0) {
                    nameList.add(names[i]);
                }
            }
            return nameList;
        }
    }