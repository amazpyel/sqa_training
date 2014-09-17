/**
 * Created with IntelliJ IDEA.
 * Author: Oleksandr Pylkevych o.pylkevych@gmail.com
 * Date: 9/17/14
 * Time: 3:16 PM
 */
public class Array_1 {
    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        int[] pi = {3, 1, 4};
        return pi;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int sum = 0;
        for ( int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public int[] rotateLeft3(int[] nums) {
        int[] rotated = { nums[1], nums[2], nums[0] };
        return rotated;
    }

    public int[] reverse3(int[] nums) {
        int[] reversed = { nums[2], nums[1], nums[0] };
        return reversed;
    }

    public int[] maxEnd3(int[] nums) {
        if (nums[0] >= nums[2]) {
            nums[1] = nums[0];
            nums[2] = nums[0];
        } else {
            nums[0] = nums[2];
            nums[1] = nums[2];
        }
        return nums;
    }

    public int sum2(int[] nums) {
        if(nums.length < 2) {
            int sum = 0;
            for (int i = 0; i < nums.length; i++) sum += nums[i];
            return sum;
        }
        if(nums.length == 0) return 0;
        return nums[0] + nums[1];
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] array = new int[] {a[1], b[1]};
        return array;
    }

    public int[] makeEnds(int[] nums) {
        int[] array = new int[] {nums[0], nums[nums.length -1]};
        return array;
    }

    public boolean has23(int[] nums) {
        return nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3;
    }

    public boolean no23(int[] nums) {
        return !(nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }

    public int[] makeLast(int[] nums) {
        int[] array = new int[nums.length * 2];
        array[array.length-1] = nums[nums.length-1];
        return array;
    }

    public boolean double23(int[] nums) {
        return ( nums.length >= 2) &&( (nums[0] == nums[1] && nums[0] == 2) || (nums[0] == nums[1] && nums[0] == 3) );
    }

    public int[] fix23(int[] nums) {
        if(nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if(nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;
        if(a.length > 0) {
            if(a[0] == 1) count++;
        }
        if(b.length > 0) {
            if(b[0] == 1) count++;
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];
        int maxSum = Math.max(sumA, sumB);
        if (maxSum == sumA) return a;
        return b;
    }

    public int[] makeMiddle(int[] nums) {
        int[] middle = new int[] {nums[nums.length/2 -1], nums[nums.length/2]};
        return middle;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[] {a[0], a[1], b[0], b[1]};
        return result;
    }

    public int[] swapEnds(int[] nums) {
        if (nums.length == 1) return nums;
        int temp;
        temp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        if (nums.length == 3) return nums;
        int[] middle = new int[] { nums[nums.length/2-1], nums[nums.length/2], nums[nums.length/2 + 1]};
        return middle;
    }

    public int maxTriple(int[] nums) {
        int maxNumber = Math.max(nums[0], nums[nums.length-1]);
        int maxN = Math.max(nums[nums.length/2], maxNumber);
        return maxN;
    }

    public int[] frontPiece(int[] nums) {
        if(nums.length < 2) return nums;
        int[] frontPiece = new int[] {nums[0], nums[1]};
        return frontPiece;
    }

    public boolean unlucky1(int[] nums) {
        if(nums.length >= 2) {
            if(nums[0] == 1 && nums[1] == 3 || nums[1] == 1 && nums[2] == 3) {
                return true;
            }
            if(nums[nums.length - 2] == 1 && nums[nums.length -1] == 3) {
                return true;
            }
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        if (a.length == 0 && b.length != 0) {
            res[0] = b[0];
            res[1] = b[1];
            return res;
        }
        if (b.length == 0 && a.length != 0 || a.length >= 2) {
            res[0] = a[0];
            res[1] = a[1];
            return res;
        }
        if(a.length < 2) {
            res[0] = a[0];
            res[1] = b[0];
            return res;
        }
        return res;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length != 0) {
            int[] res = new int[1];
            res[0] = b[0];
            return res;
        }
        if (b.length == 0 && a.length != 0) {
            int[] res = new int[1];
            res[0] = a[0];
            return res;
        }
        if (a.length == 0 && b.length == 0) return a;
        int[] res = new int[2];
        res[0] = a[0];
        res[1] = b[0];
        return res;
    }
}
