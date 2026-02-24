import java.util.HashMap;

class Main {

    public static void MajorityElement(int nums[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        // frequency count
        for(int i = 0; i < n; i++) {

            if(map.containsKey(nums[i])) {

                map.put(nums[i], map.get(nums[i]) + 1);

            } else {

                map.put(nums[i], 1);

            }
        }

        // check majority element (> n/3)
        for(int key : map.keySet()) {

            if(map.get(key) > n/3) {

                System.out.println(key);

            }

        }

    }

    public static void main(String[] args) {

        int nums[] = {1,3,2,5,1,3,5,1};

        MajorityElement(nums);

    }

}
