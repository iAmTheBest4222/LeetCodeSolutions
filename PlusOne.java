class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] arr2 = new int[digits.length + 1];
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                flag = true;
            } else if (flag) {
                digits[i] += 1;
                flag = false;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < digits.length; i++) {
                arr2[i+1]=digits[i];
            }
            arr2[0] = 1;
            return arr2;

        }return digits;
    }
}

