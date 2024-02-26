public class SLLTest {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();
        nums.add(15);
        nums.add(13);
        nums.add(57);
        nums.add(18);
        nums.add(83);
        nums.add(92);
        nums.add(87);
        System.out.println(nums.set(40, 5));
        System.out.println(nums.set(30, 0));
   }
}
